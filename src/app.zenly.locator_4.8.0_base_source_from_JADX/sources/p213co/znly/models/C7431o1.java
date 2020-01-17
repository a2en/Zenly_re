package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.o1 */
public enum C7431o1 implements EnumLite {
    OP_UNKNOWN(0),
    OP_CHAT_INSERT(1),
    OP_CURSOR_UPDATE(2),
    OP_REQUEST_MEDIA_INSERT(3),
    OP_LEAVE_GROUP(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18589e;

    /* renamed from: co.znly.models.o1$a */
    class C7432a implements EnumLiteMap<C7431o1> {
        C7432a() {
        }

        public C7431o1 findValueByNumber(int i) {
            return C7431o1.m18091a(i);
        }
    }

    static {
        new C7432a();
    }

    private C7431o1(int i) {
        this.f18589e = i;
    }

    /* renamed from: a */
    public static C7431o1 m18091a(int i) {
        if (i == 0) {
            return OP_UNKNOWN;
        }
        if (i == 1) {
            return OP_CHAT_INSERT;
        }
        if (i == 2) {
            return OP_CURSOR_UPDATE;
        }
        if (i == 3) {
            return OP_REQUEST_MEDIA_INSERT;
        }
        if (i != 4) {
            return null;
        }
        return OP_LEAVE_GROUP;
    }

    public final int getNumber() {
        return this.f18589e;
    }
}
