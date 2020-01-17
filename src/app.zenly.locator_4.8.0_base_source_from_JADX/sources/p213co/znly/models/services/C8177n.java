package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.n */
public enum C8177n implements EnumLite {
    COUNTRY(0),
    LOCALITY(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20701e;

    /* renamed from: co.znly.models.services.n$a */
    class C8178a implements EnumLiteMap<C8177n> {
        C8178a() {
        }

        public C8177n findValueByNumber(int i) {
            return C8177n.m19270a(i);
        }
    }

    static {
        new C8178a();
    }

    private C8177n(int i) {
        this.f20701e = i;
    }

    /* renamed from: a */
    public static C8177n m19270a(int i) {
        if (i == 0) {
            return COUNTRY;
        }
        if (i != 1) {
            return null;
        }
        return LOCALITY;
    }

    public final int getNumber() {
        return this.f20701e;
    }
}
