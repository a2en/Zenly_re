package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.w1 */
public enum C7245w1 implements EnumLite {
    ALL(0),
    TILES(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17977e;

    /* renamed from: co.znly.models.core.w1$a */
    class C7246a implements EnumLiteMap<C7245w1> {
        C7246a() {
        }

        public C7245w1 findValueByNumber(int i) {
            return C7245w1.m17968a(i);
        }
    }

    static {
        new C7246a();
    }

    private C7245w1(int i) {
        this.f17977e = i;
    }

    /* renamed from: a */
    public static C7245w1 m17968a(int i) {
        if (i == 0) {
            return ALL;
        }
        if (i != 1) {
            return null;
        }
        return TILES;
    }

    public final int getNumber() {
        return this.f17977e;
    }
}
