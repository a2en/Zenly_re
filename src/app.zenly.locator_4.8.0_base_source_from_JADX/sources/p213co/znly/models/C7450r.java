package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.r */
public enum C7450r implements EnumLite {
    none(0),
    authorized(1),
    denied(2),
    while_in_use(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18644e;

    /* renamed from: co.znly.models.r$a */
    class C7451a implements EnumLiteMap<C7450r> {
        C7451a() {
        }

        public C7450r findValueByNumber(int i) {
            return C7450r.m18099a(i);
        }
    }

    static {
        new C7451a();
    }

    private C7450r(int i) {
        this.f18644e = i;
    }

    /* renamed from: a */
    public static C7450r m18099a(int i) {
        if (i == 0) {
            return none;
        }
        if (i == 1) {
            return authorized;
        }
        if (i == 2) {
            return denied;
        }
        if (i != 3) {
            return null;
        }
        return while_in_use;
    }

    public final int getNumber() {
        return this.f18644e;
    }
}
