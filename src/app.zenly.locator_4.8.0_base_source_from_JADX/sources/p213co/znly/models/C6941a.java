package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.a */
public enum C6941a implements EnumLite {
    UNREACHABLE(0),
    REACHABLE(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17107e;

    /* renamed from: co.znly.models.a$a */
    class C6942a implements EnumLiteMap<C6941a> {
        C6942a() {
        }

        public C6941a findValueByNumber(int i) {
            return C6941a.m17692a(i);
        }
    }

    static {
        new C6942a();
    }

    private C6941a(int i) {
        this.f17107e = i;
    }

    /* renamed from: a */
    public static C6941a m17692a(int i) {
        if (i == 0) {
            return UNREACHABLE;
        }
        if (i != 1) {
            return null;
        }
        return REACHABLE;
    }

    public final int getNumber() {
        return this.f17107e;
    }
}
