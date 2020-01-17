package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.u1 */
public enum C8303u1 implements EnumLite {
    UNKNOWN(0),
    REVERSE_GEOCODE_VIEWPORT(1),
    ROAD_AT_CENTER(2),
    FULL_ADDRESS_AT_CENTER(3),
    ADMIN_HIERARCHY_AT_CENTER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20996e;

    /* renamed from: co.znly.models.services.u1$a */
    class C8304a implements EnumLiteMap<C8303u1> {
        C8304a() {
        }

        public C8303u1 findValueByNumber(int i) {
            return C8303u1.m19388a(i);
        }
    }

    static {
        new C8304a();
    }

    private C8303u1(int i) {
        this.f20996e = i;
    }

    /* renamed from: a */
    public static C8303u1 m19388a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return REVERSE_GEOCODE_VIEWPORT;
        }
        if (i == 2) {
            return ROAD_AT_CENTER;
        }
        if (i == 3) {
            return FULL_ADDRESS_AT_CENTER;
        }
        if (i != 4) {
            return null;
        }
        return ADMIN_HIERARCHY_AT_CENTER;
    }

    public final int getNumber() {
        return this.f20996e;
    }
}
