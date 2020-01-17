package p213co.znly.models.footsteps;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.footsteps.e */
public enum C7311e implements EnumLite {
    TEXTUAL(0),
    BLOOMFILTER_XZ(1),
    BLOOMFILTER_GZIP(2),
    COMPACT_GZIP(3),
    BLOOMFILTER(4),
    COMPACT(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18163e;

    /* renamed from: co.znly.models.footsteps.e$a */
    class C7312a implements EnumLiteMap<C7311e> {
        C7312a() {
        }

        public C7311e findValueByNumber(int i) {
            return C7311e.m18004a(i);
        }
    }

    static {
        new C7312a();
    }

    private C7311e(int i) {
        this.f18163e = i;
    }

    /* renamed from: a */
    public static C7311e m18004a(int i) {
        if (i == 0) {
            return TEXTUAL;
        }
        if (i == 1) {
            return BLOOMFILTER_XZ;
        }
        if (i == 2) {
            return BLOOMFILTER_GZIP;
        }
        if (i == 3) {
            return COMPACT_GZIP;
        }
        if (i == 4) {
            return BLOOMFILTER;
        }
        if (i != 5) {
            return null;
        }
        return COMPACT;
    }

    public final int getNumber() {
        return this.f18163e;
    }
}
