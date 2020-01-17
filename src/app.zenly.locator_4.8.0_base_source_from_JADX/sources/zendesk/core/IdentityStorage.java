package zendesk.core;

interface IdentityStorage {
    void clear();

    String getBlipsUuid();

    Identity getIdentity();

    AccessToken getStoredAccessToken();

    Long getUserId();

    String getUuid();

    void storeAccessToken(AccessToken accessToken);

    void storeIdentity(Identity identity);

    void storeSdkGuid(String str);

    void storeUserId(Long l);

    String updateBlipsUuid();

    String updateSdkGuid();
}
