package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.services.c0 */
public enum C8006c0 implements EnumLite {
    ZendeskGetCategoriesErrors_SUCCESS(0),
    ZendeskGetCategoriesErrors_CANNOT_TRANSLATE(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f20321e;

    /* renamed from: co.znly.models.services.c0$a */
    class C8007a implements EnumLiteMap<C8006c0> {
        C8007a() {
        }

        public C8006c0 findValueByNumber(int i) {
            return C8006c0.m19063a(i);
        }
    }

    static {
        new C8007a();
    }

    private C8006c0(int i) {
        this.f20321e = i;
    }

    /* renamed from: a */
    public static C8006c0 m19063a(int i) {
        if (i == 0) {
            return ZendeskGetCategoriesErrors_SUCCESS;
        }
        if (i != 1) {
            return null;
        }
        return ZendeskGetCategoriesErrors_CANNOT_TRANSLATE;
    }

    public final int getNumber() {
        return this.f20321e;
    }
}
