package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.util.C12017g;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

class ZendeskBlipsProvider implements BlipsProvider, BlipsCoreProvider {
    private final String appId;
    /* access modifiers changed from: private */
    public final BlipsService blipsService;
    private final CoreSettingsStorage coreSettingsStorage;
    private final DeviceInfo deviceInfo;
    private final Executor executor;
    private final IdentityManager identityManager;
    /* access modifiers changed from: private */
    public final Serializer serializer;

    ZendeskBlipsProvider(BlipsService blipsService2, DeviceInfo deviceInfo2, Serializer serializer2, IdentityManager identityManager2, String str, CoreSettingsStorage coreSettingsStorage2, Executor executor2) {
        this.blipsService = blipsService2;
        this.deviceInfo = deviceInfo2;
        this.serializer = serializer2;
        this.identityManager = identityManager2;
        this.appId = str;
        this.coreSettingsStorage = coreSettingsStorage2;
        this.executor = executor2;
    }

    private Map<String, Object> addDeviceInfoToValue(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("device", this.deviceInfo.getInfo());
        if (map != null && !map.isEmpty()) {
            hashMap.put("payload", map);
        }
        return hashMap;
    }

    public void coreInitialized() {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "java");
        UserAction userAction = new UserAction("2.0.1", "core_sdk", "CoreSDK", "init", null, hashMap);
        sendBlip(userAction, BlipsGroup.REQUIRED);
    }

    public void corePushDisabled(Long l) {
        sendBlip(BlipsGroup.REQUIRED, new UserAction("2.0.1", "core_sdk", "CoreSDK", "PushOff"), l);
    }

    public void corePushEnabled() {
        sendBlip(new UserAction("2.0.1", "core_sdk", "CoreSDK", "PushOn"), BlipsGroup.REQUIRED);
    }

    /* access modifiers changed from: 0000 */
    public BlipsRequest createBlipsRequest(UserAction userAction, String str, String str2, Long l) {
        return BlipsRequest.buildUserAction(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, userAction.getVersion(), userAction.getChannel(), userAction.getCategory(), userAction.getAction(), userAction.getLabel(), addDeviceInfoToValue(userAction.getValue()));
    }

    /* access modifiers changed from: 0000 */
    public void dispatchBlip(final BlipsRequest blipsRequest) {
        this.executor.execute(new Runnable() {
            public void run() {
                ZendeskBlipsProvider.this.blipsService.send(ZendeskBlipsProvider.this.serializer.serialize(blipsRequest)).enqueue(new RetrofitZendeskCallbackAdapter(new C12008e<Void>(this) {
                    public void onError(ErrorResponse errorResponse) {
                        Logger.m31608a("ZendeskBlipsProvider", "Unable to send Blip | Error: %s", errorResponse.getReason());
                    }

                    public void onSuccess(Void voidR) {
                    }
                }));
            }
        });
    }

    public void sendBlip(UserAction userAction, BlipsGroup blipsGroup) {
        sendBlip(blipsGroup, userAction, this.identityManager.getUserId());
    }

    /* access modifiers changed from: 0000 */
    public void sendBlip(BlipsGroup blipsGroup, UserAction userAction, Long l) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && C12017g.m31658b(userAction.getChannel())) {
            dispatchBlip(createBlipsRequest(userAction, this.identityManager.getBlipsUuid(), this.appId, l));
        }
    }

    /* access modifiers changed from: 0000 */
    public BlipsRequest createBlipsRequest(PageView pageView, String str, String str2, Long l) {
        return BlipsRequest.buildPageView(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, pageView.getVersion(), pageView.getChannel(), pageView.getUrl(), pageView.getNavigatorLanguage(), pageView.getPageTitle(), addDeviceInfoToValue(pageView.getValue()));
    }

    public void sendBlip(PageView pageView, BlipsGroup blipsGroup) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && C12017g.m31658b(pageView.getChannel())) {
            dispatchBlip(createBlipsRequest(pageView, this.identityManager.getBlipsUuid(), this.appId, this.identityManager.getUserId()));
        }
    }
}
