package kotlin.ranges;

/* renamed from: kotlin.ranges.b */
final class C12959b implements ClosedFloatingPointRange<Float> {

    /* renamed from: e */
    private final float f33546e;

    /* renamed from: f */
    private final float f33547f;

    public C12959b(float f, float f2) {
        this.f33546e = f;
        this.f33547f = f2;
    }

    /* renamed from: a */
    public boolean mo37331a(float f) {
        return f >= this.f33546e && f <= this.f33547f;
    }

    /* renamed from: a */
    public boolean mo37332a(float f, float f2) {
        return f <= f2;
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return mo37331a(((Number) comparable).floatValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2.f33547f == r3.f33547f) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.C12959b
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.ranges.b r0 = (kotlin.ranges.C12959b) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0025
        L_0x0013:
            float r0 = r2.f33546e
            kotlin.ranges.b r3 = (kotlin.ranges.C12959b) r3
            float r1 = r3.f33546e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            float r0 = r2.f33547f
            float r3 = r3.f33547f
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
        L_0x0025:
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.C12959b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f33546e).hashCode() * 31) + Float.valueOf(this.f33547f).hashCode();
    }

    public boolean isEmpty() {
        return this.f33546e > this.f33547f;
    }

    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return mo37332a(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33546e);
        sb.append("..");
        sb.append(this.f33547f);
        return sb.toString();
    }

    public Float getEndInclusive() {
        return Float.valueOf(this.f33547f);
    }

    public Float getStart() {
        return Float.valueOf(this.f33546e);
    }
}
