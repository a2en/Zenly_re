package p389io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.disposables.d */
abstract class C12277d<T> extends AtomicReference<T> implements Disposable {
    private static final long serialVersionUID = 6537757548749041217L;

    C12277d(T t) {
        C12324b.m32836a(t, "value is null");
        super(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36400a(T t);

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo36400a(andSet);
            }
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
