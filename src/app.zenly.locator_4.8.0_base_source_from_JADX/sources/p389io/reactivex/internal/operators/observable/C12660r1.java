package p389io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.p393i.p394a.C12301a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.r1 */
public final class C12660r1<T, U extends Collection<? super T>> extends C12291g<U> implements FuseToObservable<U> {

    /* renamed from: e */
    final ObservableSource<T> f32956e;

    /* renamed from: f */
    final Callable<U> f32957f;

    /* renamed from: io.reactivex.internal.operators.observable.r1$a */
    static final class C12661a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* renamed from: e */
        final SingleObserver<? super U> f32958e;

        /* renamed from: f */
        U f32959f;

        /* renamed from: g */
        Disposable f32960g;

        C12661a(SingleObserver<? super U> singleObserver, U u) {
            this.f32958e = singleObserver;
            this.f32959f = u;
        }

        public void dispose() {
            this.f32960g.dispose();
        }

        public boolean isDisposed() {
            return this.f32960g.isDisposed();
        }

        public void onComplete() {
            U u = this.f32959f;
            this.f32959f = null;
            this.f32958e.onSuccess(u);
        }

        public void onError(Throwable th) {
            this.f32959f = null;
            this.f32958e.onError(th);
        }

        public void onNext(T t) {
            this.f32959f.add(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32960g, disposable)) {
                this.f32960g = disposable;
                this.f32958e.onSubscribe(this);
            }
        }
    }

    public C12660r1(ObservableSource<T> observableSource, int i) {
        this.f32956e = observableSource;
        this.f32957f = C12301a.m32817a(i);
    }

    /* renamed from: a */
    public void mo36541a(SingleObserver<? super U> singleObserver) {
        try {
            Object call = this.f32957f.call();
            C12324b.m32836a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f32956e.subscribe(new C12661a(singleObserver, (Collection) call));
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12459c.m32986a(th, singleObserver);
        }
    }

    public C12279e<U> fuseToObservable() {
        return C12768a.m33396a((C12279e<T>) new C12653q1<T>(this.f32956e, this.f32957f));
    }
}
