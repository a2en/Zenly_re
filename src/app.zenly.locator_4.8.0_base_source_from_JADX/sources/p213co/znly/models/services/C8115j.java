package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.j */
public enum C8115j implements EnumLite {
    JSON(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20572e;

    /* renamed from: co.znly.models.services.j$a */
    class C8116a implements EnumLiteMap<C8115j> {
        C8116a() {
        }

        public C8115j findValueByNumber(int i) {
            return C8115j.m19194a(i);
        }
    }

    static {
        new C8116a();
    }

    private C8115j(int i) {
        this.f20572e = i;
    }

    /* renamed from: a */
    public static C8115j m19194a(int i) {
        if (i != 0) {
            return null;
        }
        return JSON;
    }

    public final int getNumber() {
        return this.f20572e;
    }
}
