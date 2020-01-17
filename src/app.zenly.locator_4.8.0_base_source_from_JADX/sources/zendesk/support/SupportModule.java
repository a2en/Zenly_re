package zendesk.support;

import java.util.UUID;
import okhttp3.C13325v;

public class SupportModule {
    private final ArticleVoteStorage articleVoteStorage;
    private final SupportBlipsProvider blipsProvider;
    private final HelpCenterProvider helpCenterProvider;

    /* renamed from: id */
    private final UUID f35201id = UUID.randomUUID();
    private final C13325v okHttpClient;
    private final RequestProvider requestProvider;
    private final SupportSettingsProvider settingsProvider;
    private final UploadProvider uploadProvider;

    public SupportModule(RequestProvider requestProvider2, UploadProvider uploadProvider2, HelpCenterProvider helpCenterProvider2, SupportSettingsProvider supportSettingsProvider, SupportBlipsProvider supportBlipsProvider, C13325v vVar, ZendeskTracker zendeskTracker, ArticleVoteStorage articleVoteStorage2) {
        this.requestProvider = requestProvider2;
        this.uploadProvider = uploadProvider2;
        this.helpCenterProvider = helpCenterProvider2;
        this.settingsProvider = supportSettingsProvider;
        this.blipsProvider = supportBlipsProvider;
        this.okHttpClient = vVar;
        this.articleVoteStorage = articleVoteStorage2;
    }

    public UUID getId() {
        return this.f35201id;
    }

    /* access modifiers changed from: 0000 */
    public ArticleVoteStorage providesArticleVoteStorage() {
        return this.articleVoteStorage;
    }

    /* access modifiers changed from: 0000 */
    public SupportBlipsProvider providesBlipsProvider() {
        return this.blipsProvider;
    }

    /* access modifiers changed from: 0000 */
    public HelpCenterProvider providesHelpCenterProvider() {
        return this.helpCenterProvider;
    }

    /* access modifiers changed from: 0000 */
    public C13325v providesOkHttpClient() {
        return this.okHttpClient;
    }

    /* access modifiers changed from: 0000 */
    public RequestProvider providesRequestProvider() {
        return this.requestProvider;
    }

    /* access modifiers changed from: 0000 */
    public SupportSettingsProvider providesSettingsProvider() {
        return this.settingsProvider;
    }

    /* access modifiers changed from: 0000 */
    public UploadProvider providesUploadProvider() {
        return this.uploadProvider;
    }
}
