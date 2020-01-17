package zendesk.support;

class AttachmentSettings {
    private static AttachmentSettings DEFAULT = new AttachmentSettings(false, 0);
    private boolean enabled;
    private long maxAttachmentSize;

    AttachmentSettings(boolean z, long j) {
        this.enabled = z;
        this.maxAttachmentSize = j;
    }

    static AttachmentSettings defaultSettings() {
        return DEFAULT;
    }

    /* access modifiers changed from: 0000 */
    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    /* access modifiers changed from: 0000 */
    public boolean isEnabled() {
        return this.enabled;
    }
}
