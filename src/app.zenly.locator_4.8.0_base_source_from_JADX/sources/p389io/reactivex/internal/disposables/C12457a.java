package p389io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Cancellable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.disposables.a */
public final class C12457a extends AtomicReference<Cancellable> implements Disposable {
    private static final long serialVersionUID = 5718521705281392066L;

    public C12457a(Cancellable cancellable) {
        super(cancellable);
    }

    public void dispose() {
        if (get() != null) {
            Cancellable cancellable = (Cancellable) getAndSet(null);
            if (cancellable != null) {
                try {
                    cancellable.cancel();
                } catch (Exception e) {
                    C12285a.m32748b(e);
                    C12768a.m33415b((Throwable) e);
                }
            }
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
