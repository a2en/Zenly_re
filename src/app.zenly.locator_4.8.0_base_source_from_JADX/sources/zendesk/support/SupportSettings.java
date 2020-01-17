package zendesk.support;

import zendesk.core.Settings;

class SupportSettings implements Settings {
    private static SupportSettings DEFAULT;
    private final AttachmentSettings attachments;
    private final ContactUsSettings contactUs;
    private final ConversationsSettings conversations;
    private final boolean neverRequestEmail;
    private final String referrerUrl;
    private final boolean showClosedRequests;
    private final boolean showReferrerLogo;
    private final String systemMessage;
    private final TicketFormSettings ticketForms;

    static {
        SupportSettings supportSettings = new SupportSettings(ConversationsSettings.defaultSettings(), ContactUsSettings.defaultSettings(), AttachmentSettings.defaultSettings(), TicketFormSettings.defaultSettings(), true, true, false, "", "");
        DEFAULT = supportSettings;
    }

    SupportSettings(ConversationsSettings conversationsSettings, ContactUsSettings contactUsSettings, AttachmentSettings attachmentSettings, TicketFormSettings ticketFormSettings, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.conversations = conversationsSettings;
        this.contactUs = contactUsSettings;
        this.attachments = attachmentSettings;
        this.ticketForms = ticketFormSettings;
        this.neverRequestEmail = z;
        this.showClosedRequests = z2;
        this.showReferrerLogo = z3;
        this.referrerUrl = str;
        this.systemMessage = str2;
    }

    static SupportSettings defaultSettings() {
        return DEFAULT;
    }

    /* access modifiers changed from: 0000 */
    public AttachmentSettings getAttachments() {
        return this.attachments;
    }

    /* access modifiers changed from: 0000 */
    public ContactUsSettings getContactUs() {
        return this.contactUs;
    }

    /* access modifiers changed from: 0000 */
    public ConversationsSettings getConversations() {
        return this.conversations;
    }

    /* access modifiers changed from: 0000 */
    public String getReferrerUrl() {
        return this.referrerUrl;
    }

    /* access modifiers changed from: 0000 */
    public String getSystemMessage() {
        return this.systemMessage;
    }

    /* access modifiers changed from: 0000 */
    public TicketFormSettings getTicketForms() {
        return this.ticketForms;
    }

    /* access modifiers changed from: 0000 */
    public boolean isNeverRequestEmailOn() {
        return this.neverRequestEmail;
    }

    /* access modifiers changed from: 0000 */
    public boolean isShowClosedRequests() {
        return this.showClosedRequests;
    }

    /* access modifiers changed from: 0000 */
    public boolean isShowReferrerLogo() {
        return this.showReferrerLogo;
    }
}
