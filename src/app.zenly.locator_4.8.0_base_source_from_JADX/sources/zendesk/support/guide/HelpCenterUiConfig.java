package zendesk.support.guide;

import android.annotation.SuppressLint;
import java.util.List;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;

public class HelpCenterUiConfig implements UiConfig {
    private final List<Long> categoryIds;
    private final boolean collapseCategories;
    private final boolean contactUsButtonVisibility;
    private final String[] labelNames;
    private final List<Long> sectionIds;
    private final boolean showConversationsMenuButton;
    private List<UiConfig> uiConfigs;

    public List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public List<Long> getSectionIds() {
        return this.sectionIds;
    }

    @SuppressLint({"RestrictedApi"})
    public List<UiConfig> getUiConfigs() {
        return C13561l.m35891a(this.uiConfigs, (UiConfig) this);
    }

    public boolean isCollapseCategories() {
        return this.collapseCategories;
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsButtonVisibility;
    }

    public boolean isShowConversationsMenuButton() {
        return this.showConversationsMenuButton;
    }
}
