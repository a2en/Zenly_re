package app.zenly.locator.map.marker;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import app.zenly.locator.core.manager.MeUserManager.C2629b;
import app.zenly.locator.core.models.C2907v;
import app.zenly.locator.p143s.p150n.C5459d;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;

/* renamed from: app.zenly.locator.map.marker.l0 */
public class C4229l0 extends C4178e0<UserCollapsedMarkerView> {

    /* renamed from: A */
    private float f11349A;

    /* renamed from: B */
    private boolean f11350B = true;

    /* renamed from: z */
    private C5459d f11351z;

    public C4229l0(Context context, String str) {
        super(context, str);
        mo11109e(false);
    }

    /* renamed from: J */
    private void m12575J() {
        mo11041j(mo11125z() || mo11123x() || (this.f11350B && this.f11349A > 0.8f));
    }

    /* renamed from: b */
    private void m12576b(C5459d dVar) {
        this.f11351z = dVar;
        if (dVar != null) {
            mo11091a(dVar.mo13060b(), dVar.mo13062c());
        } else {
            mo11091a(Double.NaN, Double.NaN);
        }
    }

    /* renamed from: A */
    public boolean mo11019A() {
        return this.f11351z != null;
    }

    /* renamed from: I */
    public void mo11062I() {
        super.mo11062I();
        ((UserCollapsedMarkerView) mo11112g()).mo10834c();
    }

    /* renamed from: a */
    public void mo11227a(C2629b bVar, C2907v vVar) {
        if (bVar == null || bVar == C2629b.LOCATION_CHANGE) {
            m12576b(vVar.f8252c);
        }
    }

    /* renamed from: d */
    public float mo11069d() {
        return 0.5f;
    }

    /* renamed from: e */
    public float mo11070e() {
        return 0.5f;
    }

    /* renamed from: h */
    public void mo11039h(boolean z) {
        super.mo11039h(z);
        m12575J();
    }

    /* renamed from: j */
    public void mo11041j(boolean z) {
        super.mo11041j(z);
        UserCollapsedMarkerView userCollapsedMarkerView = (UserCollapsedMarkerView) mo11112g();
        if (userCollapsedMarkerView != null) {
            userCollapsedMarkerView.mo10989a(z, true);
        }
    }

    /* renamed from: k */
    public void mo11042k(boolean z) {
        super.mo11042k(z);
        m12575J();
    }

    /* renamed from: r */
    public UserCollapsedMarkerView m12588r() {
        C7707a.m18760a("map:create:UserCollapsedMarkerView");
        UserCollapsedMarkerView userCollapsedMarkerView = new UserCollapsedMarkerView(mo11110f());
        userCollapsedMarkerView.setLayoutParams(new LayoutParams(-2, -2));
        C7707a.m18759a();
        return userCollapsedMarkerView;
    }

    /* renamed from: a */
    public void mo11033a() {
        ((UserCollapsedMarkerView) mo11112g()).mo10831b();
    }

    /* renamed from: a */
    public void mo11034a(float f, float f2) {
        super.mo11034a(f, f2);
        this.f11349A = f;
        m12575J();
    }
}
