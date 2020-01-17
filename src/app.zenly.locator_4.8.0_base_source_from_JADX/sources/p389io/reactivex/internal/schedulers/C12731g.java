package p389io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.internal.schedulers.g */
public final class C12731g extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: e */
    final String f33205e;

    /* renamed from: f */
    final int f33206f;

    /* renamed from: g */
    final boolean f33207g;

    /* renamed from: io.reactivex.internal.schedulers.g$a */
    static final class C12732a extends Thread implements NonBlockingThread {
        C12732a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C12731g(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.f33205e);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        Thread aVar = this.f33207g ? new C12732a(runnable, sb2) : new Thread(runnable, sb2);
        aVar.setPriority(this.f33206f);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxThreadFactory[");
        sb.append(this.f33205e);
        sb.append("]");
        return sb.toString();
    }

    public C12731g(String str, int i) {
        this(str, i, false);
    }

    public C12731g(String str, int i, boolean z) {
        this.f33205e = str;
        this.f33206f = i;
        this.f33207g = z;
    }
}
