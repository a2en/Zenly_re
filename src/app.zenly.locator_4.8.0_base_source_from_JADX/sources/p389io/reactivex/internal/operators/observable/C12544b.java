package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.b */
public final class C12544b<T> extends C12538a<T, Boolean> {

    /* renamed from: f */
    final Predicate<? super T> f32558f;

    /* renamed from: io.reactivex.internal.operators.observable.b$a */
    static final class C12545a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super Boolean> f32559e;

        /* renamed from: f */
        final Predicate<? super T> f32560f;

        /* renamed from: g */
        Disposable f32561g;

        /* renamed from: h */
        boolean f32562h;

        C12545a(Observer<? super Boolean> observer, Predicate<? super T> predicate) {
            this.f32559e = observer;
            this.f32560f = predicate;
        }

        public void dispose() {
            this.f32561g.dispose();
        }

        public boolean isDisposed() {
            return this.f32561g.isDisposed();
        }

        public void onComplete() {
            if (!this.f32562h) {
                this.f32562h = true;
                this.f32559e.onNext(Boolean.valueOf(true));
                this.f32559e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f32562h) {
                C12768a.m33415b(th);
                return;
            }
            this.f32562h = true;
            this.f32559e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32562h) {
                try {
                    if (!this.f32560f.test(t)) {
                        this.f32562h = true;
                        this.f32561g.dispose();
                        this.f32559e.onNext(Boolean.valueOf(false));
                        this.f32559e.onComplete();
                    }
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32561g.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32561g, disposable)) {
                this.f32561g = disposable;
                this.f32559e.onSubscribe(this);
            }
        }
    }

    public C12544b(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f32558f = predicate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super Boolean> observer) {
        this.f32549e.subscribe(new C12545a(observer, this.f32558f));
    }
}
