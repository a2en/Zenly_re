package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.SessionStorage;

public final class StorageModule_ProvideArticleVoteStorageFactory implements Factory<ArticleVoteStorage> {
    private final Provider<SessionStorage> baseStorageProvider;
    private final StorageModule module;

    public StorageModule_ProvideArticleVoteStorageFactory(StorageModule storageModule, Provider<SessionStorage> provider) {
        this.module = storageModule;
        this.baseStorageProvider = provider;
    }

    public static Factory<ArticleVoteStorage> create(StorageModule storageModule, Provider<SessionStorage> provider) {
        return new StorageModule_ProvideArticleVoteStorageFactory(storageModule, provider);
    }

    public ArticleVoteStorage get() {
        ArticleVoteStorage provideArticleVoteStorage = this.module.provideArticleVoteStorage((SessionStorage) this.baseStorageProvider.get());
        C12021c.m31671a(provideArticleVoteStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideArticleVoteStorage;
    }
}
