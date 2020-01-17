package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.z1 */
public enum C7266z1 implements EnumLite {
    NETWORK_TYPE_UNKNOWN(0),
    NETWORk_TYPE_EHRPD(1),
    NETWORk_TYPE_EVDO_0(2),
    NETWORK_TYPE_EVDO_A(3),
    NETWORK_TYPE_EVDO_B(4),
    NETWORK_TYPE_GPRS(5),
    NETWORK_TYPE_HSDPA(6),
    NETWORK_TYPE_HSPA(7),
    NETWORK_TYPE_HSPAP(8),
    NETWORK_TYPE_HSUPA(9),
    NETWORK_TYPE_IDEN(10),
    NETWORK_TYPE_LTE(11),
    NETWORK_TYPE_UMTS(12),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18032e;

    /* renamed from: co.znly.models.core.z1$a */
    class C7267a implements EnumLiteMap<C7266z1> {
        C7267a() {
        }

        public C7266z1 findValueByNumber(int i) {
            return C7266z1.m17979a(i);
        }
    }

    static {
        new C7267a();
    }

    private C7266z1(int i) {
        this.f18032e = i;
    }

    /* renamed from: a */
    public static C7266z1 m17979a(int i) {
        switch (i) {
            case 0:
                return NETWORK_TYPE_UNKNOWN;
            case 1:
                return NETWORk_TYPE_EHRPD;
            case 2:
                return NETWORk_TYPE_EVDO_0;
            case 3:
                return NETWORK_TYPE_EVDO_A;
            case 4:
                return NETWORK_TYPE_EVDO_B;
            case 5:
                return NETWORK_TYPE_GPRS;
            case 6:
                return NETWORK_TYPE_HSDPA;
            case 7:
                return NETWORK_TYPE_HSPA;
            case 8:
                return NETWORK_TYPE_HSPAP;
            case 9:
                return NETWORK_TYPE_HSUPA;
            case 10:
                return NETWORK_TYPE_IDEN;
            case 11:
                return NETWORK_TYPE_LTE;
            case 12:
                return NETWORK_TYPE_UMTS;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f18032e;
    }
}
