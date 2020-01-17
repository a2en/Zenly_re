package app.zenly.android.base.util;

/* renamed from: app.zenly.android.base.util.d */
public enum C1300d {
    METERS(r2),
    KILOMETERS(r2),
    FEET(r2),
    MILES(r2);
    

    /* renamed from: e */
    private final UnitConverter f4873e;

    private C1300d(UnitConverter unitConverter) {
        this.f4873e = unitConverter;
    }

    /* renamed from: a */
    public final double mo6415a(double d) {
        return FEET.f4873e.toValue(this.f4873e.toBaseUnitValue(d));
    }

    /* renamed from: b */
    public final double mo6416b(double d) {
        return KILOMETERS.f4873e.toValue(this.f4873e.toBaseUnitValue(d));
    }

    /* renamed from: c */
    public final double mo6417c(double d) {
        return MILES.f4873e.toValue(this.f4873e.toBaseUnitValue(d));
    }
}
