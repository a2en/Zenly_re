package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.n1 */
public enum C8181n1 implements EnumLite {
    REASON_OK(0),
    REASON_INTERNAL(1),
    REASON_DUPLICATE(2),
    REASON_REQUEST_ALREADY_REPLIED(3),
    REASON_REQUEST_OR_MEDIA_EXPIRED(4),
    REASON_BLOCKED(5),
    REASON_TALK_TO_STRANGER_QUARANTINE(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20714e;

    /* renamed from: co.znly.models.services.n1$a */
    class C8182a implements EnumLiteMap<C8181n1> {
        C8182a() {
        }

        public C8181n1 findValueByNumber(int i) {
            return C8181n1.m19272a(i);
        }
    }

    static {
        new C8182a();
    }

    private C8181n1(int i) {
        this.f20714e = i;
    }

    /* renamed from: a */
    public static C8181n1 m19272a(int i) {
        switch (i) {
            case 0:
                return REASON_OK;
            case 1:
                return REASON_INTERNAL;
            case 2:
                return REASON_DUPLICATE;
            case 3:
                return REASON_REQUEST_ALREADY_REPLIED;
            case 4:
                return REASON_REQUEST_OR_MEDIA_EXPIRED;
            case 5:
                return REASON_BLOCKED;
            case 6:
                return REASON_TALK_TO_STRANGER_QUARANTINE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f20714e;
    }
}
