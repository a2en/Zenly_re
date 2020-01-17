package app.zenly.locator.map.marker;

/* renamed from: app.zenly.locator.map.marker.i0 */
public class C4217i0 {

    /* renamed from: a */
    public final C4218a f11310a;

    /* renamed from: b */
    public final C4178e0 f11311b;

    /* renamed from: c */
    public final boolean f11312c;

    /* renamed from: app.zenly.locator.map.marker.i0$a */
    public enum C4218a {
        CLICK,
        FOCUS,
        LOST_POSITION,
        NONE,
        RESELECT,
        SELECT,
        SWITCH,
        UNSELECT
    }

    public C4217i0() {
        this.f11310a = C4218a.NONE;
        this.f11311b = null;
        this.f11312c = false;
    }

    public C4217i0(C4218a aVar, C4178e0 e0Var, boolean z) {
        this.f11310a = aVar;
        this.f11311b = e0Var;
        this.f11312c = z;
    }
}
