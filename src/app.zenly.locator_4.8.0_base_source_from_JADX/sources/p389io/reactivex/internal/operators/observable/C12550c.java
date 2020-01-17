package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.c */
public final class C12550c<T> extends C12291g<Boolean> implements FuseToObservable<Boolean> {

    /* renamed from: e */
    final ObservableSource<T> f32576e;

    /* renamed from: f */
    final Predicate<? super T> f32577f;

    /* renamed from: io.reactivex.internal.operators.observable.c$a */
    static final class C12551a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final SingleObserver<? super Boolean> f32578e;

        /* renamed from: f */
        final Predicate<? super T> f32579f;

        /* renamed from: g */
        Disposable f32580g;

        /* renamed from: h */
        boolean f32581h;

        C12551a(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate) {
            this.f32578e = singleObserver;
            this.f32579f = predicate;
        }

        public void dispose() {
            this.f32580g.dispose();
        }

        public boolean isDisposed() {
            return this.f32580g.isDisposed();
        }

        public void onComplete() {
            if (!this.f32581h) {
                this.f32581h = true;
                this.f32578e.onSuccess(Boolean.valueOf(true));
            }
        }

        public void onError(Throwable th) {
            if (this.f32581h) {
                C12768a.m33415b(th);
                return;
            }
            this.f32581h = true;
            this.f32578e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32581h) {
                try {
                    if (!this.f32579f.test(t)) {
                        this.f32581h = true;
                        this.f32580g.dispose();
                        this.f32578e.onSuccess(Boolean.valueOf(false));
                    }
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32580g.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32580g, disposable)) {
                this.f32580g = disposable;
                this.f32578e.onSubscribe(this);
            }
        }
    }

    public C12550c(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f32576e = observableSource;
        this.f32577f = predicate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super Boolean> singleObserver) {
        this.f32576e.subscribe(new C12551a(singleObserver, this.f32577f));
    }

    public C12279e<Boolean> fuseToObservable() {
        return C12768a.m33396a((C12279e<T>) new C12544b<T>(this.f32576e, this.f32577f));
    }
}
