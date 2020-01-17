package p389io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.b */
public class C12225b implements Backoff {

    /* renamed from: a */
    private final long f31778a;

    /* renamed from: b */
    private final int f31779b;

    public C12225b(long j, int i) {
        this.f31778a = j;
        this.f31779b = i;
    }

    public long getDelayMillis(int i) {
        return (long) (((double) this.f31778a) * Math.pow((double) this.f31779b, (double) i));
    }
}
