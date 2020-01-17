package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.f3 */
public enum C7302f3 implements EnumLite {
    NotificationUnknown(0),
    NotificationCountryChange(1),
    NotificationContactJoined(2),
    NotificationPublicShare(4),
    NotificationProfilePic(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18130e;

    /* renamed from: co.znly.models.f3$a */
    class C7303a implements EnumLiteMap<C7302f3> {
        C7303a() {
        }

        public C7302f3 findValueByNumber(int i) {
            return C7302f3.m18001a(i);
        }
    }

    static {
        new C7303a();
    }

    private C7302f3(int i) {
        this.f18130e = i;
    }

    /* renamed from: a */
    public static C7302f3 m18001a(int i) {
        if (i == 0) {
            return NotificationUnknown;
        }
        if (i == 1) {
            return NotificationCountryChange;
        }
        if (i == 2) {
            return NotificationContactJoined;
        }
        if (i == 4) {
            return NotificationPublicShare;
        }
        if (i != 8) {
            return null;
        }
        return NotificationProfilePic;
    }

    public final int getNumber() {
        return this.f18130e;
    }
}
