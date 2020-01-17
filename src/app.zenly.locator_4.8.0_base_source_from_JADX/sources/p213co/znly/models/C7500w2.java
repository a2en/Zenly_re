package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.w2 */
public enum C7500w2 implements EnumLite {
    TYPE_GPRS(0),
    TYPE_EDGE(1),
    TYPE_WCDMA(2),
    TYPE_HSDPA(3),
    TYPE_HSUPA(4),
    TYPE_CDMA_1X(5),
    TYPE_CDMA_EVDO_REV0(6),
    TYPE_CDMA_EVDO_REVA(7),
    TYPE_CDMA_EVDO_REVB(8),
    TYPE_EHRPD(9),
    TYPE_LTE(10),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18853e;

    /* renamed from: co.znly.models.w2$a */
    class C7501a implements EnumLiteMap<C7500w2> {
        C7501a() {
        }

        public C7500w2 findValueByNumber(int i) {
            return C7500w2.m18122a(i);
        }
    }

    static {
        new C7501a();
    }

    private C7500w2(int i) {
        this.f18853e = i;
    }

    /* renamed from: a */
    public static C7500w2 m18122a(int i) {
        switch (i) {
            case 0:
                return TYPE_GPRS;
            case 1:
                return TYPE_EDGE;
            case 2:
                return TYPE_WCDMA;
            case 3:
                return TYPE_HSDPA;
            case 4:
                return TYPE_HSUPA;
            case 5:
                return TYPE_CDMA_1X;
            case 6:
                return TYPE_CDMA_EVDO_REV0;
            case 7:
                return TYPE_CDMA_EVDO_REVA;
            case 8:
                return TYPE_CDMA_EVDO_REVB;
            case 9:
                return TYPE_EHRPD;
            case 10:
                return TYPE_LTE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f18853e;
    }
}
