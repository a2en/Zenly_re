package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.d.e */
public final class C12406e<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32193e;

    /* renamed from: f */
    final Action f32194f;

    /* renamed from: io.reactivex.i.b.d.e$a */
    static final class C12407a<T> implements SingleObserver<T>, Disposable {

        /* renamed from: e */
        final SingleObserver<? super T> f32195e;

        /* renamed from: f */
        final Action f32196f;

        /* renamed from: g */
        Disposable f32197g;

        C12407a(SingleObserver<? super T> singleObserver, Action action) {
            this.f32195e = singleObserver;
            this.f32196f = action;
        }

        /* renamed from: a */
        private void m32899a() {
            try {
                this.f32196f.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
        }

        public void dispose() {
            this.f32197g.dispose();
        }

        public boolean isDisposed() {
            return this.f32197g.isDisposed();
        }

        public void onError(Throwable th) {
            this.f32195e.onError(th);
            m32899a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32197g, disposable)) {
                this.f32197g = disposable;
                this.f32195e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f32195e.onSuccess(t);
            m32899a();
        }
    }

    public C12406e(SingleSource<T> singleSource, Action action) {
        this.f32193e = singleSource;
        this.f32194f = action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32193e.subscribe(new C12407a(singleObserver, this.f32194f));
    }
}
