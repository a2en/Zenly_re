package app.zenly.locator.chat.p055o5;

import app.zenly.android.base.util.C1302f;
import app.zenly.locator.chat.p055o5.C2127d.C2128a;
import app.zenly.locator.chat.p055o5.C2127d.C2129b;
import app.zenly.locator.chat.p055o5.C2127d.C2130c;
import app.zenly.locator.chat.p055o5.C2127d.C2131d;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.models.C2874c0.C2875a;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2908w.C2911c;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.o5.a */
public final class C2119a {

    /* renamed from: c */
    private static final long f6617c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: d */
    private static final long f6618d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    private final double f6619a = C1302f.KILOMETERS_PER_HOUR.mo6419b(3.0d);

    /* renamed from: b */
    private final C2718k5 f6620b;

    /* renamed from: app.zenly.locator.chat.o5.a$a */
    public static final class C2120a {
        private C2120a() {
        }

        public /* synthetic */ C2120a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2120a(null);
    }

    public C2119a(C2718k5 k5Var) {
        C12932j.m33818b(k5Var, "friendsManager");
        this.f6620b = k5Var;
    }

    /* renamed from: b */
    private final C2127d m7865b(C2896p pVar) {
        if (pVar.f8214r) {
            long e = pVar.f8222z.mo8996e();
            if (e != 0) {
                return new C2129b(e);
            }
            return C2128a.f6626a;
        }
        long c = this.f6620b.mo8791c(pVar.f8197a);
        if (!pVar.f8193B) {
            C2879d0 d0Var = pVar.f8198b;
            if (d0Var != null) {
                return new C2130c(c, d0Var.mo8942e());
            }
        }
        return new C2131d(c);
    }

    /* renamed from: c */
    private final boolean m7866c(C2896p pVar) {
        return pVar.f8195D > this.f6619a && !pVar.f8196E;
    }

    /* renamed from: d */
    private final boolean m7867d(C2896p pVar) {
        return pVar.f8222z.mo8997f() == C2911c.MOVING && C12840k.m33571a((Object[]) C2121b.f6621a, (Object) pVar.f8222z.mo8995d().mo9005c().mo9017d());
    }

    /* renamed from: e */
    private final boolean m7868e(C2896p pVar) {
        return pVar.f8210n != null;
    }

    /* renamed from: f */
    private final boolean m7869f(C2896p pVar) {
        return C12840k.m33571a((Object[]) C2121b.f6621a, (Object) pVar.f8219w);
    }

    /* renamed from: g */
    private final boolean m7870g(C2896p pVar) {
        return pVar.f8215s == 0.0f;
    }

    /* renamed from: h */
    private final boolean m7871h(C2896p pVar) {
        return pVar.f8222z.mo8997f() == C2911c.MOVING;
    }

    /* renamed from: i */
    private final boolean m7872i(C2896p pVar) {
        return pVar.f8192A.mo8930d() == C2875a.ASLEEP;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [app.zenly.locator.chat.o5.f] */
    /* JADX WARNING: type inference failed for: r1v0, types: [app.zenly.locator.chat.o5.f$e] */
    /* JADX WARNING: type inference failed for: r0v10, types: [app.zenly.locator.chat.o5.f$c] */
    /* JADX WARNING: type inference failed for: r1v2, types: [app.zenly.locator.chat.o5.f$e] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r1v4, types: [app.zenly.locator.chat.o5.f$e] */
    /* JADX WARNING: type inference failed for: r1v7, types: [app.zenly.locator.chat.o5.f$d] */
    /* JADX WARNING: type inference failed for: r1v13, types: [app.zenly.locator.chat.o5.f$a] */
    /* JADX WARNING: type inference failed for: r9v5, types: [app.zenly.locator.chat.o5.f$b] */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17, types: [app.zenly.locator.chat.o5.f$d] */
    /* JADX WARNING: type inference failed for: r1v18, types: [app.zenly.locator.chat.o5.f$a] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v12
      assigns: [?[OBJECT, ARRAY], app.zenly.locator.chat.o5.f$d, app.zenly.locator.chat.o5.f$a]
      uses: [app.zenly.locator.chat.o5.f, app.zenly.locator.chat.o5.f$d, app.zenly.locator.chat.o5.f$a]
      mth insns count: 70
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final app.zenly.locator.chat.p055o5.C2137f mo7914a(app.zenly.locator.core.models.C2896p r9) {
        /*
            r8 = this;
            java.lang.String r0 = "friend"
            kotlin.jvm.internal.C12932j.m33818b(r9, r0)
            boolean r0 = r9.mo8979d()
            if (r0 != 0) goto L_0x000e
            app.zenly.locator.chat.o5.f$f r9 = app.zenly.locator.chat.p055o5.C2137f.C2143f.f6649b
            return r9
        L_0x000e:
            boolean r0 = r8.m7870g(r9)
            if (r0 == 0) goto L_0x0019
            app.zenly.locator.chat.o5.f$b r9 = app.zenly.locator.chat.p055o5.C2137f.C2139b.f6640b
            r0 = r9
            goto L_0x00d2
        L_0x0019:
            boolean r0 = r8.m7867d(r9)
            if (r0 == 0) goto L_0x0045
            app.zenly.locator.chat.o5.f$a r0 = new app.zenly.locator.chat.o5.f$a
            app.zenly.locator.core.models.w r1 = r9.f8222z
            app.zenly.locator.core.models.w$b r1 = r1.mo8995d()
            app.zenly.locator.core.models.z r1 = r1.mo9005c()
            app.zenly.locator.core.models.z$b r2 = r1.mo9017d()
            app.zenly.locator.core.models.w r1 = r9.f8222z
            app.zenly.locator.core.models.w$b r1 = r1.mo8995d()
            long r3 = r1.mo8999a()
            boolean r5 = r8.m7866c(r9)
            double r6 = r9.f8195D
            r1 = r0
            r1.<init>(r2, r3, r5, r6)
            goto L_0x00d2
        L_0x0045:
            boolean r0 = r8.m7872i(r9)
            if (r0 == 0) goto L_0x0065
            app.zenly.locator.chat.o5.f$d r0 = new app.zenly.locator.chat.o5.f$d
            app.zenly.locator.core.models.c0 r1 = r9.f8192A
            long r2 = r1.mo8928b()
            app.zenly.locator.core.models.c0 r1 = r9.f8192A
            long r4 = r1.mo8929c()
            java.lang.String r6 = r9.f8218v
            java.lang.String r9 = "friend.timeZone"
            kotlin.jvm.internal.C12932j.m33815a(r6, r9)
            r1 = r0
            r1.<init>(r2, r4, r6)
            goto L_0x00d2
        L_0x0065:
            boolean r0 = r8.m7869f(r9)
            if (r0 == 0) goto L_0x0086
            app.zenly.locator.chat.o5.d r0 = r8.m7865b(r9)
            app.zenly.locator.chat.o5.f$e r1 = new app.zenly.locator.chat.o5.f$e
            app.zenly.locator.chat.o5.o r2 = r8.m7864a(r0)
            app.zenly.locator.chat.o5.e$c r3 = new app.zenly.locator.chat.o5.e$c
            app.zenly.locator.core.models.z$b r9 = r9.f8219w
            java.lang.String r4 = "friend.significantPlace"
            kotlin.jvm.internal.C12932j.m33815a(r9, r4)
            r3.<init>(r9)
            r1.<init>(r2, r3, r0)
        L_0x0084:
            r0 = r1
            goto L_0x00d2
        L_0x0086:
            boolean r0 = r8.m7868e(r9)
            if (r0 == 0) goto L_0x00a6
            app.zenly.locator.chat.o5.d r0 = r8.m7865b(r9)
            app.zenly.locator.chat.o5.f$e r1 = new app.zenly.locator.chat.o5.f$e
            app.zenly.locator.chat.o5.o r2 = r8.m7864a(r0)
            app.zenly.locator.chat.o5.e$b r3 = new app.zenly.locator.chat.o5.e$b
            app.zenly.locator.core.models.k r9 = r9.f8210n
            java.lang.String r4 = "friend.bubbleBitmap"
            kotlin.jvm.internal.C12932j.m33815a(r9, r4)
            r3.<init>(r9)
            r1.<init>(r2, r3, r0)
            goto L_0x0084
        L_0x00a6:
            boolean r0 = r8.m7871h(r9)
            if (r0 == 0) goto L_0x00b8
            app.zenly.locator.chat.o5.f$c r0 = new app.zenly.locator.chat.o5.f$c
            boolean r1 = r8.m7866c(r9)
            double r2 = r9.f8195D
            r0.<init>(r1, r2)
            goto L_0x00d2
        L_0x00b8:
            app.zenly.locator.chat.o5.d r0 = r8.m7865b(r9)
            app.zenly.locator.chat.o5.f$e r1 = new app.zenly.locator.chat.o5.f$e
            app.zenly.locator.chat.o5.o r2 = r8.m7864a(r0)
            app.zenly.locator.chat.o5.e$d r3 = new app.zenly.locator.chat.o5.e$d
            app.zenly.locator.s.n.d r9 = r9.f8199c
            java.lang.String r4 = "friend.position"
            kotlin.jvm.internal.C12932j.m33815a(r9, r4)
            r3.<init>(r9)
            r1.<init>(r2, r3, r0)
            goto L_0x0084
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.p055o5.C2119a.mo7914a(app.zenly.locator.core.models.p):app.zenly.locator.chat.o5.f");
    }

    /* renamed from: a */
    private final C2190o m7864a(C2127d dVar) {
        if (dVar instanceof C2128a) {
            return null;
        }
        if (dVar instanceof C2129b) {
            return m7863a(System.currentTimeMillis() - ((C2129b) dVar).mo7923a());
        }
        if (dVar instanceof C2130c) {
            return m7863a(System.currentTimeMillis() - ((C2130c) dVar).mo7927a());
        }
        if (dVar instanceof C2131d) {
            return m7863a(System.currentTimeMillis() - ((C2131d) dVar).mo7932a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    private final C2190o m7863a(long j) {
        long j2 = f6617c;
        if (j < j2) {
            j2 = f6618d;
        }
        return new C2190o((j2 - (j % j2)) + 1, j2);
    }
}
