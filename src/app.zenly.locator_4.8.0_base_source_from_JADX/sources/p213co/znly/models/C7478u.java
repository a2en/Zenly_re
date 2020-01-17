package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.u */
public enum C7478u implements EnumLite {
    unknown(0),
    offline(1),
    online(2),
    online_cellular(3),
    online_wifi(4),
    restricted(5),
    unreachable(6),
    battery_off(7),
    uninstalled(8),
    inactive(9),
    deleted(10),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18770e;

    /* renamed from: co.znly.models.u$a */
    class C7479a implements EnumLiteMap<C7478u> {
        C7479a() {
        }

        public C7478u findValueByNumber(int i) {
            return C7478u.m18111a(i);
        }
    }

    static {
        new C7479a();
    }

    private C7478u(int i) {
        this.f18770e = i;
    }

    /* renamed from: a */
    public static C7478u m18111a(int i) {
        switch (i) {
            case 0:
                return unknown;
            case 1:
                return offline;
            case 2:
                return online;
            case 3:
                return online_cellular;
            case 4:
                return online_wifi;
            case 5:
                return restricted;
            case 6:
                return unreachable;
            case 7:
                return battery_off;
            case 8:
                return uninstalled;
            case 9:
                return inactive;
            case 10:
                return deleted;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f18770e;
    }
}
