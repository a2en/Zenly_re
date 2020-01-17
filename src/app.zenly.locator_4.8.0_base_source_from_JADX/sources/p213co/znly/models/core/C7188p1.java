package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.p1 */
public enum C7188p1 implements EnumLite {
    CACHE(0),
    SERVER(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17810e;

    /* renamed from: co.znly.models.core.p1$a */
    class C7189a implements EnumLiteMap<C7188p1> {
        C7189a() {
        }

        public C7188p1 findValueByNumber(int i) {
            return C7188p1.m17903a(i);
        }
    }

    static {
        new C7189a();
    }

    private C7188p1(int i) {
        this.f17810e = i;
    }

    /* renamed from: a */
    public static C7188p1 m17903a(int i) {
        if (i == 0) {
            return CACHE;
        }
        if (i != 1) {
            return null;
        }
        return SERVER;
    }

    public final int getNumber() {
        return this.f17810e;
    }
}
