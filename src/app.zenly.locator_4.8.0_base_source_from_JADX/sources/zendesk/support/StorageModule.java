package zendesk.support;

import android.content.Context;
import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

class StorageModule {
    StorageModule() {
    }

    /* access modifiers changed from: 0000 */
    public ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return new ZendeskArticleVoteStorage(sessionStorage.getAdditionalSdkStorage());
    }

    /* access modifiers changed from: 0000 */
    public HelpCenterSessionCache provideHelpCenterSessionCache() {
        return new ZendeskHelpCenterSessionCache();
    }

    /* access modifiers changed from: 0000 */
    public RequestMigrator provideRequestMigrator(Context context) {
        return new LegacyRequestMigrator(context.getSharedPreferences("zendesk-authorization", 0));
    }

    /* access modifiers changed from: 0000 */
    public RequestSessionCache provideRequestSessionCache() {
        return new ZendeskRequestSessionCache();
    }

    /* access modifiers changed from: 0000 */
    public RequestStorage provideRequestStorage(SessionStorage sessionStorage, RequestMigrator requestMigrator, MemoryCache memoryCache) {
        return new ZendeskRequestStorage(sessionStorage.getAdditionalSdkStorage(), requestMigrator, memoryCache);
    }
}
