package zendesk.core;

import com.google.gson.C11134g;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12017g;
import zendesk.core.AnonymousIdentity.Builder;

class LegacyIdentityMigrator {
    private IdentityManager identityManager;
    private IdentityStorage identityStorage;
    private SharedPreferencesStorage legacyIdentityStorage;
    private SharedPreferencesStorage legacyPushStorage;
    private PushDeviceIdStorage pushDeviceIdStorage;

    /* renamed from: zendesk.core.LegacyIdentityMigrator$1 */
    static /* synthetic */ class C135711 {
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
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$zendesk$core$AuthenticationType     // Catch:{ NoSuchFieldError -> 0x001f }
                zendesk.core.AuthenticationType r1 = zendesk.core.AuthenticationType.JWT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.LegacyIdentityMigrator.C135711.<clinit>():void");
        }
    }

    LegacyIdentityMigrator(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage2, IdentityManager identityManager2, PushDeviceIdStorage pushDeviceIdStorage2) {
        this.legacyIdentityStorage = sharedPreferencesStorage;
        this.legacyPushStorage = sharedPreferencesStorage2;
        this.identityStorage = identityStorage2;
        this.identityManager = identityManager2;
        this.pushDeviceIdStorage = pushDeviceIdStorage2;
    }

    private void clear() {
        this.legacyIdentityStorage.remove("zendesk-identity-type");
        this.legacyIdentityStorage.remove("zendesk-identity");
        this.legacyIdentityStorage.remove("stored_token");
        this.legacyIdentityStorage.remove("uuid");
        this.legacyIdentityStorage.remove("user_id");
        this.legacyPushStorage.remove("pushRegResponseIdentifier");
    }

    private AccessToken getLegacyAccessToken() {
        String str = this.legacyIdentityStorage.get("stored_token");
        if (C12017g.m31659c(str)) {
            return null;
        }
        try {
            JsonElement a = new C11134g().mo32486a(str);
            if (a != null) {
                if (a.isJsonObject()) {
                    JsonObject asJsonObject = a.getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("access_token");
                    JsonElement jsonElement2 = asJsonObject.get("user_id");
                    if (!(jsonElement == null || jsonElement2 == null)) {
                        return new AccessToken(jsonElement.getAsString(), jsonElement2.getAsString());
                    }
                }
            }
            return null;
        } catch (JsonSyntaxException e) {
            Logger.m31612c("LegacyIdentityStorage", "Unable to read legacy AccessToken.", e, new Object[0]);
            return null;
        }
    }

    private Identity getLegacyIdentity() {
        AuthenticationType legacyIdentityType = getLegacyIdentityType();
        if (legacyIdentityType == null) {
            return null;
        }
        int i = C135711.$SwitchMap$zendesk$core$AuthenticationType[legacyIdentityType.ordinal()];
        if (i == 1) {
            return readLegacyAnonymousIdentity();
        }
        if (i != 2) {
            return null;
        }
        return readLegacyJwtIdentity();
    }

    private AuthenticationType getLegacyIdentityType() {
        return AuthenticationType.getAuthType(this.legacyIdentityStorage.get("zendesk-identity-type"));
    }

    private String getLegacyPushId() {
        String str = this.legacyPushStorage.get("pushRegResponseIdentifier");
        if (C12017g.m31658b(str)) {
            try {
                JsonElement a = new C11134g().mo32486a(str);
                if (a != null) {
                    if (a.isJsonObject()) {
                        JsonElement jsonElement = a.getAsJsonObject().get("identifier");
                        if (jsonElement != null) {
                            return jsonElement.getAsString();
                        }
                    }
                }
                return null;
            } catch (JsonSyntaxException e) {
                Logger.m31612c("LegacyIdentityStorage", "Unable to read legacy push device ID.", e, new Object[0]);
            }
        }
        return null;
    }

    private String getLegacySdkGuid() {
        return this.legacyIdentityStorage.get("uuid");
    }

    private long getLegacyUserId() {
        return this.legacyIdentityStorage.getLong("user_id");
    }

    private AnonymousIdentity readLegacyAnonymousIdentity() {
        String str = this.legacyIdentityStorage.get("zendesk-identity");
        if (C12017g.m31659c(str)) {
            return null;
        }
        try {
            JsonElement a = new C11134g().mo32486a(str);
            if (a != null) {
                if (a.isJsonObject()) {
                    JsonObject asJsonObject = a.getAsJsonObject();
                    Builder builder = new Builder();
                    JsonElement jsonElement = asJsonObject.get("email");
                    if (jsonElement != null) {
                        builder.withEmailIdentifier(jsonElement.getAsString());
                    }
                    JsonElement jsonElement2 = asJsonObject.get("name");
                    if (jsonElement2 != null) {
                        builder.withNameIdentifier(jsonElement2.getAsString());
                    }
                    return (AnonymousIdentity) builder.build();
                }
            }
            return null;
        } catch (JsonSyntaxException e) {
            Logger.m31612c("LegacyIdentityStorage", "Unable to read legacy AnonymousIdentity.", e, new Object[0]);
            return null;
        }
    }

    private JwtIdentity readLegacyJwtIdentity() {
        String str = this.legacyIdentityStorage.get("zendesk-identity");
        if (C12017g.m31659c(str)) {
            return null;
        }
        try {
            JsonElement a = new C11134g().mo32486a(str);
            if (a == null) {
                return null;
            }
            JsonObject asJsonObject = a.getAsJsonObject();
            if (asJsonObject == null) {
                return null;
            }
            JsonElement jsonElement = asJsonObject.get("token");
            return jsonElement != null ? new JwtIdentity(jsonElement.getAsString()) : null;
        } catch (JsonSyntaxException e) {
            Logger.m31612c("LegacyIdentityStorage", "Unable to read legacy JwtIdentity.", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void checkAndMigrateIdentity() {
        Identity legacyIdentity = getLegacyIdentity();
        if (legacyIdentity != null) {
            this.identityStorage.storeIdentity(legacyIdentity);
            long legacyUserId = getLegacyUserId();
            if (legacyUserId != 0) {
                this.identityStorage.storeUserId(Long.valueOf(legacyUserId));
            }
            AccessToken legacyAccessToken = getLegacyAccessToken();
            if (legacyAccessToken != null) {
                this.identityManager.storeAccessToken(legacyAccessToken);
            }
            if (getLegacyIdentityType() == AuthenticationType.ANONYMOUS) {
                String legacySdkGuid = getLegacySdkGuid();
                if (C12017g.m31658b(legacySdkGuid)) {
                    this.identityStorage.storeSdkGuid(legacySdkGuid);
                }
            }
            String legacyPushId = getLegacyPushId();
            if (C12017g.m31658b(legacyPushId)) {
                this.pushDeviceIdStorage.storePushDeviceId(legacyPushId);
            }
            clear();
        }
    }
}
