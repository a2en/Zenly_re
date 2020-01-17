package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12004a;
import com.zendesk.service.C12008e;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor;
import com.zendesk.util.C12014d;
import com.zendesk.util.C12017g;
import java.util.Locale;

class ZendeskPushRegistrationProvider implements PushRegistrationProvider {
    private static final RequestExtractor<PushRegistrationResponseWrapper, String> PUSH_RESPONSE_EXTRACTOR = new RequestExtractor<PushRegistrationResponseWrapper, String>() {
        public String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
            return (pushRegistrationResponseWrapper == null || pushRegistrationResponseWrapper.getRegistrationResponse() == null || !C12017g.m31658b(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) ? "" : pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
        }
    };
    /* access modifiers changed from: private */
    public final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    /* access modifiers changed from: private */
    public final Locale locale;
    /* access modifiers changed from: private */
    public final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    enum TokenType {
        Identifier(null),
        UrbanAirshipChannelId("urban_airship_channel_id");
        
        final String name;

        private TokenType(String str) {
            this.name = str;
        }
    }

    ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager2, SettingsProvider settingsProvider2, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale2) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager2;
        this.settingsProvider = settingsProvider2;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
        this.locale = locale2;
    }

    private boolean checkForStoredPushRegistration(String str, C12008e<String> eVar) {
        String str2 = "PushRegistrationProvider";
        if (!C12017g.m31658b(str)) {
            String str3 = "Invalid identifier provided.";
            if (eVar != null) {
                eVar.onError(new C12004a(str3));
            }
            Logger.m31614d(str2, str3, new Object[0]);
            return true;
        } else if (!this.pushIdStorage.hasStoredDeviceId() || !str.equals(this.pushIdStorage.getPushDeviceId())) {
            if (this.pushIdStorage.hasStoredDeviceId()) {
                this.pushIdStorage.removePushDeviceId();
                Logger.m31608a(str2, "Removing stored push registration response because a new one has been provided.", new Object[0]);
            }
            return false;
        } else {
            if (eVar != null) {
                eVar.onSuccess(str);
            }
            Logger.m31608a(str2, "Skipping registration because device is already registered with this ID.", new Object[0]);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public PushRegistrationRequest getPushRegistrationRequest(String str, Locale locale2, AuthenticationType authenticationType, TokenType tokenType) {
        PushRegistrationRequest pushRegistrationRequest = new PushRegistrationRequest();
        pushRegistrationRequest.setIdentifier(str);
        pushRegistrationRequest.setLocale(C12014d.m31647a(locale2));
        if (tokenType == TokenType.UrbanAirshipChannelId) {
            pushRegistrationRequest.setTokenType(tokenType.name);
        }
        if (AuthenticationType.ANONYMOUS == authenticationType) {
            pushRegistrationRequest.setSdkGuid(this.identityManager.getSdkGuid());
        }
        return pushRegistrationRequest;
    }

    /* access modifiers changed from: 0000 */
    public void internalRegister(PushRegistrationRequest pushRegistrationRequest, final C12008e<String> eVar) {
        if (pushRegistrationRequest == null) {
            String str = "PushRegistrationRequest is null. Cannot continue with registration.";
            Logger.m31610b("PushRegistrationProvider", str, new Object[0]);
            if (eVar != null) {
                eVar.onError(new C12004a(str));
            }
            return;
        }
        PushRegistrationRequestWrapper pushRegistrationRequestWrapper = new PushRegistrationRequestWrapper();
        pushRegistrationRequestWrapper.setPushRegistrationRequest(pushRegistrationRequest);
        this.pushService.registerDevice(pushRegistrationRequestWrapper).enqueue(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<String>(eVar) {
            public void onSuccess(String str) {
                ZendeskPushRegistrationProvider.this.pushIdStorage.storePushDeviceId(str);
                ZendeskPushRegistrationProvider.this.blipsProvider.corePushEnabled();
                C12008e eVar = eVar;
                if (eVar != null) {
                    eVar.onSuccess(str);
                }
            }
        }, PUSH_RESPONSE_EXTRACTOR));
    }

    public boolean isRegisteredForPush() {
        return this.pushIdStorage.hasStoredDeviceId();
    }

    public void registerWithDeviceIdentifier(final String str, final C12008e<String> eVar) {
        if (!checkForStoredPushRegistration(str, eVar)) {
            this.settingsProvider.getCoreSettings(new PassThroughErrorZendeskCallback<CoreSettings>(eVar) {
                public void onSuccess(CoreSettings coreSettings) {
                    AuthenticationType authentication = coreSettings.getAuthentication();
                    if (authentication == null) {
                        C12008e eVar = eVar;
                        if (eVar != null) {
                            eVar.onError(new C12004a("Authentication type is null."));
                        }
                        return;
                    }
                    ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = ZendeskPushRegistrationProvider.this;
                    ZendeskPushRegistrationProvider.this.internalRegister(zendeskPushRegistrationProvider.getPushRegistrationRequest(str, zendeskPushRegistrationProvider.locale, authentication, TokenType.Identifier), eVar);
                }
            });
        }
    }

    public void registerWithUAChannelId(final String str, final C12008e<String> eVar) {
        if (!checkForStoredPushRegistration(str, eVar)) {
            this.settingsProvider.getCoreSettings(new PassThroughErrorZendeskCallback<CoreSettings>(eVar) {
                public void onSuccess(CoreSettings coreSettings) {
                    AuthenticationType authentication = coreSettings.getAuthentication();
                    if (authentication == null) {
                        C12008e eVar = eVar;
                        if (eVar != null) {
                            eVar.onError(new C12004a("Authentication type is null."));
                        }
                        return;
                    }
                    ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = ZendeskPushRegistrationProvider.this;
                    ZendeskPushRegistrationProvider.this.internalRegister(zendeskPushRegistrationProvider.getPushRegistrationRequest(str, zendeskPushRegistrationProvider.locale, authentication, TokenType.UrbanAirshipChannelId), eVar);
                }
            });
        }
    }

    public void unregisterDevice(final C12008e<Void> eVar) {
        String pushDeviceId = this.pushIdStorage.getPushDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (pushDeviceId != null) {
            this.pushService.unregisterDevice(pushDeviceId).enqueue(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<Void>(eVar) {
                public void onSuccess(Void voidR) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removePushDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    C12008e eVar = eVar;
                    if (eVar != null) {
                        eVar.onSuccess(voidR);
                    }
                }
            }));
        }
    }
}
