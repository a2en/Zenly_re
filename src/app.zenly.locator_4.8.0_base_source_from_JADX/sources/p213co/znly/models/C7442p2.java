package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.p2 */
public enum C7442p2 implements EnumLite {
    Type_UNKNOWN(0),
    Type_WIFI_ON(1),
    Type_BACK_ONLINE(2),
    Type_WATCHER(3),
    Type_PRECISE(4),
    Type_ALWAYS_ON_LOCATION(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18620e;

    /* renamed from: co.znly.models.p2$a */
    class C7443a implements EnumLiteMap<C7442p2> {
        C7443a() {
        }

        public C7442p2 findValueByNumber(int i) {
            return C7442p2.m18096a(i);
        }
    }

    static {
        new C7443a();
    }

    private C7442p2(int i) {
        this.f18620e = i;
    }

    /* renamed from: a */
    public static C7442p2 m18096a(int i) {
        if (i == 0) {
            return Type_UNKNOWN;
        }
        if (i == 1) {
            return Type_WIFI_ON;
        }
        if (i == 2) {
            return Type_BACK_ONLINE;
        }
        if (i == 3) {
            return Type_WATCHER;
        }
        if (i == 4) {
            return Type_PRECISE;
        }
        if (i != 5) {
            return null;
        }
        return Type_ALWAYS_ON_LOCATION;
    }

    public final int getNumber() {
        return this.f18620e;
    }
}
