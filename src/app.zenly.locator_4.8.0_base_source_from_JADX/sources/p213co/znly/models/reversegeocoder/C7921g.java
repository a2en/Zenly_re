package p213co.znly.models.reversegeocoder;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.reversegeocoder.g */
public enum C7921g implements EnumLite {
    TRAVEL_MODE_WALKING(0),
    TRAVEL_MODE_BYCYCLING(1),
    TRAVEL_MODE_DRIVING(2),
    TRAVEL_MODE_TRANSIT(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20091e;

    /* renamed from: co.znly.models.reversegeocoder.g$a */
    class C7922a implements EnumLiteMap<C7921g> {
        C7922a() {
        }

        public C7921g findValueByNumber(int i) {
            return C7921g.m18962a(i);
        }
    }

    static {
        new C7922a();
    }

    private C7921g(int i) {
        this.f20091e = i;
    }

    /* renamed from: a */
    public static C7921g m18962a(int i) {
        if (i == 0) {
            return TRAVEL_MODE_WALKING;
        }
        if (i == 1) {
            return TRAVEL_MODE_BYCYCLING;
        }
        if (i == 2) {
            return TRAVEL_MODE_DRIVING;
        }
        if (i != 3) {
            return null;
        }
        return TRAVEL_MODE_TRANSIT;
    }

    public final int getNumber() {
        return this.f20091e;
    }
}
