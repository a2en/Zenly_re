package app.zenly.locator.core.app;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: app.zenly.locator.core.app.a */
/* compiled from: lambda */
public final /* synthetic */ class C2449a implements Executor {

    /* renamed from: a */
    private final /* synthetic */ Handler f7349a;

    public /* synthetic */ C2449a(Handler handler) {
        this.f7349a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f7349a.post(runnable);
    }
}
