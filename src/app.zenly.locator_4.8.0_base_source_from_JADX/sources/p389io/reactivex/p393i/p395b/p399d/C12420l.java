package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.d.l */
public final class C12420l<T> extends C12271b {

    /* renamed from: e */
    final SingleSource<T> f32222e;

    /* renamed from: f */
    final Function<? super T, ? extends CompletableSource> f32223f;

    /* renamed from: io.reactivex.i.b.d.l$a */
    static final class C12421a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, CompletableObserver, Disposable {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: e */
        final CompletableObserver f32224e;

        /* renamed from: f */
        final Function<? super T, ? extends CompletableSource> f32225f;

        C12421a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function) {
            this.f32224e = completableObserver;
            this.f32225f = function;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32224e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32224e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
        }

        public void onSuccess(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) C12324b.m32836a(this.f32225f.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    completableSource.subscribe(this);
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                onError(th);
            }
        }
    }

    public C12420l(SingleSource<T> singleSource, Function<? super T, ? extends CompletableSource> function) {
        this.f32222e = singleSource;
        this.f32223f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        C12421a aVar = new C12421a(completableObserver, this.f32223f);
        completableObserver.onSubscribe(aVar);
        this.f32222e.subscribe(aVar);
    }
}
