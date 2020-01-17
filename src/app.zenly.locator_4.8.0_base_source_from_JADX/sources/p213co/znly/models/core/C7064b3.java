package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.b3 */
public enum C7064b3 implements EnumLite {
    STATE_UNKNOWN(0),
    STATE_RUNNING(1),
    STATE_SUSPENDED(2),
    STATE_CANCELING(3),
    STATE_COMPLETED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17475e;

    /* renamed from: co.znly.models.core.b3$a */
    class C7065a implements EnumLiteMap<C7064b3> {
        C7065a() {
        }

        public C7064b3 findValueByNumber(int i) {
            return C7064b3.m17769a(i);
        }
    }

    static {
        new C7065a();
    }

    private C7064b3(int i) {
        this.f17475e = i;
    }

    /* renamed from: a */
    public static C7064b3 m17769a(int i) {
        if (i == 0) {
            return STATE_UNKNOWN;
        }
        if (i == 1) {
            return STATE_RUNNING;
        }
        if (i == 2) {
            return STATE_SUSPENDED;
        }
        if (i == 3) {
            return STATE_CANCELING;
        }
        if (i != 4) {
            return null;
        }
        return STATE_COMPLETED;
    }

    public final int getNumber() {
        return this.f17475e;
    }
}
