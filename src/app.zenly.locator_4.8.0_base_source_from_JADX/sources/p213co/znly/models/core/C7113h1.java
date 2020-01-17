package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.h1 */
public enum C7113h1 implements EnumLite {
    ACTION_UNKNOWN(0),
    ACTION_ENTER(1),
    ACTION_EXIT(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17604e;

    /* renamed from: co.znly.models.core.h1$a */
    class C7114a implements EnumLiteMap<C7113h1> {
        C7114a() {
        }

        public C7113h1 findValueByNumber(int i) {
            return C7113h1.m17803a(i);
        }
    }

    static {
        new C7114a();
    }

    private C7113h1(int i) {
        this.f17604e = i;
    }

    /* renamed from: a */
    public static C7113h1 m17803a(int i) {
        if (i == 0) {
            return ACTION_UNKNOWN;
        }
        if (i == 1) {
            return ACTION_ENTER;
        }
        if (i != 2) {
            return null;
        }
        return ACTION_EXIT;
    }

    public final int getNumber() {
        return this.f17604e;
    }
}
