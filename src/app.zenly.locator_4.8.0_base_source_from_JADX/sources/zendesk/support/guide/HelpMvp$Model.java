package zendesk.support.guide;

import com.zendesk.service.C12008e;
import java.util.List;
import zendesk.support.ArticleItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;

public interface HelpMvp$Model {
    void getArticles(List<Long> list, List<Long> list2, String[] strArr, C12008e<List<HelpItem>> eVar);

    void getArticlesForSection(SectionItem sectionItem, String[] strArr, C12008e<List<ArticleItem>> eVar);
}
