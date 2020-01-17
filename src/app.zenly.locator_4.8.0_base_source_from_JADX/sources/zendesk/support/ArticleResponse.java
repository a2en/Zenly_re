package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class ArticleResponse {
    private Article article;
    private List<User> users;

    ArticleResponse() {
    }

    /* access modifiers changed from: 0000 */
    public Article getArticle() {
        return this.article;
    }

    /* access modifiers changed from: 0000 */
    public List<User> getUsers() {
        return C12010a.m31632a(this.users);
    }
}
