package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy.Type;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C13174c0;
import okhttp3.C13177e;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.p420h.C13202e;

/* renamed from: okhttp3.internal.connection.g */
public final class C13237g {

    /* renamed from: g */
    private static final Executor f34086g;

    /* renamed from: a */
    private final int f34087a;

    /* renamed from: b */
    private final long f34088b;

    /* renamed from: c */
    private final Runnable f34089c = new C13228a(this);

    /* renamed from: d */
    private final Deque<C13235f> f34090d = new ArrayDeque();

    /* renamed from: e */
    final C13238h f34091e = new C13238h();

    /* renamed from: f */
    boolean f34092f;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13184e.m34500a("OkHttp ConnectionPool", true));
        f34086g = threadPoolExecutor;
    }

    public C13237g(int i, long j, TimeUnit timeUnit) {
        this.f34087a = i;
        this.f34088b = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo38041a() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.mo38040a(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C13237g.mo38041a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38045b(C13235f fVar) {
        if (!this.f34092f) {
            this.f34092f = true;
            f34086g.execute(this.f34089c);
        }
        this.f34090d.add(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo38043a(C13177e eVar, C13241j jVar, List<C13174c0> list, boolean z) {
        for (C13235f fVar : this.f34090d) {
            if ((!z || fVar.mo38036b()) && fVar.mo38033a(eVar, list)) {
                jVar.mo38058a(fVar);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo38044a(C13235f fVar) {
        if (fVar.f34078k || this.f34087a == 0) {
            this.f34090d.remove(fVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo38040a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            C13235f fVar = null;
            int i = 0;
            int i2 = 0;
            for (C13235f fVar2 : this.f34090d) {
                if (m34741a(fVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - fVar2.f34084q;
                    if (j3 > j2) {
                        fVar = fVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f34088b) {
                if (i <= this.f34087a) {
                    if (i > 0) {
                        long j4 = this.f34088b - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.f34088b;
                        return j5;
                    } else {
                        this.f34092f = false;
                        return -1;
                    }
                }
            }
            this.f34090d.remove(fVar);
            C13184e.m34505a(fVar.socket());
            return 0;
        }
    }

    /* renamed from: a */
    private int m34741a(C13235f fVar, long j) {
        List<Reference<C13241j>> list = fVar.f34083p;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C13243b bVar = (C13243b) reference;
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(fVar.route().mo37833a().mo37854k());
                sb.append(" was leaked. Did you forget to close a response body?");
                C13202e.m34581d().mo37898a(sb.toString(), bVar.f34120a);
                list.remove(i);
                fVar.f34078k = true;
                if (list.isEmpty()) {
                    fVar.f34084q = j - this.f34088b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo38042a(C13174c0 c0Var, IOException iOException) {
        if (c0Var.mo37834b().type() != Type.DIRECT) {
            C13177e a = c0Var.mo37833a();
            a.mo37850h().connectFailed(a.mo37854k().mo38298p(), c0Var.mo37834b().address(), iOException);
        }
        this.f34091e.mo38047b(c0Var);
    }
}
