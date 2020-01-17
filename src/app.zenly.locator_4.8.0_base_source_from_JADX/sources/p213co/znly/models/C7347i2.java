package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.i2 */
public enum C7347i2 implements EnumLite {
    REASON_UNKNOWN(0),
    REASON_DELETION_PROCESS(1),
    REASON_PHONENUMBER_PROBATION(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18292e;

    /* renamed from: co.znly.models.i2$a */
    class C7348a implements EnumLiteMap<C7347i2> {
        C7348a() {
        }

        public C7347i2 findValueByNumber(int i) {
            return C7347i2.m18034a(i);
        }
    }

    static {
        new C7348a();
    }

    private C7347i2(int i) {
        this.f18292e = i;
    }

    /* renamed from: a */
    public static C7347i2 m18034a(int i) {
        if (i == 0) {
            return REASON_UNKNOWN;
        }
        if (i == 1) {
            return REASON_DELETION_PROCESS;
        }
        if (i != 2) {
            return null;
        }
        return REASON_PHONENUMBER_PROBATION;
    }

    public final int getNumber() {
        return this.f18292e;
    }
}
