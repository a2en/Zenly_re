package p389io.reactivex.internal.disposables;

import p389io.reactivex.CompletableObserver;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.internal.fuseable.QueueDisposable;

/* renamed from: io.reactivex.internal.disposables.c */
public enum C12459c implements QueueDisposable<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m32982a(Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* renamed from: a */
    public static void m32981a(MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onComplete();
    }

    /* renamed from: a */
    public static void m32985a(Throwable th, Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(th);
    }

    /* renamed from: a */
    public static void m32980a(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onComplete();
    }

    /* renamed from: a */
    public static void m32983a(Throwable th, CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onError(th);
    }

    /* renamed from: a */
    public static void m32986a(Throwable th, SingleObserver<?> singleObserver) {
        singleObserver.onSubscribe(INSTANCE);
        singleObserver.onError(th);
    }

    /* renamed from: a */
    public static void m32984a(Throwable th, MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onError(th);
    }
}
