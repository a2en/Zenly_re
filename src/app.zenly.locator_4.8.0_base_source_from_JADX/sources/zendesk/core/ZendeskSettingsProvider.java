package zendesk.core;

import android.content.Context;
import com.google.gson.JsonElement;
import com.zendesk.logger.Logger;
import com.zendesk.service.C12008e;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.util.C12014d;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import retrofit2.C13429h;

class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    private final String applicationId;
    private final Context context;
    /* access modifiers changed from: private */
    public final CoreSettingsStorage coreSettingsStorage;
    /* access modifiers changed from: private */
    public final Serializer serializer;
    private final SdkSettingsService settingsService;
    /* access modifiers changed from: private */
    public final SettingsStorage settingsStorage;

    ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage2, CoreSettingsStorage coreSettingsStorage2, Serializer serializer2, String str, Context context2) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage2;
        this.coreSettingsStorage = coreSettingsStorage2;
        this.serializer = serializer2;
        this.applicationId = str;
        this.context = context2;
    }

    private void getSettingsInternal(Locale locale, C12008e<Map<String, JsonElement>> eVar) {
        this.settingsService.getSettings(C12014d.m31647a(locale), this.applicationId).enqueue(new RetrofitZendeskCallbackAdapter(eVar));
    }

    /* access modifiers changed from: 0000 */
    public CoreSettings extractCoreSettings(Map<String, JsonElement> map) {
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(map == null ? null : (JsonElement) map.get("core"), CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        return ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }

    public void getCoreSettings(final C12008e<CoreSettings> eVar) {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new C12008e<Map<String, JsonElement>>() {
                public void onError(ErrorResponse errorResponse) {
                    C12008e eVar = eVar;
                    if (eVar != null) {
                        eVar.onSuccess(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings());
                    }
                }

                public void onSuccess(Map<String, JsonElement> map) {
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (eVar != null) {
                        eVar.onSuccess(ZendeskSettingsProvider.this.extractCoreSettings(map));
                    }
                }
            });
        } else if (eVar != null) {
            eVar.onSuccess(this.coreSettingsStorage.getCoreSettings());
        }
    }

    public <E extends Settings> void getSettingsForSdk(final String str, final Class<E> cls, final C12008e<SettingsPack<E>> eVar) {
        if (!this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new C12008e<Map<String, JsonElement>>() {
                public void onError(ErrorResponse errorResponse) {
                    if (eVar != null) {
                        if (ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                            eVar.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                        } else {
                            eVar.onError(errorResponse);
                        }
                    }
                }

                public void onSuccess(Map<String, JsonElement> map) {
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (eVar != null) {
                        eVar.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                    }
                }
            });
        } else if (eVar != null) {
            eVar.onSuccess(new SettingsPack(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
        }
    }

    private Map<String, JsonElement> getSettingsInternal(Locale locale) {
        try {
            C13429h execute = this.settingsService.getSettings(C12014d.m31647a(locale), this.applicationId).execute();
            if (execute.mo38662a() != null) {
                return new HashMap((Map) execute.mo38662a());
            }
            return new HashMap(0);
        } catch (IOException unused) {
            Logger.m31610b("ZendeskSdkSettingsProvi", "Settings retrieval failed, returning empty map.", new Object[0]);
            return new HashMap(0);
        }
    }

    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0), null);
        }
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }
}
