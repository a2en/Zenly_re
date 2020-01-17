package p389io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.DisposableContainer;

/* renamed from: io.reactivex.internal.schedulers.j */
public final class C12735j extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* renamed from: f */
    static final Object f33208f = new Object();

    /* renamed from: g */
    static final Object f33209g = new Object();

    /* renamed from: h */
    static final Object f33210h = new Object();

    /* renamed from: i */
    static final Object f33211i = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: e */
    final Runnable f33212e;

    public C12735j(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f33212e = runnable;
        lazySet(0, disposableContainer);
    }

    /* renamed from: a */
    public void mo36892a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f33211i) {
                if (obj == f33209g) {
                    future.cancel(false);
                    return;
                } else if (obj == f33210h) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f33211i
            r3 = 0
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f33209g
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f33210h
            if (r1 != r2) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = f33210h
            goto L_0x0028
        L_0x0026:
            java.lang.Object r4 = f33209g
        L_0x0028:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0035:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f33211i
            if (r0 == r1) goto L_0x004f
            java.lang.Object r1 = f33208f
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0035
            io.reactivex.internal.disposables.DisposableContainer r0 = (p389io.reactivex.internal.disposables.DisposableContainer) r0
            r0.delete(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.schedulers.C12735j.dispose():void");
    }

    public boolean isDisposed() {
        Object obj = get(0);
        if (obj == f33208f || obj == f33211i) {
            return true;
        }
        return false;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f33212e.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == f33208f || !compareAndSet(0, obj3, f33211i) || obj3 == null)) {
                ((DisposableContainer) obj3).delete(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f33209g || obj2 == f33210h) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f33211i));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == f33208f || !compareAndSet(0, obj4, f33211i) || obj4 == null)) {
            ((DisposableContainer) obj4).delete(this);
        }
        do {
            obj = get(1);
            if (obj == f33209g || obj == f33210h) {
                return;
            }
        } while (!compareAndSet(1, obj, f33211i));
    }
}
