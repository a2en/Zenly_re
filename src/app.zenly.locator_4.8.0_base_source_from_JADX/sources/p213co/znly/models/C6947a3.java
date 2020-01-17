package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.a3 */
public enum C6947a3 implements EnumLite {
    UNKNOW(0),
    IS_BLOCKED(1),
    BLOCKED_YOU(2),
    NOT_BLOCKED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17120e;

    /* renamed from: co.znly.models.a3$a */
    class C6948a implements EnumLiteMap<C6947a3> {
        C6948a() {
        }

        public C6947a3 findValueByNumber(int i) {
            return C6947a3.m17694a(i);
        }
    }

    static {
        new C6948a();
    }

    private C6947a3(int i) {
        this.f17120e = i;
    }

    /* renamed from: a */
    public static C6947a3 m17694a(int i) {
        if (i == 0) {
            return UNKNOW;
        }
        if (i == 1) {
            return IS_BLOCKED;
        }
        if (i == 2) {
            return BLOCKED_YOU;
        }
        if (i != 3) {
            return null;
        }
        return NOT_BLOCKED;
    }

    public final int getNumber() {
        return this.f17120e;
    }
}
