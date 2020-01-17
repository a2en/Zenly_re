package com.google.android.libraries.places.internal;

public enum zzuf {
    DOUBLE(zzum.DOUBLE, 1),
    FLOAT(zzum.FLOAT, 5),
    INT64(zzum.LONG, 0),
    UINT64(zzum.LONG, 0),
    INT32(zzum.INT, 0),
    FIXED64(zzum.LONG, 1),
    FIXED32(zzum.INT, 5),
    BOOL(zzum.BOOLEAN, 0),
    STRING(zzum.STRING, 2),
    GROUP(zzum.MESSAGE, 3),
    MESSAGE(zzum.MESSAGE, 2),
    BYTES(zzum.BYTE_STRING, 2),
    UINT32(zzum.INT, 0),
    ENUM(zzum.ENUM, 0),
    SFIXED32(zzum.INT, 5),
    SFIXED64(zzum.LONG, 1),
    SINT32(zzum.INT, 0),
    SINT64(zzum.LONG, 0);
    
    private final zzum zzs;
    private final int zzt;

    private zzuf(zzum zzum, int i) {
        this.zzs = zzum;
        this.zzt = i;
    }

    public final zzum zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
