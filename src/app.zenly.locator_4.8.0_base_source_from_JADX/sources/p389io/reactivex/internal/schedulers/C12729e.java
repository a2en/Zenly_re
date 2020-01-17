package p389io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;

/* renamed from: io.reactivex.internal.schedulers.e */
public final class C12729e extends C12286f {

    /* renamed from: c */
    private static final C12731g f33201c = new C12731g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f33202b;

    public C12729e() {
        this(f33201c);
    }

    /* renamed from: a */
    public C12289c mo6573a() {
        return new C12730f(this.f33202b);
    }

    public C12729e(ThreadFactory threadFactory) {
        this.f33202b = threadFactory;
    }
}
