package app.zenly.android.base.util;

/* renamed from: app.zenly.android.base.util.f */
public enum C1302f {
    METERS_PER_SECOND(r2),
    KILOMETERS_PER_HOUR(r2),
    MILES_PER_HOUR(r2);
    

    /* renamed from: e */
    private final UnitConverter f4880e;

    private C1302f(UnitConverter unitConverter) {
        this.f4880e = unitConverter;
    }

    /* renamed from: a */
    public final double mo6418a(double d) {
        return KILOMETERS_PER_HOUR.f4880e.toValue(this.f4880e.toBaseUnitValue(d));
    }

    /* renamed from: b */
    public final double mo6419b(double d) {
        return METERS_PER_SECOND.f4880e.toValue(this.f4880e.toBaseUnitValue(d));
    }

    /* renamed from: c */
    public final double mo6420c(double d) {
        return MILES_PER_HOUR.f4880e.toValue(this.f4880e.toBaseUnitValue(d));
    }
}
