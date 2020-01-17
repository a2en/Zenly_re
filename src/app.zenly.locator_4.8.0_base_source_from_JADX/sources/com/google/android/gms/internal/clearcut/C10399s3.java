package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.s3 */
public enum C10399s3 {
    DOUBLE(C10429x3.DOUBLE, 1),
    FLOAT(C10429x3.FLOAT, 5),
    INT64(C10429x3.LONG, 0),
    UINT64(C10429x3.LONG, 0),
    INT32(C10429x3.INT, 0),
    FIXED64(C10429x3.LONG, 1),
    FIXED32(C10429x3.INT, 5),
    BOOL(C10429x3.BOOLEAN, 0),
    STRING(C10429x3.STRING, 2),
    GROUP(C10429x3.MESSAGE, 3),
    MESSAGE(C10429x3.MESSAGE, 2),
    BYTES(C10429x3.BYTE_STRING, 2),
    UINT32(C10429x3.INT, 0),
    ENUM(C10429x3.ENUM, 0),
    SFIXED32(C10429x3.INT, 5),
    SFIXED64(C10429x3.LONG, 1),
    SINT32(C10429x3.INT, 0),
    SINT64(C10429x3.LONG, 0);
    

    /* renamed from: e */
    private final C10429x3 f27203e;

    /* renamed from: f */
    private final int f27204f;

    private C10399s3(C10429x3 x3Var, int i) {
        this.f27203e = x3Var;
        this.f27204f = i;
    }

    /* renamed from: a */
    public final C10429x3 mo28124a() {
        return this.f27203e;
    }
}
