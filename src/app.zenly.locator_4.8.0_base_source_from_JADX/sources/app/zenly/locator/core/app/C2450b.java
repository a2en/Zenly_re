package app.zenly.locator.core.app;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: app.zenly.locator.core.app.b */
/* compiled from: lambda */
public final /* synthetic */ class C2450b implements Executor {

    /* renamed from: a */
    private final /* synthetic */ ExecutorService f7350a;

    public /* synthetic */ C2450b(ExecutorService executorService) {
        this.f7350a = executorService;
    }

    public final void execute(Runnable runnable) {
        this.f7350a.execute(runnable);
    }
}
