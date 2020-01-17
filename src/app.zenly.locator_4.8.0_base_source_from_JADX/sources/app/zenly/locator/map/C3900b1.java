package app.zenly.locator.map;

/* renamed from: app.zenly.locator.map.b1 */
public enum C3900b1 {
    GOOGLE_MAP(2, -395795, -16777216),
    MAPBOX(1, -395795, -16777216),
    THARP(3, -395795, -16777216);
    

    /* renamed from: e */
    public final int f10336e;

    /* renamed from: f */
    public final int f10337f;

    /* renamed from: g */
    public final int f10338g;

    private C3900b1(int i, int i2, int i3) {
        this.f10336e = i;
        this.f10337f = i2;
        this.f10338g = i3;
    }

    /* renamed from: a */
    public static C3900b1 m11503a(int i, C3900b1 b1Var) {
        C3900b1[] values;
        for (C3900b1 b1Var2 : values()) {
            if (b1Var2.f10336e == i) {
                return b1Var2;
            }
        }
        return b1Var;
    }
}
