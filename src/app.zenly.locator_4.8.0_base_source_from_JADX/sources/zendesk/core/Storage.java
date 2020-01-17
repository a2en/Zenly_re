package zendesk.core;

interface Storage {
    void clear();

    SessionStorage getSessionStorage();

    boolean hasSdkConfigChanged(ApplicationConfiguration applicationConfiguration);

    void storeSdkHash(ApplicationConfiguration applicationConfiguration);
}
