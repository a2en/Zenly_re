package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.CompletableEmitter;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableOnSubscribe;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Cancellable;
import p389io.reactivex.internal.disposables.C12457a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.a.c */
public final class C12331c extends C12271b {

    /* renamed from: e */
    final CompletableOnSubscribe f32010e;

    /* renamed from: io.reactivex.i.b.a.c$a */
    static final class C12332a extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: e */
        final CompletableObserver f32011e;

        C12332a(CompletableObserver completableObserver) {
            this.f32011e = completableObserver;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            Object obj = get();
            C12458b bVar = C12458b.DISPOSED;
            if (obj != bVar) {
                Disposable disposable = (Disposable) getAndSet(bVar);
                if (disposable != C12458b.DISPOSED) {
                    try {
                        this.f32011e.onComplete();
                    } finally {
                        if (disposable != null) {
                            disposable.dispose();
                        }
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C12768a.m33415b(th);
            }
        }

        public void setCancellable(Cancellable cancellable) {
            setDisposable(new C12457a(cancellable));
        }

        public void setDisposable(Disposable disposable) {
            C12458b.m32977b(this, disposable);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C12332a.class.getSimpleName(), super.toString()});
        }

        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C12458b bVar = C12458b.DISPOSED;
            if (obj != bVar) {
                Disposable disposable = (Disposable) getAndSet(bVar);
                if (disposable != C12458b.DISPOSED) {
                    try {
                        this.f32011e.onError(th);
                        return true;
                    } finally {
                        if (disposable != null) {
                            disposable.dispose();
                        }
                    }
                }
            }
            return false;
        }
    }

    public C12331c(CompletableOnSubscribe completableOnSubscribe) {
        this.f32010e = completableOnSubscribe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        C12332a aVar = new C12332a(completableObserver);
        completableObserver.onSubscribe(aVar);
        try {
            this.f32010e.subscribe(aVar);
        } catch (Throwable th) {
            C12285a.m32748b(th);
            aVar.onError(th);
        }
    }
}
