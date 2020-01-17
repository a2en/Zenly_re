package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class RequestModule_ProvidesAsyncMiddlewareFactory implements Factory<AsyncMiddleware> {
    private static final RequestModule_ProvidesAsyncMiddlewareFactory INSTANCE = new RequestModule_ProvidesAsyncMiddlewareFactory();

    public static Factory<AsyncMiddleware> create() {
        return INSTANCE;
    }

    public AsyncMiddleware get() {
        AsyncMiddleware providesAsyncMiddleware = RequestModule.providesAsyncMiddleware();
        C12021c.m31671a(providesAsyncMiddleware, "Cannot return null from a non-@Nullable @Provides method");
        return providesAsyncMiddleware;
    }
}
