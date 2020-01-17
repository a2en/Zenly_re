package p213co.znly.models.verify;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.verify.e */
public enum C8454e implements EnumLite {
    ALPHA(0),
    ALPHANUM(1),
    NUMERIC(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21478e;

    /* renamed from: co.znly.models.verify.e$a */
    class C8455a implements EnumLiteMap<C8454e> {
        C8455a() {
        }

        public C8454e findValueByNumber(int i) {
            return C8454e.m19515a(i);
        }
    }

    static {
        new C8455a();
    }

    private C8454e(int i) {
        this.f21478e = i;
    }

    /* renamed from: a */
    public static C8454e m19515a(int i) {
        if (i == 0) {
            return ALPHA;
        }
        if (i == 1) {
            return ALPHANUM;
        }
        if (i != 2) {
            return null;
        }
        return NUMERIC;
    }

    public final int getNumber() {
        return this.f21478e;
    }
}
