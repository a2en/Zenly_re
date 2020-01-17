package p213co.znly.models.verify;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.verify.b */
public enum C8449b implements EnumLite {
    CAPABILITY_UNKNOWN(0),
    CAPABILITY_TEXT_MSG(1),
    CAPABILITY_VOICE_MSG(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f21450e;

    /* renamed from: co.znly.models.verify.b$a */
    class C8450a implements EnumLiteMap<C8449b> {
        C8450a() {
        }

        public C8449b findValueByNumber(int i) {
            return C8449b.m19513a(i);
        }
    }

    static {
        new C8450a();
    }

    private C8449b(int i) {
        this.f21450e = i;
    }

    /* renamed from: a */
    public static C8449b m19513a(int i) {
        if (i == 0) {
            return CAPABILITY_UNKNOWN;
        }
        if (i == 1) {
            return CAPABILITY_TEXT_MSG;
        }
        if (i != 2) {
            return null;
        }
        return CAPABILITY_VOICE_MSG;
    }

    public final int getNumber() {
        return this.f21450e;
    }
}
