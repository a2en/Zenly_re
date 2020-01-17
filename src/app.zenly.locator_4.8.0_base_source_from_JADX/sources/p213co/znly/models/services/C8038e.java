package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.e */
public enum C8038e implements EnumLite {
    TILE_COVERING(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20398e;

    /* renamed from: co.znly.models.services.e$a */
    class C8039a implements EnumLiteMap<C8038e> {
        C8039a() {
        }

        public C8038e findValueByNumber(int i) {
            return C8038e.m19101a(i);
        }
    }

    static {
        new C8039a();
    }

    private C8038e(int i) {
        this.f20398e = i;
    }

    /* renamed from: a */
    public static C8038e m19101a(int i) {
        if (i != 0) {
            return null;
        }
        return TILE_COVERING;
    }

    public final int getNumber() {
        return this.f20398e;
    }
}
