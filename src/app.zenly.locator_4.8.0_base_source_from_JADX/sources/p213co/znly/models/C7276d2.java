package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.d2 */
public enum C7276d2 implements EnumLite {
    NOLABEL(0),
    HOME(1),
    WORK(2),
    SCHOOL(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18061e;

    /* renamed from: co.znly.models.d2$a */
    class C7277a implements EnumLiteMap<C7276d2> {
        C7277a() {
        }

        public C7276d2 findValueByNumber(int i) {
            return C7276d2.m17988a(i);
        }
    }

    static {
        new C7277a();
    }

    private C7276d2(int i) {
        this.f18061e = i;
    }

    /* renamed from: a */
    public static C7276d2 m17988a(int i) {
        if (i == 0) {
            return NOLABEL;
        }
        if (i == 1) {
            return HOME;
        }
        if (i == 2) {
            return WORK;
        }
        if (i != 3) {
            return null;
        }
        return SCHOOL;
    }

    public final int getNumber() {
        return this.f18061e;
    }
}
