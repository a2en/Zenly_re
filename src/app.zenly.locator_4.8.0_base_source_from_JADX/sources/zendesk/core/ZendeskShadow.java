package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;

final class ZendeskShadow {
    private final BlipsCoreProvider blipsCoreProvider;
    private final CoreModule coreModule;
    private final IdentityManager identityManager;
    private final LegacyIdentityMigrator legacyIdentityMigrator;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final Storage storage;

    ZendeskShadow(Storage storage2, LegacyIdentityMigrator legacyIdentityMigrator2, IdentityManager identityManager2, BlipsCoreProvider blipsCoreProvider2, PushRegistrationProvider pushRegistrationProvider2, CoreModule coreModule2, ProviderStore providerStore) {
        this.storage = storage2;
        this.legacyIdentityMigrator = legacyIdentityMigrator2;
        this.identityManager = identityManager2;
        this.blipsCoreProvider = blipsCoreProvider2;
        this.pushRegistrationProvider = pushRegistrationProvider2;
        this.coreModule = coreModule2;
    }

    private static boolean checkIdentityValid(Identity identity) {
        String str = "ZendeskShadow";
        String str2 = "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.";
        if (identity == null) {
            Logger.m31614d(str, str2, new Object[0]);
            return false;
        } else if (!(identity instanceof AnonymousIdentity) && !(identity instanceof JwtIdentity)) {
            Logger.m31614d(str, str2, new Object[0]);
            return false;
        } else if (!(identity instanceof JwtIdentity) || !C12017g.m31659c(((JwtIdentity) identity).getJwtUserIdentifier())) {
            return true;
        } else {
            Logger.m31614d(str, str2, new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void cleanupIfNewConfig(ApplicationConfiguration applicationConfiguration) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            this.pushRegistrationProvider.unregisterDevice(null);
        }
    }

    public CoreModule coreModule() {
        return this.coreModule;
    }

    /* access modifiers changed from: 0000 */
    public void init(ApplicationConfiguration applicationConfiguration, boolean z) {
        String str = "ZendeskShadow";
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            Logger.m31608a(str, "SDK app config details have changed, cleaning up old config storage.", new Object[0]);
            this.storage.clear();
            this.storage.storeSdkHash(applicationConfiguration);
        } else if (z) {
            Logger.m31613c(str, "Zendesk is already initialized with these details, skipping.", new Object[0]);
            return;
        }
        this.blipsCoreProvider.coreInitialized();
    }

    public void setIdentity(Identity identity) {
        if (checkIdentityValid(identity)) {
            this.legacyIdentityMigrator.checkAndMigrateIdentity();
            if (this.identityManager.identityIsDifferent(identity)) {
                this.pushRegistrationProvider.unregisterDevice(null);
                this.storage.getSessionStorage().clear();
                this.identityManager.updateAndPersistIdentity(identity);
            } else {
                Logger.m31613c("ZendeskShadow", "Zendesk is already initialized with this identity, skipping.", new Object[0]);
            }
        }
    }
}
