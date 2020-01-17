package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.h1 */
public final class C12589h1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f32732f;

    /* renamed from: io.reactivex.internal.operators.observable.h1$a */
    static final class C12590a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32733e;

        /* renamed from: f */
        boolean f32734f;

        /* renamed from: g */
        Disposable f32735g;

        /* renamed from: h */
        long f32736h;

        C12590a(Observer<? super T> observer, long j) {
            this.f32733e = observer;
            this.f32736h = j;
        }

        public void dispose() {
            this.f32735g.dispose();
        }

        public boolean isDisposed() {
            return this.f32735g.isDisposed();
        }

        public void onComplete() {
            if (!this.f32734f) {
                this.f32734f = true;
                this.f32735g.dispose();
                this.f32733e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f32734f) {
                C12768a.m33415b(th);
                return;
            }
            this.f32734f = true;
            this.f32735g.dispose();
            this.f32733e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32734f) {
                long j = this.f32736h;
                this.f32736h = j - 1;
                if (j > 0) {
                    boolean z = this.f32736h == 0;
                    this.f32733e.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32735g, disposable)) {
                this.f32735g = disposable;
                if (this.f32736h == 0) {
                    this.f32734f = true;
                    disposable.dispose();
                    C12459c.m32982a(this.f32733e);
                    return;
                }
                this.f32733e.onSubscribe(this);
            }
        }
    }

    public C12589h1(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f32732f = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12590a(observer, this.f32732f));
    }
}
