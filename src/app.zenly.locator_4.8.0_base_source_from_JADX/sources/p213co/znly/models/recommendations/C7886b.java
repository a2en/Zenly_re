package p213co.znly.models.recommendations;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.recommendations.b */
public enum C7886b implements EnumLite {
    ACK_MATCH_UNKNOWN(0),
    ACK_MATCH_ACCEPTED(1),
    ACK_MATCH_IGNORED(2),
    ACK_MATCH_PICKED_FROM_LIST(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f19950e;

    /* renamed from: co.znly.models.recommendations.b$a */
    class C7887a implements EnumLiteMap<C7886b> {
        C7887a() {
        }

        public C7886b findValueByNumber(int i) {
            return C7886b.m18945a(i);
        }
    }

    static {
        new C7887a();
    }

    private C7886b(int i) {
        this.f19950e = i;
    }

    /* renamed from: a */
    public static C7886b m18945a(int i) {
        if (i == 0) {
            return ACK_MATCH_UNKNOWN;
        }
        if (i == 1) {
            return ACK_MATCH_ACCEPTED;
        }
        if (i == 2) {
            return ACK_MATCH_IGNORED;
        }
        if (i != 3) {
            return null;
        }
        return ACK_MATCH_PICKED_FROM_LIST;
    }

    public final int getNumber() {
        return this.f19950e;
    }
}
