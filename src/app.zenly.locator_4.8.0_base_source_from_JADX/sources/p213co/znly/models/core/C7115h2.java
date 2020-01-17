package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.h2 */
public enum C7115h2 implements EnumLite {
    STATE_UNKNOWN(0),
    STATE_LOCKED(1),
    STATE_UNLOCKED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17610e;

    /* renamed from: co.znly.models.core.h2$a */
    class C7116a implements EnumLiteMap<C7115h2> {
        C7116a() {
        }

        public C7115h2 findValueByNumber(int i) {
            return C7115h2.m17804a(i);
        }
    }

    static {
        new C7116a();
    }

    private C7115h2(int i) {
        this.f17610e = i;
    }

    /* renamed from: a */
    public static C7115h2 m17804a(int i) {
        if (i == 0) {
            return STATE_UNKNOWN;
        }
        if (i == 1) {
            return STATE_LOCKED;
        }
        if (i != 2) {
            return null;
        }
        return STATE_UNLOCKED;
    }

    public final int getNumber() {
        return this.f17610e;
    }
}
