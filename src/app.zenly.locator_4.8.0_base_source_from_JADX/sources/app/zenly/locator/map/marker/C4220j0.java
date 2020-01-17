package app.zenly.locator.map.marker;

import java.util.List;

/* renamed from: app.zenly.locator.map.marker.j0 */
public class C4220j0 {

    /* renamed from: a */
    public final C4221a f11323a;

    /* renamed from: b */
    public final List<C4178e0> f11324b;

    /* renamed from: c */
    public final boolean f11325c;

    /* renamed from: app.zenly.locator.map.marker.j0$a */
    public enum C4221a {
        FOLLOW,
        NONE,
        UNFOLLOW
    }

    public C4220j0() {
        this.f11323a = C4221a.NONE;
        this.f11324b = null;
        this.f11325c = false;
    }

    public C4220j0(C4221a aVar, List<C4178e0> list, boolean z) {
        this.f11323a = aVar;
        this.f11324b = list;
        this.f11325c = z;
    }
}
