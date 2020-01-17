package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleEmitter;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleOnSubscribe;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Cancellable;
import p389io.reactivex.internal.disposables.C12457a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.d.b */
public final class C12401b<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleOnSubscribe<T> f32186e;

    /* renamed from: io.reactivex.i.b.d.b$a */
    static final class C12402a<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: e */
        final SingleObserver<? super T> f32187e;

        C12402a(SingleObserver<? super T> singleObserver) {
            this.f32187e = singleObserver;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C12768a.m33415b(th);
            }
        }

        public void onSuccess(T t) {
            Object obj = get();
            C12458b bVar = C12458b.DISPOSED;
            if (obj != bVar) {
                Disposable disposable = (Disposable) getAndSet(bVar);
                if (disposable != C12458b.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f32187e.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (disposable != null) {
                                disposable.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f32187e.onSuccess(t);
                    }
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
            }
        }

        public void setCancellable(Cancellable cancellable) {
            setDisposable(new C12457a(cancellable));
        }

        public void setDisposable(Disposable disposable) {
            C12458b.m32977b(this, disposable);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C12402a.class.getSimpleName(), super.toString()});
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
                        this.f32187e.onError(th);
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

    public C12401b(SingleOnSubscribe<T> singleOnSubscribe) {
        this.f32186e = singleOnSubscribe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        C12402a aVar = new C12402a(singleObserver);
        singleObserver.onSubscribe(aVar);
        try {
            this.f32186e.subscribe(aVar);
        } catch (Throwable th) {
            C12285a.m32748b(th);
            aVar.onError(th);
        }
    }
}
