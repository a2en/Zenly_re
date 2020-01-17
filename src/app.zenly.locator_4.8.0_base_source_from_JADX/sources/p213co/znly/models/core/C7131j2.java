package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.j2 */
public enum C7131j2 implements EnumLite {
    STATE_UNKNOWN(0),
    STATE_IDLE(1),
    STATE_RINGING(2),
    STATE_OFFHOOK(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17666e;

    /* renamed from: co.znly.models.core.j2$a */
    class C7132a implements EnumLiteMap<C7131j2> {
        C7132a() {
        }

        public C7131j2 findValueByNumber(int i) {
            return C7131j2.m17815a(i);
        }
    }

    static {
        new C7132a();
    }

    private C7131j2(int i) {
        this.f17666e = i;
    }

    /* renamed from: a */
    public static C7131j2 m17815a(int i) {
        if (i == 0) {
            return STATE_UNKNOWN;
        }
        if (i == 1) {
            return STATE_IDLE;
        }
        if (i == 2) {
            return STATE_RINGING;
        }
        if (i != 3) {
            return null;
        }
        return STATE_OFFHOOK;
    }

    public final int getNumber() {
        return this.f17666e;
    }
}
