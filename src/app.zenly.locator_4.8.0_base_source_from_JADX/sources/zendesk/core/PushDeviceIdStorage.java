package zendesk.core;

interface PushDeviceIdStorage {
    String getPushDeviceId();

    boolean hasStoredDeviceId();

    void removePushDeviceId();

    void storePushDeviceId(String str);
}
