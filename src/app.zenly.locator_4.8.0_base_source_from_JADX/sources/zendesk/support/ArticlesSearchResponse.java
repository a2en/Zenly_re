package zendesk.support;

import com.zendesk.util.C12010a;
import java.util.List;

class ArticlesSearchResponse implements ArticlesResponse {
    private List<Category> categories;
    private List<Article> results;
    private List<Section> sections;
    private List<User> users;

    ArticlesSearchResponse() {
    }

    public List<Article> getArticles() {
        return C12010a.m31632a(this.results);
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
