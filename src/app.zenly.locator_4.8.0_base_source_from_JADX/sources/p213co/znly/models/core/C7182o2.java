package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.o2 */
public enum C7182o2 implements EnumLite {
    RINGER_MODE_UNKNOWN(0),
    RINGER_MODE_NORMAL(1),
    RINGER_MODE_SILENT(2),
    RINGER_MODE_VIBRATE(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17797e;

    /* renamed from: co.znly.models.core.o2$a */
    class C7183a implements EnumLiteMap<C7182o2> {
        C7183a() {
        }

        public C7182o2 findValueByNumber(int i) {
            return C7182o2.m17900a(i);
        }
    }

    static {
        new C7183a();
    }

    private C7182o2(int i) {
        this.f17797e = i;
    }

    /* renamed from: a */
    public static C7182o2 m17900a(int i) {
        if (i == 0) {
            return RINGER_MODE_UNKNOWN;
        }
        if (i == 1) {
            return RINGER_MODE_NORMAL;
        }
        if (i == 2) {
            return RINGER_MODE_SILENT;
        }
        if (i != 3) {
            return null;
        }
        return RINGER_MODE_VIBRATE;
    }

    public final int getNumber() {
        return this.f17797e;
    }
}
