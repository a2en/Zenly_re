package p389io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.i1 */
public final class C12598i1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final int f32768f;

    /* renamed from: io.reactivex.internal.operators.observable.i1$a */
    static final class C12599a<T> extends ArrayDeque<T> implements Observer<T>, Disposable {
        private static final long serialVersionUID = 7240042530241604978L;

        /* renamed from: e */
        final Observer<? super T> f32769e;

        /* renamed from: f */
        final int f32770f;

        /* renamed from: g */
        Disposable f32771g;

        /* renamed from: h */
        volatile boolean f32772h;

        C12599a(Observer<? super T> observer, int i) {
            this.f32769e = observer;
            this.f32770f = i;
        }

        public void dispose() {
            if (!this.f32772h) {
                this.f32772h = true;
                this.f32771g.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f32772h;
        }

        public void onComplete() {
            Observer<? super T> observer = this.f32769e;
            while (!this.f32772h) {
                Object poll = poll();
                if (poll == null) {
                    if (!this.f32772h) {
                        observer.onComplete();
                    }
                    return;
                }
                observer.onNext(poll);
            }
        }

        public void onError(Throwable th) {
            this.f32769e.onError(th);
        }

        public void onNext(T t) {
            if (this.f32770f == size()) {
                poll();
            }
            offer(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32771g, disposable)) {
                this.f32771g = disposable;
                this.f32769e.onSubscribe(this);
            }
        }
    }

    public C12598i1(ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.f32768f = i;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12599a(observer, this.f32768f));
    }
}
