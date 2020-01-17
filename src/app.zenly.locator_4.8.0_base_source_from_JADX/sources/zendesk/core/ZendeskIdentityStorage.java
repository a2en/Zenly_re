package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import java.util.UUID;

class ZendeskIdentityStorage implements IdentityStorage {
    private final BaseStorage identityStorage;

    /* renamed from: zendesk.core.ZendeskIdentityStorage$1 */
    static /* synthetic */ class C135771 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType = new int[AuthenticationType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                zendesk.core.AuthenticationType[] r0 = zendesk.core.AuthenticationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$core$AuthenticationType = r0
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x0014 }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.JWT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ZendeskIdentityStorage.C135771.<clinit>():void");
        }
    }

    ZendeskIdentityStorage(BaseStorage baseStorage) {
        this.identityStorage = baseStorage;
    }

    public void clear() {
        this.identityStorage.clear();
    }

    public String getBlipsUuid() {
        return this.identityStorage.get("blips_buid");
    }

    public Identity getIdentity() {
        String str = this.identityStorage.get("zendesk-identity-type");
        if (C12017g.m31658b(str)) {
            AuthenticationType authType = AuthenticationType.getAuthType(str);
            if (authType != null) {
                int i = C135771.$SwitchMap$zendesk$core$AuthenticationType[authType.ordinal()];
                String str2 = "zendesk-identity";
                String str3 = "ZendeskIdentityStorage";
                if (i == 1) {
                    Logger.m31608a(str3, "Loading Jwt identity", new Object[0]);
                    return (Identity) this.identityStorage.get(str2, JwtIdentity.class);
                } else if (i == 2) {
                    Logger.m31608a(str3, "Loading Anonymous identity", new Object[0]);
                    return (Identity) this.identityStorage.get(str2, AnonymousIdentity.class);
                }
            }
        }
        return null;
    }

    public AccessToken getStoredAccessToken() {
        return (AccessToken) this.identityStorage.get("stored_token", AccessToken.class);
    }

    public Long getUserId() {
        return (Long) this.identityStorage.get("user_id", Long.class);
    }

    public String getUuid() {
        Logger.m31608a("ZendeskIdentityStorage", "Fetching UUID from preferences store", new Object[0]);
        String str = this.identityStorage.get("uuid");
        return C12017g.m31659c(str) ? "" : str;
    }

    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken != null) {
            this.identityStorage.put("stored_token", (Object) accessToken);
        }
    }

    public void storeIdentity(Identity identity) {
        String str = "ZendeskIdentityStorage";
        if (identity == null) {
            Logger.m31610b(str, "identity is null, will not store the identity", new Object[0]);
            return;
        }
        String str2 = null;
        if (identity instanceof AnonymousIdentity) {
            Logger.m31608a(str, "Storing anonymous identity", new Object[0]);
            str2 = AuthenticationType.ANONYMOUS.getAuthenticationType();
        } else if (identity instanceof JwtIdentity) {
            Logger.m31608a(str, "Storing jwt identity", new Object[0]);
            str2 = AuthenticationType.JWT.getAuthenticationType();
        } else {
            Logger.m31610b(str, "Unknown authentication type, identity will not be stored", new Object[0]);
        }
        if (!(identity == null || str2 == null)) {
            this.identityStorage.put("zendesk-identity", (Object) identity);
            this.identityStorage.put("zendesk-identity-type", str2);
        }
    }

    public void storeSdkGuid(String str) {
        Logger.m31608a("ZendeskIdentityStorage", "Storing new UUID in preference store", new Object[0]);
        this.identityStorage.put("uuid", str);
    }

    public void storeUserId(Long l) {
        if (l != null) {
            this.identityStorage.put("user_id", (Object) l);
        }
    }

    public String updateBlipsUuid() {
        String uuid = UUID.randomUUID().toString();
        Logger.m31608a("ZendeskIdentityStorage", "Generate new Blips BUID", new Object[0]);
        this.identityStorage.put("blips_buid", uuid);
        return uuid;
    }

    public String updateSdkGuid() {
        String uuid = UUID.randomUUID().toString();
        storeSdkGuid(uuid);
        return uuid;
    }
}
