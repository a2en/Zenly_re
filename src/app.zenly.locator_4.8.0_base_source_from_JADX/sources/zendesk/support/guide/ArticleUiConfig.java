package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import zendesk.commonui.C13561l;
import zendesk.commonui.UiConfig;
import zendesk.support.Article;

public class ArticleUiConfig implements UiConfig {
    private final ArticleViewModel article;
    private final long articleId;
    private final int configurationState;
    private final boolean contactUsVisible;
    private final List<UiConfig> uiConfigs;

    public static class Builder {
        /* access modifiers changed from: private */
        public ArticleViewModel article;
        /* access modifiers changed from: private */
        public long articleId;
        /* access modifiers changed from: private */
        public int configurationState;
        /* access modifiers changed from: private */
        public boolean contactUsVisible = true;
        /* access modifiers changed from: private */
        public List<UiConfig> uiConfigs = new ArrayList();

        public Builder(long j) {
            this.articleId = j;
            this.configurationState = 1;
        }

        private void setUiConfigs(List<UiConfig> list) {
            this.uiConfigs = list;
            ArticleUiConfig articleUiConfig = (ArticleUiConfig) C13561l.m35893a(list, ArticleUiConfig.class);
            if (articleUiConfig != null) {
                this.contactUsVisible = articleUiConfig.isContactUsButtonVisible();
            }
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<UiConfig> list) {
            setUiConfigs(list);
            ArticleUiConfig articleUiConfig = new ArticleUiConfig(this);
            Intent intent = new Intent(context, ViewArticleActivity.class);
            C13561l.m35895a(intent, (UiConfig) articleUiConfig);
            return intent;
        }

        public void show(Context context, List<UiConfig> list) {
            context.startActivity(intent(context, list));
        }

        public Builder(Article article2) {
            this.article = new ArticleViewModel(article2);
            this.configurationState = 2;
        }
    }

    /* access modifiers changed from: 0000 */
    public ArticleViewModel getArticle() {
        return this.article;
    }

    /* access modifiers changed from: 0000 */
    public long getArticleId() {
        return this.articleId;
    }

    /* access modifiers changed from: 0000 */
    public int getConfigurationState() {
        return this.configurationState;
    }

    @SuppressLint({"RestrictedApi"})
    public List<UiConfig> getUiConfigs() {
        return C13561l.m35891a(this.uiConfigs, (UiConfig) this);
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsVisible;
    }

    private ArticleUiConfig(Builder builder) {
        this.configurationState = builder.configurationState;
        this.article = builder.article;
        this.articleId = builder.articleId;
        this.contactUsVisible = builder.contactUsVisible;
        this.uiConfigs = builder.uiConfigs;
    }
}
