package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.i.b.d.g */
public final class C12410g<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32202e;

    /* renamed from: f */
    final Consumer<? super Throwable> f32203f;

    /* renamed from: io.reactivex.i.b.d.g$a */
    final class C12411a implements SingleObserver<T> {

        /* renamed from: e */
        private final SingleObserver<? super T> f32204e;

        C12411a(SingleObserver<? super T> singleObserver) {
            this.f32204e = singleObserver;
        }

        public void onError(Throwable th) {
            try {
                C12410g.this.f32203f.accept(th);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                th = new CompositeException(th, th2);
            }
            this.f32204e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32204e.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f32204e.onSuccess(t);
        }
    }

    public C12410g(SingleSource<T> singleSource, Consumer<? super Throwable> consumer) {
        this.f32202e = singleSource;
        this.f32203f = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32202e.subscribe(new C12411a(singleObserver));
    }
}
