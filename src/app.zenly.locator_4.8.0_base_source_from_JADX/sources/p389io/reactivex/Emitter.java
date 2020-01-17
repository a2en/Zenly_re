package p389io.reactivex;

/* renamed from: io.reactivex.Emitter */
public interface Emitter<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
