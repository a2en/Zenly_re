package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.j1 */
public enum C7364j1 implements EnumLite {
    PIN_CONTEXT_RESULT_UNKNOWN(0),
    PIN_CONTEXT_RESULT_UNAVAILABLE(1),
    PIN_CONTEXT_RESULT_SUCCESS(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18356e;

    /* renamed from: co.znly.models.j1$a */
    class C7365a implements EnumLiteMap<C7364j1> {
        C7365a() {
        }

        public C7364j1 findValueByNumber(int i) {
            return C7364j1.m18059a(i);
        }
    }

    static {
        new C7365a();
    }

    private C7364j1(int i) {
        this.f18356e = i;
    }

    /* renamed from: a */
    public static C7364j1 m18059a(int i) {
        if (i == 0) {
            return PIN_CONTEXT_RESULT_UNKNOWN;
        }
        if (i == 1) {
            return PIN_CONTEXT_RESULT_UNAVAILABLE;
        }
        if (i != 2) {
            return null;
        }
        return PIN_CONTEXT_RESULT_SUCCESS;
    }

    public final int getNumber() {
        return this.f18356e;
    }
}
