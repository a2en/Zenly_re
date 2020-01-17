package p213co.znly.models.reversegeocoder;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.reversegeocoder.f */
public enum C7919f implements EnumLite {
    Default(0),
    Mapbox(1),
    TomTom(2),
    Pelorus(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20084e;

    /* renamed from: co.znly.models.reversegeocoder.f$a */
    class C7920a implements EnumLiteMap<C7919f> {
        C7920a() {
        }

        public C7919f findValueByNumber(int i) {
            return C7919f.m18961a(i);
        }
    }

    static {
        new C7920a();
    }

    private C7919f(int i) {
        this.f20084e = i;
    }

    /* renamed from: a */
    public static C7919f m18961a(int i) {
        if (i == 0) {
            return Default;
        }
        if (i == 1) {
            return Mapbox;
        }
        if (i == 2) {
            return TomTom;
        }
        if (i != 3) {
            return null;
        }
        return Pelorus;
    }

    public final int getNumber() {
        return this.f20084e;
    }
}
