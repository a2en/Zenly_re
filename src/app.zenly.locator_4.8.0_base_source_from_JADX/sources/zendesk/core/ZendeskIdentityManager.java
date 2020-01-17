package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import java.util.Locale;

class ZendeskIdentityManager implements IdentityManager {
    private final IdentityStorage identityStorage;

    ZendeskIdentityManager(IdentityStorage identityStorage2) {
        this.identityStorage = identityStorage2;
    }

    public String getBlipsUuid() {
        String blipsUuid = this.identityStorage.getBlipsUuid();
        return C12017g.m31659c(blipsUuid) ? this.identityStorage.updateBlipsUuid() : blipsUuid;
    }

    public Identity getIdentity() {
        Identity identity = this.identityStorage.getIdentity();
        if (!(identity instanceof AnonymousIdentity)) {
            return identity;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
        anonymousIdentity.setSdkGuid(getSdkGuid());
        return anonymousIdentity;
    }

    public String getSdkGuid() {
        String uuid = this.identityStorage.getUuid();
        return C12017g.m31659c(uuid) ? this.identityStorage.updateSdkGuid() : uuid;
    }

    public String getStoredAccessTokenAsBearerToken() {
        AccessToken storedAccessToken = this.identityStorage.getStoredAccessToken();
        if (storedAccessToken != null) {
            return String.format(Locale.US, "Bearer %s", new Object[]{storedAccessToken.getAccessToken()});
        }
        Logger.m31614d("ZendeskIdentityManager", "There is no stored access token, have you initialised an identity and requested an access token?", new Object[0]);
        return null;
    }

    public Long getUserId() {
        return this.identityStorage.getUserId();
    }

    public boolean identityIsDifferent(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        return identity2 == null || identity == null || !identity2.equals(identity);
    }

    public void storeAccessToken(AccessToken accessToken) {
        String str = "ZendeskIdentityManager";
        if (accessToken == null) {
            Logger.m31614d(str, "Access Token object was null, cannot store.", new Object[0]);
            return;
        }
        if (!C12017g.m31659c(accessToken.getAccessToken())) {
            this.identityStorage.storeAccessToken(accessToken);
        } else {
            Logger.m31614d(str, "Access token String was null or empty, cannot store.", new Object[0]);
        }
        String userId = accessToken.getUserId();
        if (C12017g.m31660d(userId)) {
            this.identityStorage.storeUserId(Long.valueOf(userId));
        } else {
            Logger.m31614d(str, "User ID String was null or empty, cannot store.", new Object[0]);
        }
    }

    public Identity updateAndPersistIdentity(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        String str = "ZendeskIdentityManager";
        if (identity2 == null) {
            Logger.m31608a(str, "No previous identity set, storing identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        } else if (identity == null || !identityIsDifferent(identity)) {
            return identity2;
        } else {
            Logger.m31608a(str, "Identity has changed, storing new identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        }
    }
}
