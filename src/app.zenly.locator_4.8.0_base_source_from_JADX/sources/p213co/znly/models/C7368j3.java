package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.j3 */
public enum C7368j3 implements EnumLite {
    E_NO_ERROR(0),
    E_ERROR(1),
    E_INVALID_REQUEST(2),
    E_UNAVAILABLE(3),
    E_INVALID_RELEASE(4),
    E_DEADLINE_EXCEEDED(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18369e;

    /* renamed from: co.znly.models.j3$a */
    class C7369a implements EnumLiteMap<C7368j3> {
        C7369a() {
        }

        public C7368j3 findValueByNumber(int i) {
            return C7368j3.m18060a(i);
        }
    }

    static {
        new C7369a();
    }

    private C7368j3(int i) {
        this.f18369e = i;
    }

    /* renamed from: a */
    public static C7368j3 m18060a(int i) {
        if (i == 0) {
            return E_NO_ERROR;
        }
        if (i == 1) {
            return E_ERROR;
        }
        if (i == 2) {
            return E_INVALID_REQUEST;
        }
        if (i == 3) {
            return E_UNAVAILABLE;
        }
        if (i == 4) {
            return E_INVALID_RELEASE;
        }
        if (i != 5) {
            return null;
        }
        return E_DEADLINE_EXCEEDED;
    }

    public final int getNumber() {
        return this.f18369e;
    }
}
