package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzqw<T extends zzqy<T>> {
    private static final zzqw zzd = new zzqw(true);
    final zzte<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzqw() {
        this.zza = zzte.zza(16);
    }

    public static <T extends zzqy<T>> zzqw<T> zza() {
        return zzd;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzqw zzqw = new zzqw();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Entry zzb2 = this.zza.zzb(i);
            zzqw.zzb((T) (zzqy) zzb2.getKey(), zzb2.getValue());
        }
        for (Entry entry : this.zza.zzd()) {
            zzqw.zzb((T) (zzqy) entry.getKey(), entry.getValue());
        }
        zzqw.zzc = this.zzc;
        return zzqw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqw)) {
            return false;
        }
        return this.zza.equals(((zzqw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzb) {
            this.zza.zza();
            this.zzb = true;
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final Iterator<Entry<T, Object>> zzd() {
        if (this.zzc) {
            return new zzrr(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<Entry<T, Object>> zze() {
        if (this.zzc) {
            return new zzrr(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza(this.zza.zzb(i))) {
                return false;
            }
        }
        for (Entry zza2 : this.zza.zzd()) {
            if (!zza(zza2)) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Entry zzc2 : this.zza.zzd()) {
            i += zzc(zzc2);
        }
        return i;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        return obj instanceof zzrq ? zzrq.zza() : obj;
    }

    private static int zzc(Entry<T, Object> entry) {
        zzqy zzqy = (zzqy) entry.getKey();
        Object value = entry.getValue();
        if (zzqy.zzc() != zzum.MESSAGE || zzqy.zzd() || zzqy.zze()) {
            return zza(zzqy, value);
        }
        if (value instanceof zzrq) {
            return zzqn.zzb(((zzqy) entry.getKey()).zza(), (zzru) (zzrq) value);
        }
        return zzqn.zzb(((zzqy) entry.getKey()).zza(), (zzsm) value);
    }

    private zzqw(boolean z) {
        this(zzte.zza(0));
        zzb();
    }

    private final void zzb(T t, Object obj) {
        if (!t.zzd()) {
            zza(t.zzb(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zza(t.zzb(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof zzrq) {
            this.zzc = true;
        }
        this.zza.put(t, r6);
    }

    private zzqw(zzte<T, Object> zzte) {
        this.zza = zzte;
        zzb();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.libraries.places.internal.zzrg) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.libraries.places.internal.zzrq) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.libraries.places.internal.zzuf r2, java.lang.Object r3) {
        /*
            com.google.android.libraries.places.internal.zzrd.zza(r3)
            int[] r0 = com.google.android.libraries.places.internal.zzqv.zza
            com.google.android.libraries.places.internal.zzum r2 = r2.zza()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzsm
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzrq
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzrg
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.libraries.places.internal.zzqa
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqw.zza(com.google.android.libraries.places.internal.zzuf, java.lang.Object):void");
    }

    private final void zzb(Entry<T, Object> entry) {
        Object obj;
        zzqy zzqy = (zzqy) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzrq) {
            value = zzrq.zza();
        }
        if (zzqy.zzd()) {
            Object zza2 = zza((T) zzqy);
            if (zza2 == null) {
                zza2 = new ArrayList();
            }
            for (Object zza3 : (List) value) {
                ((List) zza2).add(zza(zza3));
            }
            this.zza.put(zzqy, zza2);
        } else if (zzqy.zzc() == zzum.MESSAGE) {
            Object zza4 = zza((T) zzqy);
            if (zza4 == null) {
                this.zza.put(zzqy, zza(value));
                return;
            }
            if (zza4 instanceof zzss) {
                obj = zzqy.zza((zzss) zza4, (zzss) value);
            } else {
                obj = zzqy.zza(((zzsm) zza4).zzl(), (zzsm) value).zzf();
            }
            this.zza.put(zzqy, obj);
        } else {
            this.zza.put(zzqy, zza(value));
        }
    }

    private static <T extends zzqy<T>> boolean zza(Entry<T, Object> entry) {
        zzqy zzqy = (zzqy) entry.getKey();
        if (zzqy.zzc() == zzum.MESSAGE) {
            if (zzqy.zzd()) {
                for (zzsm zzg : (List) entry.getValue()) {
                    if (!zzg.zzg()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzsm) {
                    if (!((zzsm) value).zzg()) {
                        return false;
                    }
                } else if (value instanceof zzrq) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzqw<T> zzqw) {
        for (int i = 0; i < zzqw.zza.zzc(); i++) {
            zzb(zzqw.zza.zzb(i));
        }
        for (Entry zzb2 : zzqw.zza.zzd()) {
            zzb(zzb2);
        }
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzss) {
            return ((zzss) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int zzb(zzuf zzuf, Object obj) {
        switch (zzqv.zzb[zzuf.ordinal()]) {
            case 1:
                return zzqn.zzb(((Double) obj).doubleValue());
            case 2:
                return zzqn.zzb(((Float) obj).floatValue());
            case 3:
                return zzqn.zzd(((Long) obj).longValue());
            case 4:
                return zzqn.zze(((Long) obj).longValue());
            case 5:
                return zzqn.zzf(((Integer) obj).intValue());
            case 6:
                return zzqn.zzg(((Long) obj).longValue());
            case 7:
                return zzqn.zzi(((Integer) obj).intValue());
            case 8:
                return zzqn.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzqn.zzc((zzsm) obj);
            case 10:
                if (obj instanceof zzrq) {
                    return zzqn.zza((zzru) (zzrq) obj);
                }
                return zzqn.zzb((zzsm) obj);
            case 11:
                if (obj instanceof zzqa) {
                    return zzqn.zzb((zzqa) obj);
                }
                return zzqn.zzb((String) obj);
            case 12:
                if (obj instanceof zzqa) {
                    return zzqn.zzb((zzqa) obj);
                }
                return zzqn.zzb((byte[]) obj);
            case 13:
                return zzqn.zzg(((Integer) obj).intValue());
            case 14:
                return zzqn.zzj(((Integer) obj).intValue());
            case 15:
                return zzqn.zzh(((Long) obj).longValue());
            case 16:
                return zzqn.zzh(((Integer) obj).intValue());
            case 17:
                return zzqn.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzrg) {
                    return zzqn.zzk(((zzrg) obj).zza());
                }
                return zzqn.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static void zza(zzqn zzqn, zzuf zzuf, int i, Object obj) throws IOException {
        if (zzuf == zzuf.GROUP) {
            zzsm zzsm = (zzsm) obj;
            zzrd.zza(zzsm);
            zzqn.zza(i, 3);
            zzsm.zza(zzqn);
            zzqn.zza(i, 4);
            return;
        }
        zzqn.zza(i, zzuf.zzb());
        switch (zzqv.zzb[zzuf.ordinal()]) {
            case 1:
                zzqn.zza(((Double) obj).doubleValue());
                break;
            case 2:
                zzqn.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzqn.zza(((Long) obj).longValue());
                return;
            case 4:
                zzqn.zza(((Long) obj).longValue());
                return;
            case 5:
                zzqn.zza(((Integer) obj).intValue());
                return;
            case 6:
                zzqn.zzc(((Long) obj).longValue());
                return;
            case 7:
                zzqn.zzd(((Integer) obj).intValue());
                return;
            case 8:
                zzqn.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzsm) obj).zza(zzqn);
                return;
            case 10:
                zzqn.zza((zzsm) obj);
                return;
            case 11:
                if (obj instanceof zzqa) {
                    zzqn.zza((zzqa) obj);
                    return;
                } else {
                    zzqn.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzqa) {
                    zzqn.zza((zzqa) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzqn.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzqn.zzb(((Integer) obj).intValue());
                return;
            case 14:
                zzqn.zzd(((Integer) obj).intValue());
                return;
            case 15:
                zzqn.zzc(((Long) obj).longValue());
                return;
            case 16:
                zzqn.zzc(((Integer) obj).intValue());
                return;
            case 17:
                zzqn.zzb(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof zzrg)) {
                    zzqn.zza(((Integer) obj).intValue());
                    break;
                } else {
                    zzqn.zza(((zzrg) obj).zza());
                    return;
                }
        }
    }

    static int zza(zzuf zzuf, int i, Object obj) {
        int zze = zzqn.zze(i);
        if (zzuf == zzuf.GROUP) {
            zzrd.zza((zzsm) obj);
            zze <<= 1;
        }
        return zze + zzb(zzuf, obj);
    }

    public static int zza(zzqy<?> zzqy, Object obj) {
        zzuf zzb2 = zzqy.zzb();
        int zza2 = zzqy.zza();
        if (!zzqy.zzd()) {
            return zza(zzb2, zza2, obj);
        }
        int i = 0;
        if (zzqy.zze()) {
            for (Object zzb3 : (List) obj) {
                i += zzb(zzb2, zzb3);
            }
            return zzqn.zze(zza2) + i + zzqn.zzl(i);
        }
        for (Object zza3 : (List) obj) {
            i += zza(zzb2, zza2, zza3);
        }
        return i;
    }
}
