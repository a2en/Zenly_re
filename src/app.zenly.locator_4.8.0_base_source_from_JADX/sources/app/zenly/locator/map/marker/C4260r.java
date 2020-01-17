package app.zenly.locator.map.marker;

import app.zenly.locator.map.base.Map.FinishCallback;

/* renamed from: app.zenly.locator.map.marker.r */
/* compiled from: lambda */
public final /* synthetic */ class C4260r implements FinishCallback {

    /* renamed from: a */
    private final /* synthetic */ MarkerManager f11431a;

    /* renamed from: b */
    private final /* synthetic */ C4178e0 f11432b;

    /* renamed from: c */
    private final /* synthetic */ boolean f11433c;

    public /* synthetic */ C4260r(MarkerManager markerManager, C4178e0 e0Var, boolean z) {
        this.f11431a = markerManager;
        this.f11432b = e0Var;
        this.f11433c = z;
    }

    public final void onFinish(boolean z) {
        this.f11431a.mo10925a(this.f11432b, this.f11433c, z);
    }
}
