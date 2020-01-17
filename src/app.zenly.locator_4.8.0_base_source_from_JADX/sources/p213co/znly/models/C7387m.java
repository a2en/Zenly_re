package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.m */
public enum C7387m implements EnumLite {
    DATAVARIANT_NONE(0),
    DATAVARIANT_TST_EXPONENTIAL(1),
    DATAVARIANT_REALTIME_FRIENDSHIP(2),
    DATAVARIANT_REALTIME_FRIENDREQUEST(3),
    DATAVARIANT_TST_REWEIGHTED_IN_SIG_PLACES(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18425e;

    /* renamed from: co.znly.models.m$a */
    class C7388a implements EnumLiteMap<C7387m> {
        C7388a() {
        }

        public C7387m findValueByNumber(int i) {
            return C7387m.m18072a(i);
        }
    }

    static {
        new C7388a();
    }

    private C7387m(int i) {
        this.f18425e = i;
    }

    /* renamed from: a */
    public static C7387m m18072a(int i) {
        if (i == 0) {
            return DATAVARIANT_NONE;
        }
        if (i == 1) {
            return DATAVARIANT_TST_EXPONENTIAL;
        }
        if (i == 2) {
            return DATAVARIANT_REALTIME_FRIENDSHIP;
        }
        if (i == 3) {
            return DATAVARIANT_REALTIME_FRIENDREQUEST;
        }
        if (i != 4) {
            return null;
        }
        return DATAVARIANT_TST_REWEIGHTED_IN_SIG_PLACES;
    }

    public final int getNumber() {
        return this.f18425e;
    }
}
