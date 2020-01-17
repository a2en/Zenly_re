package zendesk.core;

import com.zendesk.util.C12012b;
import java.util.Locale;

class ZendeskStorage implements Storage {
    private final MemoryCache memoryCache;
    private final BaseStorage sdkDetailsStorage;
    private final SessionStorage sessionStorage;
    private final SettingsStorage settingsStorage;

    ZendeskStorage(SessionStorage sessionStorage2, SettingsStorage settingsStorage2, BaseStorage baseStorage, MemoryCache memoryCache2) {
        this.sessionStorage = sessionStorage2;
        this.settingsStorage = settingsStorage2;
        this.sdkDetailsStorage = baseStorage;
        this.memoryCache = memoryCache2;
    }

    private String generateSdkHash(ApplicationConfiguration applicationConfiguration) {
        return C12012b.m31642a(String.format(Locale.US, "%s_%s_%s", new Object[]{applicationConfiguration.getZendeskUrl().toLowerCase(Locale.US), applicationConfiguration.getApplicationId().toLowerCase(Locale.US), applicationConfiguration.getOauthClientId().toLowerCase(Locale.US)}));
    }

    public void clear() {
        this.sessionStorage.clear();
        this.settingsStorage.clear();
        this.memoryCache.clear();
    }

    public SessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    public boolean hasSdkConfigChanged(ApplicationConfiguration applicationConfiguration) {
        return !generateSdkHash(applicationConfiguration).equals(this.sdkDetailsStorage.get("sdk_hash"));
    }

    public void storeSdkHash(ApplicationConfiguration applicationConfiguration) {
        this.sdkDetailsStorage.put("sdk_hash", generateSdkHash(applicationConfiguration));
    }
}
