package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.i5 */
public enum C8113i5 implements EnumLite {
    UNKNOWN_CURSOR(0),
    CHAT_CURSOR(1),
    PING_CURSOR(2),
    REQUEST_MEDIA_CURSOR(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20568e;

    /* renamed from: co.znly.models.services.i5$a */
    class C8114a implements EnumLiteMap<C8113i5> {
        C8114a() {
        }

        public C8113i5 findValueByNumber(int i) {
            return C8113i5.m19193a(i);
        }
    }

    static {
        new C8114a();
    }

    private C8113i5(int i) {
        this.f20568e = i;
    }

    /* renamed from: a */
    public static C8113i5 m19193a(int i) {
        if (i == 0) {
            return UNKNOWN_CURSOR;
        }
        if (i == 1) {
            return CHAT_CURSOR;
        }
        if (i == 2) {
            return PING_CURSOR;
        }
        if (i != 3) {
            return null;
        }
        return REQUEST_MEDIA_CURSOR;
    }

    public final int getNumber() {
        return this.f20568e;
    }
}
