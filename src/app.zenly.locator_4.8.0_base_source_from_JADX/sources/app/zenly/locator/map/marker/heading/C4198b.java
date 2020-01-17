package app.zenly.locator.map.marker.heading;

import android.content.Context;
import app.zenly.locator.core.models.C2908w.C2910b;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.map.marker.C4167b0;
import app.zenly.locator.map.marker.C4167b0.C4169b;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.marker.MarkerAdapter;
import app.zenly.locator.map.marker.heading.C4208e.C4213b;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.marker.heading.b */
public final class C4198b extends MarkerAdapter<C4208e, HeadingPlaceMarkerView> {

    /* renamed from: h */
    private final C4208e f11247h = new C4208e(this.f11251l, "from");

    /* renamed from: i */
    private final C4208e f11248i = new C4208e(this.f11251l, "to");

    /* renamed from: j */
    private C4167b0 f11249j;

    /* renamed from: k */
    private final C4199a f11250k;

    /* renamed from: l */
    private final Context f11251l;

    /* renamed from: app.zenly.locator.map.marker.heading.b$a */
    public static final class C4199a extends C4169b {

        /* renamed from: a */
        final /* synthetic */ C4198b f11252a;

        C4199a(C4198b bVar) {
            this.f11252a = bVar;
        }

        /* renamed from: a */
        public void mo10787a(C4167b0 b0Var, C2910b bVar) {
            C12932j.m33818b(b0Var, "marker");
            C12932j.m33818b(bVar, "heading");
            this.f11252a.m12511f();
        }

        /* renamed from: c */
        public void mo11015c(C4167b0 b0Var, boolean z) {
            this.f11252a.m12511f();
        }

        /* renamed from: a */
        public void mo11054a(C4167b0 b0Var, C2918b bVar) {
            C12932j.m33818b(b0Var, "marker");
            C12932j.m33818b(bVar, "place");
            this.f11252a.m12511f();
        }
    }

    public C4198b(Context context) {
        C12932j.m33818b(context, "context");
        super("HeadingMarkerAdapter");
        this.f11251l = context;
        mo10904a(this.f11247h);
        mo10904a(this.f11248i);
        this.f11250k = new C4199a(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m12511f() {
        /*
            r8 = this;
            app.zenly.locator.map.marker.b0 r0 = r8.f11249j
            r1 = 0
            if (r0 == 0) goto L_0x000e
            app.zenly.locator.core.models.p r2 = r0.mo11025P()
            if (r2 == 0) goto L_0x000e
            app.zenly.locator.core.models.d0 r2 = r2.f8198b
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            if (r0 != 0) goto L_0x001c
            app.zenly.locator.map.marker.heading.e r0 = r8.f11247h
            r0.mo11118s()
            app.zenly.locator.map.marker.heading.e r0 = r8.f11248i
            r0.mo11118s()
            return
        L_0x001c:
            app.zenly.locator.core.models.p r0 = r0.mo11025P()
            app.zenly.locator.core.models.w r0 = r0.f8222z
            app.zenly.locator.core.models.w$b r0 = r0.mo8995d()
            app.zenly.locator.core.models.z r3 = r0.mo9008f()
            app.zenly.locator.s.n.d r3 = r3.mo9015b()
            if (r3 == 0) goto L_0x006a
            app.zenly.locator.map.marker.heading.e r3 = r8.f11247h
            app.zenly.locator.core.models.z r4 = r0.mo9008f()
            app.zenly.locator.core.models.z$b r4 = r4.mo9017d()
            app.zenly.locator.map.marker.heading.e$b r4 = r8.m12509a(r4)
            r3.mo11201a(r4)
            app.zenly.locator.core.models.z r4 = r0.mo9008f()
            app.zenly.locator.s.n.d r4 = r4.mo9015b()
            r3.mo11100a(r4)
            boolean r4 = r0.mo9007e()
            if (r4 == 0) goto L_0x0064
            app.zenly.locator.map.marker.heading.e$a$a r4 = new app.zenly.locator.map.marker.heading.e$a$a
            if (r2 == 0) goto L_0x005b
            java.lang.String r5 = r2.mo8942e()
            goto L_0x005c
        L_0x005b:
            r5 = r1
        L_0x005c:
            long r6 = r0.mo9004b()
            r4.<init>(r5, r6)
            goto L_0x0066
        L_0x0064:
            app.zenly.locator.map.marker.heading.e$a$b r4 = app.zenly.locator.map.marker.heading.C4208e.C4209a.C4211b.f11294a
        L_0x0066:
            r3.mo11200a(r4)
            goto L_0x006f
        L_0x006a:
            app.zenly.locator.map.marker.heading.e r3 = r8.f11247h
            r3.mo11118s()
        L_0x006f:
            app.zenly.locator.core.models.z r3 = r0.mo9005c()
            app.zenly.locator.s.n.d r3 = r3.mo9015b()
            if (r3 == 0) goto L_0x00b1
            app.zenly.locator.map.marker.heading.e r3 = r8.f11248i
            app.zenly.locator.core.models.z r4 = r0.mo9005c()
            app.zenly.locator.core.models.z$b r4 = r4.mo9017d()
            app.zenly.locator.map.marker.heading.e$b r4 = r8.m12509a(r4)
            r3.mo11201a(r4)
            app.zenly.locator.core.models.z r4 = r0.mo9005c()
            app.zenly.locator.s.n.d r4 = r4.mo9015b()
            r3.mo11100a(r4)
            boolean r4 = r0.mo9006d()
            if (r4 == 0) goto L_0x00ab
            app.zenly.locator.map.marker.heading.e$a$c r4 = new app.zenly.locator.map.marker.heading.e$a$c
            if (r2 == 0) goto L_0x00a3
            java.lang.String r1 = r2.mo8942e()
        L_0x00a3:
            long r5 = r0.mo8999a()
            r4.<init>(r1, r5)
            goto L_0x00ad
        L_0x00ab:
            app.zenly.locator.map.marker.heading.e$a$b r4 = app.zenly.locator.map.marker.heading.C4208e.C4209a.C4211b.f11294a
        L_0x00ad:
            r3.mo11200a(r4)
            goto L_0x00b6
        L_0x00b1:
            app.zenly.locator.map.marker.heading.e r0 = r8.f11248i
            r0.mo11118s()
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.heading.C4198b.m12511f():void");
    }

    /* renamed from: d */
    public final C4208e mo11176d() {
        return this.f11247h;
    }

    /* renamed from: e */
    public final C4208e mo11177e() {
        return this.f11248i;
    }

    /* renamed from: a */
    public final void mo11175a(C4167b0 b0Var) {
        if (!C12932j.m33817a((Object) b0Var, (Object) this.f11249j)) {
            C4167b0 b0Var2 = this.f11249j;
            if (b0Var2 != null) {
                b0Var2.mo11105b((C4179a) this.f11250k);
            }
            this.f11249j = b0Var;
            if (b0Var != null) {
                b0Var.mo11099a((C4179a) this.f11250k);
            }
            m12511f();
        }
    }

    /* renamed from: a */
    private final C4213b m12509a(C2918b bVar) {
        int i = C4197a.f11246a[bVar.ordinal()];
        if (i == 1) {
            return C4213b.HOME;
        }
        if (i == 2) {
            return C4213b.SCHOOL;
        }
        if (i != 3) {
            return C4213b.UNKNOWN;
        }
        return C4213b.WORK;
    }
}
