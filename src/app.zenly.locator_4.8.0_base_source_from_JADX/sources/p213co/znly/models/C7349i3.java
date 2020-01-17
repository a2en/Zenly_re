package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.i3 */
public enum C7349i3 implements EnumLite {
    UNKNOWN(0),
    ACQUIRE(1),
    RELEASE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18298e;

    /* renamed from: co.znly.models.i3$a */
    class C7350a implements EnumLiteMap<C7349i3> {
        C7350a() {
        }

        public C7349i3 findValueByNumber(int i) {
            return C7349i3.m18035a(i);
        }
    }

    static {
        new C7350a();
    }

    private C7349i3(int i) {
        this.f18298e = i;
    }

    /* renamed from: a */
    public static C7349i3 m18035a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACQUIRE;
        }
        if (i != 2) {
            return null;
        }
        return RELEASE;
    }

    public final int getNumber() {
        return this.f18298e;
    }
}
