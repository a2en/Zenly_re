package com.google.android.libraries.places.internal;

final class zzsh {
    private static final zzsf zza = zzc();
    private static final zzsf zzb = new zzsi();

    static zzsf zza() {
        return zza;
    }

    static zzsf zzb() {
        return zzb;
    }

    private static zzsf zzc() {
        try {
            return (zzsf) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
