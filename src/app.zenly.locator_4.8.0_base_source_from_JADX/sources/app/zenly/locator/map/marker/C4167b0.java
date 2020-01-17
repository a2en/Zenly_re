package app.zenly.locator.map.marker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2511d;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2874c0;
import app.zenly.locator.core.models.C2874c0.C2875a;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2908w;
import app.zenly.locator.core.models.C2908w.C2910b;
import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.debug.C3439b;
import app.zenly.locator.map.marker.AvatarMarkerView.C4140e;
import app.zenly.locator.map.marker.C4171c0.C4173b;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.marker.C4223k0.C4225b;
import java.util.Objects;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;

/* renamed from: app.zenly.locator.map.marker.b0 */
public class C4167b0 extends C4267y {

    /* renamed from: l0 */
    private static final int f11104l0 = C3200e0.m10182a(10);

    /* renamed from: M */
    private final int f11105M = R.color.green;

    /* renamed from: N */
    private final int f11106N = R.color.green_dark;

    /* renamed from: O */
    private final int f11107O = R.color.orange;

    /* renamed from: P */
    private final int f11108P = R.color.orange_dark;

    /* renamed from: Q */
    private final int f11109Q = R.color.cerulean_blue;

    /* renamed from: R */
    private final int f11110R = R.color.yellow_light;

    /* renamed from: S */
    private final int f11111S = R.color.gray_heavy;

    /* renamed from: T */
    private final int f11112T = R.color.gray_black;

    /* renamed from: U */
    private C2896p f11113U;

    /* renamed from: V */
    private float f11114V = 1.0f;

    /* renamed from: W */
    private float f11115W;

    /* renamed from: X */
    private boolean f11116X = false;

    /* renamed from: Y */
    private boolean f11117Y = true;

    /* renamed from: Z */
    private boolean f11118Z = true;

    /* renamed from: a0 */
    private Bitmap f11119a0;

    /* renamed from: b0 */
    private C2890k f11120b0;

    /* renamed from: c0 */
    private boolean f11121c0;

    /* renamed from: d0 */
    private Bitmap f11122d0;

    /* renamed from: e0 */
    private Bitmap f11123e0;

    /* renamed from: f0 */
    private C4171c0 f11124f0;

    /* renamed from: g0 */
    private boolean f11125g0 = true;

    /* renamed from: h0 */
    private int f11126h0;

    /* renamed from: i0 */
    private boolean f11127i0;

    /* renamed from: j0 */
    private Bitmap f11128j0;

    /* renamed from: k0 */
    private final C4173b f11129k0 = new C4168a();

    /* renamed from: app.zenly.locator.map.marker.b0$a */
    class C4168a extends C4173b {
        C4168a() {
        }

        /* renamed from: b */
        public void mo10917e(C4171c0 c0Var) {
            C4167b0.this.mo11107c();
        }

        /* renamed from: a */
        public void mo10914c(C4171c0 c0Var) {
            C4167b0.this.m12233C0();
            C4167b0.this.mo11107c();
            C4167b0.this.m12284z0();
        }

        /* renamed from: b */
        public void mo10912a(C4171c0 c0Var, boolean z) {
            C4167b0.this.m12284z0();
        }

        /* renamed from: a */
        public void mo11049a(C4171c0 c0Var, boolean z) {
            C4167b0.this.m12233C0();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.b0$b */
    public static class C4169b extends C4179a<C4167b0> {
        /* renamed from: a */
        public void mo11052a(C4167b0 b0Var, double d, boolean z) {
        }

        /* renamed from: a */
        public void mo11053a(C4167b0 b0Var, int i) {
        }

        /* renamed from: a */
        public void mo11010a(C4167b0 b0Var, int i, boolean z) {
        }

        /* renamed from: a */
        public void mo11011a(C4167b0 b0Var, Bitmap bitmap) {
        }

        /* renamed from: a */
        public void mo11012a(C4167b0 b0Var, C2874c0 c0Var) {
        }

        /* renamed from: a */
        public void mo11013a(C4167b0 b0Var, C2890k kVar) {
        }

        /* renamed from: a */
        public void mo10787a(C4167b0 b0Var, C2910b bVar) {
        }

        /* renamed from: a */
        public void mo11054a(C4167b0 b0Var, C2918b bVar) {
        }

        /* renamed from: a */
        public void mo11055a(C4167b0 b0Var, String str) {
        }

        /* renamed from: a */
        public void mo11056a(C4167b0 b0Var, boolean z) {
        }

        /* renamed from: b */
        public void mo11057b(C4167b0 b0Var, boolean z) {
        }

        /* renamed from: c */
        public void mo11015c(C4167b0 b0Var, boolean z) {
        }

        /* renamed from: d */
        public void mo11016d(C4167b0 b0Var, boolean z) {
        }

        /* renamed from: e */
        public void mo11058e(C4167b0 b0Var, boolean z) {
        }

        /* renamed from: f */
        public void mo11059f(C4167b0 b0Var, boolean z) {
        }
    }

    public C4167b0(Context context, C2896p pVar) {
        super(context, pVar.f8197a);
        mo11032a(pVar, 0, true);
    }

    /* renamed from: A0 */
    private void m12231A0() {
        C2896p pVar = this.f11113U;
        boolean z = pVar.f8211o && !pVar.f8214r && pVar.f8193B;
        if (z != this.f11121c0) {
            this.f11121c0 = z;
            AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
            if (avatarMarkerView != null) {
                avatarMarkerView.mo10839e(this.f11121c0);
            }
            m12275s(this.f11121c0);
        }
    }

    /* renamed from: B0 */
    private void m12232B0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2896p pVar = this.f11113U;
            if (pVar.f8214r || pVar.f8193B) {
                C2896p pVar2 = this.f11113U;
                if (pVar2.f8208l) {
                    avatarMarkerView.setPrecision(C4140e.City);
                } else if (pVar2.f8204h) {
                    avatarMarkerView.setPrecision(C4140e.LowPrecision);
                } else {
                    avatarMarkerView.setPrecision(null);
                }
            } else {
                avatarMarkerView.setPrecision(C4140e.LocationDisabled);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m12233C0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2896p pVar = this.f11113U;
            if (!pVar.f8214r && !pVar.f8193B) {
                avatarMarkerView.mo10825a(this.f11111S, this.f11112T);
            } else if (this.f11113U.f8192A.mo8930d() == C2875a.ASLEEP || (this.f11113U.f8192A.mo8930d() == C2875a.PROBABLY_ASLEEP && !m12239Y())) {
                avatarMarkerView.mo10825a(this.f11109Q, this.f11110R);
            } else if (m12239Y()) {
                avatarMarkerView.mo10825a(this.f11107O, this.f11108P);
            } else {
                avatarMarkerView.mo10825a(this.f11105M, this.f11106N);
            }
        }
    }

    /* renamed from: D0 */
    private void m12234D0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.setSleepingLocation(this.f11128j0);
        }
    }

    /* renamed from: E0 */
    private void m12235E0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.setNotifications(!mo11122w() ? this.f11113U.f8212p : 0);
        }
    }

    /* renamed from: F0 */
    private void m12236F0() {
        C2896p pVar = this.f11113U;
        float f = pVar.f8212p > 0 ? 1.0f : (float) pVar.f8209m;
        if (Math.abs(mo11117p() - f) > 0.01f) {
            mo11092a(f);
            m12277t(true);
        }
    }

    /* renamed from: W */
    private boolean m12237W() {
        return m12238X() && this.f11124f0.mo11122w();
    }

    /* renamed from: X */
    private boolean m12238X() {
        C4171c0 c0Var = this.f11124f0;
        return c0Var != null && c0Var.mo11019A();
    }

    /* renamed from: Y */
    private boolean m12239Y() {
        return m12238X() && this.f11124f0.mo11065O();
    }

    /* renamed from: Z */
    private void m12240Z() {
        C2896p pVar = this.f11113U;
        m12242a(pVar.f8206j, pVar.f8207k);
    }

    /* renamed from: a0 */
    private void m12250a0() {
        m12281w0();
    }

    /* renamed from: b0 */
    private void m12253b0() {
        m12232B0();
        m12265n(this.f11113U.f8208l);
    }

    /* renamed from: c0 */
    private void m12254c0() {
        C2908w wVar = this.f11113U.f8222z;
        this.f11123e0 = C2511d.m8764a(mo11110f().getResources(), wVar.mo8995d().mo9005c().mo9017d());
        m12246a(wVar.mo8995d());
        m12282x0();
        m12280v0();
    }

    /* renamed from: d0 */
    private void m12255d0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.mo10835c(this.f11113U.f8213q);
        }
        m12267o(this.f11113U.f8213q);
    }

    /* renamed from: e0 */
    private void m12256e0() {
        if (this.f11113U.f8194C) {
            this.f11122d0 = BitmapFactory.decodeResource(mo11110f().getResources(), 2131231474);
        } else {
            this.f11122d0 = null;
        }
        m12283y0();
        m12281w0();
    }

    /* renamed from: f0 */
    private void m12257f0() {
        m12271q(this.f11113U.f8193B);
        m12233C0();
        m12232B0();
        mo11031V();
        m12231A0();
        mo11107c();
    }

    /* renamed from: g0 */
    private void m12258g0() {
        m12232B0();
        m12273r(this.f11113U.f8204h);
    }

    /* renamed from: h0 */
    private void m12259h0() {
        m12281w0();
        mo11107c();
        m12247a(mo11027R());
    }

    /* renamed from: i0 */
    private void m12260i0() {
        mo11100a(this.f11113U.f8199c);
    }

    /* renamed from: j0 */
    private void m12261j0() {
        mo11103b(this.f11113U.f8202f);
        C2896p pVar = this.f11113U;
        m12241a(pVar.f8202f, pVar.f8205i);
    }

    /* renamed from: k0 */
    private void m12262k0() {
        m12231A0();
        m12233C0();
        m12232B0();
        mo11031V();
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.mo10829a(this.f11113U.f8214r);
        }
        m12269p(this.f11113U.f8214r);
    }

    /* renamed from: l0 */
    private void m12263l0() {
        m12236F0();
        mo11089H();
    }

    /* renamed from: m0 */
    private void m12264m0() {
        this.f11128j0 = C2511d.m8764a(mo11110f().getResources(), this.f11113U.f8219w);
        m12244a(this.f11113U.f8192A);
        m12234D0();
        m12280v0();
        m12233C0();
    }

    /* renamed from: n */
    private void m12265n(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11056a(this, z);
            }
        }
    }

    /* renamed from: n0 */
    private void m12266n0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2896p pVar = this.f11113U;
            avatarMarkerView.mo10824a(pVar.f8195D, pVar.f8196E);
        }
        m12280v0();
    }

    /* renamed from: o */
    private void m12267o(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11057b(this, z);
            }
        }
    }

    /* renamed from: o0 */
    private void m12268o0() {
        m12231A0();
    }

    /* renamed from: p */
    private void m12269p(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11015c(this, z);
            }
        }
    }

    /* renamed from: p0 */
    private void m12270p0() {
        m12249a(this.f11113U.f8218v);
    }

    /* renamed from: q0 */
    private void m12272q0() {
        mo11107c();
        m12236F0();
        m12235E0();
        m12251b(this.f11113U.f8212p);
        m12284z0();
        mo11089H();
    }

    /* renamed from: r */
    private void m12273r(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11058e(this, z);
            }
        }
    }

    /* renamed from: r0 */
    private void m12274r0() {
        mo11102b();
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            C2879d0 d0Var = this.f11113U.f8198b;
            if (d0Var != null) {
                avatarMarkerView.setUser(d0Var);
            }
        }
    }

    /* renamed from: s */
    private void m12275s(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11059f(this, z);
            }
        }
    }

    /* renamed from: s0 */
    private void m12276s0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.mo10837d(this.f11113U.f8220x.f8223a);
        }
    }

    /* renamed from: t */
    private void m12277t(boolean z) {
        float f = mo11125z() ? mo11219J() : mo11123x() ? mo11220K() + ((mo11219J() - mo11220K()) * 0.5f) : -1.0f;
        mo11221a(f, z);
    }

    /* renamed from: t0 */
    private void m12278t0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.setTimeOnTheSpot(this.f11113U.f8222z.mo8996e());
        }
        m12280v0();
    }

    /* renamed from: u0 */
    private void m12279u0() {
        mo11107c();
    }

    /* renamed from: v0 */
    private void m12280v0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            boolean z = !mo11122w() && this.f11113U.f8222z.mo8994c() && !this.f11113U.f8222z.mo8995d().mo9011i();
            boolean z2 = !mo11122w() && this.f11113U.f8192A.mo8930d() == C2875a.ASLEEP;
            C2911c f = this.f11113U.f8222z.mo8997f();
            boolean z3 = f == C2911c.MOVING && (this.f11113U.f8195D > 0.0d || this.f11126h0 == 2) && (this.f11114V >= 0.4f || mo11122w());
            boolean z4 = f == C2911c.STATIC && mo11122w();
            if (z) {
                if (z3) {
                    this.f11126h0 = 5;
                } else {
                    this.f11126h0 = 4;
                }
            } else if (z2) {
                this.f11126h0 = 6;
            } else if (z3) {
                this.f11126h0 = 2;
            } else if (z4) {
                this.f11126h0 = 3;
            } else if (this.f11118Z) {
                this.f11126h0 = 1;
            } else {
                this.f11126h0 = 0;
            }
            avatarMarkerView.setBottomLeftDecoration(this.f11126h0);
        }
    }

    /* renamed from: w0 */
    private void m12281w0() {
        Bitmap bitmap = null;
        C2890k kVar = mo11027R() != C2918b.HOME ? this.f11113U.f8210n : null;
        if (!Objects.equals(kVar, this.f11120b0)) {
            this.f11120b0 = kVar;
            m12245a(kVar);
        }
        C2896p pVar = this.f11113U;
        if (pVar.f8219w != C2918b.NONE) {
            bitmap = C2511d.m8764a(mo11110f().getResources(), this.f11113U.f8219w);
        } else {
            C2890k kVar2 = this.f11120b0;
            if (kVar2 != null) {
                bitmap = kVar2.mo8961a();
            } else if (pVar.f8194C) {
                bitmap = BitmapFactory.decodeResource(mo11110f().getResources(), 2131230930);
            }
        }
        if (!Objects.equals(bitmap, this.f11119a0)) {
            this.f11119a0 = bitmap;
            AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
            if (avatarMarkerView != null) {
                avatarMarkerView.setIcon(bitmap);
            }
            m12243a(bitmap);
        }
    }

    /* renamed from: x0 */
    private void m12282x0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.setHeadingDestination(this.f11123e0);
        }
    }

    /* renamed from: y0 */
    private void m12283y0() {
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.setHeadingTraject(this.f11122d0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m12284z0() {
        boolean z = true;
        boolean z2 = mo11028S() > 0;
        if (!this.f11127i0 || z2 || m12237W()) {
            z = false;
        }
        super.mo11041j(z);
    }

    /* renamed from: A */
    public boolean mo11019A() {
        return this.f11113U.mo8979d() && super.mo11019A();
    }

    /* renamed from: B */
    public boolean mo11020B() {
        boolean z = false;
        boolean z2 = this.f11113U.f8215s == 0.0f && !(this.f11113U.f8212p > 0);
        boolean z3 = m12238X() && this.f11124f0.mo11020B();
        boolean z4 = mo11125z();
        boolean w = mo11122w();
        boolean x = mo11123x();
        if ((this.f11116X && !z2 && !z3) || z4 || w || x) {
            z = true;
        }
        C3439b.m10684a().setMarkerVisibility(mo11116o(), z, this.f11116X, z2, z3);
        return z;
    }

    /* renamed from: L */
    public void mo11021L() {
        this.f11116X = true;
        mo11107c();
    }

    /* renamed from: M */
    public int mo11022M() {
        return this.f11113U.f8206j;
    }

    /* renamed from: N */
    public C2890k mo11023N() {
        return this.f11120b0;
    }

    /* renamed from: O */
    public Bitmap mo11024O() {
        return this.f11119a0;
    }

    /* renamed from: P */
    public C2896p mo11025P() {
        return this.f11113U;
    }

    /* renamed from: Q */
    public C4171c0 mo11026Q() {
        return this.f11124f0;
    }

    /* renamed from: R */
    public C2918b mo11027R() {
        return this.f11113U.f8219w;
    }

    /* renamed from: S */
    public int mo11028S() {
        return this.f11113U.f8212p;
    }

    /* renamed from: T */
    public boolean mo11029T() {
        return this.f11113U.f8207k;
    }

    /* renamed from: U */
    public boolean mo11030U() {
        return this.f11113U.f8214r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1.f8193B != false) goto L_0x002c;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11031V() {
        /*
            r7 = this;
            app.zenly.locator.map.marker.MarkerView r0 = r7.mo11112g()
            app.zenly.locator.map.marker.AvatarMarkerView r0 = (app.zenly.locator.map.marker.AvatarMarkerView) r0
            if (r0 == 0) goto L_0x0030
            boolean r1 = r7.f11117Y
            if (r1 == 0) goto L_0x002c
            boolean r1 = r7.mo11122w()
            if (r1 != 0) goto L_0x002a
            app.zenly.locator.core.models.p r1 = r7.f11113U
            double r2 = r1.f8202f
            int r4 = f11104l0
            float r4 = (float) r4
            float r5 = r7.f11115W
            float r4 = r4 * r5
            double r4 = (double) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x002a
            boolean r2 = r1.f8214r
            if (r2 != 0) goto L_0x002c
            boolean r1 = r1.f8193B
            if (r1 != 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            r0.setPrecisionVisible(r1)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.C4167b0.mo11031V():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11037c(boolean z) {
        super.mo11037c(z);
        mo11089H();
    }

    /* renamed from: g */
    public void mo11038g(boolean z) {
        super.mo11038g(z);
        mo11107c();
        m12280v0();
        m12235E0();
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        if (avatarMarkerView != null) {
            avatarMarkerView.mo10833b(z);
        }
    }

    /* renamed from: h */
    public void mo11039h(boolean z) {
        if (z != mo11123x()) {
            super.mo11039h(z);
            mo11107c();
            m12277t(true);
            mo11089H();
        }
    }

    /* renamed from: i */
    public int mo11040i() {
        return C4181f0.m12466a(this, super.mo11046q(), false);
    }

    /* renamed from: j */
    public void mo11041j(boolean z) {
        this.f11127i0 = z;
        m12284z0();
    }

    /* renamed from: k */
    public void mo11042k(boolean z) {
        if (z != mo11125z()) {
            super.mo11042k(z);
            mo11107c();
            m12277t(true);
            mo11089H();
        }
    }

    /* renamed from: l */
    public double mo11043l() {
        return this.f11113U.f8202f;
    }

    /* renamed from: m */
    public void mo11045m(boolean z) {
        this.f11117Y = z;
        mo11031V();
    }

    /* renamed from: q */
    public int mo11046q() {
        return C4181f0.m12466a(this, super.mo11046q(), true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendMarker[name:");
        C2879d0 d0Var = this.f11113U.f8198b;
        sb.append(d0Var != null ? d0Var.mo8942e() : "NULL");
        sb.append(", z:");
        sb.append(mo11046q());
        sb.append(", uuid:");
        sb.append(mo11116o());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    private void m12251b(int i) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11053a(this, i);
            }
        }
    }

    /* renamed from: q */
    private void m12271q(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11016d(this, z);
            }
        }
    }

    /* renamed from: a */
    public C2896p mo11032a(C2896p pVar, int i, boolean z) {
        C2896p pVar2 = this.f11113U;
        this.f11113U = pVar;
        if (z || C2831a.m9302a(i, 2)) {
            m12274r0();
        }
        if (z || C2831a.m9302a(i, 4)) {
            m12260i0();
        }
        if (z || C2831a.m9302a(i, 8)) {
            m12261j0();
        }
        if (z || C2831a.m9302a(i, 16)) {
            m12258g0();
        }
        if (z || C2831a.m9302a(i, 32)) {
            m12266n0();
        }
        if (z || C2831a.m9302a(i, 64)) {
            m12240Z();
        }
        if (z || C2831a.m9302a(i, 128)) {
            m12253b0();
        }
        if (z || C2831a.m9302a(i, 256)) {
            m12263l0();
        }
        if (z || C2831a.m9302a(i, 262144)) {
            m12259h0();
        }
        if (z || C2831a.m9302a(i, 1024)) {
            m12268o0();
        }
        if (z || C2831a.m9302a(i, 4096)) {
            m12272q0();
        }
        if (z || C2831a.m9302a(i, 8192)) {
            m12250a0();
        }
        if (z || C2831a.m9302a(i, 16384)) {
            m12255d0();
        }
        if (z || C2831a.m9302a(i, 32768)) {
            m12262k0();
        }
        if (z || C2831a.m9302a(i, 65536)) {
            m12279u0();
        }
        if (z || C2831a.m9302a(i, 131072)) {
            m12278t0();
        }
        if (z || C2831a.m9302a(i, (int) ItemAnimator.FLAG_MOVED)) {
            m12270p0();
        }
        if (z || C2831a.m9302a(i, 1)) {
            mo11102b();
        }
        if (z || C2831a.m9302a(i, 524288)) {
            m12276s0();
        }
        if (z || C2831a.m9302a(i, 1048576)) {
            m12254c0();
        }
        if (z || C2831a.m9302a(i, 2097152)) {
            m12264m0();
        }
        if (z || C2831a.m9302a(i, 4194304)) {
            m12257f0();
        }
        if (z || C2831a.m9302a(i, 8388608)) {
            m12256e0();
        }
        return pVar2;
    }

    /* renamed from: l */
    public void mo11044l(boolean z) {
        this.f11118Z = z;
        m12280v0();
    }

    /* renamed from: a */
    public void mo11035a(C4171c0 c0Var) {
        C4171c0 c0Var2 = this.f11124f0;
        if (c0Var != c0Var2) {
            if (c0Var2 != null) {
                c0Var2.mo11105b((C4179a) this.f11129k0);
            }
            this.f11124f0 = c0Var;
            if (c0Var != null) {
                c0Var.mo11099a((C4179a) this.f11129k0);
            }
            m12233C0();
            mo11107c();
            m12284z0();
        }
    }

    /* renamed from: a */
    public void mo11033a() {
        C7707a.m18760a("friend:bindMarkerView");
        super.mo11033a();
        AvatarMarkerView avatarMarkerView = (AvatarMarkerView) mo11112g();
        C2879d0 d0Var = this.f11113U.f8198b;
        if (d0Var != null) {
            avatarMarkerView.setUser(d0Var);
        }
        avatarMarkerView.setNotifications(this.f11113U.f8212p);
        avatarMarkerView.mo10835c(this.f11113U.f8213q);
        avatarMarkerView.mo10829a(this.f11113U.f8214r);
        avatarMarkerView.setIcon(this.f11119a0);
        avatarMarkerView.setTimeOnTheSpot(this.f11113U.f8222z.mo8996e());
        C2896p pVar = this.f11113U;
        avatarMarkerView.mo10824a(pVar.f8195D, pVar.f8196E);
        avatarMarkerView.mo10833b(mo11122w());
        avatarMarkerView.mo10837d(this.f11113U.f8220x.f8223a);
        m12231A0();
        m12232B0();
        mo11031V();
        m12283y0();
        m12282x0();
        m12234D0();
        m12280v0();
        m12233C0();
        if (this.f11125g0) {
            avatarMarkerView.mo10841g();
            this.f11125g0 = false;
        }
        C7707a.m18759a();
    }

    /* renamed from: a */
    public void mo11036a(C4225b bVar) {
        super.mo11036a(bVar);
        m12277t(true);
    }

    /* renamed from: a */
    public void mo11034a(float f, float f2) {
        super.mo11034a(f, f2);
        this.f11114V = f;
        this.f11115W = f2;
        mo11031V();
        m12277t(false);
        m12280v0();
    }

    /* renamed from: a */
    private void m12241a(double d, boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11052a(this, d, z);
            }
        }
    }

    /* renamed from: a */
    private void m12242a(int i, boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11010a(this, i, z);
            }
        }
    }

    /* renamed from: a */
    private void m12243a(Bitmap bitmap) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11011a(this, bitmap);
            }
        }
    }

    /* renamed from: a */
    private void m12245a(C2890k kVar) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11013a(this, kVar);
            }
        }
    }

    /* renamed from: a */
    private void m12249a(String str) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11055a(this, str);
            }
        }
    }

    /* renamed from: a */
    private void m12246a(C2910b bVar) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo10787a(this, bVar);
            }
        }
    }

    /* renamed from: a */
    private void m12247a(C2918b bVar) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11054a(this, bVar);
            }
        }
    }

    /* renamed from: a */
    private void m12244a(C2874c0 c0Var) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4169b) {
                ((C4169b) aVar).mo11012a(this, c0Var);
            }
        }
    }
}
