package kotlin.ranges;

import kotlin.collections.C12819b0;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.p411u.C13039c;

/* renamed from: kotlin.ranges.c */
public class C12960c implements Iterable<Integer>, KMappedMarker {

    /* renamed from: h */
    public static final C12961a f33548h = new C12961a(null);

    /* renamed from: e */
    private final int f33549e;

    /* renamed from: f */
    private final int f33550f;

    /* renamed from: g */
    private final int f33551g;

    /* renamed from: kotlin.ranges.c$a */
    public static final class C12961a {
        private C12961a() {
        }

        /* renamed from: a */
        public final C12960c mo37344a(int i, int i2, int i3) {
            return new C12960c(i, i2, i3);
        }

        public /* synthetic */ C12961a(C12928f fVar) {
            this();
        }
    }

    public C12960c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f33549e = i;
            this.f33550f = C13039c.m34044b(i, i2, i3);
            this.f33551g = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int mo37336a() {
        return this.f33551g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f33551g == r3.f33551g) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.C12960c
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.ranges.c r0 = (kotlin.ranges.C12960c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f33549e
            kotlin.ranges.c r3 = (kotlin.ranges.C12960c) r3
            int r1 = r3.f33549e
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f33550f
            int r1 = r3.f33550f
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f33551g
            int r3 = r3.f33551g
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.C12960c.equals(java.lang.Object):boolean");
    }

    public final int getFirst() {
        return this.f33549e;
    }

    public final int getLast() {
        return this.f33550f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f33549e * 31) + this.f33550f) * 31) + this.f33551g;
    }

    public boolean isEmpty() {
        if (this.f33551g > 0) {
            if (this.f33549e > this.f33550f) {
                return true;
            }
        } else if (this.f33549e < this.f33550f) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        String str = " step ";
        if (this.f33551g > 0) {
            sb = new StringBuilder();
            sb.append(this.f33549e);
            sb.append("..");
            sb.append(this.f33550f);
            sb.append(str);
            i = this.f33551g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f33549e);
            sb.append(" downTo ");
            sb.append(this.f33550f);
            sb.append(str);
            i = -this.f33551g;
        }
        sb.append(i);
        return sb.toString();
    }

    public C12819b0 iterator() {
        return new C12962d(this.f33549e, this.f33550f, this.f33551g);
    }
}
