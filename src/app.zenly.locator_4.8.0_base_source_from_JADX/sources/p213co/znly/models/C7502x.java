package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.x */
public enum C7502x implements EnumLite {
    ALL(0),
    COUNTRY_CHANGE(1),
    ACTIVITY(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18859e;

    /* renamed from: co.znly.models.x$a */
    class C7503a implements EnumLiteMap<C7502x> {
        C7503a() {
        }

        public C7502x findValueByNumber(int i) {
            return C7502x.m18123a(i);
        }
    }

    static {
        new C7503a();
    }

    private C7502x(int i) {
        this.f18859e = i;
    }

    /* renamed from: a */
    public static C7502x m18123a(int i) {
        if (i == 0) {
            return ALL;
        }
        if (i == 1) {
            return COUNTRY_CHANGE;
        }
        if (i != 2) {
            return null;
        }
        return ACTIVITY;
    }

    public final int getNumber() {
        return this.f18859e;
    }
}
