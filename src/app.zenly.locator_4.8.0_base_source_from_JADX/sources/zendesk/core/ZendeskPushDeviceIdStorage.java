package zendesk.core;

class ZendeskPushDeviceIdStorage implements PushDeviceIdStorage {
    private final BaseStorage deviceIdStorage;

    ZendeskPushDeviceIdStorage(BaseStorage baseStorage) {
        this.deviceIdStorage = baseStorage;
    }

    public String getPushDeviceId() {
        return this.deviceIdStorage.get("pushDeviceIdentifier");
    }

    public boolean hasStoredDeviceId() {
        return this.deviceIdStorage.get("pushDeviceIdentifier") != null;
    }

    public void removePushDeviceId() {
        this.deviceIdStorage.remove("pushDeviceIdentifier");
    }

    public void storePushDeviceId(String str) {
        if (str != null) {
            this.deviceIdStorage.put("pushDeviceIdentifier", str);
        }
    }
}
