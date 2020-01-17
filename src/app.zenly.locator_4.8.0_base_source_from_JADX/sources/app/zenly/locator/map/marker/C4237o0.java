package app.zenly.locator.map.marker;

import android.content.Context;
import app.zenly.locator.core.manager.MeUserManager.C2629b;
import app.zenly.locator.core.models.C2907v;
import app.zenly.locator.map.marker.C4178e0.C4179a;

/* renamed from: app.zenly.locator.map.marker.o0 */
public class C4237o0 extends MarkerAdapter {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4231m0 f11366h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C4234n0 f11367i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4229l0 f11368j;

    /* renamed from: k */
    private final C4179a f11369k = new C4238a();

    /* renamed from: app.zenly.locator.map.marker.o0$a */
    class C4238a extends C4179a {
        C4238a() {
        }

        /* renamed from: a */
        public void mo10912a(C4178e0 e0Var, boolean z) {
            super.mo10912a(e0Var, z);
            C4237o0.this.f11366h.mo11038g(z);
            C4237o0.this.f11367i.mo11038g(z);
            C4237o0.this.f11368j.mo11038g(z);
        }

        /* renamed from: b */
        public void mo11077b(C4178e0 e0Var, boolean z) {
            super.mo11077b(e0Var, z);
            C4237o0.this.f11366h.mo11039h(z);
            C4237o0.this.f11367i.mo11039h(z);
            C4237o0.this.f11368j.mo11039h(z);
        }

        /* renamed from: d */
        public void mo10916d(C4178e0 e0Var, boolean z) {
            super.mo10916d(e0Var, z);
            C4237o0.this.f11366h.mo11042k(z);
            C4237o0.this.f11367i.mo11042k(z);
            C4237o0.this.f11368j.mo11042k(z);
        }
    }

    public C4237o0(Context context) {
        super("UserMarkersAdapter");
        this.f11366h = new C4231m0(context, "user_compass");
        this.f11366h.mo11094a(0);
        mo10904a(this.f11366h);
        this.f11367i = new C4234n0(context, "user_expanded");
        this.f11367i.mo11094a(1);
        mo10904a(this.f11367i);
        this.f11368j = new C4229l0(context, "user_collapsed");
        this.f11368j.mo11094a(2);
        mo10904a(this.f11368j);
        this.f11366h.mo11099a(this.f11369k);
        this.f11367i.mo11099a(this.f11369k);
        this.f11368j.mo11099a(this.f11369k);
    }

    /* renamed from: d */
    public C4229l0 mo11235d() {
        return this.f11368j;
    }

    /* renamed from: e */
    public C4234n0 mo11236e() {
        return this.f11367i;
    }

    /* renamed from: a */
    public void mo11234a(C2629b bVar, C2907v vVar) {
        this.f11366h.mo11229a(bVar, vVar);
        this.f11368j.mo11227a(bVar, vVar);
        this.f11367i.mo11233a(bVar, vVar);
    }
}
