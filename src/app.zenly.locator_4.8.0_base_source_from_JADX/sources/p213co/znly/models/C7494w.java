package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.w */
public enum C7494w implements EnumLite {
    NO_GHOST(0),
    CITY(1),
    HIDDEN(2),
    GLOBAL(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18827e;

    /* renamed from: co.znly.models.w$a */
    class C7495a implements EnumLiteMap<C7494w> {
        C7495a() {
        }

        public C7494w findValueByNumber(int i) {
            return C7494w.m18119a(i);
        }
    }

    static {
        new C7495a();
    }

    private C7494w(int i) {
        this.f18827e = i;
    }

    /* renamed from: a */
    public static C7494w m18119a(int i) {
        if (i == 0) {
            return NO_GHOST;
        }
        if (i == 1) {
            return CITY;
        }
        if (i == 2) {
            return HIDDEN;
        }
        if (i != 3) {
            return null;
        }
        return GLOBAL;
    }

    public final int getNumber() {
        return this.f18827e;
    }
}
