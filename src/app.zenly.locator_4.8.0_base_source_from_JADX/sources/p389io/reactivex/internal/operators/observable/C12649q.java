package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.q */
public final class C12649q<T> extends C12538a<T, T> {

    /* renamed from: f */
    final Consumer<? super T> f32924f;

    /* renamed from: g */
    final Consumer<? super Throwable> f32925g;

    /* renamed from: h */
    final Action f32926h;

    /* renamed from: i */
    final Action f32927i;

    /* renamed from: io.reactivex.internal.operators.observable.q$a */
    static final class C12650a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32928e;

        /* renamed from: f */
        final Consumer<? super T> f32929f;

        /* renamed from: g */
        final Consumer<? super Throwable> f32930g;

        /* renamed from: h */
        final Action f32931h;

        /* renamed from: i */
        final Action f32932i;

        /* renamed from: j */
        Disposable f32933j;

        /* renamed from: k */
        boolean f32934k;

        C12650a(Observer<? super T> observer, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            this.f32928e = observer;
            this.f32929f = consumer;
            this.f32930g = consumer2;
            this.f32931h = action;
            this.f32932i = action2;
        }

        public void dispose() {
            this.f32933j.dispose();
        }

        public boolean isDisposed() {
            return this.f32933j.isDisposed();
        }

        public void onComplete() {
            if (!this.f32934k) {
                try {
                    this.f32931h.run();
                    this.f32934k = true;
                    this.f32928e.onComplete();
                    try {
                        this.f32932i.run();
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        C12768a.m33415b(th);
                    }
                } catch (Throwable th2) {
                    C12285a.m32748b(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32934k) {
                C12768a.m33415b(th);
                return;
            }
            this.f32934k = true;
            try {
                this.f32930g.accept(th);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                th = new CompositeException(th, th2);
            }
            this.f32928e.onError(th);
            try {
                this.f32932i.run();
            } catch (Throwable th3) {
                C12285a.m32748b(th3);
                C12768a.m33415b(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f32934k) {
                try {
                    this.f32929f.accept(t);
                    this.f32928e.onNext(t);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32933j.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32933j, disposable)) {
                this.f32933j = disposable;
                this.f32928e.onSubscribe(this);
            }
        }
    }

    public C12649q(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.f32924f = consumer;
        this.f32925g = consumer2;
        this.f32926h = action;
        this.f32927i = action2;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.f32549e;
        C12650a aVar = new C12650a(observer, this.f32924f, this.f32925g, this.f32926h, this.f32927i);
        observableSource.subscribe(aVar);
    }
}
