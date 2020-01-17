package zendesk.support.guide;

import com.zendesk.service.C12008e;
import java.util.List;
import zendesk.support.SearchArticle;
import zendesk.support.SupportSdkSettings;

public interface HelpCenterMvp$Model {
    void getSettings(C12008e<SupportSdkSettings> eVar);

    void search(List<Long> list, List<Long> list2, String str, String[] strArr, C12008e<List<SearchArticle>> eVar);
}
