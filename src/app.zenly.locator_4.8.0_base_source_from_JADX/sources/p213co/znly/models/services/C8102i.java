package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.i */
public enum C8102i implements EnumLite {
    OK(0),
    ERROR(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20544e;

    /* renamed from: co.znly.models.services.i$a */
    class C8103a implements EnumLiteMap<C8102i> {
        C8103a() {
        }

        public C8102i findValueByNumber(int i) {
            return C8102i.m19184a(i);
        }
    }

    static {
        new C8103a();
    }

    private C8102i(int i) {
        this.f20544e = i;
    }

    /* renamed from: a */
    public static C8102i m19184a(int i) {
        if (i == 0) {
            return OK;
        }
        if (i != 1) {
            return null;
        }
        return ERROR;
    }

    public final int getNumber() {
        return this.f20544e;
    }
}
