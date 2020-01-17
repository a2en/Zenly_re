package p389io.reactivex.internal.observers;

import java.util.concurrent.CountDownLatch;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.util.C12754d;
import p389io.reactivex.internal.util.C12757g;

/* renamed from: io.reactivex.internal.observers.d */
public abstract class C12465d<T> extends CountDownLatch implements Observer<T>, Disposable {

    /* renamed from: e */
    T f32325e;

    /* renamed from: f */
    Throwable f32326f;

    /* renamed from: g */
    Disposable f32327g;

    /* renamed from: h */
    volatile boolean f32328h;

    public C12465d() {
        super(1);
    }

    /* renamed from: a */
    public final T mo36671a() {
        if (getCount() != 0) {
            try {
                C12754d.m33348a();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C12757g.m33354b(e);
            }
        }
        Throwable th = this.f32326f;
        if (th == null) {
            return this.f32325e;
        }
        throw C12757g.m33354b(th);
    }

    public final void dispose() {
        this.f32328h = true;
        Disposable disposable = this.f32327g;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.f32328h;
    }

    public final void onComplete() {
        countDown();
    }

    public final void onSubscribe(Disposable disposable) {
        this.f32327g = disposable;
        if (this.f32328h) {
            disposable.dispose();
        }
    }
}
