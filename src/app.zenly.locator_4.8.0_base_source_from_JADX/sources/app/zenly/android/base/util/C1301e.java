package app.zenly.android.base.util;

/* renamed from: app.zenly.android.base.util.e */
public final class C1301e implements UnitConverter {

    /* renamed from: a */
    private final double f4874a;

    /* renamed from: b */
    private final double f4875b;

    public C1301e(double d, double d2) {
        this.f4874a = d;
        this.f4875b = d2;
    }

    public double toBaseUnitValue(double d) {
        return (this.f4874a * d) + this.f4875b;
    }

    public double toValue(double d) {
        return (d - this.f4875b) / this.f4874a;
    }

    public /* synthetic */ C1301e(double d, double d2, int i, C12928f fVar) {
        if ((i & 2) != 0) {
            d2 = 0.0d;
        }
        this(d, d2);
    }
}
