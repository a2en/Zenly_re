package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.g */
public abstract class C0862g {

    /* renamed from: androidx.lifecycle.g$a */
    public enum C0863a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.g$b */
    public enum C0864b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo4448a(C0864b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public C0862g() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract C0864b mo4445a();

    /* renamed from: a */
    public abstract void mo4446a(LifecycleObserver lifecycleObserver);

    /* renamed from: b */
    public abstract void mo4447b(LifecycleObserver lifecycleObserver);
}
