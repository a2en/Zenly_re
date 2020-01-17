package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.r0 */
public enum C7452r0 implements EnumLite {
    KIND_NOKIND(0),
    KIND_COLLECTION(1),
    KIND_LIFECYCLE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18650e;

    /* renamed from: co.znly.models.r0$a */
    class C7453a implements EnumLiteMap<C7452r0> {
        C7453a() {
        }

        public C7452r0 findValueByNumber(int i) {
            return C7452r0.m18100a(i);
        }
    }

    static {
        new C7453a();
    }

    private C7452r0(int i) {
        this.f18650e = i;
    }

    /* renamed from: a */
    public static C7452r0 m18100a(int i) {
        if (i == 0) {
            return KIND_NOKIND;
        }
        if (i == 1) {
            return KIND_COLLECTION;
        }
        if (i != 2) {
            return null;
        }
        return KIND_LIFECYCLE;
    }

    public final int getNumber() {
        return this.f18650e;
    }
}
