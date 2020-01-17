package p389io.reactivex.internal.schedulers;

import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.schedulers.h */
public final class C12733h extends C12719a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public C12733h(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f33161f = Thread.currentThread();
        try {
            this.f33160e.run();
            this.f33161f = null;
        } catch (Throwable th) {
            this.f33161f = null;
            lazySet(C12719a.f33158g);
            C12768a.m33415b(th);
        }
    }
}
