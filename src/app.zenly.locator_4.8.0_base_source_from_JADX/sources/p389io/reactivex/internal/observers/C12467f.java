package p389io.reactivex.internal.observers;

import java.util.concurrent.CountDownLatch;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.util.C12754d;
import p389io.reactivex.internal.util.C12757g;

/* renamed from: io.reactivex.internal.observers.f */
public final class C12467f<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* renamed from: e */
    T f32329e;

    /* renamed from: f */
    Throwable f32330f;

    /* renamed from: g */
    Disposable f32331g;

    /* renamed from: h */
    volatile boolean f32332h;

    public C12467f() {
        super(1);
    }

    /* renamed from: a */
    public T mo36672a() {
        if (getCount() != 0) {
            try {
                C12754d.m33348a();
                await();
            } catch (InterruptedException e) {
                mo36673b();
                throw C12757g.m33354b(e);
            }
        }
        Throwable th = this.f32330f;
        if (th == null) {
            return this.f32329e;
        }
        throw C12757g.m33354b(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36673b() {
        this.f32332h = true;
        Disposable disposable = this.f32331g;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.f32330f = th;
        countDown();
    }

    public void onSubscribe(Disposable disposable) {
        this.f32331g = disposable;
        if (this.f32332h) {
            disposable.dispose();
        }
    }

    public void onSuccess(T t) {
        this.f32329e = t;
        countDown();
    }
}
