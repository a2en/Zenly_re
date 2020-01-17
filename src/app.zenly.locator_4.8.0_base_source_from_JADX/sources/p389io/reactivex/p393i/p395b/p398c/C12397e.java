package p389io.reactivex.p393i.p395b.p398c;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.c.e */
public final class C12397e<T, R> extends C12279e<R> {

    /* renamed from: e */
    final SingleSource<T> f32173e;

    /* renamed from: f */
    final Function<? super T, ? extends ObservableSource<? extends R>> f32174f;

    /* renamed from: io.reactivex.i.b.c.e$a */
    static final class C12398a<T, R> extends AtomicReference<Disposable> implements Observer<R>, SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: e */
        final Observer<? super R> f32175e;

        /* renamed from: f */
        final Function<? super T, ? extends ObservableSource<? extends R>> f32176f;

        C12398a(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f32175e = observer;
            this.f32176f = function;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32175e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32175e.onError(th);
        }

        public void onNext(R r) {
            this.f32175e.onNext(r);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
        }

        public void onSuccess(T t) {
            try {
                ((ObservableSource) C12324b.m32836a(this.f32176f.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32175e.onError(th);
            }
        }
    }

    public C12397e(SingleSource<T> singleSource, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        this.f32173e = singleSource;
        this.f32174f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        C12398a aVar = new C12398a(observer, this.f32174f);
        observer.onSubscribe(aVar);
        this.f32173e.subscribe(aVar);
    }
}
