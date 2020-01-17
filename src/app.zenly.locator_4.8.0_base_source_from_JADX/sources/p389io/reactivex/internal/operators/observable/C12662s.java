package p389io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.s */
public final class C12662s<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f32961f;

    /* renamed from: g */
    final T f32962g;

    /* renamed from: h */
    final boolean f32963h;

    /* renamed from: io.reactivex.internal.operators.observable.s$a */
    static final class C12663a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32964e;

        /* renamed from: f */
        final long f32965f;

        /* renamed from: g */
        final T f32966g;

        /* renamed from: h */
        final boolean f32967h;

        /* renamed from: i */
        Disposable f32968i;

        /* renamed from: j */
        long f32969j;

        /* renamed from: k */
        boolean f32970k;

        C12663a(Observer<? super T> observer, long j, T t, boolean z) {
            this.f32964e = observer;
            this.f32965f = j;
            this.f32966g = t;
            this.f32967h = z;
        }

        public void dispose() {
            this.f32968i.dispose();
        }

        public boolean isDisposed() {
            return this.f32968i.isDisposed();
        }

        public void onComplete() {
            if (!this.f32970k) {
                this.f32970k = true;
                T t = this.f32966g;
                if (t != null || !this.f32967h) {
                    if (t != null) {
                        this.f32964e.onNext(t);
                    }
                    this.f32964e.onComplete();
                    return;
                }
                this.f32964e.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            if (this.f32970k) {
                C12768a.m33415b(th);
                return;
            }
            this.f32970k = true;
            this.f32964e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32970k) {
                long j = this.f32969j;
                if (j == this.f32965f) {
                    this.f32970k = true;
                    this.f32968i.dispose();
                    this.f32964e.onNext(t);
                    this.f32964e.onComplete();
                    return;
                }
                this.f32969j = j + 1;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32968i, disposable)) {
                this.f32968i = disposable;
                this.f32964e.onSubscribe(this);
            }
        }
    }

    public C12662s(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.f32961f = j;
        this.f32962g = t;
        this.f32963h = z;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.f32549e;
        C12663a aVar = new C12663a(observer, this.f32961f, this.f32962g, this.f32963h);
        observableSource.subscribe(aVar);
    }
}
