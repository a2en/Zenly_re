package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.v4 */
public enum C8340v4 implements EnumLite {
    OK(0),
    INTERNAL(13),
    UNAVAILABLE(14),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21127e;

    /* renamed from: co.znly.models.services.v4$a */
    class C8341a implements EnumLiteMap<C8340v4> {
        C8341a() {
        }

        public C8340v4 findValueByNumber(int i) {
            return C8340v4.m19423a(i);
        }
    }

    static {
        new C8341a();
    }

    private C8340v4(int i) {
        this.f21127e = i;
    }

    /* renamed from: a */
    public static C8340v4 m19423a(int i) {
        if (i == 0) {
            return OK;
        }
        if (i == 13) {
            return INTERNAL;
        }
        if (i != 14) {
            return null;
        }
        return UNAVAILABLE;
    }

    public final int getNumber() {
        return this.f21127e;
    }
}
