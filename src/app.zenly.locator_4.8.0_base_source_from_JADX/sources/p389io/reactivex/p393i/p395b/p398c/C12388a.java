package p389io.reactivex.p393i.p395b.p398c;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.c.a */
public final class C12388a<R> extends C12279e<R> {

    /* renamed from: e */
    final CompletableSource f32139e;

    /* renamed from: f */
    final ObservableSource<? extends R> f32140f;

    /* renamed from: io.reactivex.i.b.c.a$a */
    static final class C12389a<R> extends AtomicReference<Disposable> implements Observer<R>, CompletableObserver, Disposable {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: e */
        final Observer<? super R> f32141e;

        /* renamed from: f */
        ObservableSource<? extends R> f32142f;

        C12389a(Observer<? super R> observer, ObservableSource<? extends R> observableSource) {
            this.f32142f = observableSource;
            this.f32141e = observer;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            ObservableSource<? extends R> observableSource = this.f32142f;
            if (observableSource == null) {
                this.f32141e.onComplete();
                return;
            }
            this.f32142f = null;
            observableSource.subscribe(this);
        }

        public void onError(Throwable th) {
            this.f32141e.onError(th);
        }

        public void onNext(R r) {
            this.f32141e.onNext(r);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
        }
    }

    public C12388a(CompletableSource completableSource, ObservableSource<? extends R> observableSource) {
        this.f32139e = completableSource;
        this.f32140f = observableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        C12389a aVar = new C12389a(observer, this.f32140f);
        observer.onSubscribe(aVar);
        this.f32139e.subscribe(aVar);
    }
}
