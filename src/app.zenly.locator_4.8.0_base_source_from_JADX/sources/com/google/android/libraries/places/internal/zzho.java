package com.google.android.libraries.places.internal;

import java.io.IOException;

public abstract class zzho {
    private static final zzho zza;
    private static final zzho zzb;
    private static final zzho zzc;
    private static final zzho zzd;
    private static final zzho zze = new zzhq("base16()", "0123456789ABCDEF");

    static {
        Character valueOf = Character.valueOf('=');
        zza = new zzhp("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzhp("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        zzc = new zzhs("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        zzd = new zzhs("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
    }

    zzho() {
    }

    /* access modifiers changed from: 0000 */
    public abstract int zza(int i);

    public final String zza(byte[] bArr, int i, int i2) {
        zzgg.zza(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zza(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public static zzho zza() {
        return zze;
    }
}
