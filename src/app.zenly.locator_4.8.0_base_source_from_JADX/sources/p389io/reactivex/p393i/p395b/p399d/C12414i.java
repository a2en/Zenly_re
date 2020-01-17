package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.i.b.d.i */
public final class C12414i<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32211e;

    /* renamed from: f */
    final Consumer<? super T> f32212f;

    /* renamed from: io.reactivex.i.b.d.i$a */
    final class C12415a implements SingleObserver<T> {

        /* renamed from: e */
        final SingleObserver<? super T> f32213e;

        C12415a(SingleObserver<? super T> singleObserver) {
            this.f32213e = singleObserver;
        }

        public void onError(Throwable th) {
            this.f32213e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32213e.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                C12414i.this.f32212f.accept(t);
                this.f32213e.onSuccess(t);
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32213e.onError(th);
            }
        }
    }

    public C12414i(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f32211e = singleSource;
        this.f32212f = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32211e.subscribe(new C12415a(singleObserver));
    }
}
