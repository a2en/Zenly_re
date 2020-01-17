package kotlin.ranges;

/* renamed from: kotlin.ranges.a */
final class C12958a implements ClosedFloatingPointRange<Double> {

    /* renamed from: e */
    private final double f33544e;

    /* renamed from: f */
    private final double f33545f;

    public C12958a(double d, double d2) {
        this.f33544e = d;
        this.f33545f = d2;
    }

    /* renamed from: a */
    public boolean mo37326a(double d) {
        return d >= this.f33544e && d <= this.f33545f;
    }

    /* renamed from: a */
    public boolean mo37327a(double d, double d2) {
        return d <= d2;
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return mo37326a(((Number) comparable).doubleValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r5.f33545f == r6.f33545f) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.C12958a
            if (r0 == 0) goto L_0x0027
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlin.ranges.a r0 = (kotlin.ranges.C12958a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0025
        L_0x0013:
            double r0 = r5.f33544e
            kotlin.ranges.a r6 = (kotlin.ranges.C12958a) r6
            double r2 = r6.f33544e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            double r0 = r5.f33545f
            double r2 = r6.f33545f
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0027
        L_0x0025:
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.C12958a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.f33544e).hashCode() * 31) + Double.valueOf(this.f33545f).hashCode();
    }

    public boolean isEmpty() {
        return this.f33544e > this.f33545f;
    }

    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return mo37327a(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33544e);
        sb.append("..");
        sb.append(this.f33545f);
        return sb.toString();
    }

    public Double getEndInclusive() {
        return Double.valueOf(this.f33545f);
    }

    public Double getStart() {
        return Double.valueOf(this.f33544e);
    }
}
