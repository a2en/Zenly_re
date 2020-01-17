package kotlin.ranges;

/* renamed from: kotlin.ranges.e */
public final class C12963e extends C12960c implements ClosedRange<Integer> {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C12963e f33556i = new C12963e(1, 0);

    /* renamed from: j */
    public static final C12964a f33557j = new C12964a(null);

    /* renamed from: kotlin.ranges.e$a */
    public static final class C12964a {
        private C12964a() {
        }

        /* renamed from: a */
        public final C12963e mo37347a() {
            return C12963e.f33556i;
        }

        public /* synthetic */ C12964a(C12928f fVar) {
            this();
        }
    }

    public C12963e(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: a */
    public boolean mo37346a(int i) {
        return getFirst() <= i && i <= getLast();
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return mo37346a(((Number) comparable).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (getLast() == r3.getLast()) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.C12963e
            if (r0 == 0) goto L_0x002b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.ranges.e r0 = (kotlin.ranges.C12963e) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            int r0 = r2.getFirst()
            kotlin.ranges.e r3 = (kotlin.ranges.C12963e) r3
            int r1 = r3.getFirst()
            if (r0 != r1) goto L_0x002b
            int r0 = r2.getLast()
            int r3 = r3.getLast()
            if (r0 != r3) goto L_0x002b
        L_0x0029:
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.C12963e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFirst());
        sb.append("..");
        sb.append(getLast());
        return sb.toString();
    }

    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }
}
