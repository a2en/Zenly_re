package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

final class zztb {
    private static final Class<?> zza = zzd();
    private static final zztr<?, ?> zzb = zza(false);
    private static final zztr<?, ?> zzc = zza(true);
    private static final zztr<?, ?> zzd = new zztt();

    public static void zza(Class<?> cls) {
        if (!zzrb.class.isAssignableFrom(cls)) {
            Class<?> cls2 = zza;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void zzb(int i, List<Float> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzi(i, list, z);
        }
    }

    public static void zzb(int i, List<zzqa> list, zzul zzul) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzb(i, list);
        }
    }

    static int zzc(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzrz) {
            zzrz zzrz = (zzrz) list;
            i = 0;
            while (i2 < size) {
                i += zzqn.zzf(zzrz.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzqn.zzf(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzd(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzre) {
            zzre zzre = (zzre) list;
            i = 0;
            while (i2 < size) {
                i += zzqn.zzk(zzre.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzqn.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzre) {
            zzre zzre = (zzre) list;
            i = 0;
            while (i2 < size) {
                i += zzqn.zzf(zzre.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzqn.zzf(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzre) {
            zzre zzre = (zzre) list;
            i = 0;
            while (i2 < size) {
                i += zzqn.zzg(zzre.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzqn.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzre) {
            zzre zzre = (zzre) list;
            i = 0;
            while (i2 < size) {
                i += zzqn.zzh(zzre.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzqn.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzh(List<?> list) {
        return list.size() << 2;
    }

    static int zzi(List<?> list) {
        return list.size() << 3;
    }

    static int zzj(List<?> list) {
        return list.size();
    }

    public static void zza(int i, List<Double> list, zzul zzul, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzg(i, list, z);
        }
    }

    static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqn.zzi(i, 0);
    }

    static int zzi(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqn.zzg(i, 0);
    }

    static int zzj(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzqn.zzb(i, true);
    }

    public static void zzb(int i, List<?> list, zzul zzul, zzsz zzsz) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zzb(i, list, zzsz);
        }
    }

    public static void zza(int i, List<String> list, zzul zzul) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zza(i, list);
        }
    }

    static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzrz) {
            zzrz zzrz = (zzrz) list;
            i = 0;
            while (i2 < size) {
                i += zzqn.zze(zzrz.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzqn.zze(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void zza(int i, List<?> list, zzul zzul, zzsz zzsz) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzul.zza(i, list, zzsz);
        }
    }

    static int zzc(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzqn.zze(i));
    }

    static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzqn.zze(i));
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzqn.zze(i));
    }

    static int zzf(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzqn.zze(i));
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzqn.zze(i));
    }

    static int zza(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzrz) {
            zzrz zzrz = (zzrz) list;
            i = 0;
            while (i2 < size) {
                i += zzqn.zzd(zzrz.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzqn.zzd(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zztr<?, ?> zzc() {
        return zzd;
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int zzb(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzqn.zze(i));
    }

    static int zza(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzqn.zze(i));
    }

    static int zzb(int i, List<zzqa> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzqn.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzqn.zzb((zzqa) list.get(i2));
        }
        return zze;
    }

    static int zza(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzqn.zze(i) * size;
        if (list instanceof zzrw) {
            zzrw zzrw = (zzrw) list;
            while (i4 < size) {
                Object zza2 = zzrw.zza(i4);
                if (zza2 instanceof zzqa) {
                    i3 = zzqn.zzb((zzqa) zza2);
                } else {
                    i3 = zzqn.zzb((String) zza2);
                }
                zze += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzqa) {
                    i2 = zzqn.zzb((zzqa) obj);
                } else {
                    i2 = zzqn.zzb((String) obj);
                }
                zze += i2;
                i4++;
            }
        }
        return zze;
    }

    static int zzb(int i, List<zzsm> list, zzsz zzsz) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzqn.zzc(i, (zzsm) list.get(i3), zzsz);
        }
        return i2;
    }

    public static zztr<?, ?> zzb() {
        return zzc;
    }

    static int zza(int i, Object obj, zzsz zzsz) {
        if (obj instanceof zzru) {
            return zzqn.zza(i, (zzru) obj);
        }
        return zzqn.zzb(i, (zzsm) obj, zzsz);
    }

    static int zza(int i, List<?> list, zzsz zzsz) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzqn.zze(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzru) {
                i2 = zzqn.zza((zzru) obj);
            } else {
                i2 = zzqn.zza((zzsm) obj, zzsz);
            }
            zze += i2;
        }
        return zze;
    }

    public static zztr<?, ?> zza() {
        return zzb;
    }

    private static zztr<?, ?> zza(boolean z) {
        try {
            Class zze = zze();
            if (zze == null) {
                return null;
            }
            return (zztr) zze.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zza(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void zza(zzsf zzsf, T t, T t2, long j) {
        zztx.zza((Object) t, j, zzsf.zza(zztx.zzf(t, j), zztx.zzf(t2, j)));
    }

    static <T, FT extends zzqy<FT>> void zza(zzqr<FT> zzqr, T t, T t2) {
        zzqw zza2 = zzqr.zza((Object) t2);
        if (!zza2.zza.isEmpty()) {
            zzqr.zzb(t).zza(zza2);
        }
    }

    static <T, UT, UB> void zza(zztr<UT, UB> zztr, T t, T t2) {
        zztr.zza((Object) t, zztr.zzb(zztr.zza(t), zztr.zza(t2)));
    }
}
