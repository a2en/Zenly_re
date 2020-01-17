package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.q0 */
public enum C7445q0 implements EnumLite {
    LIFECYCLE_UNKNOWN(0),
    LIFECYCLE_BACKGROUND(1),
    LIFECYCLE_FOREGROUND(2),
    LIFECYCLE_NOACTIVITY(256),
    LIFECYCLE_BACKGROUND_NOACTIVITY(257),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18629e;

    /* renamed from: co.znly.models.q0$a */
    class C7446a implements EnumLiteMap<C7445q0> {
        C7446a() {
        }

        public C7445q0 findValueByNumber(int i) {
            return C7445q0.m18097a(i);
        }
    }

    static {
        new C7446a();
    }

    private C7445q0(int i) {
        this.f18629e = i;
    }

    /* renamed from: a */
    public static C7445q0 m18097a(int i) {
        if (i == 0) {
            return LIFECYCLE_UNKNOWN;
        }
        if (i == 1) {
            return LIFECYCLE_BACKGROUND;
        }
        if (i == 2) {
            return LIFECYCLE_FOREGROUND;
        }
        if (i == 256) {
            return LIFECYCLE_NOACTIVITY;
        }
        if (i != 257) {
            return null;
        }
        return LIFECYCLE_BACKGROUND_NOACTIVITY;
    }

    public final int getNumber() {
        return this.f18629e;
    }
}
