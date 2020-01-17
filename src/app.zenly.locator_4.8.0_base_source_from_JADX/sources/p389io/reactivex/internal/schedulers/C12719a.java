package p389io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.schedulers.SchedulerRunnableIntrospection;

/* renamed from: io.reactivex.internal.schedulers.a */
abstract class C12719a extends AtomicReference<Future<?>> implements Disposable, SchedulerRunnableIntrospection {

    /* renamed from: g */
    protected static final FutureTask<Void> f33158g = new FutureTask<>(C12301a.f31980b, null);

    /* renamed from: h */
    protected static final FutureTask<Void> f33159h = new FutureTask<>(C12301a.f31980b, null);
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: e */
    protected final Runnable f33160e;

    /* renamed from: f */
    protected Thread f33161f;

    C12719a(Runnable runnable) {
        this.f33160e = runnable;
    }

    /* renamed from: a */
    public final void mo36868a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f33158g) {
                if (future2 == f33159h) {
                    future.cancel(this.f33161f != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        Future future = (Future) get();
        if (future != f33158g) {
            FutureTask<Void> futureTask = f33159h;
            if (future != futureTask && compareAndSet(future, futureTask) && future != null) {
                future.cancel(this.f33161f != Thread.currentThread());
            }
        }
    }

    public Runnable getWrappedRunnable() {
        return this.f33160e;
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f33158g || future == f33159h;
    }
}
