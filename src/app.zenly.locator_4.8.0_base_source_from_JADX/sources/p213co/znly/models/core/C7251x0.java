package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.x0 */
public enum C7251x0 implements EnumLite {
    UNKNOWN(0),
    PBKDF2(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17989e;

    /* renamed from: co.znly.models.core.x0$a */
    class C7252a implements EnumLiteMap<C7251x0> {
        C7252a() {
        }

        public C7251x0 findValueByNumber(int i) {
            return C7251x0.m17970a(i);
        }
    }

    static {
        new C7252a();
    }

    private C7251x0(int i) {
        this.f17989e = i;
    }

    /* renamed from: a */
    public static C7251x0 m17970a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return PBKDF2;
    }

    public final int getNumber() {
        return this.f17989e;
    }
}
