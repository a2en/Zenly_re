package p213co.znly.models.services.usermonitor;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.usermonitor.d */
public enum C8320d implements EnumLite {
    NoSchedule(0),
    Late(1),
    Unreachable(2),
    Expired(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21058e;

    /* renamed from: co.znly.models.services.usermonitor.d$a */
    class C8321a implements EnumLiteMap<C8320d> {
        C8321a() {
        }

        public C8320d findValueByNumber(int i) {
            return C8320d.m19408a(i);
        }
    }

    static {
        new C8321a();
    }

    private C8320d(int i) {
        this.f21058e = i;
    }

    /* renamed from: a */
    public static C8320d m19408a(int i) {
        if (i == 0) {
            return NoSchedule;
        }
        if (i == 1) {
            return Late;
        }
        if (i == 2) {
            return Unreachable;
        }
        if (i != 3) {
            return null;
        }
        return Expired;
    }

    public final int getNumber() {
        return this.f21058e;
    }
}
