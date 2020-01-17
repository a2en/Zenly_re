package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.k */
public enum C7133k implements EnumLite {
    PRIVATE(0),
    GROUP(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17671e;

    /* renamed from: co.znly.models.core.k$a */
    class C7134a implements EnumLiteMap<C7133k> {
        C7134a() {
        }

        public C7133k findValueByNumber(int i) {
            return C7133k.m17816a(i);
        }
    }

    static {
        new C7134a();
    }

    private C7133k(int i) {
        this.f17671e = i;
    }

    /* renamed from: a */
    public static C7133k m17816a(int i) {
        if (i == 0) {
            return PRIVATE;
        }
        if (i != 1) {
            return null;
        }
        return GROUP;
    }

    public final int getNumber() {
        return this.f17671e;
    }
}
