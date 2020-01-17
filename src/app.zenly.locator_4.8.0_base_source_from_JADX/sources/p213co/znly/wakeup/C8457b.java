package p213co.znly.wakeup;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.wakeup.b */
public enum C8457b implements EnumLite {
    ACTION_UNKNOWN(0),
    ACTION_WAKE_UP(1),
    ACTION_OFFLINE_PING(2),
    ACTION_ONLINE_PING(3),
    ACTION_CONTINUOUS(4),
    ACTION_RESERVED_5(5),
    ACTION_SEQUENCE_FAILED(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21489e;

    /* renamed from: co.znly.wakeup.b$a */
    class C8458a implements EnumLiteMap<C8457b> {
        C8458a() {
        }

        public C8457b findValueByNumber(int i) {
            return C8457b.m19516a(i);
        }
    }

    static {
        new C8458a();
    }

    private C8457b(int i) {
        this.f21489e = i;
    }

    /* renamed from: a */
    public static C8457b m19516a(int i) {
        switch (i) {
            case 0:
                return ACTION_UNKNOWN;
            case 1:
                return ACTION_WAKE_UP;
            case 2:
                return ACTION_OFFLINE_PING;
            case 3:
                return ACTION_ONLINE_PING;
            case 4:
                return ACTION_CONTINUOUS;
            case 5:
                return ACTION_RESERVED_5;
            case 6:
                return ACTION_SEQUENCE_FAILED;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f21489e;
    }
}
