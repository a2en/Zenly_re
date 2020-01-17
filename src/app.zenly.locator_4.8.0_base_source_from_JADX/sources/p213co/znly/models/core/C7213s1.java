package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.s1 */
public enum C7213s1 implements EnumLite {
    NONE(0),
    NOT_SELECTED(1),
    SELECTED(2),
    OPERATED(3),
    ACTION_DONE(4),
    OPERATED_ALT(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17900e;

    /* renamed from: co.znly.models.core.s1$a */
    class C7214a implements EnumLiteMap<C7213s1> {
        C7214a() {
        }

        public C7213s1 findValueByNumber(int i) {
            return C7213s1.m17952a(i);
        }
    }

    static {
        new C7214a();
    }

    private C7213s1(int i) {
        this.f17900e = i;
    }

    /* renamed from: a */
    public static C7213s1 m17952a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return NOT_SELECTED;
        }
        if (i == 2) {
            return SELECTED;
        }
        if (i == 3) {
            return OPERATED;
        }
        if (i == 4) {
            return ACTION_DONE;
        }
        if (i != 5) {
            return null;
        }
        return OPERATED_ALT;
    }

    public final int getNumber() {
        return this.f17900e;
    }
}
