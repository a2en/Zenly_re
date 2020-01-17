package p389io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.c */
public class C12226c {

    /* renamed from: a */
    private final int f31780a;

    /* renamed from: b */
    private final Backoff f31781b;

    /* renamed from: c */
    private final RetryPolicy f31782c;

    public C12226c(Backoff backoff, RetryPolicy retryPolicy) {
        this(0, backoff, retryPolicy);
    }

    /* renamed from: a */
    public long mo36154a() {
        return this.f31781b.getDelayMillis(this.f31780a);
    }

    /* renamed from: b */
    public C12226c mo36155b() {
        return new C12226c(this.f31781b, this.f31782c);
    }

    /* renamed from: c */
    public C12226c mo36156c() {
        return new C12226c(this.f31780a + 1, this.f31781b, this.f31782c);
    }

    public C12226c(int i, Backoff backoff, RetryPolicy retryPolicy) {
        this.f31780a = i;
        this.f31781b = backoff;
        this.f31782c = retryPolicy;
    }
}
