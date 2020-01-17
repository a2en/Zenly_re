package app.zenly.locator.core.models;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.sleepdetection.C8408b;
import p213co.znly.models.sleepdetection.C8408b.C8412c;

/* renamed from: app.zenly.locator.core.models.c0 */
public final class C2874c0 {

    /* renamed from: a */
    private C8408b f8123a;

    /* renamed from: b */
    private long f8124b;

    /* renamed from: c */
    private C2875a f8125c = C2875a.UNKNOWN;

    /* renamed from: d */
    private C8408b f8126d;

    /* renamed from: e */
    private long f8127e;

    /* renamed from: f */
    private long f8128f;

    /* renamed from: g */
    private C2916z f8129g = C2916z.f8285f;

    /* renamed from: h */
    private boolean f8130h;

    /* renamed from: i */
    private boolean f8131i;

    /* renamed from: j */
    private long f8132j;

    /* renamed from: app.zenly.locator.core.models.c0$a */
    public enum C2875a {
        ASLEEP(C8412c.SLEEP_STATE_ASLEEP),
        PROBABLY_ASLEEP(C8412c.SLEEP_STATE_PROBABLY_ASLEEP),
        UNKNOWN(C8412c.SLEEP_STATE_UNKNOWN);
        

        /* renamed from: j */
        public static final C2876a f8137j = null;

        /* renamed from: e */
        private final C8412c f8138e;

        /* renamed from: app.zenly.locator.core.models.c0$a$a */
        public static final class C2876a {
            private C2876a() {
            }

            /* renamed from: a */
            public final C2875a mo8932a(C8412c cVar) {
                C2875a aVar;
                C12932j.m33818b(cVar, "coreState");
                C2875a[] values = C2875a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i];
                    if (aVar.mo8931a() == cVar) {
                        break;
                    }
                    i++;
                }
                return aVar != null ? aVar : C2875a.UNKNOWN;
            }

            public /* synthetic */ C2876a(C12928f fVar) {
                this();
            }
        }

        static {
            f8137j = new C2876a(null);
        }

        private C2875a(C8412c cVar) {
            this.f8138e = cVar;
        }

        /* renamed from: a */
        public final C8412c mo8931a() {
            return this.f8138e;
        }
    }

    /* renamed from: a */
    public final void mo8926a(C8408b bVar) {
        this.f8126d = bVar;
    }

    /* renamed from: b */
    public final long mo8928b() {
        return this.f8127e;
    }

    /* renamed from: c */
    public final long mo8929c() {
        return this.f8128f;
    }

    /* renamed from: d */
    public final C2875a mo8930d() {
        return this.f8125c;
    }

    /* renamed from: a */
    public final C2874c0 mo8925a(C2874c0 c0Var) {
        C12932j.m33818b(c0Var, "clone");
        c0Var.f8126d = this.f8126d;
        c0Var.f8125c = this.f8125c;
        c0Var.f8127e = this.f8127e;
        c0Var.f8128f = this.f8128f;
        c0Var.f8129g = this.f8129g;
        c0Var.f8130h = this.f8130h;
        c0Var.f8132j = this.f8132j;
        return c0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8927a() {
        /*
            r15 = this;
            co.znly.models.sleepdetection.b r0 = r15.f8126d
            co.znly.models.sleepdetection.b r1 = r15.f8123a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x00d1
            co.znly.models.sleepdetection.b r0 = r15.f8126d
            if (r0 == 0) goto L_0x00d1
            app.zenly.locator.core.models.c0$a$a r3 = app.zenly.locator.core.models.C2874c0.C2875a.f8137j
            co.znly.models.sleepdetection.b$c r4 = r0.getSleepState()
            java.lang.String r5 = "it.sleepState"
            kotlin.jvm.internal.C12932j.m33815a(r4, r5)
            app.zenly.locator.core.models.c0$a r3 = r3.mo8932a(r4)
            co.znly.core.ZenlyCore r4 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            co.znly.core.vendor.com.google.protobuf.Timestamp r5 = r0.getBedTimestamp()
            java.lang.String r6 = "it.bedTimestamp"
            kotlin.jvm.internal.C12932j.m33815a(r5, r6)
            long r5 = app.zenly.locator.core.util.C3245z.m10288g(r5)
            long r4 = app.zenly.locator.p143s.p148l.C5447b.m15473a(r4, r5)
            co.znly.core.ZenlyCore r6 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            co.znly.core.vendor.com.google.protobuf.Timestamp r7 = r0.getEstimatedWakeUpTimestamp()
            java.lang.String r8 = "it.estimatedWakeUpTimestamp"
            kotlin.jvm.internal.C12932j.m33815a(r7, r8)
            long r7 = app.zenly.locator.core.util.C3245z.m10288g(r7)
            long r6 = app.zenly.locator.p143s.p148l.C5447b.m15473a(r6, r7)
            app.zenly.locator.core.models.z$a r8 = app.zenly.locator.core.models.C2916z.f8286g
            co.znly.models.PlaceProto$Place r9 = r0.getPlace()
            java.lang.String r10 = "it.place"
            kotlin.jvm.internal.C12932j.m33815a(r9, r10)
            app.zenly.locator.core.models.z r8 = r8.mo9022a(r9)
            co.znly.models.sleepdetection.b$a r9 = r0.getBedTimeType()
            co.znly.models.sleepdetection.b$a r10 = p213co.znly.models.sleepdetection.C8408b.C8409a.BED_TIME_TYPE_WENT_TO_BED_LATE
            if (r9 != r10) goto L_0x0063
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            co.znly.core.ZenlyCore r10 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            co.znly.core.vendor.com.google.protobuf.Timestamp r11 = r0.getWakeUpTimestamp()
            java.lang.String r12 = "it.wakeUpTimestamp"
            kotlin.jvm.internal.C12932j.m33815a(r11, r12)
            long r11 = app.zenly.locator.core.util.C3245z.m10288g(r11)
            long r10 = app.zenly.locator.p143s.p148l.C5447b.m15473a(r10, r11)
            app.zenly.locator.core.models.c0$a r12 = r15.f8125c
            if (r3 != r12) goto L_0x009f
            long r12 = r15.f8127e
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x009f
            long r12 = r15.f8128f
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x009f
            app.zenly.locator.core.models.z r12 = r15.f8129g
            boolean r12 = kotlin.jvm.internal.C12932j.m33817a(r8, r12)
            r12 = r12 ^ r1
            if (r12 != 0) goto L_0x009f
            boolean r12 = r15.f8130h
            if (r9 != r12) goto L_0x009f
            long r12 = r15.f8132j
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r12 = 0
            goto L_0x00a0
        L_0x009f:
            r12 = 1
        L_0x00a0:
            if (r12 == 0) goto L_0x00ae
            r15.f8125c = r3
            r15.f8127e = r4
            r15.f8128f = r6
            r15.f8129g = r8
            r15.f8130h = r9
            r15.f8132j = r10
        L_0x00ae:
            r15.f8123a = r0
            app.zenly.locator.core.models.c0$a r3 = r15.f8125c
            app.zenly.locator.core.models.c0$a r4 = app.zenly.locator.core.models.C2874c0.C2875a.ASLEEP
            if (r3 != r4) goto L_0x00cc
            co.znly.core.ZenlyCore r3 = app.zenly.locator.p143s.p148l.C5448c.m15478a()
            co.znly.core.vendor.com.google.protobuf.Timestamp r0 = r0.getOversleepingTimestamp()
            java.lang.String r4 = "it.oversleepingTimestamp"
            kotlin.jvm.internal.C12932j.m33815a(r0, r4)
            long r4 = app.zenly.locator.core.util.C3245z.m10288g(r0)
            long r3 = app.zenly.locator.p143s.p148l.C5447b.m15473a(r3, r4)
            goto L_0x00ce
        L_0x00cc:
            r3 = 0
        L_0x00ce:
            r15.f8124b = r3
            goto L_0x00d2
        L_0x00d1:
            r12 = 0
        L_0x00d2:
            app.zenly.locator.core.models.c0$a r0 = r15.f8125c
            app.zenly.locator.core.models.c0$a r3 = app.zenly.locator.core.models.C2874c0.C2875a.ASLEEP
            if (r0 != r3) goto L_0x00e4
            long r3 = r15.f8124b
            long r5 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e4
            r0 = 1
            goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            boolean r3 = r15.f8131i
            if (r0 == r3) goto L_0x00ed
            r15.f8131i = r0
            r0 = 1
            goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            if (r12 != 0) goto L_0x00f4
            if (r0 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r1 = 0
        L_0x00f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.models.C2874c0.mo8927a():boolean");
    }
}
