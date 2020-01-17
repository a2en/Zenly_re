package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.v */
public enum C7486v implements EnumLite {
    dt_none(0),
    ios(1),
    android(2),
    bot(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18806e;

    /* renamed from: co.znly.models.v$a */
    class C7487a implements EnumLiteMap<C7486v> {
        C7487a() {
        }

        public C7486v findValueByNumber(int i) {
            return C7486v.m18115a(i);
        }
    }

    static {
        new C7487a();
    }

    private C7486v(int i) {
        this.f18806e = i;
    }

    /* renamed from: a */
    public static C7486v m18115a(int i) {
        if (i == 0) {
            return dt_none;
        }
        if (i == 1) {
            return ios;
        }
        if (i == 2) {
            return android;
        }
        if (i != 3) {
            return null;
        }
        return bot;
    }

    public final int getNumber() {
        return this.f18806e;
    }
}
