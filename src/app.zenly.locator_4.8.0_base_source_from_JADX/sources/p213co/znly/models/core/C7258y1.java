package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.y1 */
public enum C7258y1 implements EnumLite {
    STATE_UNKNOWN(0),
    STATE_UNPLUGGED(1),
    STATE_CHARGING(2),
    STATE_FULL(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18004e;

    /* renamed from: co.znly.models.core.y1$a */
    class C7259a implements EnumLiteMap<C7258y1> {
        C7259a() {
        }

        public C7258y1 findValueByNumber(int i) {
            return C7258y1.m17972a(i);
        }
    }

    static {
        new C7259a();
    }

    private C7258y1(int i) {
        this.f18004e = i;
    }

    /* renamed from: a */
    public static C7258y1 m17972a(int i) {
        if (i == 0) {
            return STATE_UNKNOWN;
        }
        if (i == 1) {
            return STATE_UNPLUGGED;
        }
        if (i == 2) {
            return STATE_CHARGING;
        }
        if (i != 3) {
            return null;
        }
        return STATE_FULL;
    }

    public final int getNumber() {
        return this.f18004e;
    }
}
