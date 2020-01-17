package p389io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.a */
public class C12224a implements RetryPolicy {

    /* renamed from: a */
    private final int f31777a;

    public C12224a(int i) {
        this.f31777a = i;
    }

    public boolean shouldRetry(int i, Throwable th) {
        return i < this.f31777a;
    }
}
