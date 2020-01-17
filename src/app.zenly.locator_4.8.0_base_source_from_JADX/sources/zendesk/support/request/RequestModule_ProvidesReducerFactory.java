package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.List;
import zendesk.suas.C13621h;

public final class RequestModule_ProvidesReducerFactory implements Factory<List<C13621h>> {
    private static final RequestModule_ProvidesReducerFactory INSTANCE = new RequestModule_ProvidesReducerFactory();

    public static Factory<List<C13621h>> create() {
        return INSTANCE;
    }

    public List<C13621h> get() {
        List<C13621h> providesReducer = RequestModule.providesReducer();
        C12021c.m31671a(providesReducer, "Cannot return null from a non-@Nullable @Provides method");
        return providesReducer;
    }
}
