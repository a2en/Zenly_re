package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.d2 */
public enum C7080d2 implements EnumLite {
    STATE_FILTER_UNKNOWN(0),
    STATE_FILTER_NONE(1),
    STATE_FILTER_PRIORITY(2),
    STATE_FILTER_ALARMS(3),
    STATE_FILTER_ALL(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17519e;

    /* renamed from: co.znly.models.core.d2$a */
    class C7081a implements EnumLiteMap<C7080d2> {
        C7081a() {
        }

        public C7080d2 findValueByNumber(int i) {
            return C7080d2.m17786a(i);
        }
    }

    static {
        new C7081a();
    }

    private C7080d2(int i) {
        this.f17519e = i;
    }

    /* renamed from: a */
    public static C7080d2 m17786a(int i) {
        if (i == 0) {
            return STATE_FILTER_UNKNOWN;
        }
        if (i == 1) {
            return STATE_FILTER_NONE;
        }
        if (i == 2) {
            return STATE_FILTER_PRIORITY;
        }
        if (i == 3) {
            return STATE_FILTER_ALARMS;
        }
        if (i != 4) {
            return null;
        }
        return STATE_FILTER_ALL;
    }

    public final int getNumber() {
        return this.f17519e;
    }
}
