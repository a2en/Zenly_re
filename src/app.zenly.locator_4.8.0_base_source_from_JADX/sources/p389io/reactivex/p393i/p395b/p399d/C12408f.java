package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.d.f */
public final class C12408f<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32198e;

    /* renamed from: f */
    final Action f32199f;

    /* renamed from: io.reactivex.i.b.d.f$a */
    static final class C12409a<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -8583764624474935784L;

        /* renamed from: e */
        final SingleObserver<? super T> f32200e;

        /* renamed from: f */
        Disposable f32201f;

        C12409a(SingleObserver<? super T> singleObserver, Action action) {
            this.f32200e = singleObserver;
            lazySet(action);
        }

        public void dispose() {
            Action action = (Action) getAndSet(null);
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    C12768a.m33415b(th);
                }
                this.f32201f.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f32201f.isDisposed();
        }

        public void onError(Throwable th) {
            this.f32200e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32201f, disposable)) {
                this.f32201f = disposable;
                this.f32200e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f32200e.onSuccess(t);
        }
    }

    public C12408f(SingleSource<T> singleSource, Action action) {
        this.f32198e = singleSource;
        this.f32199f = action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32198e.subscribe(new C12409a(singleObserver, this.f32199f));
    }
}
