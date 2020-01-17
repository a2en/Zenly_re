package zendesk.support;

import retrofit2.Call;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13446b;
import retrofit2.p427m.C13449e;
import retrofit2.p427m.C13456l;
import retrofit2.p427m.C13460p;
import retrofit2.p427m.C13461q;

interface HelpCenterService {
    @C13446b("/api/v2/help_center/votes/{vote_id}.json")
    Call<Void> deleteVote(@C13460p("vote_id") Long l);

    @C13456l("/api/v2/help_center/articles/{article_id}/down.json")
    Call<ArticleVoteResponse> downvoteArticle(@C13460p("article_id") Long l, @C13445a String str);

    @C13449e("/api/v2/help_center/{locale}/articles/{article_id}.json?respect_sanitization_settings=true")
    Call<ArticleResponse> getArticle(@C13460p("locale") String str, @C13460p("article_id") Long l, @C13461q("include") String str2);

    @C13449e("/api/v2/help_center/{locale}/sections/{id}/articles.json?respect_sanitization_settings=true")
    Call<ArticlesListResponse> getArticles(@C13460p("locale") String str, @C13460p("id") Long l, @C13461q("label_names") String str2, @C13461q("include") String str3, @C13461q("per_page") int i);

    @C13449e("/api/v2/help_center/{locale}/articles/{article_id}/attachments/{attachment_type}.json")
    Call<AttachmentResponse> getAttachments(@C13460p("locale") String str, @C13460p("article_id") Long l, @C13460p("attachment_type") String str2);

    @C13449e("/api/v2/help_center/{locale}/categories.json?per_page=1000")
    Call<CategoriesResponse> getCategories(@C13460p("locale") String str);

    @C13449e("/api/v2/help_center/{locale}/categories/{category_id}.json")
    Call<CategoryResponse> getCategoryById(@C13460p("locale") String str, @C13460p("category_id") Long l);

    @C13449e("/hc/api/mobile/{locale}/article_tree.json")
    Call<HelpResponse> getHelp(@C13460p("locale") String str, @C13461q("category_ids") String str2, @C13461q("section_ids") String str3, @C13461q("include") String str4, @C13461q("limit") int i, @C13461q("article_labels") String str5, @C13461q("per_page") int i2, @C13461q("sort_by") String str6, @C13461q("sort_order") String str7);

    @C13449e("/api/v2/help_center/{locale}/sections/{section_id}.json")
    Call<SectionResponse> getSectionById(@C13460p("locale") String str, @C13460p("section_id") Long l);

    @C13449e("/api/v2/help_center/{locale}/categories/{id}/sections.json")
    Call<SectionsResponse> getSections(@C13460p("locale") String str, @C13460p("id") Long l, @C13461q("per_page") int i);

    @C13449e("/api/v2/help_center/articles/search.json?respect_sanitization_settings=true&origin=mobile_sdk")
    Call<ArticlesSearchResponse> searchArticles(@C13461q("query") String str, @C13461q("locale") String str2, @C13461q("include") String str3, @C13461q("label_names") String str4, @C13461q("category") String str5, @C13461q("section") String str6, @C13461q("page") Integer num, @C13461q("per_page") Integer num2);

    @C13456l("/api/v2/help_center/{locale}/articles/{article_id}/stats/view.json")
    Call<Void> submitRecordArticleView(@C13460p("article_id") Long l, @C13460p("locale") String str, @C13445a RecordArticleViewRequest recordArticleViewRequest);

    @C13456l("/api/v2/help_center/articles/{article_id}/up.json")
    Call<ArticleVoteResponse> upvoteArticle(@C13460p("article_id") Long l, @C13445a String str);
}
