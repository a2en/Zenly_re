package p389io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.schedulers.c */
final class C12724c implements Callable<Void>, Disposable {

    /* renamed from: j */
    static final FutureTask<Void> f33176j = new FutureTask<>(C12301a.f31980b, null);

    /* renamed from: e */
    final Runnable f33177e;

    /* renamed from: f */
    final AtomicReference<Future<?>> f33178f = new AtomicReference<>();

    /* renamed from: g */
    final AtomicReference<Future<?>> f33179g = new AtomicReference<>();

    /* renamed from: h */
    final ExecutorService f33180h;

    /* renamed from: i */
    Thread f33181i;

    C12724c(Runnable runnable, ExecutorService executorService) {
        this.f33177e = runnable;
        this.f33180h = executorService;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36872a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f33179g.get();
            if (future2 == f33176j) {
                future.cancel(this.f33181i != Thread.currentThread());
                return;
            }
        } while (!this.f33179g.compareAndSet(future2, future));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36873b(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f33178f.get();
            if (future2 == f33176j) {
                future.cancel(this.f33181i != Thread.currentThread());
                return;
            }
        } while (!this.f33178f.compareAndSet(future2, future));
    }

    public void dispose() {
        Future future = (Future) this.f33179g.getAndSet(f33176j);
        boolean z = true;
        if (!(future == null || future == f33176j)) {
            future.cancel(this.f33181i != Thread.currentThread());
        }
        Future future2 = (Future) this.f33178f.getAndSet(f33176j);
        if (future2 != null && future2 != f33176j) {
            if (this.f33181i == Thread.currentThread()) {
                z = false;
            }
            future2.cancel(z);
        }
    }

    public boolean isDisposed() {
        return this.f33179g.get() == f33176j;
    }

    public Void call() throws Exception {
        this.f33181i = Thread.currentThread();
        try {
            this.f33177e.run();
            mo36873b(this.f33180h.submit(this));
            this.f33181i = null;
        } catch (Throwable th) {
            this.f33181i = null;
            C12768a.m33415b(th);
        }
        return null;
    }
}
