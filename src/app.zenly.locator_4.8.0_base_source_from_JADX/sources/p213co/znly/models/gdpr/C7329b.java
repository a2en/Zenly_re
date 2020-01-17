package p213co.znly.models.gdpr;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.gdpr.b */
public enum C7329b implements EnumLite {
    NOFILTER(0),
    OBFUSCATE_STRING(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18215e;

    /* renamed from: co.znly.models.gdpr.b$a */
    class C7330a implements EnumLiteMap<C7329b> {
        C7330a() {
        }

        public C7329b findValueByNumber(int i) {
            return C7329b.m18011a(i);
        }
    }

    static {
        new C7330a();
    }

    private C7329b(int i) {
        this.f18215e = i;
    }

    /* renamed from: a */
    public static C7329b m18011a(int i) {
        if (i == 0) {
            return NOFILTER;
        }
        if (i != 1) {
            return null;
        }
        return OBFUSCATE_STRING;
    }

    public final int getNumber() {
        return this.f18215e;
    }
}
