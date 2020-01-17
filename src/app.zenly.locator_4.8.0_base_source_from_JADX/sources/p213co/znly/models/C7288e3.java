package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.e3 */
public enum C7288e3 implements EnumLite {
    standard(0),
    satellite(1),
    hybrid(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18097e;

    /* renamed from: co.znly.models.e3$a */
    class C7289a implements EnumLiteMap<C7288e3> {
        C7289a() {
        }

        public C7288e3 findValueByNumber(int i) {
            return C7288e3.m17993a(i);
        }
    }

    static {
        new C7289a();
    }

    private C7288e3(int i) {
        this.f18097e = i;
    }

    /* renamed from: a */
    public static C7288e3 m17993a(int i) {
        if (i == 0) {
            return standard;
        }
        if (i == 1) {
            return satellite;
        }
        if (i != 2) {
            return null;
        }
        return hybrid;
    }

    public final int getNumber() {
        return this.f18097e;
    }
}
