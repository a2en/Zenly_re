package p389io.reactivex;

import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Cancellable;

/* renamed from: io.reactivex.MaybeEmitter */
public interface MaybeEmitter<T> {
    boolean isDisposed();

    void onComplete();

    void onError(Throwable th);

    void onSuccess(T t);

    void setCancellable(Cancellable cancellable);

    void setDisposable(Disposable disposable);

    boolean tryOnError(Throwable th);
}
