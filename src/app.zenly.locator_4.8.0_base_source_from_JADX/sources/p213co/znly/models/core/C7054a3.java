package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.core.a3 */
public enum C7054a3 implements EnumLite {
    UPLOAD_STATUS_UNKNOWN(0),
    UPLOAD_STATUS_RUNNING(1),
    UPLOAD_STATUS_FAILURE(2),
    UPLOAD_STATUS_SUCCESS(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f17451e;

    /* renamed from: co.znly.models.core.a3$a */
    class C7055a implements EnumLiteMap<C7054a3> {
        C7055a() {
        }

        public C7054a3 findValueByNumber(int i) {
            return C7054a3.m17760a(i);
        }
    }

    static {
        new C7055a();
    }

    private C7054a3(int i) {
        this.f17451e = i;
    }

    /* renamed from: a */
    public static C7054a3 m17760a(int i) {
        if (i == 0) {
            return UPLOAD_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return UPLOAD_STATUS_RUNNING;
        }
        if (i == 2) {
            return UPLOAD_STATUS_FAILURE;
        }
        if (i != 3) {
            return null;
        }
        return UPLOAD_STATUS_SUCCESS;
    }

    public final int getNumber() {
        return this.f17451e;
    }
}
