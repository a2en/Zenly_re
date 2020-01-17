package zendesk.support;

class ConversationsSettings {
    private static ConversationsSettings DEFAULT = new ConversationsSettings(false);
    private boolean enabled;

    ConversationsSettings(boolean z) {
        this.enabled = z;
    }

    static ConversationsSettings defaultSettings() {
        return DEFAULT;
    }

    /* access modifiers changed from: 0000 */
    public boolean isEnabled() {
        return this.enabled;
    }
}
