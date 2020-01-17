package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb.zzc;
import java.io.IOException;
import java.util.Arrays;

public final class zztu {
    private static final zztu zza = new zztu(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zztu() {
        this(0, new int[8], new Object[8], true);
    }

    public static zztu zza() {
        return zza;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zztu)) {
            return false;
        }
        zztu zztu = (zztu) obj;
        int i = this.zzb;
        if (i == zztu.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zztu.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zztu.zzd;
                int i3 = this.zzb;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }

    public final void zzb() {
        this.zzf = false;
    }

    public final int zzc() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzqn.zzd(this.zzc[i3] >>> 3, (zzqa) this.zzd[i3]);
        }
        this.zze = i2;
        return i2;
    }

    public final int zzd() {
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzqn.zze(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 1) {
                i = zzqn.zzg(i6, ((Long) this.zzd[i4]).longValue());
            } else if (i7 == 2) {
                i = zzqn.zzc(i6, (zzqa) this.zzd[i4]);
            } else if (i7 == 3) {
                i = (zzqn.zze(i6) << 1) + ((zztu) this.zzd[i4]).zzd();
            } else if (i7 == 5) {
                i = zzqn.zzi(i6, ((Integer) this.zzd[i4]).intValue());
            } else {
                throw new IllegalStateException(zzrl.zza());
            }
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    private zztu(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    static zztu zza(zztu zztu, zztu zztu2) {
        int i = zztu.zzb + zztu2.zzb;
        int[] copyOf = Arrays.copyOf(zztu.zzc, i);
        System.arraycopy(zztu2.zzc, 0, copyOf, zztu.zzb, zztu2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zztu.zzd, i);
        System.arraycopy(zztu2.zzd, 0, copyOf2, zztu.zzb, zztu2.zzb);
        return new zztu(i, copyOf, copyOf2, true);
    }

    public final void zzb(zzul zzul) throws IOException {
        if (this.zzb != 0) {
            if (zzul.zza() == zzc.zzj) {
                for (int i = 0; i < this.zzb; i++) {
                    zza(this.zzc[i], this.zzd[i], zzul);
                }
                return;
            }
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zza(this.zzc[i2], this.zzd[i2], zzul);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void zza(zzul zzul) throws IOException {
        if (zzul.zza() == zzc.zzk) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzul.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzul.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    private static void zza(int i, Object obj, zzul zzul) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzul.zza(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzul.zzd(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzul.zza(i2, (zzqa) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzul.zzd(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzrl.zza());
        } else if (zzul.zza() == zzc.zzj) {
            zzul.zza(i2);
            ((zztu) obj).zzb(zzul);
            zzul.zzb(i2);
        } else {
            zzul.zzb(i2);
            ((zztu) obj).zzb(zzul);
            zzul.zza(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzsn.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }
}
