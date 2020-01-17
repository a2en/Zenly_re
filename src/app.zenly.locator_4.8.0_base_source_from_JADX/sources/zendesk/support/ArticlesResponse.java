package zendesk.support;

import java.util.List;

interface ArticlesResponse {
    List<Article> getArticles();

    List<Category> getCategories();

    List<Section> getSections();

    List<User> getUsers();
}
