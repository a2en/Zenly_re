package zendesk.support.request;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.belvedere.C13489a;

public final class RequestModule_ProvidesBelvedereFactory implements Factory<C13489a> {
    private final Provider<Context> contextProvider;

    public RequestModule_ProvidesBelvedereFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<C13489a> create(Provider<Context> provider) {
        return new RequestModule_ProvidesBelvedereFactory(provider);
    }

    public C13489a get() {
        C13489a providesBelvedere = RequestModule.providesBelvedere((Context) this.contextProvider.get());
        C12021c.m31671a(providesBelvedere, "Cannot return null from a non-@Nullable @Provides method");
        return providesBelvedere;
    }
}
