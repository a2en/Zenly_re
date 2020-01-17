package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.l1 */
public final class C12617l1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final Predicate<? super T> f32805f;

    /* renamed from: io.reactivex.internal.operators.observable.l1$a */
    static final class C12618a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32806e;

        /* renamed from: f */
        final Predicate<? super T> f32807f;

        /* renamed from: g */
        Disposable f32808g;

        /* renamed from: h */
        boolean f32809h;

        C12618a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f32806e = observer;
            this.f32807f = predicate;
        }

        public void dispose() {
            this.f32808g.dispose();
        }

        public boolean isDisposed() {
            return this.f32808g.isDisposed();
        }

        public void onComplete() {
            if (!this.f32809h) {
                this.f32809h = true;
                this.f32806e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f32809h) {
                this.f32809h = true;
                this.f32806e.onError(th);
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            if (!this.f32809h) {
                this.f32806e.onNext(t);
                try {
                    if (this.f32807f.test(t)) {
                        this.f32809h = true;
                        this.f32808g.dispose();
                        this.f32806e.onComplete();
                    }
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32808g.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32808g, disposable)) {
                this.f32808g = disposable;
                this.f32806e.onSubscribe(this);
            }
        }
    }

    public C12617l1(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f32805f = predicate;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12618a(observer, this.f32805f));
    }
}
