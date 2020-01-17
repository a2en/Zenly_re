package kotlin.ranges;

import kotlin.collections.C12821c0;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.p411u.C13039c;

/* renamed from: kotlin.ranges.f */
public class C12965f implements Iterable<Long>, KMappedMarker {

    /* renamed from: e */
    private final long f33558e;

    /* renamed from: f */
    private final long f33559f;

    /* renamed from: g */
    private final long f33560g;

    /* renamed from: kotlin.ranges.f$a */
    public static final class C12966a {
        private C12966a() {
        }

        public /* synthetic */ C12966a(C12928f fVar) {
            this();
        }
    }

    static {
        new C12966a(null);
    }

    public C12965f(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f33558e = j;
            this.f33559f = C13039c.m34045b(j, j2, j3);
            this.f33560g = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long getFirst() {
        return this.f33558e;
    }

    public final long getLast() {
        return this.f33559f;
    }

    public C12821c0 iterator() {
        C12967g gVar = new C12967g(this.f33558e, this.f33559f, this.f33560g);
        return gVar;
    }
}
