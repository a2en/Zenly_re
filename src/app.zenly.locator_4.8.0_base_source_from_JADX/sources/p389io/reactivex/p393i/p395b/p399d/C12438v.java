package p389io.reactivex.p393i.p395b.p399d;

import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p401d.C12452c;

/* renamed from: io.reactivex.i.b.d.v */
public final class C12438v<T> extends C12272c<T> {

    /* renamed from: f */
    final SingleSource<? extends T> f32265f;

    /* renamed from: io.reactivex.i.b.d.v$a */
    static final class C12439a<T> extends C12452c<T> implements SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: g */
        Disposable f32266g;

        C12439a(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void cancel() {
            super.cancel();
            this.f32266g.dispose();
        }

        public void onError(Throwable th) {
            this.f32297e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32266g, disposable)) {
                this.f32266g = disposable;
                this.f32297e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo36644a(t);
        }
    }

    public C12438v(SingleSource<? extends T> singleSource) {
        this.f32265f = singleSource;
    }

    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f32265f.subscribe(new C12439a(subscriber));
    }
}
