package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.d3 */
public enum C7278d3 implements EnumLite {
    CLASSIC(0),
    RAINBOW(1),
    DARK(2),
    JUNGLE(3),
    LEMONADE(4),
    GOLD(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18070e;

    /* renamed from: co.znly.models.d3$a */
    class C7279a implements EnumLiteMap<C7278d3> {
        C7279a() {
        }

        public C7278d3 findValueByNumber(int i) {
            return C7278d3.m17989a(i);
        }
    }

    static {
        new C7279a();
    }

    private C7278d3(int i) {
        this.f18070e = i;
    }

    /* renamed from: a */
    public static C7278d3 m17989a(int i) {
        if (i == 0) {
            return CLASSIC;
        }
        if (i == 1) {
            return RAINBOW;
        }
        if (i == 2) {
            return DARK;
        }
        if (i == 3) {
            return JUNGLE;
        }
        if (i == 4) {
            return LEMONADE;
        }
        if (i != 5) {
            return null;
        }
        return GOLD;
    }

    public final int getNumber() {
        return this.f18070e;
    }
}
