package zendesk.core;

import com.google.gson.C11125d;
import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ZendeskApplicationModule_ProvideGsonFactory implements Factory<C11125d> {
    private static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

    public static Factory<C11125d> create() {
        return INSTANCE;
    }

    public C11125d get() {
        C11125d provideGson = ZendeskApplicationModule.provideGson();
        C12021c.m31671a(provideGson, "Cannot return null from a non-@Nullable @Provides method");
        return provideGson;
    }
}
