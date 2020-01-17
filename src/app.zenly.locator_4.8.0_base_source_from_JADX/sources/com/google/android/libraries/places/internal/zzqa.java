package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzqa implements Serializable, Iterable<Byte> {
    public static final zzqa zza = new zzqk(zzrd.zzb);
    private static final zzqg zzb = (zzpy.zza() ? new zzqj(null) : new zzqe(null));
    private static final Comparator<zzqa> zzd = new zzqc();
    private int zzc = 0;

    zzqa() {
    }

    public static zzqa zza(String str) {
        return new zzqk(str.getBytes(zzrd.zza));
    }

    /* access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    static zzqi zzc(int i) {
        return new zzqi(i, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zza2 = zza();
            i = zza(zza2, 0, zza2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzpz(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza())});
    }

    public abstract byte zza(int i);

    public abstract int zza();

    /* access modifiers changed from: protected */
    public abstract int zza(int i, int i2, int i3);

    public abstract zzqa zza(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: 0000 */
    public abstract void zza(zzpx zzpx) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract byte zzb(int i);

    public final String zzb() {
        return zza() == 0 ? "" : zza(zzrd.zza);
    }

    public abstract boolean zzc();

    /* access modifiers changed from: protected */
    public final int zzd() {
        return this.zzc;
    }

    static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
