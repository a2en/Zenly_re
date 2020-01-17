package p389io.reactivex.p393i.p395b.p397b;

import org.reactivestreams.Subscriber;
import p389io.reactivex.C12272c;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import p389io.reactivex.p393i.p401d.C12452c;

/* renamed from: io.reactivex.i.b.b.t */
public final class C12384t<T> extends C12272c<T> implements HasUpstreamMaybeSource<T> {

    /* renamed from: f */
    final MaybeSource<T> f32135f;

    /* renamed from: io.reactivex.i.b.b.t$a */
    static final class C12385a<T> extends C12452c<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: g */
        Disposable f32136g;

        C12385a(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void cancel() {
            super.cancel();
            this.f32136g.dispose();
        }

        public void onComplete() {
            this.f32297e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32297e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32136g, disposable)) {
                this.f32136g = disposable;
                this.f32297e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo36644a(t);
        }
    }

    public C12384t(MaybeSource<T> maybeSource) {
        this.f32135f = maybeSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f32135f.subscribe(new C12385a(subscriber));
    }

    public MaybeSource<T> source() {
        return this.f32135f;
    }
}
