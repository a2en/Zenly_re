package zendesk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.C11125d;
import java.io.File;
import java.util.Locale;
import okhttp3.C13204g;

class ZendeskStorageModule {
    private static final String STORAGE_BELVEDERE_CACHE;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("belvedere-data-v2");
        sb.append(File.separator);
        sb.append("user");
        sb.append(File.separator);
        sb.append("zendesk");
        STORAGE_BELVEDERE_CACHE = sb.toString();
    }

    private static SharedPreferences getSharedPrefs(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    static BaseStorage provideAdditionalSdkBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("additional_sdk")), serializer);
    }

    static AuthenticationProvider provideAuthProvider(IdentityManager identityManager) {
        return new ZendeskAuthenticationProvider(identityManager);
    }

    static C13204g provideCache(File file) {
        return new C13204g(new File(file, storageName("response_cache")), 20971520);
    }

    static CoreSettingsStorage provideCoreSettingsStorage(SettingsStorage settingsStorage) {
        return new ZendeskCoreSettingsStorage(settingsStorage);
    }

    static BaseStorage provideIdentityBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("identity")), serializer);
    }

    static IdentityManager provideIdentityManager(IdentityStorage identityStorage) {
        return new ZendeskIdentityManager(identityStorage);
    }

    static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        return new ZendeskIdentityStorage(baseStorage);
    }

    static SharedPreferencesStorage provideLegacyIdentityBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, "zendesk-token"), serializer);
    }

    static LegacyIdentityMigrator provideLegacyIdentityStorage(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        LegacyIdentityMigrator legacyIdentityMigrator = new LegacyIdentityMigrator(sharedPreferencesStorage, sharedPreferencesStorage2, identityStorage, identityManager, pushDeviceIdStorage);
        return legacyIdentityMigrator;
    }

    static SharedPreferencesStorage provideLegacyPushBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, "zendesk-push-token"), serializer);
    }

    static MemoryCache provideMemoryCache() {
        return new ZendeskLruMemoryCache();
    }

    static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        return new ZendeskPushDeviceIdStorage(baseStorage);
    }

    static BaseStorage provideSdkBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("sdk")), serializer);
    }

    static Storage provideSdkStorage(SettingsStorage settingsStorage, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        return new ZendeskStorage(sessionStorage, settingsStorage, baseStorage, memoryCache);
    }

    static Serializer provideSerializer(C11125d dVar) {
        return new GsonSerializer(dVar);
    }

    static SessionStorage provideSessionStorage(IdentityStorage identityStorage, BaseStorage baseStorage, BaseStorage baseStorage2, C13204g gVar, File file, File file2, File file3) {
        ZendeskSessionStorage zendeskSessionStorage = new ZendeskSessionStorage(identityStorage, baseStorage, gVar, baseStorage2, file, file2, file3);
        return zendeskSessionStorage;
    }

    static BaseStorage provideSettingsBaseStorage(Context context, Serializer serializer) {
        return new SharedPreferencesStorage(getSharedPrefs(context, storageName("settings")), serializer);
    }

    static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        return new ZendeskSettingsStorage(baseStorage);
    }

    static File providesBelvedereDir(Context context) {
        return new File(context.getCacheDir(), STORAGE_BELVEDERE_CACHE);
    }

    static File providesCacheDir(Context context) {
        return new File(context.getCacheDir(), "zendesk");
    }

    static File providesDataDir(Context context) {
        return new File(context.getFilesDir(), "zendesk");
    }

    static BaseStorage providesDiskLruStorage(File file, Serializer serializer) {
        return new ZendeskDiskLruCache(new File(file, storageName("media_cache")), serializer, 20971520);
    }

    private static String storageName(String str) {
        return String.format(Locale.US, "zendesk_%s", new Object[]{str});
    }
}
