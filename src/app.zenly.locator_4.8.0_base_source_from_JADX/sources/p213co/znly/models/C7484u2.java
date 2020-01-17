package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.u2 */
public enum C7484u2 implements EnumLite {
    GPRS(0),
    Edge(1),
    WCDMA(2),
    HSDPA(3),
    HSUPA(4),
    CDMA1x(5),
    CDMAEVDOReV0(6),
    CDMAEVDOReVA(7),
    CDMAEVDOReVB(8),
    eHRPD(9),
    LTE(10),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18799e;

    /* renamed from: co.znly.models.u2$a */
    class C7485a implements EnumLiteMap<C7484u2> {
        C7485a() {
        }

        public C7484u2 findValueByNumber(int i) {
            return C7484u2.m18114a(i);
        }
    }

    static {
        new C7485a();
    }

    private C7484u2(int i) {
        this.f18799e = i;
    }

    /* renamed from: a */
    public static C7484u2 m18114a(int i) {
        switch (i) {
            case 0:
                return GPRS;
            case 1:
                return Edge;
            case 2:
                return WCDMA;
            case 3:
                return HSDPA;
            case 4:
                return HSUPA;
            case 5:
                return CDMA1x;
            case 6:
                return CDMAEVDOReV0;
            case 7:
                return CDMAEVDOReVA;
            case 8:
                return CDMAEVDOReVB;
            case 9:
                return eHRPD;
            case 10:
                return LTE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f18799e;
    }
}
