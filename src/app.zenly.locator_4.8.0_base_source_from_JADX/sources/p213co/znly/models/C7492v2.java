package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.v2 */
public enum C7492v2 implements EnumLite {
    noghost(0),
    city(1),
    hidden(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18820e;

    /* renamed from: co.znly.models.v2$a */
    class C7493a implements EnumLiteMap<C7492v2> {
        C7493a() {
        }

        public C7492v2 findValueByNumber(int i) {
            return C7492v2.m18118a(i);
        }
    }

    static {
        new C7493a();
    }

    private C7492v2(int i) {
        this.f18820e = i;
    }

    /* renamed from: a */
    public static C7492v2 m18118a(int i) {
        if (i == 0) {
            return noghost;
        }
        if (i == 1) {
            return city;
        }
        if (i != 2) {
            return null;
        }
        return hidden;
    }

    public final int getNumber() {
        return this.f18820e;
    }
}
