package app.zenly.locator.map.marker;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2511d;
import app.zenly.locator.core.manager.p070t5.C2832b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.models.C2898q;
import app.zenly.locator.core.models.C2898q.C2899a;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.marker.GatheringMarkerView.C4149g;
import app.zenly.locator.map.marker.GatheringMarkerView.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;

/* renamed from: app.zenly.locator.map.marker.c0 */
public class C4171c0 extends C4223k0<GatheringMarkerView> {

    /* renamed from: K */
    private final Map<String, C4178e0> f11132K = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final Map<C4178e0, Member> f11133L = new HashMap();

    /* renamed from: M */
    private final List<Member> f11134M = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final List<C4178e0> f11135N = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final List<C4178e0> f11136O = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final List<C4178e0> f11137P = new ArrayList();

    /* renamed from: Q */
    private C2898q f11138Q;

    /* renamed from: R */
    private float f11139R = 0.0f;

    /* renamed from: S */
    private Bitmap f11140S;

    /* renamed from: T */
    private boolean f11141T;

    /* renamed from: U */
    private boolean f11142U = false;

    /* renamed from: V */
    private boolean f11143V = false;

    /* renamed from: W */
    private boolean f11144W = false;

    /* renamed from: X */
    private boolean f11145X;

    /* renamed from: Y */
    private C4179a f11146Y = new C4172a();

    /* renamed from: app.zenly.locator.map.marker.c0$a */
    class C4172a extends C4179a {
        C4172a() {
        }

        /* renamed from: a */
        public void mo10912a(C4178e0 e0Var, boolean z) {
            if (!z) {
                C4171c0.this.f11136O.remove(e0Var);
            } else if (!C4171c0.this.f11136O.contains(e0Var)) {
                C4171c0.this.f11136O.add(e0Var);
            }
            C4171c0.this.mo11107c();
        }

        /* renamed from: b */
        public void mo11077b(C4178e0 e0Var, boolean z) {
            if (!z) {
                C4171c0.this.f11137P.remove(e0Var);
            } else if (!C4171c0.this.f11137P.contains(e0Var)) {
                C4171c0.this.f11137P.add(e0Var);
            }
            C4171c0.this.mo11107c();
        }

        /* renamed from: c */
        public void mo10914c(C4178e0 e0Var) {
            Member member = (Member) C4171c0.this.f11133L.get(e0Var);
            if (member != null) {
                if (e0Var.mo11019A()) {
                    C4171c0.this.m12346a(member);
                } else {
                    C4171c0.this.m12349b(member);
                }
            }
        }

        /* renamed from: d */
        public void mo10916d(C4178e0 e0Var, boolean z) {
            if (!z) {
                C4171c0.this.f11135N.remove(e0Var);
            } else if (!C4171c0.this.f11135N.contains(e0Var)) {
                C4171c0.this.f11135N.add(e0Var);
            }
            C4171c0.this.mo11107c();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.c0$b */
    public static class C4173b extends C4179a<C4171c0> {
        /* renamed from: a */
        public void mo11049a(C4171c0 c0Var, boolean z) {
        }
    }

    public C4171c0(Context context, C2898q qVar) {
        super(context, String.format("gathering-%d", new Object[]{Integer.valueOf(qVar.f8224a)}));
        mo11092a(1.0f);
        mo11066a(qVar, 1);
    }

    /* renamed from: P */
    private void m12335P() {
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        if (gatheringMarkerView != null) {
            gatheringMarkerView.setNotifications(this.f11138Q.f8232i);
        }
        m12342W();
    }

    /* renamed from: Q */
    private void m12336Q() {
        mo11100a(this.f11138Q.f8225b);
    }

    /* renamed from: R */
    private void m12337R() {
        mo11103b((double) this.f11138Q.f8228e);
    }

    /* renamed from: S */
    private void m12338S() {
        m12344Y();
        boolean O = mo11065O();
        mo11092a(0.5f);
        m12342W();
        m12343X();
        m12340U();
        mo11089H();
        if (this.f11144W != mo11065O()) {
            this.f11144W = mo11065O();
            m12353o(this.f11144W);
        }
    }

    /* renamed from: T */
    private void m12339T() {
        mo11102b();
    }

    /* renamed from: U */
    private void m12340U() {
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        if (gatheringMarkerView == null) {
            return;
        }
        if (this.f11143V || this.f11138Q.f8229f != C2899a.SLEEPING) {
            gatheringMarkerView.setColors(C4149g.STANDARD);
        } else {
            gatheringMarkerView.setColors(C4149g.SLEEP);
        }
    }

    /* renamed from: V */
    private void m12341V() {
        Bitmap a = C2511d.m8764a(mo11110f().getResources(), this.f11138Q.f8233j);
        if (a == null) {
            C2890k kVar = this.f11138Q.f8234k;
            if (kVar != null) {
                a = kVar.mo8961a();
            }
        }
        if (!Objects.equals(a, this.f11140S)) {
            this.f11140S = a;
            GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
            if (gatheringMarkerView != null) {
                gatheringMarkerView.setIcon(this.f11140S);
            }
        }
    }

    /* renamed from: W */
    private void m12342W() {
        super.mo11041j(this.f11145X && !mo11065O() && this.f11138Q.f8232i == 0);
    }

    /* renamed from: X */
    private void m12343X() {
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        if (gatheringMarkerView != null) {
            gatheringMarkerView.mo10877a(this.f11143V || this.f11138Q.f8229f == C2899a.BUMP);
        }
    }

    /* renamed from: Y */
    private void m12344Y() {
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        if (gatheringMarkerView != null) {
            int i = !mo11065O() ? 0 : this.f11142U ? 2 : 1;
            if (i != gatheringMarkerView.getStyle()) {
                gatheringMarkerView.setStyle(i);
                gatheringMarkerView.mo10882e();
            }
        }
    }

    /* renamed from: o */
    private void m12353o(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            C4179a aVar = (C4179a) this.f11178x.get(size);
            if (aVar instanceof C4173b) {
                ((C4173b) aVar).mo11049a(this, z);
            }
        }
    }

    /* renamed from: A */
    public boolean mo11019A() {
        return super.mo11019A() && this.f11138Q.f8226c;
    }

    /* renamed from: B */
    public boolean mo11020B() {
        return mo11019A() && !this.f11141T && !mo11122w() && this.f11139R < 0.8f && this.f11135N.isEmpty() && this.f11136O.isEmpty() && this.f11137P.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo11061G() {
        super.mo11061G();
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        if (mo11020B() && gatheringMarkerView != null) {
            gatheringMarkerView.mo10882e();
        }
    }

    /* renamed from: I */
    public void mo11062I() {
        super.mo11062I();
        ((GatheringMarkerView) mo11112g()).mo10881d();
    }

    /* renamed from: L */
    public C2898q mo11021L() {
        return this.f11138Q;
    }

    /* renamed from: M */
    public int mo11063M() {
        return this.f11138Q.f8224a;
    }

    /* renamed from: N */
    public Collection<C4178e0> mo11064N() {
        return this.f11132K.values();
    }

    /* renamed from: O */
    public boolean mo11065O() {
        return this.f11143V || this.f11138Q.mo8984a();
    }

    /* renamed from: d */
    public float mo11069d() {
        return 0.5f;
    }

    /* renamed from: e */
    public float mo11070e() {
        return 0.935f;
    }

    /* renamed from: h */
    public int mo11071h() {
        return 20;
    }

    /* renamed from: i */
    public void mo11072i(boolean z) {
        if (z != mo11119t()) {
            super.mo11072i(z);
            for (C4178e0 e0Var : this.f11132K.values()) {
                if (z) {
                    e0Var.mo11099a(this.f11146Y);
                } else {
                    e0Var.mo11105b(this.f11146Y);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo11041j(boolean z) {
        this.f11145X = z;
        m12342W();
    }

    /* renamed from: l */
    public void mo11044l(boolean z) {
        this.f11142U = z;
        m12344Y();
    }

    /* renamed from: m */
    public void mo11074m(boolean z) {
        this.f11143V = z;
        m12343X();
        m12338S();
    }

    /* renamed from: n */
    public void mo11075n(boolean z) {
        this.f11141T = z;
        mo11107c();
    }

    /* renamed from: q */
    public int mo11046q() {
        return C4181f0.m12467a(this, super.mo11046q(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11037c(boolean z) {
        super.mo11037c(z);
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        if (gatheringMarkerView != null) {
            gatheringMarkerView.mo10878a(z, true);
        }
        mo11089H();
    }

    /* renamed from: r */
    public GatheringMarkerView m12380r() {
        C7707a.m18760a("map:create:GatheringMarkerView");
        GatheringMarkerView gatheringMarkerView = new GatheringMarkerView(mo11110f());
        gatheringMarkerView.setLayoutParams(new LayoutParams(-2, -2));
        gatheringMarkerView.mo10882e();
        C7707a.m18759a();
        return gatheringMarkerView;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12349b(Member member) {
        this.f11134M.remove(member);
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        if (gatheringMarkerView != null) {
            gatheringMarkerView.mo10880b(member);
        }
    }

    /* renamed from: a */
    public void mo11066a(C2898q qVar, int i) {
        this.f11138Q = qVar;
        if (C2832b.m9308a(i, 65)) {
            m12336Q();
        }
        if (C2832b.m9308a(i, 17)) {
            m12339T();
        }
        if (C2832b.m9308a(i, 129)) {
            m12337R();
        }
        if (C2832b.m9308a(i, 513)) {
            mo11089H();
        }
        if (C2832b.m9308a(i, 257)) {
            m12338S();
        }
        if (C2832b.m9308a(i, 1025)) {
            m12335P();
        }
        if (C2832b.m9308a(i, 2049)) {
            m12341V();
        }
        if (C2832b.m9308a(i, 4097)) {
            m12341V();
        }
    }

    /* renamed from: m */
    public int mo11073m() {
        return C0540a.m2536a(mo11110f(), (int) R.color.orange);
    }

    /* renamed from: i */
    public int mo11040i() {
        return C4181f0.m12467a(this, super.mo11046q(), false);
    }

    /* renamed from: a */
    public void mo11067a(C4178e0 e0Var, C2879d0 d0Var) {
        C4178e0 e0Var2 = (C4178e0) this.f11132K.get(e0Var.mo11116o());
        if (e0Var2 != null) {
            Member member = (Member) this.f11133L.get(e0Var2);
            if (e0Var == e0Var2) {
                member.mo10894a(d0Var);
                return;
            }
            this.f11133L.remove(e0Var2);
            m12349b(member);
            e0Var2.mo11105b(this.f11146Y);
            this.f11135N.remove(e0Var2);
            this.f11136O.remove(e0Var2);
            this.f11137P.remove(e0Var2);
        }
        this.f11132K.put(e0Var.mo11116o(), e0Var);
        if (e0Var.mo11125z() && !this.f11135N.contains(e0Var)) {
            this.f11135N.add(e0Var);
        }
        if (e0Var.mo11122w() && !this.f11136O.contains(e0Var)) {
            this.f11136O.add(e0Var);
        }
        if (e0Var.mo11123x() && !this.f11137P.contains(e0Var)) {
            this.f11137P.add(e0Var);
        }
        if (mo11119t()) {
            e0Var.mo11099a(this.f11146Y);
        }
        Member member2 = new Member(d0Var);
        this.f11133L.put(e0Var, member2);
        m12346a(member2);
    }

    /* renamed from: a */
    public boolean mo11068a(C4178e0 e0Var) {
        if (e0Var != null) {
            this.f11132K.remove(e0Var.mo11116o());
            e0Var.mo11105b(this.f11146Y);
            this.f11135N.remove(e0Var);
            this.f11136O.remove(e0Var);
            this.f11137P.remove(e0Var);
            Member member = (Member) this.f11133L.get(e0Var);
            if (member != null) {
                this.f11133L.remove(e0Var);
                m12349b(member);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12346a(Member member) {
        if (!this.f11134M.contains(member)) {
            this.f11134M.add(member);
            GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
            if (gatheringMarkerView != null) {
                gatheringMarkerView.mo10876a(member);
            }
        }
    }

    /* renamed from: a */
    public void mo11033a() {
        super.mo11033a();
        GatheringMarkerView gatheringMarkerView = (GatheringMarkerView) mo11112g();
        gatheringMarkerView.setUuid(mo11116o());
        gatheringMarkerView.setMembers(this.f11134M);
        gatheringMarkerView.setNotifications(this.f11138Q.f8232i);
        gatheringMarkerView.setIcon(this.f11140S);
        gatheringMarkerView.mo10877a(this.f11143V || this.f11138Q.f8229f == C2899a.BUMP);
        gatheringMarkerView.mo10878a(mo11124y(), false);
        m12344Y();
        m12340U();
    }

    /* renamed from: a */
    public void mo11034a(float f, float f2) {
        super.mo11034a(f, f2);
        this.f11139R = f;
        mo11107c();
    }
}
