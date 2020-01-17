package com.google.android.libraries.places.internal;

import java.lang.reflect.Type;

public enum zzqx {
    DOUBLE(0, zzqz.SCALAR, zzrn.DOUBLE),
    FLOAT(1, zzqz.SCALAR, zzrn.FLOAT),
    INT64(2, zzqz.SCALAR, zzrn.LONG),
    UINT64(3, zzqz.SCALAR, zzrn.LONG),
    INT32(4, zzqz.SCALAR, zzrn.INT),
    FIXED64(5, zzqz.SCALAR, zzrn.LONG),
    FIXED32(6, zzqz.SCALAR, zzrn.INT),
    BOOL(7, zzqz.SCALAR, zzrn.BOOLEAN),
    STRING(8, zzqz.SCALAR, zzrn.STRING),
    MESSAGE(9, zzqz.SCALAR, zzrn.MESSAGE),
    BYTES(10, zzqz.SCALAR, zzrn.BYTE_STRING),
    UINT32(11, zzqz.SCALAR, zzrn.INT),
    ENUM(12, zzqz.SCALAR, zzrn.ENUM),
    SFIXED32(13, zzqz.SCALAR, zzrn.INT),
    SFIXED64(14, zzqz.SCALAR, zzrn.LONG),
    SINT32(15, zzqz.SCALAR, zzrn.INT),
    SINT64(16, zzqz.SCALAR, zzrn.LONG),
    GROUP(17, zzqz.SCALAR, zzrn.MESSAGE),
    DOUBLE_LIST(18, zzqz.VECTOR, zzrn.DOUBLE),
    FLOAT_LIST(19, zzqz.VECTOR, zzrn.FLOAT),
    INT64_LIST(20, zzqz.VECTOR, zzrn.LONG),
    UINT64_LIST(21, zzqz.VECTOR, zzrn.LONG),
    INT32_LIST(22, zzqz.VECTOR, zzrn.INT),
    FIXED64_LIST(23, zzqz.VECTOR, zzrn.LONG),
    FIXED32_LIST(24, zzqz.VECTOR, zzrn.INT),
    BOOL_LIST(25, zzqz.VECTOR, zzrn.BOOLEAN),
    STRING_LIST(26, zzqz.VECTOR, zzrn.STRING),
    MESSAGE_LIST(27, zzqz.VECTOR, zzrn.MESSAGE),
    BYTES_LIST(28, zzqz.VECTOR, zzrn.BYTE_STRING),
    UINT32_LIST(29, zzqz.VECTOR, zzrn.INT),
    ENUM_LIST(30, zzqz.VECTOR, zzrn.ENUM),
    SFIXED32_LIST(31, zzqz.VECTOR, zzrn.INT),
    SFIXED64_LIST(32, zzqz.VECTOR, zzrn.LONG),
    SINT32_LIST(33, zzqz.VECTOR, zzrn.INT),
    SINT64_LIST(34, zzqz.VECTOR, zzrn.LONG),
    DOUBLE_LIST_PACKED(35, zzqz.PACKED_VECTOR, zzrn.DOUBLE),
    FLOAT_LIST_PACKED(36, zzqz.PACKED_VECTOR, zzrn.FLOAT),
    INT64_LIST_PACKED(37, zzqz.PACKED_VECTOR, zzrn.LONG),
    UINT64_LIST_PACKED(38, zzqz.PACKED_VECTOR, zzrn.LONG),
    INT32_LIST_PACKED(39, zzqz.PACKED_VECTOR, zzrn.INT),
    FIXED64_LIST_PACKED(40, zzqz.PACKED_VECTOR, zzrn.LONG),
    FIXED32_LIST_PACKED(41, zzqz.PACKED_VECTOR, zzrn.INT),
    BOOL_LIST_PACKED(42, zzqz.PACKED_VECTOR, zzrn.BOOLEAN),
    UINT32_LIST_PACKED(43, zzqz.PACKED_VECTOR, zzrn.INT),
    ENUM_LIST_PACKED(44, zzqz.PACKED_VECTOR, zzrn.ENUM),
    SFIXED32_LIST_PACKED(45, zzqz.PACKED_VECTOR, zzrn.INT),
    SFIXED64_LIST_PACKED(46, zzqz.PACKED_VECTOR, zzrn.LONG),
    SINT32_LIST_PACKED(47, zzqz.PACKED_VECTOR, zzrn.INT),
    SINT64_LIST_PACKED(48, zzqz.PACKED_VECTOR, zzrn.LONG),
    GROUP_LIST(49, zzqz.VECTOR, zzrn.MESSAGE),
    MAP(50, zzqz.MAP, zzrn.VOID);
    
    private static final zzqx[] zzbe = null;
    private static final Type[] zzbf = null;
    private final zzrn zzaz;
    private final int zzba;
    private final zzqz zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        int i;
        zzbf = new Type[0];
        zzqx[] values = values();
        zzbe = new zzqx[values.length];
        for (zzqx zzqx : values) {
            zzbe[zzqx.zzba] = zzqx;
        }
    }

    private zzqx(int i, zzqz zzqz, zzrn zzrn) {
        this.zzba = i;
        this.zzbb = zzqz;
        this.zzaz = zzrn;
        int i2 = zzra.zza[zzqz.ordinal()];
        if (i2 == 1) {
            this.zzbc = zzrn.zza();
        } else if (i2 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = zzrn.zza();
        }
        boolean z = false;
        if (zzqz == zzqz.SCALAR) {
            int i3 = zzra.zzb[zzrn.ordinal()];
            if (!(i3 == 1 || i3 == 2 || i3 == 3)) {
                z = true;
            }
        }
        this.zzbd = z;
    }

    public final int zza() {
        return this.zzba;
    }
}
