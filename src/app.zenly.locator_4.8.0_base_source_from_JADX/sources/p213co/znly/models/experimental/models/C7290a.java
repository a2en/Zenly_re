package p213co.znly.models.experimental.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.experimental.models.a */
public enum C7290a implements EnumLite {
    NOTIFICATION_TYPE_UNKNOWN(0),
    NOTIFICATION_TYPE_NO_FRIENDS(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18102e;

    /* renamed from: co.znly.models.experimental.models.a$a */
    class C7291a implements EnumLiteMap<C7290a> {
        C7291a() {
        }

        public C7290a findValueByNumber(int i) {
            return C7290a.m17994a(i);
        }
    }

    static {
        new C7291a();
    }

    private C7290a(int i) {
        this.f18102e = i;
    }

    /* renamed from: a */
    public static C7290a m17994a(int i) {
        if (i == 0) {
            return NOTIFICATION_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return NOTIFICATION_TYPE_NO_FRIENDS;
    }

    public final int getNumber() {
        return this.f18102e;
    }
}
