package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12461e;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.p0 */
public final class C12645p0<T> extends C12538a<T, T> {

    /* renamed from: f */
    final Function<? super Throwable, ? extends ObservableSource<? extends T>> f32912f;

    /* renamed from: g */
    final boolean f32913g;

    /* renamed from: io.reactivex.internal.operators.observable.p0$a */
    static final class C12646a<T> implements Observer<T> {

        /* renamed from: e */
        final Observer<? super T> f32914e;

        /* renamed from: f */
        final Function<? super Throwable, ? extends ObservableSource<? extends T>> f32915f;

        /* renamed from: g */
        final boolean f32916g;

        /* renamed from: h */
        final C12461e f32917h = new C12461e();

        /* renamed from: i */
        boolean f32918i;

        /* renamed from: j */
        boolean f32919j;

        C12646a(Observer<? super T> observer, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
            this.f32914e = observer;
            this.f32915f = function;
            this.f32916g = z;
        }

        public void onComplete() {
            if (!this.f32919j) {
                this.f32919j = true;
                this.f32918i = true;
                this.f32914e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f32918i) {
                this.f32918i = true;
                if (!this.f32916g || (th instanceof Exception)) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.f32915f.apply(th);
                        if (observableSource == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f32914e.onError(nullPointerException);
                            return;
                        }
                        observableSource.subscribe(this);
                    } catch (Throwable th2) {
                        C12285a.m32748b(th2);
                        this.f32914e.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f32914e.onError(th);
                }
            } else if (this.f32919j) {
                C12768a.m33415b(th);
            } else {
                this.f32914e.onError(th);
            }
        }

        public void onNext(T t) {
            if (!this.f32919j) {
                this.f32914e.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f32917h.mo36653a(disposable);
        }
    }

    public C12645p0(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.f32912f = function;
        this.f32913g = z;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12646a aVar = new C12646a(observer, this.f32912f, this.f32913g);
        observer.onSubscribe(aVar.f32917h);
        this.f32549e.subscribe(aVar);
    }
}
