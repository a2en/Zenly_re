package zendesk.support.guide;

import com.zendesk.service.C12008e;
import java.util.List;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSearch.Builder;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;

class HelpCenterModel implements HelpCenterMvp$Model {
    private final HelpCenterProvider provider;
    private final SupportSettingsProvider settingsProvider;

    HelpCenterModel(HelpCenterProvider helpCenterProvider, SupportSettingsProvider supportSettingsProvider) {
        this.provider = helpCenterProvider;
        this.settingsProvider = supportSettingsProvider;
    }

    public void getSettings(C12008e<SupportSdkSettings> eVar) {
        this.settingsProvider.getSettings(eVar);
    }

    public void search(List<Long> list, List<Long> list2, String str, String[] strArr, C12008e<List<SearchArticle>> eVar) {
        HelpCenterProvider helpCenterProvider = this.provider;
        Builder builder = new Builder();
        builder.withQuery(str);
        builder.withCategoryIds(list);
        builder.withSectionIds(list2);
        builder.withLabelNames(strArr);
        helpCenterProvider.searchArticles(builder.build(), eVar);
    }
}
