package zendesk.core;

interface BlipsCoreProvider {
    void coreInitialized();

    void corePushDisabled(Long l);

    void corePushEnabled();
}
