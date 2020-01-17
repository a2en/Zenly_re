package p213co.znly.models.services.usermonitor;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.usermonitor.e */
public enum C8322e implements EnumLite {
    EventTriggered(0),
    EventExpired(1),
    Unfriended(2),
    Ghosted(3),
    NotHeading(4),
    HeadingChanged(5),
    NoNetwork(7),
    NoBattery(8),
    ComeBackOnline(9),
    UserLate(10),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21071e;

    /* renamed from: co.znly.models.services.usermonitor.e$a */
    class C8323a implements EnumLiteMap<C8322e> {
        C8323a() {
        }

        public C8322e findValueByNumber(int i) {
            return C8322e.m19409a(i);
        }
    }

    static {
        new C8323a();
    }

    private C8322e(int i) {
        this.f21071e = i;
    }

    /* renamed from: a */
    public static C8322e m19409a(int i) {
        switch (i) {
            case 0:
                return EventTriggered;
            case 1:
                return EventExpired;
            case 2:
                return Unfriended;
            case 3:
                return Ghosted;
            case 4:
                return NotHeading;
            case 5:
                return HeadingChanged;
            case 7:
                return NoNetwork;
            case 8:
                return NoBattery;
            case 9:
                return ComeBackOnline;
            case 10:
                return UserLate;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f21071e;
    }
}
