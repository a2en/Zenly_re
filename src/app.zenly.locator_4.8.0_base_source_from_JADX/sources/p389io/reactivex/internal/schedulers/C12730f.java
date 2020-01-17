package p389io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.disposables.DisposableContainer;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.schedulers.f */
public class C12730f extends C12289c implements Disposable {

    /* renamed from: e */
    private final ScheduledExecutorService f33203e;

    /* renamed from: f */
    volatile boolean f33204f;

    public C12730f(ThreadFactory threadFactory) {
        this.f33203e = C12736k.m33311a(threadFactory);
    }

    /* renamed from: a */
    public Disposable mo6574a(Runnable runnable) {
        return mo6576a(runnable, 0, null);
    }

    /* renamed from: b */
    public Disposable mo36887b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C12734i iVar = new C12734i(C12768a.m33405a(runnable));
        if (j <= 0) {
            try {
                future = this.f33203e.submit(iVar);
            } catch (RejectedExecutionException e) {
                C12768a.m33415b((Throwable) e);
                return C12459c.INSTANCE;
            }
        } else {
            future = this.f33203e.schedule(iVar, j, timeUnit);
        }
        iVar.mo36868a(future);
        return iVar;
    }

    public void dispose() {
        if (!this.f33204f) {
            this.f33204f = true;
            this.f33203e.shutdownNow();
        }
    }

    public boolean isDisposed() {
        return this.f33204f;
    }

    /* renamed from: a */
    public Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f33204f) {
            return C12459c.INSTANCE;
        }
        return mo36884a(runnable, j, timeUnit, null);
    }

    /* renamed from: a */
    public C12735j mo36884a(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        Future future;
        C12735j jVar = new C12735j(C12768a.m33405a(runnable), disposableContainer);
        if (disposableContainer != null && !disposableContainer.add(jVar)) {
            return jVar;
        }
        if (j <= 0) {
            try {
                future = this.f33203e.submit(jVar);
            } catch (RejectedExecutionException e) {
                if (disposableContainer != null) {
                    disposableContainer.remove(jVar);
                }
                C12768a.m33415b((Throwable) e);
            }
        } else {
            future = this.f33203e.schedule(jVar, j, timeUnit);
        }
        jVar.mo36892a(future);
        return jVar;
    }

    /* renamed from: b */
    public Disposable mo36886b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C12768a.m33405a(runnable);
        if (j2 <= 0) {
            C12724c cVar = new C12724c(a, this.f33203e);
            if (j <= 0) {
                try {
                    future = this.f33203e.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C12768a.m33415b((Throwable) e);
                    return C12459c.INSTANCE;
                }
            } else {
                future = this.f33203e.schedule(cVar, j, timeUnit);
            }
            cVar.mo36872a(future);
            return cVar;
        }
        C12733h hVar = new C12733h(a);
        try {
            hVar.mo36868a(this.f33203e.scheduleAtFixedRate(hVar, j, j2, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e2) {
            C12768a.m33415b((Throwable) e2);
            return C12459c.INSTANCE;
        }
    }

    /* renamed from: a */
    public void mo36885a() {
        if (!this.f33204f) {
            this.f33204f = true;
            this.f33203e.shutdown();
        }
    }
}
