package p213co.znly.models.services.usermonitor;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.usermonitor.b */
public enum C8316b implements EnumLite {
    Unknown(0),
    OnEnterGeofence(1),
    OnExitGeofence(2),
    OnWakeUp(3),
    OnComingBackOnline(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21031e;

    /* renamed from: co.znly.models.services.usermonitor.b$a */
    class C8317a implements EnumLiteMap<C8316b> {
        C8317a() {
        }

        public C8316b findValueByNumber(int i) {
            return C8316b.m19407a(i);
        }
    }

    static {
        new C8317a();
    }

    private C8316b(int i) {
        this.f21031e = i;
    }

    /* renamed from: a */
    public static C8316b m19407a(int i) {
        if (i == 0) {
            return Unknown;
        }
        if (i == 1) {
            return OnEnterGeofence;
        }
        if (i == 2) {
            return OnExitGeofence;
        }
        if (i == 3) {
            return OnWakeUp;
        }
        if (i != 4) {
            return null;
        }
        return OnComingBackOnline;
    }

    public final int getNumber() {
        return this.f21031e;
    }
}
