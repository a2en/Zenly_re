package zendesk.support;

import com.google.gson.p315j.C11258c;
import zendesk.core.Settings;

public class HelpCenterSettings implements Settings {
    private static HelpCenterSettings DEFAULT = new HelpCenterSettings();
    @C11258c("help_center_article_voting_enabled")
    private boolean articleVotingEnabled;
    private boolean enabled;
    private String locale;

    HelpCenterSettings() {
    }

    static HelpCenterSettings defaultSettings() {
        return DEFAULT;
    }

    public String getLocale() {
        return this.locale;
    }

    /* access modifiers changed from: 0000 */
    public boolean isArticleVotingEnabled() {
        return this.articleVotingEnabled;
    }

    /* access modifiers changed from: 0000 */
    public boolean isEnabled() {
        return this.enabled;
    }
}
