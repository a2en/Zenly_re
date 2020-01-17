package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.q2 */
public enum C7199q2 implements EnumLite {
    VOIP_EVENT_UNKOWN(0),
    VOIP_EVENT_TOKEN_UPDATE(1),
    VOIP_EVENT_PUSH(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17844e;

    /* renamed from: co.znly.models.core.q2$a */
    class C7200a implements EnumLiteMap<C7199q2> {
        C7200a() {
        }

        public C7199q2 findValueByNumber(int i) {
            return C7199q2.m17930a(i);
        }
    }

    static {
        new C7200a();
    }

    private C7199q2(int i) {
        this.f17844e = i;
    }

    /* renamed from: a */
    public static C7199q2 m17930a(int i) {
        if (i == 0) {
            return VOIP_EVENT_UNKOWN;
        }
        if (i == 1) {
            return VOIP_EVENT_TOKEN_UPDATE;
        }
        if (i != 2) {
            return null;
        }
        return VOIP_EVENT_PUSH;
    }

    public final int getNumber() {
        return this.f17844e;
    }
}
