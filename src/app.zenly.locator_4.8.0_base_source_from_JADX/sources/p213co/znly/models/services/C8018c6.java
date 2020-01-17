package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.c6 */
public enum C8018c6 implements EnumLite {
    VIEWPORT_MODE_UNKNOWN(0),
    VIEWPORT_MODE_STANDARD(1),
    VIEWPORT_MODE_DISCOVER(2),
    VIEWPORT_MODE_GROUP(3),
    VIEWPORT_MODE_HIDDEN(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20354e;

    /* renamed from: co.znly.models.services.c6$a */
    class C8019a implements EnumLiteMap<C8018c6> {
        C8019a() {
        }

        public C8018c6 findValueByNumber(int i) {
            return C8018c6.m19073a(i);
        }
    }

    static {
        new C8019a();
    }

    private C8018c6(int i) {
        this.f20354e = i;
    }

    /* renamed from: a */
    public static C8018c6 m19073a(int i) {
        if (i == 0) {
            return VIEWPORT_MODE_UNKNOWN;
        }
        if (i == 1) {
            return VIEWPORT_MODE_STANDARD;
        }
        if (i == 2) {
            return VIEWPORT_MODE_DISCOVER;
        }
        if (i == 3) {
            return VIEWPORT_MODE_GROUP;
        }
        if (i != 4) {
            return null;
        }
        return VIEWPORT_MODE_HIDDEN;
    }

    public final int getNumber() {
        return this.f20354e;
    }
}
