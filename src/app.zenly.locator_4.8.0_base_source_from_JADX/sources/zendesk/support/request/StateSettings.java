package zendesk.support.request;

import java.io.Serializable;
import zendesk.support.SupportSdkSettings;

class StateSettings implements Serializable {
    private final boolean attachmentsEnabled;
    private final boolean conversationsEnabled;
    private final boolean hasIdentityEmailAddress;
    private final boolean hasIdentityName;
    private final long maxAttachmentSize;
    private final boolean neverRequestEmail;
    private final String referrerUrl;
    private final boolean settingsLoaded;
    private final boolean showZendeskLogo;
    private final String systemMessage;

    StateSettings(boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2) {
        this.settingsLoaded = true;
        this.conversationsEnabled = z;
        this.attachmentsEnabled = z2;
        this.maxAttachmentSize = j;
        this.neverRequestEmail = z3;
        this.hasIdentityEmailAddress = z4;
        this.hasIdentityName = z5;
        this.showZendeskLogo = z6;
        this.referrerUrl = str;
        this.systemMessage = str2;
    }

    static StateSettings fromSupportSettings(SupportSdkSettings supportSdkSettings, boolean z, boolean z2) {
        StateSettings stateSettings = new StateSettings(supportSdkSettings.isConversationsEnabled(), supportSdkSettings.isAttachmentsEnabled(), supportSdkSettings.getMaxAttachmentSize(), supportSdkSettings.isNeverAskForEmailEnabled(), z, z2, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl(), supportSdkSettings.getRequestSystemMessage());
        return stateSettings;
    }

    /* access modifiers changed from: 0000 */
    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
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
    public boolean hasIdentityEmailAddress() {
        return this.hasIdentityEmailAddress;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasIdentityName() {
        return this.hasIdentityName;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasSettings() {
        return this.settingsLoaded;
    }

    /* access modifiers changed from: 0000 */
    public boolean isAttachmentsEnabled() {
        return this.attachmentsEnabled;
    }

    /* access modifiers changed from: 0000 */
    public boolean isConversationsEnabled() {
        return this.conversationsEnabled;
    }

    /* access modifiers changed from: 0000 */
    public boolean isNeverRequestEmailOn() {
        return this.neverRequestEmail;
    }

    /* access modifiers changed from: 0000 */
    public boolean isShowZendeskLogo() {
        return this.showZendeskLogo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Settings{settingsLoaded=");
        sb.append(this.settingsLoaded);
        sb.append(", conversationsEnabled=");
        sb.append(this.conversationsEnabled);
        sb.append(", attachmentsEnabled=");
        sb.append(this.attachmentsEnabled);
        sb.append(", maxAttachmentSize=");
        sb.append(this.maxAttachmentSize);
        sb.append(", neverRequestEmail=");
        sb.append(this.neverRequestEmail);
        sb.append(", hasIdentityEmailAddress=");
        sb.append(this.hasIdentityEmailAddress);
        sb.append(", hasIdentityName=");
        sb.append(this.hasIdentityName);
        sb.append(", referrerUrl=");
        sb.append(this.referrerUrl);
        sb.append(", systemMessage=");
        sb.append(this.systemMessage);
        sb.append('}');
        return sb.toString();
    }

    StateSettings() {
        this.settingsLoaded = false;
        this.conversationsEnabled = false;
        this.attachmentsEnabled = false;
        this.maxAttachmentSize = -1;
        this.neverRequestEmail = true;
        this.hasIdentityEmailAddress = false;
        this.hasIdentityName = false;
        this.showZendeskLogo = true;
        String str = "";
        this.referrerUrl = str;
        this.systemMessage = str;
    }
}
