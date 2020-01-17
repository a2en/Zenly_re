package com.google.android.libraries.places.internal;

final class zzst {
    private static final zzsr zza = zzc();
    private static final zzsr zzb = new zzsu();

    static zzsr zza() {
        return zza;
    }

    static zzsr zzb() {
        return zzb;
    }

    private static zzsr zzc() {
        try {
            return (zzsr) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
