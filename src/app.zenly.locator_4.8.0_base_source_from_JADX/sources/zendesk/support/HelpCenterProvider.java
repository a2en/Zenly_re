package zendesk.support;

import com.zendesk.service.C12008e;
import java.util.List;
import java.util.Locale;

public interface HelpCenterProvider {
    void deleteVote(Long l, C12008e<Void> eVar);

    void downvoteArticle(Long l, C12008e<ArticleVote> eVar);

    void getArticle(Long l, C12008e<Article> eVar);

    void getArticles(Long l, C12008e<List<Article>> eVar);

    void getArticles(Long l, String str, C12008e<List<Article>> eVar);

    void getAttachments(Long l, AttachmentType attachmentType, C12008e<List<HelpCenterAttachment>> eVar);

    void getCategories(C12008e<List<Category>> eVar);

    void getCategory(Long l, C12008e<Category> eVar);

    void getHelp(HelpRequest helpRequest, C12008e<List<HelpItem>> eVar);

    void getSection(Long l, C12008e<Section> eVar);

    void getSections(Long l, C12008e<List<Section>> eVar);

    void getSuggestedArticles(SuggestedArticleSearch suggestedArticleSearch, C12008e<Object> eVar);

    void listArticles(ListArticleQuery listArticleQuery, C12008e<List<SearchArticle>> eVar);

    void listArticlesFlat(ListArticleQuery listArticleQuery, C12008e<List<Object>> eVar);

    void searchArticles(HelpCenterSearch helpCenterSearch, C12008e<List<SearchArticle>> eVar);

    void submitRecordArticleView(Article article, Locale locale, C12008e<Void> eVar);

    void upvoteArticle(Long l, C12008e<ArticleVote> eVar);
}
