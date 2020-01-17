package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.d.h */
public final class C12412h<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32206e;

    /* renamed from: f */
    final Consumer<? super Disposable> f32207f;

    /* renamed from: io.reactivex.i.b.d.h$a */
    static final class C12413a<T> implements SingleObserver<T> {

        /* renamed from: e */
        final SingleObserver<? super T> f32208e;

        /* renamed from: f */
        final Consumer<? super Disposable> f32209f;

        /* renamed from: g */
        boolean f32210g;

        C12413a(SingleObserver<? super T> singleObserver, Consumer<? super Disposable> consumer) {
            this.f32208e = singleObserver;
            this.f32209f = consumer;
        }

        public void onError(Throwable th) {
            if (this.f32210g) {
                C12768a.m33415b(th);
            } else {
                this.f32208e.onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            try {
                this.f32209f.accept(disposable);
                this.f32208e.onSubscribe(disposable);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32210g = true;
                disposable.dispose();
                C12459c.m32986a(th, this.f32208e);
            }
        }

        public void onSuccess(T t) {
            if (!this.f32210g) {
                this.f32208e.onSuccess(t);
            }
        }
    }

    public C12412h(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f32206e = singleSource;
        this.f32207f = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32206e.subscribe(new C12413a(singleObserver, this.f32207f));
    }
}
