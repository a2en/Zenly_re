package p389io.fabric.sdk.android;

/* renamed from: io.fabric.sdk.android.InitializationCallback */
public interface InitializationCallback<T> {

    /* renamed from: a */
    public static final InitializationCallback f31569a = new C12148b();

    /* renamed from: io.fabric.sdk.android.InitializationCallback$b */
    public static class C12148b implements InitializationCallback<Object> {
        public void failure(Exception exc) {
        }

        public void success(Object obj) {
        }

        private C12148b() {
        }
    }

    void failure(Exception exc);

    void success(T t);
}
