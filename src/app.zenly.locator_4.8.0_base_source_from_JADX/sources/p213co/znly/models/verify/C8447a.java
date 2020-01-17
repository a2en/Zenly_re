package p213co.znly.models.verify;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.verify.a */
public enum C8447a implements EnumLite {
    TYPE_UNKNOWN(0),
    TYPE_LOGIN(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21444e;

    /* renamed from: co.znly.models.verify.a$a */
    class C8448a implements EnumLiteMap<C8447a> {
        C8448a() {
        }

        public C8447a findValueByNumber(int i) {
            return C8447a.m19512a(i);
        }
    }

    static {
        new C8448a();
    }

    private C8447a(int i) {
        this.f21444e = i;
    }

    /* renamed from: a */
    public static C8447a m19512a(int i) {
        if (i == 0) {
            return TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return TYPE_LOGIN;
    }

    public final int getNumber() {
        return this.f21444e;
    }
}
