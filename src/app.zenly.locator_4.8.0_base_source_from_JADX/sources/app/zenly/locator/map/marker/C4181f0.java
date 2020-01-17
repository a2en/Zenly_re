package app.zenly.locator.map.marker;

/* renamed from: app.zenly.locator.map.marker.f0 */
public class C4181f0 {
    /* renamed from: a */
    public static int m12466a(C4167b0 b0Var, int i, boolean z) {
        if (!z || !b0Var.mo11124y()) {
            int i2 = (b0Var.mo11125z() || b0Var.mo11122w() || b0Var.mo11123x()) ? 10000000 : b0Var.mo11025P().f8212p > 0 ? 5000000 : b0Var.mo11025P().f8217u ? 4000000 : 1000000;
            i += i2;
        }
        return b0Var.mo11025P().f8209m > 0.0d ? (int) (((double) i) + ((b0Var.mo11025P().f8209m + 1.0d) * 100000.0d)) : i;
    }

    /* renamed from: a */
    public static int m12467a(C4171c0 c0Var, int i, boolean z) {
        if (!z || !c0Var.mo11124y()) {
            int i2 = c0Var.mo11021L().f8232i > 0 ? 5000000 : c0Var.mo11021L().f8231h ? 4000000 : c0Var.mo11021L().mo8984a() ? 3000000 : 2000000;
            i += i2;
        }
        return c0Var.mo11021L().f8230g > 0.0d ? (int) (((double) i) + ((c0Var.mo11021L().f8230g + 1.0d) * 100000.0d)) : i;
    }
}
