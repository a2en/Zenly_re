package p213co.znly.wakeup;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.wakeup.d */
public enum C8461d implements EnumLite {
    REASON_UNKNOWN(0),
    REASON_TOP(1),
    REASON_VISIBLE(2),
    REASON_SELECTED(3),
    REASON_DISCOVER(4),
    REASON_SONAR(5),
    REASON_PUBLICSHARE(6),
    REASON_DEBUG(7),
    REASON_COUNTRYCHANGE(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21511e;

    /* renamed from: co.znly.wakeup.d$a */
    class C8462a implements EnumLiteMap<C8461d> {
        C8462a() {
        }

        public C8461d findValueByNumber(int i) {
            return C8461d.m19517a(i);
        }
    }

    static {
        new C8462a();
    }

    private C8461d(int i) {
        this.f21511e = i;
    }

    /* renamed from: a */
    public static C8461d m19517a(int i) {
        switch (i) {
            case 0:
                return REASON_UNKNOWN;
            case 1:
                return REASON_TOP;
            case 2:
                return REASON_VISIBLE;
            case 3:
                return REASON_SELECTED;
            case 4:
                return REASON_DISCOVER;
            case 5:
                return REASON_SONAR;
            case 6:
                return REASON_PUBLICSHARE;
            case 7:
                return REASON_DEBUG;
            case 8:
                return REASON_COUNTRYCHANGE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f21511e;
    }
}
