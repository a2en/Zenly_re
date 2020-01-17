package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.observers.C12470i;

/* renamed from: io.reactivex.i.b.d.w */
public final class C12440w<T> extends C12279e<T> {

    /* renamed from: e */
    final SingleSource<? extends T> f32267e;

    /* renamed from: io.reactivex.i.b.d.w$a */
    static final class C12441a<T> extends C12470i<T> implements SingleObserver<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: g */
        Disposable f32268g;

        C12441a(Observer<? super T> observer) {
            super(observer);
        }

        public void dispose() {
            super.dispose();
            this.f32268g.dispose();
        }

        public void onError(Throwable th) {
            mo36677a(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32268g, disposable)) {
                this.f32268g = disposable;
                this.f32337e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo36676a(t);
        }
    }

    public C12440w(SingleSource<? extends T> singleSource) {
        this.f32267e = singleSource;
    }

    /* renamed from: b */
    public static <T> SingleObserver<T> m32918b(Observer<? super T> observer) {
        return new C12441a(observer);
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32267e.subscribe(m32918b(observer));
    }
}
