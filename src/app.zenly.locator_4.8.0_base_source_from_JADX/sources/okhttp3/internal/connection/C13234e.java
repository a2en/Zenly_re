package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.C13177e;
import okhttp3.C13325v;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.connection.C13239i.C13240a;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.internal.connection.e */
final class C13234e {

    /* renamed from: a */
    private final C13241j f34060a;

    /* renamed from: b */
    private final C13177e f34061b;

    /* renamed from: c */
    private final C13237g f34062c;

    /* renamed from: d */
    private final Call f34063d;

    /* renamed from: e */
    private final EventListener f34064e;

    /* renamed from: f */
    private C13240a f34065f;

    /* renamed from: g */
    private final C13239i f34066g;

    /* renamed from: h */
    private C13235f f34067h;

    /* renamed from: i */
    private boolean f34068i;

    C13234e(C13241j jVar, C13237g gVar, C13177e eVar, Call call, EventListener eventListener) {
        this.f34060a = jVar;
        this.f34062c = gVar;
        this.f34061b = eVar;
        this.f34063d = call;
        this.f34064e = eventListener;
        this.f34066g = new C13239i(eVar, gVar.f34091e, call, eventListener);
    }

    /* renamed from: e */
    private boolean m34715e() {
        C13235f fVar = this.f34060a.f34112i;
        return fVar != null && fVar.f34079l == 0 && C13184e.m34508a(fVar.route().mo37833a().mo37854k(), this.f34061b.mo37854k());
    }

    /* renamed from: a */
    public ExchangeCodec mo38022a(C13325v vVar, Chain chain, boolean z) {
        try {
            return m34714a(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), vVar.mo38348s(), vVar.mo38354y(), z).mo38026a(vVar, chain);
        } catch (RouteException e) {
            mo38025d();
            throw e;
        } catch (IOException e2) {
            mo38025d();
            throw new RouteException(e2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo38023b() {
        boolean z;
        synchronized (this.f34062c) {
            if (!m34715e() && (this.f34065f == null || !this.f34065f.mo38052b())) {
                if (!this.f34066g.mo38049a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo38024c() {
        boolean z;
        synchronized (this.f34062c) {
            z = this.f34068i;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo38025d() {
        synchronized (this.f34062c) {
            this.f34068i = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo38035a(r9) != false) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.C13235f m34714a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.f r0 = r3.m34713a(r4, r5, r6, r7, r8)
            okhttp3.internal.connection.g r1 = r3.f34062c
            monitor-enter(r1)
            int r2 = r0.f34080m     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo38035a(r9)
            if (r1 != 0) goto L_0x0018
            r0.mo38037c()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C13234e.m34714a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.f");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.C13235f m34713a(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            okhttp3.internal.connection.g r2 = r1.f34062c
            monitor-enter(r2)
            okhttp3.internal.connection.j r0 = r1.f34060a     // Catch:{ all -> 0x0140 }
            boolean r0 = r0.mo38064f()     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x0138
            r0 = 0
            r1.f34068i = r0     // Catch:{ all -> 0x0140 }
            boolean r3 = r18.m34715e()     // Catch:{ all -> 0x0140 }
            r4 = 0
            if (r3 == 0) goto L_0x0020
            okhttp3.internal.connection.j r3 = r1.f34060a     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.f r3 = r3.f34112i     // Catch:{ all -> 0x0140 }
            okhttp3.c0 r3 = r3.route()     // Catch:{ all -> 0x0140 }
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            okhttp3.internal.connection.j r5 = r1.f34060a     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.f r5 = r5.f34112i     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.j r6 = r1.f34060a     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.f r6 = r6.f34112i     // Catch:{ all -> 0x0140 }
            if (r6 == 0) goto L_0x003a
            okhttp3.internal.connection.j r6 = r1.f34060a     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.f r6 = r6.f34112i     // Catch:{ all -> 0x0140 }
            boolean r6 = r6.f34078k     // Catch:{ all -> 0x0140 }
            if (r6 == 0) goto L_0x003a
            okhttp3.internal.connection.j r6 = r1.f34060a     // Catch:{ all -> 0x0140 }
            java.net.Socket r6 = r6.mo38065g()     // Catch:{ all -> 0x0140 }
            goto L_0x003b
        L_0x003a:
            r6 = r4
        L_0x003b:
            okhttp3.internal.connection.j r7 = r1.f34060a     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.f r7 = r7.f34112i     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x0047
            okhttp3.internal.connection.j r5 = r1.f34060a     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.f r5 = r5.f34112i     // Catch:{ all -> 0x0140 }
            r7 = r4
            goto L_0x0049
        L_0x0047:
            r7 = r5
            r5 = r4
        L_0x0049:
            r8 = 1
            if (r5 != 0) goto L_0x0061
            okhttp3.internal.connection.g r9 = r1.f34062c     // Catch:{ all -> 0x0140 }
            okhttp3.e r10 = r1.f34061b     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.j r11 = r1.f34060a     // Catch:{ all -> 0x0140 }
            boolean r9 = r9.mo38043a(r10, r11, r4, r0)     // Catch:{ all -> 0x0140 }
            if (r9 == 0) goto L_0x005f
            okhttp3.internal.connection.j r3 = r1.f34060a     // Catch:{ all -> 0x0140 }
            okhttp3.internal.connection.f r5 = r3.f34112i     // Catch:{ all -> 0x0140 }
            r9 = r4
            r3 = 1
            goto L_0x0063
        L_0x005f:
            r9 = r3
            goto L_0x0062
        L_0x0061:
            r9 = r4
        L_0x0062:
            r3 = 0
        L_0x0063:
            monitor-exit(r2)     // Catch:{ all -> 0x0140 }
            okhttp3.p418f0.C13184e.m34505a(r6)
            if (r7 == 0) goto L_0x0070
            okhttp3.EventListener r2 = r1.f34064e
            okhttp3.Call r6 = r1.f34063d
            r2.mo37762b(r6, r7)
        L_0x0070:
            if (r3 == 0) goto L_0x0079
            okhttp3.EventListener r2 = r1.f34064e
            okhttp3.Call r6 = r1.f34063d
            r2.mo37755a(r6, r5)
        L_0x0079:
            if (r5 == 0) goto L_0x007c
            return r5
        L_0x007c:
            if (r9 != 0) goto L_0x0092
            okhttp3.internal.connection.i$a r2 = r1.f34065f
            if (r2 == 0) goto L_0x0088
            boolean r2 = r2.mo38052b()
            if (r2 != 0) goto L_0x0092
        L_0x0088:
            okhttp3.internal.connection.i r2 = r1.f34066g
            okhttp3.internal.connection.i$a r2 = r2.mo38050b()
            r1.f34065f = r2
            r2 = 1
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            okhttp3.internal.connection.g r6 = r1.f34062c
            monitor-enter(r6)
            okhttp3.internal.connection.j r7 = r1.f34060a     // Catch:{ all -> 0x0135 }
            boolean r7 = r7.mo38064f()     // Catch:{ all -> 0x0135 }
            if (r7 != 0) goto L_0x012d
            if (r2 == 0) goto L_0x00b8
            okhttp3.internal.connection.i$a r2 = r1.f34065f     // Catch:{ all -> 0x0135 }
            java.util.List r2 = r2.mo38051a()     // Catch:{ all -> 0x0135 }
            okhttp3.internal.connection.g r7 = r1.f34062c     // Catch:{ all -> 0x0135 }
            okhttp3.e r10 = r1.f34061b     // Catch:{ all -> 0x0135 }
            okhttp3.internal.connection.j r11 = r1.f34060a     // Catch:{ all -> 0x0135 }
            boolean r0 = r7.mo38043a(r10, r11, r2, r0)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x00b9
            okhttp3.internal.connection.j r0 = r1.f34060a     // Catch:{ all -> 0x0135 }
            okhttp3.internal.connection.f r5 = r0.f34112i     // Catch:{ all -> 0x0135 }
            r3 = 1
            goto L_0x00b9
        L_0x00b8:
            r2 = r4
        L_0x00b9:
            if (r3 != 0) goto L_0x00cc
            if (r9 != 0) goto L_0x00c3
            okhttp3.internal.connection.i$a r0 = r1.f34065f     // Catch:{ all -> 0x0135 }
            okhttp3.c0 r9 = r0.mo38053c()     // Catch:{ all -> 0x0135 }
        L_0x00c3:
            okhttp3.internal.connection.f r5 = new okhttp3.internal.connection.f     // Catch:{ all -> 0x0135 }
            okhttp3.internal.connection.g r0 = r1.f34062c     // Catch:{ all -> 0x0135 }
            r5.<init>(r0, r9)     // Catch:{ all -> 0x0135 }
            r1.f34067h = r5     // Catch:{ all -> 0x0135 }
        L_0x00cc:
            monitor-exit(r6)     // Catch:{ all -> 0x0135 }
            if (r3 == 0) goto L_0x00d7
            okhttp3.EventListener r0 = r1.f34064e
            okhttp3.Call r2 = r1.f34063d
            r0.mo37755a(r2, r5)
            return r5
        L_0x00d7:
            okhttp3.Call r0 = r1.f34063d
            okhttp3.EventListener r3 = r1.f34064e
            r10 = r5
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r3
            r10.mo38029a(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.internal.connection.g r0 = r1.f34062c
            okhttp3.internal.connection.h r0 = r0.f34091e
            okhttp3.c0 r3 = r5.route()
            r0.mo38046a(r3)
            okhttp3.internal.connection.g r3 = r1.f34062c
            monitor-enter(r3)
            r1.f34067h = r4     // Catch:{ all -> 0x012a }
            okhttp3.internal.connection.g r0 = r1.f34062c     // Catch:{ all -> 0x012a }
            okhttp3.e r6 = r1.f34061b     // Catch:{ all -> 0x012a }
            okhttp3.internal.connection.j r7 = r1.f34060a     // Catch:{ all -> 0x012a }
            boolean r0 = r0.mo38043a(r6, r7, r2, r8)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0114
            r5.f34078k = r8     // Catch:{ all -> 0x012a }
            java.net.Socket r4 = r5.socket()     // Catch:{ all -> 0x012a }
            okhttp3.internal.connection.j r0 = r1.f34060a     // Catch:{ all -> 0x012a }
            okhttp3.internal.connection.f r5 = r0.f34112i     // Catch:{ all -> 0x012a }
            goto L_0x011e
        L_0x0114:
            okhttp3.internal.connection.g r0 = r1.f34062c     // Catch:{ all -> 0x012a }
            r0.mo38045b(r5)     // Catch:{ all -> 0x012a }
            okhttp3.internal.connection.j r0 = r1.f34060a     // Catch:{ all -> 0x012a }
            r0.mo38058a(r5)     // Catch:{ all -> 0x012a }
        L_0x011e:
            monitor-exit(r3)     // Catch:{ all -> 0x012a }
            okhttp3.p418f0.C13184e.m34505a(r4)
            okhttp3.EventListener r0 = r1.f34064e
            okhttp3.Call r2 = r1.f34063d
            r0.mo37755a(r2, r5)
            return r5
        L_0x012a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x012a }
            throw r0
        L_0x012d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0135 }
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0135 }
            throw r0
        L_0x0138:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x0140 }
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0140 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C13234e.m34713a(int, int, int, int, boolean):okhttp3.internal.connection.f");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13235f mo38021a() {
        return this.f34067h;
    }
}
