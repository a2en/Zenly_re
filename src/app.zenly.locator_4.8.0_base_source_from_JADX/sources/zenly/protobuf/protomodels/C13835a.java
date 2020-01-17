package zenly.protobuf.protomodels;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: zenly.protobuf.protomodels.a */
public enum C13835a implements EnumLite {
    UNKNOWN(0),
    ED25519(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f35250e;

    /* renamed from: zenly.protobuf.protomodels.a$a */
    class C13836a implements EnumLiteMap<C13835a> {
        C13836a() {
        }

        public C13835a findValueByNumber(int i) {
            return C13835a.m35963a(i);
        }
    }

    static {
        new C13836a();
    }

    private C13835a(int i) {
        this.f35250e = i;
    }

    /* renamed from: a */
    public static C13835a m35963a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return ED25519;
    }

    public final int getNumber() {
        return this.f35250e;
    }
}
