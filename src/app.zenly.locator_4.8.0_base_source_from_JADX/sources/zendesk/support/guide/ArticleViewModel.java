package zendesk.support.guide;

import java.io.Serializable;
import java.util.Date;
import zendesk.support.Article;

class ArticleViewModel implements Serializable {
    private final String authorName;
    private final String body;
    private final Date createdAt;

    /* renamed from: id */
    private final long f35204id;
    private final String title;

    ArticleViewModel(Article article) {
        this.f35204id = article.getId().longValue();
        this.title = article.getTitle();
        this.body = article.getBody();
        this.createdAt = article.getCreatedAt();
        this.authorName = article.getAuthor() == null ? null : article.getAuthor().getName();
    }

    /* access modifiers changed from: 0000 */
    public String getAuthorName() {
        return this.authorName;
    }

    /* access modifiers changed from: 0000 */
    public String getBody() {
        return this.body;
    }

    /* access modifiers changed from: 0000 */
    public Date getCreatedAt() {
        return this.createdAt;
    }

    /* access modifiers changed from: 0000 */
    public long getId() {
        return this.f35204id;
    }

    /* access modifiers changed from: 0000 */
    public String getTitle() {
        return this.title;
    }
}
