package p213co.znly.models.recommendations;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.recommendations.c */
public enum C7888c implements EnumLite {
    ACK_RECO_UNKNOWN(0),
    ACK_RECO_ACCEPTED(1),
    ACK_RECO_IGNORED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f19956e;

    /* renamed from: co.znly.models.recommendations.c$a */
    class C7889a implements EnumLiteMap<C7888c> {
        C7889a() {
        }

        public C7888c findValueByNumber(int i) {
            return C7888c.m18946a(i);
        }
    }

    static {
        new C7889a();
    }

    private C7888c(int i) {
        this.f19956e = i;
    }

    /* renamed from: a */
    public static C7888c m18946a(int i) {
        if (i == 0) {
            return ACK_RECO_UNKNOWN;
        }
        if (i == 1) {
            return ACK_RECO_ACCEPTED;
        }
        if (i != 2) {
            return null;
        }
        return ACK_RECO_IGNORED;
    }

    public final int getNumber() {
        return this.f19956e;
    }
}
