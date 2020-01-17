package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;

/* renamed from: co.znly.models.e */
public enum C7280e implements EnumLite {
    CRUD_OP_UNKNOWN(0),
    CRUD_OP_CREATE(1),
    CRUD_OP_READ(2),
    CRUD_OP_UPDATE(3),
    CRUD_OP_DELETE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f18078e;

    /* renamed from: co.znly.models.e$a */
    class C7281a implements EnumLiteMap<C7280e> {
        C7281a() {
        }

        public C7280e findValueByNumber(int i) {
            return C7280e.m17990a(i);
        }
    }

    static {
        new C7281a();
    }

    private C7280e(int i) {
        this.f18078e = i;
    }

    /* renamed from: a */
    public static C7280e m17990a(int i) {
        if (i == 0) {
            return CRUD_OP_UNKNOWN;
        }
        if (i == 1) {
            return CRUD_OP_CREATE;
        }
        if (i == 2) {
            return CRUD_OP_READ;
        }
        if (i == 3) {
            return CRUD_OP_UPDATE;
        }
        if (i != 4) {
            return null;
        }
        return CRUD_OP_DELETE;
    }

    public final int getNumber() {
        return this.f18078e;
    }
}
