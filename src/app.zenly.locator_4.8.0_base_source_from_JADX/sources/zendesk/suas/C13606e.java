package zendesk.suas;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: zendesk.suas.e */
class C13606e {

    /* renamed from: zendesk.suas.e$a */
    public static class C13607a implements Executor {

        /* renamed from: a */
        private final Handler f35142a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.f35142a.post(runnable);
            }
        }
    }

    /* renamed from: zendesk.suas.e$b */
    public static class C13608b implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    static Executor m35915a() {
        return new C13607a();
    }

    /* renamed from: b */
    static Executor m35916b() {
        return new C13608b();
    }
}
