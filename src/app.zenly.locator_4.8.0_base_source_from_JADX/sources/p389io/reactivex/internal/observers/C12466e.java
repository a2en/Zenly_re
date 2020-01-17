package p389io.reactivex.internal.observers;

/* renamed from: io.reactivex.internal.observers.e */
public final class C12466e<T> extends C12465d<T> {
    public void onError(Throwable th) {
        if (this.f32325e == null) {
            this.f32326f = th;
        }
        countDown();
    }

    public void onNext(T t) {
        if (this.f32325e == null) {
            this.f32325e = t;
            this.f32327g.dispose();
            countDown();
        }
    }
}
