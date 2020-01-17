package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.b3 */
public enum C6960b3 implements EnumLite {
    metric(0),
    imperial(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17158e;

    /* renamed from: co.znly.models.b3$a */
    class C6961a implements EnumLiteMap<C6960b3> {
        C6961a() {
        }

        public C6960b3 findValueByNumber(int i) {
            return C6960b3.m17701a(i);
        }
    }

    static {
        new C6961a();
    }

    private C6960b3(int i) {
        this.f17158e = i;
    }

    /* renamed from: a */
    public static C6960b3 m17701a(int i) {
        if (i == 0) {
            return metric;
        }
        if (i != 1) {
            return null;
        }
        return imperial;
    }

    public final int getNumber() {
        return this.f17158e;
    }
}
