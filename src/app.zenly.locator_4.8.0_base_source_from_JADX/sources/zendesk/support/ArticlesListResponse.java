package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class ArticlesListResponse implements ArticlesResponse {
    private List<Article> articles;
    private List<Category> categories;
    private List<Section> sections;
    private List<User> users;

    ArticlesListResponse() {
    }

    public List<Article> getArticles() {
        return C12010a.m31632a(this.articles);
    }

    public List<Category> getCategories() {
        return C12010a.m31632a(this.categories);
    }

    public List<Section> getSections() {
        return C12010a.m31632a(this.sections);
    }

    public List<User> getUsers() {
        return C12010a.m31632a(this.users);
    }
}
