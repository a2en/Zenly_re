package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.r1 */
public enum C7204r1 implements EnumLite {
    CONVERSATION(0),
    FRIEND(1),
    FRIENDREQUEST(2),
    ALREADY(3),
    SUGGESTED(4),
    CONTACT(5),
    FAVORITE(6),
    UNMANAGED(7),
    SUGGESTED_USERS_ONLY(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17864e;

    /* renamed from: co.znly.models.core.r1$a */
    class C7205a implements EnumLiteMap<C7204r1> {
        C7205a() {
        }

        public C7204r1 findValueByNumber(int i) {
            return C7204r1.m17932a(i);
        }
    }

    static {
        new C7205a();
    }

    private C7204r1(int i) {
        this.f17864e = i;
    }

    /* renamed from: a */
    public static C7204r1 m17932a(int i) {
        switch (i) {
            case 0:
                return CONVERSATION;
            case 1:
                return FRIEND;
            case 2:
                return FRIENDREQUEST;
            case 3:
                return ALREADY;
            case 4:
                return SUGGESTED;
            case 5:
                return CONTACT;
            case 6:
                return FAVORITE;
            case 7:
                return UNMANAGED;
            case 8:
                return SUGGESTED_USERS_ONLY;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f17864e;
    }
}
