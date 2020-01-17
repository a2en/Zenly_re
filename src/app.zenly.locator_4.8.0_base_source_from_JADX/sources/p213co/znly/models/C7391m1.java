package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.m1 */
public enum C7391m1 implements EnumLite {
    UNKNOWN(0),
    READING(1),
    JOIN(2),
    LEAVE(4),
    TYPING(8),
    LIST(16),
    INAPP(32),
    QUITAPP(64),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18439e;

    /* renamed from: co.znly.models.m1$a */
    class C7392a implements EnumLiteMap<C7391m1> {
        C7392a() {
        }

        public C7391m1 findValueByNumber(int i) {
            return C7391m1.m18074a(i);
        }
    }

    static {
        new C7392a();
    }

    private C7391m1(int i) {
        this.f18439e = i;
    }

    /* renamed from: a */
    public static C7391m1 m18074a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return READING;
        }
        if (i == 2) {
            return JOIN;
        }
        if (i == 4) {
            return LEAVE;
        }
        if (i == 8) {
            return TYPING;
        }
        if (i == 16) {
            return LIST;
        }
        if (i == 32) {
            return INAPP;
        }
        if (i != 64) {
            return null;
        }
        return QUITAPP;
    }

    public final int getNumber() {
        return this.f18439e;
    }
}
