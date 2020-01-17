package p389io.reactivex.p393i.p395b.p396a;

import p389io.reactivex.C12271b;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.a.i */
public final class C12340i extends C12271b {

    /* renamed from: e */
    final CompletableSource f32031e;

    /* renamed from: f */
    final Consumer<? super Disposable> f32032f;

    /* renamed from: g */
    final Consumer<? super Throwable> f32033g;

    /* renamed from: h */
    final Action f32034h;

    /* renamed from: i */
    final Action f32035i;

    /* renamed from: j */
    final Action f32036j;

    /* renamed from: k */
    final Action f32037k;

    /* renamed from: io.reactivex.i.b.a.i$a */
    final class C12341a implements CompletableObserver, Disposable {

        /* renamed from: e */
        final CompletableObserver f32038e;

        /* renamed from: f */
        Disposable f32039f;

        C12341a(CompletableObserver completableObserver) {
            this.f32038e = completableObserver;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36583a() {
            try {
                C12340i.this.f32036j.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
        }

        public void dispose() {
            try {
                C12340i.this.f32037k.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
            this.f32039f.dispose();
        }

        public boolean isDisposed() {
            return this.f32039f.isDisposed();
        }

        public void onComplete() {
            if (this.f32039f != C12458b.DISPOSED) {
                try {
                    C12340i.this.f32034h.run();
                    C12340i.this.f32035i.run();
                    this.f32038e.onComplete();
                    mo36583a();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32038e.onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32039f == C12458b.DISPOSED) {
                C12768a.m33415b(th);
                return;
            }
            try {
                C12340i.this.f32033g.accept(th);
                C12340i.this.f32035i.run();
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                th = new CompositeException(th, th2);
            }
            this.f32038e.onError(th);
            mo36583a();
        }

        public void onSubscribe(Disposable disposable) {
            try {
                C12340i.this.f32032f.accept(disposable);
                if (C12458b.m32974a(this.f32039f, disposable)) {
                    this.f32039f = disposable;
                    this.f32038e.onSubscribe(this);
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                disposable.dispose();
                this.f32039f = C12458b.DISPOSED;
                C12459c.m32983a(th, this.f32038e);
            }
        }
    }

    public C12340i(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        this.f32031e = completableSource;
        this.f32032f = consumer;
        this.f32033g = consumer2;
        this.f32034h = action;
        this.f32035i = action2;
        this.f32036j = action3;
        this.f32037k = action4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        this.f32031e.subscribe(new C12341a(completableObserver));
    }
}
