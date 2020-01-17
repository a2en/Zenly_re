package app.zenly.android.base.util;

/* renamed from: app.zenly.android.base.util.g */
public enum C1303g {
    CELSIUS(new C1301e(1.0d, 273.15d)),
    FAHRENHEIT(new C1301e(0.55555555555556d, 255.37222222222428d)),
    KELVIN(r2);
    

    /* renamed from: e */
    private final UnitConverter f4885e;

    private C1303g(UnitConverter unitConverter) {
        this.f4885e = unitConverter;
    }

    /* renamed from: a */
    public final double mo6421a(double d) {
        return CELSIUS.f4885e.toValue(this.f4885e.toBaseUnitValue(d));
    }

    /* renamed from: b */
    public final double mo6422b(double d) {
        return FAHRENHEIT.f4885e.toValue(this.f4885e.toBaseUnitValue(d));
    }
}
