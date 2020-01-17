package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.u0 */
public enum C7480u0 implements EnumLite {
    COUNTER(0),
    GAUGE(1),
    SUMMARY(2),
    UNTYPED(3),
    HISTOGRAM(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18778e;

    /* renamed from: co.znly.models.u0$a */
    class C7481a implements EnumLiteMap<C7480u0> {
        C7481a() {
        }

        public C7480u0 findValueByNumber(int i) {
            return C7480u0.m18112a(i);
        }
    }

    static {
        new C7481a();
    }

    private C7480u0(int i) {
        this.f18778e = i;
    }

    /* renamed from: a */
    public static C7480u0 m18112a(int i) {
        if (i == 0) {
            return COUNTER;
        }
        if (i == 1) {
            return GAUGE;
        }
        if (i == 2) {
            return SUMMARY;
        }
        if (i == 3) {
            return UNTYPED;
        }
        if (i != 4) {
            return null;
        }
        return HISTOGRAM;
    }

    public final int getNumber() {
        return this.f18778e;
    }
}
