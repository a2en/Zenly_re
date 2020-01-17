package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12273d;
import p389io.reactivex.MaybeEmitter;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeOnSubscribe;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Cancellable;
import p389io.reactivex.internal.disposables.C12457a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.b.d */
public final class C12350d<T> extends C12273d<T> {

    /* renamed from: e */
    final MaybeOnSubscribe<T> f32063e;

    /* renamed from: io.reactivex.i.b.b.d$a */
    static final class C12351a<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: e */
        final MaybeObserver<? super T> f32064e;

        C12351a(MaybeObserver<? super T> maybeObserver) {
            this.f32064e = maybeObserver;
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
                        this.f32064e.onComplete();
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

        public void onSuccess(T t) {
            Object obj = get();
            C12458b bVar = C12458b.DISPOSED;
            if (obj != bVar) {
                Disposable disposable = (Disposable) getAndSet(bVar);
                if (disposable != C12458b.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f32064e.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (disposable != null) {
                                disposable.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f32064e.onSuccess(t);
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
            return String.format("%s{%s}", new Object[]{C12351a.class.getSimpleName(), super.toString()});
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
                        this.f32064e.onError(th);
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

    public C12350d(MaybeOnSubscribe<T> maybeOnSubscribe) {
        this.f32063e = maybeOnSubscribe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        C12351a aVar = new C12351a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        try {
            this.f32063e.subscribe(aVar);
        } catch (Throwable th) {
            C12285a.m32748b(th);
            aVar.onError(th);
        }
    }
}
