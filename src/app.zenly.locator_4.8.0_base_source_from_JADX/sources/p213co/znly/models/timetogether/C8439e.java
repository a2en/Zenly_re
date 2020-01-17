package p213co.znly.models.timetogether;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.timetogether.e */
public enum C8439e implements EnumLite {
    UNKNOWN_TREND(0),
    EQUAL(1),
    RAISING(2),
    DROPPING(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21413e;

    /* renamed from: co.znly.models.timetogether.e$a */
    class C8440a implements EnumLiteMap<C8439e> {
        C8440a() {
        }

        public C8439e findValueByNumber(int i) {
            return C8439e.m19508a(i);
        }
    }

    static {
        new C8440a();
    }

    private C8439e(int i) {
        this.f21413e = i;
    }

    /* renamed from: a */
    public static C8439e m19508a(int i) {
        if (i == 0) {
            return UNKNOWN_TREND;
        }
        if (i == 1) {
            return EQUAL;
        }
        if (i == 2) {
            return RAISING;
        }
        if (i != 3) {
            return null;
        }
        return DROPPING;
    }

    public final int getNumber() {
        return this.f21413e;
    }
}
