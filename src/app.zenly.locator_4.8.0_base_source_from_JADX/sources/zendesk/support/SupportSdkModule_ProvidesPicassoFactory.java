package zendesk.support;

import android.content.Context;
import com.squareup.picasso.Picasso;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import okhttp3.C13325v;

public final class SupportSdkModule_ProvidesPicassoFactory implements Factory<Picasso> {
    private final Provider<Context> contextProvider;
    private final Provider<ExecutorService> executorServiceProvider;
    private final SupportSdkModule module;
    private final Provider<C13325v> okHttpClientProvider;

    public SupportSdkModule_ProvidesPicassoFactory(SupportSdkModule supportSdkModule, Provider<Context> provider, Provider<C13325v> provider2, Provider<ExecutorService> provider3) {
        this.module = supportSdkModule;
        this.contextProvider = provider;
        this.okHttpClientProvider = provider2;
        this.executorServiceProvider = provider3;
    }

    public static Factory<Picasso> create(SupportSdkModule supportSdkModule, Provider<Context> provider, Provider<C13325v> provider2, Provider<ExecutorService> provider3) {
        return new SupportSdkModule_ProvidesPicassoFactory(supportSdkModule, provider, provider2, provider3);
    }

    public Picasso get() {
        Picasso providesPicasso = this.module.providesPicasso((Context) this.contextProvider.get(), (C13325v) this.okHttpClientProvider.get(), (ExecutorService) this.executorServiceProvider.get());
        C12021c.m31671a(providesPicasso, "Cannot return null from a non-@Nullable @Provides method");
        return providesPicasso;
    }
}
