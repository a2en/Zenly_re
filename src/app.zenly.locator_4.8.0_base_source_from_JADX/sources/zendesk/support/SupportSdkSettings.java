package zendesk.support;

import com.zendesk.util.C12010a;
import com.zendesk.util.C12017g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import zendesk.core.AuthenticationType;

public class SupportSdkSettings {
    private final AuthenticationType authenticationType;
    private final HelpCenterSettings helpCenterSettings;
    private final SupportSettings mobileSettings;

    public SupportSdkSettings(SupportSettings supportSettings, HelpCenterSettings helpCenterSettings2, AuthenticationType authenticationType2) {
        this.mobileSettings = supportSettings;
        this.helpCenterSettings = helpCenterSettings2;
        this.authenticationType = authenticationType2;
    }

    private AttachmentSettings getAttachmentSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if ((supportSettings == null || supportSettings.getAttachments() == null) ? false : true) {
            return this.mobileSettings.getAttachments();
        }
        return null;
    }

    private ConversationsSettings getConversationsSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if ((supportSettings == null || supportSettings.getConversations() == null) ? false : true) {
            return this.mobileSettings.getConversations();
        }
        return null;
    }

    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    public List<String> getContactZendeskTags() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings != null && supportSettings.getContactUs() != null && C12010a.m31639b((Collection<Type>) this.mobileSettings.getContactUs().getTags()) ? this.mobileSettings.getContactUs().getTags() : new ArrayList();
    }

    public String getHelpCenterLocale() {
        HelpCenterSettings helpCenterSettings2 = this.helpCenterSettings;
        return helpCenterSettings2 != null && helpCenterSettings2.getLocale() != null ? this.helpCenterSettings.getLocale() : "";
    }

    public long getMaxAttachmentSize() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            return attachmentSettings.getMaxAttachmentSize();
        }
        return 0;
    }

    public String getReferrerUrl() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || !C12017g.m31658b(supportSettings.getReferrerUrl())) ? "https://www.zendesk.com/embeddables" : this.mobileSettings.getReferrerUrl();
    }

    public String getRequestSystemMessage() {
        SupportSettings supportSettings = this.mobileSettings;
        return (supportSettings == null || !C12017g.m31658b(supportSettings.getSystemMessage())) ? "" : this.mobileSettings.getSystemMessage();
    }

    public boolean hasHelpCenterSettings() {
        return this.helpCenterSettings != null;
    }

    public boolean isAttachmentsEnabled() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        return attachmentSettings != null && attachmentSettings.isEnabled();
    }

    public boolean isConversationsEnabled() {
        ConversationsSettings conversationsSettings = getConversationsSettings();
        return conversationsSettings != null && conversationsSettings.isEnabled();
    }

    public boolean isHelpCenterArticleVotingEnabled() {
        return hasHelpCenterSettings() && this.helpCenterSettings.isArticleVotingEnabled();
    }

    public boolean isHelpCenterEnabled() {
        HelpCenterSettings helpCenterSettings2 = this.helpCenterSettings;
        return helpCenterSettings2 != null && helpCenterSettings2.isEnabled();
    }

    public boolean isNeverAskForEmailEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isNeverRequestEmailOn();
    }

    public boolean isShowClosedRequests() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings == null || supportSettings.isShowClosedRequests();
    }

    public boolean isShowReferrerLogoEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        return supportSettings != null && supportSettings.isShowReferrerLogo();
    }

    public boolean isTicketFormSupportAvailable() {
        SupportSettings supportSettings = this.mobileSettings;
        if (!((supportSettings == null || supportSettings.getTicketForms() == null) ? false : true) || !this.mobileSettings.getTicketForms().isAvailable()) {
            return false;
        }
        return true;
    }
}
