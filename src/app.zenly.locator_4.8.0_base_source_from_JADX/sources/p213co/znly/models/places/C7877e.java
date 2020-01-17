package p213co.znly.models.places;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.places.e */
public enum C7877e implements EnumLite {
    EMPTY(0),
    POINT(1),
    POLYGON(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f19931e;

    /* renamed from: co.znly.models.places.e$a */
    class C7878a implements EnumLiteMap<C7877e> {
        C7878a() {
        }

        public C7877e findValueByNumber(int i) {
            return C7877e.m18942a(i);
        }
    }

    static {
        new C7878a();
    }

    private C7877e(int i) {
        this.f19931e = i;
    }

    /* renamed from: a */
    public static C7877e m18942a(int i) {
        if (i == 0) {
            return EMPTY;
        }
        if (i == 1) {
            return POINT;
        }
        if (i != 2) {
            return null;
        }
        return POLYGON;
    }

    public final int getNumber() {
        return this.f19931e;
    }
}
