package p389io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.schedulers.i */
public final class C12734i extends C12719a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public C12734i(Runnable runnable) {
        super(runnable);
    }

    public Void call() throws Exception {
        this.f33161f = Thread.currentThread();
        try {
            this.f33160e.run();
            return null;
        } finally {
            lazySet(C12719a.f33158g);
            this.f33161f = null;
        }
    }
}
