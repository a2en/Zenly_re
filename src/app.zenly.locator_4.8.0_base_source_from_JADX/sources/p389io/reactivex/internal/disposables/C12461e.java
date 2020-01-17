package p389io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.disposables.e */
public final class C12461e extends AtomicReference<Disposable> implements Disposable {
    private static final long serialVersionUID = -754898800686245608L;

    public C12461e() {
    }

    /* renamed from: a */
    public boolean mo36653a(Disposable disposable) {
        return C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
    }

    /* renamed from: b */
    public boolean mo36654b(Disposable disposable) {
        return C12458b.m32977b(this, disposable);
    }

    public void dispose() {
        C12458b.m32975a((AtomicReference<Disposable>) this);
    }

    public boolean isDisposed() {
        return C12458b.m32973a((Disposable) get());
    }

    public C12461e(Disposable disposable) {
        lazySet(disposable);
    }
}
