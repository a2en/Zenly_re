package p389io.reactivex.p393i.p395b.p397b;

import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.b.o */
public final class C12370o<T> extends C12346a<T, T> {

    /* renamed from: f */
    final Consumer<? super Disposable> f32104f;

    /* renamed from: g */
    final Consumer<? super T> f32105g;

    /* renamed from: h */
    final Consumer<? super Throwable> f32106h;

    /* renamed from: i */
    final Action f32107i;

    /* renamed from: j */
    final Action f32108j;

    /* renamed from: k */
    final Action f32109k;

    /* renamed from: io.reactivex.i.b.b.o$a */
    static final class C12371a<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32110e;

        /* renamed from: f */
        final C12370o<T> f32111f;

        /* renamed from: g */
        Disposable f32112g;

        C12371a(MaybeObserver<? super T> maybeObserver, C12370o<T> oVar) {
            this.f32110e = maybeObserver;
            this.f32111f = oVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36597a(Throwable th) {
            try {
                this.f32111f.f32106h.accept(th);
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                th = new CompositeException(th, th2);
            }
            this.f32112g = C12458b.DISPOSED;
            this.f32110e.onError(th);
            mo36596a();
        }

        public void dispose() {
            try {
                this.f32111f.f32109k.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
            this.f32112g.dispose();
            this.f32112g = C12458b.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f32112g.isDisposed();
        }

        public void onComplete() {
            if (this.f32112g != C12458b.DISPOSED) {
                try {
                    this.f32111f.f32107i.run();
                    this.f32112g = C12458b.DISPOSED;
                    this.f32110e.onComplete();
                    mo36596a();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    mo36597a(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32112g == C12458b.DISPOSED) {
                C12768a.m33415b(th);
            } else {
                mo36597a(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32112g, disposable)) {
                try {
                    this.f32111f.f32104f.accept(disposable);
                    this.f32112g = disposable;
                    this.f32110e.onSubscribe(this);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    disposable.dispose();
                    this.f32112g = C12458b.DISPOSED;
                    C12459c.m32984a(th, this.f32110e);
                }
            }
        }

        public void onSuccess(T t) {
            if (this.f32112g != C12458b.DISPOSED) {
                try {
                    this.f32111f.f32105g.accept(t);
                    this.f32112g = C12458b.DISPOSED;
                    this.f32110e.onSuccess(t);
                    mo36596a();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    mo36597a(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36596a() {
            try {
                this.f32111f.f32108j.run();
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12768a.m33415b(th);
            }
        }
    }

    public C12370o(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Action action3) {
        super(maybeSource);
        this.f32104f = consumer;
        this.f32105g = consumer2;
        this.f32106h = consumer3;
        this.f32107i = action;
        this.f32108j = action2;
        this.f32109k = action3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32051e.subscribe(new C12371a(maybeObserver, this));
    }
}
