package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
class C0314b implements C0318e {
    C0314b() {
    }

    /* renamed from: j */
    private C0319f m1261j(C0317d dVar) {
        return (C0319f) dVar.mo2181b();
    }

    /* renamed from: a */
    public void mo2185a() {
    }

    /* renamed from: a */
    public void mo2189a(C0317d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo2179a(new C0319f(colorStateList, f));
        View d = dVar.mo2183d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo2194c(dVar, f3);
    }

    /* renamed from: b */
    public float mo2191b(C0317d dVar) {
        return m1261j(dVar).mo2206b();
    }

    /* renamed from: c */
    public void mo2194c(C0317d dVar, float f) {
        m1261j(dVar).mo2204a(f, dVar.mo2180a(), dVar.mo2182c());
        mo2200i(dVar);
    }

    /* renamed from: d */
    public float mo2195d(C0317d dVar) {
        return mo2187a(dVar) * 2.0f;
    }

    /* renamed from: e */
    public void mo2196e(C0317d dVar) {
        mo2194c(dVar, mo2191b(dVar));
    }

    /* renamed from: f */
    public float mo2197f(C0317d dVar) {
        return dVar.mo2183d().getElevation();
    }

    /* renamed from: g */
    public void mo2198g(C0317d dVar) {
        mo2194c(dVar, mo2191b(dVar));
    }

    /* renamed from: h */
    public float mo2199h(C0317d dVar) {
        return mo2187a(dVar) * 2.0f;
    }

    /* renamed from: i */
    public void mo2200i(C0317d dVar) {
        if (!dVar.mo2180a()) {
            dVar.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float b = mo2191b(dVar);
        float a = mo2187a(dVar);
        int ceil = (int) Math.ceil((double) C0320g.m1324a(b, a, dVar.mo2182c()));
        int ceil2 = (int) Math.ceil((double) C0320g.m1327b(b, a, dVar.mo2182c()));
        dVar.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: b */
    public void mo2192b(C0317d dVar, float f) {
        dVar.mo2183d().setElevation(f);
    }

    /* renamed from: c */
    public ColorStateList mo2193c(C0317d dVar) {
        return m1261j(dVar).mo2202a();
    }

    /* renamed from: a */
    public void mo2188a(C0317d dVar, float f) {
        m1261j(dVar).mo2203a(f);
    }

    /* renamed from: a */
    public float mo2187a(C0317d dVar) {
        return m1261j(dVar).mo2207c();
    }

    /* renamed from: a */
    public void mo2190a(C0317d dVar, ColorStateList colorStateList) {
        m1261j(dVar).mo2205a(colorStateList);
    }
}
