package kotlin.ranges;

/* renamed from: kotlin.ranges.h */
public final class C12968h extends C12965f implements ClosedRange<Long> {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C12968h f33565h = new C12968h(1, 0);

    /* renamed from: i */
    public static final C12969a f33566i = new C12969a(null);

    /* renamed from: kotlin.ranges.h$a */
    public static final class C12969a {
        private C12969a() {
        }

        /* renamed from: a */
        public final C12968h mo37356a() {
            return C12968h.f33565h;
        }

        public /* synthetic */ C12969a(C12928f fVar) {
            this();
        }
    }

    public C12968h(long j, long j2) {
        super(j, j2, 1);
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return mo37352a(((Number) comparable).longValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (getLast() == r6.getLast()) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.C12968h
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlin.ranges.h r0 = (kotlin.ranges.C12968h) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002d
        L_0x0013:
            long r0 = r5.getFirst()
            kotlin.ranges.h r6 = (kotlin.ranges.C12968h) r6
            long r2 = r6.getFirst()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002f
            long r0 = r5.getLast()
            long r2 = r6.getLast()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x002f
        L_0x002d:
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.C12968h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
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

    /* renamed from: a */
    public boolean mo37352a(long j) {
        return getFirst() <= j && j <= getLast();
    }

    public Long getEndInclusive() {
        return Long.valueOf(getLast());
    }

    public Long getStart() {
        return Long.valueOf(getFirst());
    }
}
