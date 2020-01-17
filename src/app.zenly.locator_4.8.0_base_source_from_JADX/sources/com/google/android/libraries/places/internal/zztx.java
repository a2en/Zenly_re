package com.google.android.libraries.places.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zztx {
    static final boolean zza = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);
    private static final Logger zzb = Logger.getLogger(zztx.class.getName());
    private static final Unsafe zzc = zzc();
    private static final Class<?> zzd = zzpy.zzb();
    private static final boolean zze = zzd(Long.TYPE);
    private static final boolean zzf = zzd(Integer.TYPE);
    private static final zzd zzg;
    private static final boolean zzh = zze();
    private static final boolean zzi = zzd();
    private static final long zzj = ((long) zzb(byte[].class));
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final long zzw;
    private static final int zzx = ((int) (zzj & 7));

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            if (zztx.zza) {
                return zztx.zzk(obj, j);
            }
            return zztx.zzl(obj, j);
        }

        public final boolean zzb(Object obj, long j) {
            if (zztx.zza) {
                return zztx.zzm(obj, j);
            }
            return zztx.zzn(obj, j);
        }

        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        public final void zza(Object obj, long j, byte b) {
            if (zztx.zza) {
                zztx.zzc(obj, j, b);
            } else {
                zztx.zzd(obj, j, b);
            }
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zztx.zza) {
                zztx.zzd(obj, j, z);
            } else {
                zztx.zze(obj, j, z);
            }
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            return this.zza.getByte(obj, j);
        }

        public final boolean zzb(Object obj, long j) {
            return this.zza.getBoolean(obj, j);
        }

        public final float zzc(Object obj, long j) {
            return this.zza.getFloat(obj, j);
        }

        public final double zzd(Object obj, long j) {
            return this.zza.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, byte b) {
            this.zza.putByte(obj, j, b);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zza.putBoolean(obj, j, z);
        }

        public final void zza(Object obj, long j, float f) {
            this.zza.putFloat(obj, j, f);
        }

        public final void zza(Object obj, long j, double d) {
            this.zza.putDouble(obj, j, d);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            if (zztx.zza) {
                return zztx.zzk(obj, j);
            }
            return zztx.zzl(obj, j);
        }

        public final boolean zzb(Object obj, long j) {
            if (zztx.zza) {
                return zztx.zzm(obj, j);
            }
            return zztx.zzn(obj, j);
        }

        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        public final void zza(Object obj, long j, byte b) {
            if (zztx.zza) {
                zztx.zzc(obj, j, b);
            } else {
                zztx.zzd(obj, j, b);
            }
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zztx.zza) {
                zztx.zzd(obj, j, z);
            } else {
                zztx.zze(obj, j, z);
            }
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static abstract class zzd {
        Unsafe zza;

        zzd(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract byte zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public final void zza(Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public abstract void zza(Object obj, long j, boolean z);

        public abstract boolean zzb(Object obj, long j);

        public abstract float zzc(Object obj, long j);

        public abstract double zzd(Object obj, long j);

        public final int zze(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final long zzf(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f2  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<com.google.android.libraries.places.internal.zztx> r6 = com.google.android.libraries.places.internal.zztx.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            zzb = r6
            sun.misc.Unsafe r6 = zzc()
            zzc = r6
            java.lang.Class r6 = com.google.android.libraries.places.internal.zzpy.zzb()
            zzd = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = zzd(r6)
            zze = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = zzd(r6)
            zzf = r6
            sun.misc.Unsafe r6 = zzc
            r7 = 0
            if (r6 != 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            boolean r6 = com.google.android.libraries.places.internal.zzpy.zza()
            if (r6 == 0) goto L_0x0058
            boolean r6 = zze
            if (r6 == 0) goto L_0x004c
            com.google.android.libraries.places.internal.zztx$zzc r7 = new com.google.android.libraries.places.internal.zztx$zzc
            sun.misc.Unsafe r6 = zzc
            r7.<init>(r6)
            goto L_0x005f
        L_0x004c:
            boolean r6 = zzf
            if (r6 == 0) goto L_0x005f
            com.google.android.libraries.places.internal.zztx$zza r7 = new com.google.android.libraries.places.internal.zztx$zza
            sun.misc.Unsafe r6 = zzc
            r7.<init>(r6)
            goto L_0x005f
        L_0x0058:
            com.google.android.libraries.places.internal.zztx$zzb r7 = new com.google.android.libraries.places.internal.zztx$zzb
            sun.misc.Unsafe r6 = zzc
            r7.<init>(r6)
        L_0x005f:
            zzg = r7
            boolean r6 = zze()
            zzh = r6
            boolean r6 = zzd()
            zzi = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = zzb(r6)
            long r6 = (long) r6
            zzj = r6
            int r6 = zzb(r5)
            long r6 = (long) r6
            zzk = r6
            int r5 = zzc(r5)
            long r5 = (long) r5
            zzl = r5
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzm = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzn = r4
            int r4 = zzb(r3)
            long r4 = (long) r4
            zzo = r4
            int r3 = zzc(r3)
            long r3 = (long) r3
            zzp = r3
            int r3 = zzb(r2)
            long r3 = (long) r3
            zzq = r3
            int r2 = zzc(r2)
            long r2 = (long) r2
            zzr = r2
            int r2 = zzb(r1)
            long r2 = (long) r2
            zzs = r2
            int r1 = zzc(r1)
            long r1 = (long) r1
            zzt = r1
            int r1 = zzb(r0)
            long r1 = (long) r1
            zzu = r1
            int r0 = zzc(r0)
            long r0 = (long) r0
            zzv = r0
            java.lang.reflect.Field r0 = zzf()
            if (r0 == 0) goto L_0x00dc
            com.google.android.libraries.places.internal.zztx$zzd r1 = zzg
            if (r1 != 0) goto L_0x00d5
            goto L_0x00dc
        L_0x00d5:
            sun.misc.Unsafe r1 = r1.zza
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00de
        L_0x00dc:
            r0 = -1
        L_0x00de:
            zzw = r0
            long r0 = zzj
            r2 = 7
            long r0 = r0 & r2
            int r1 = (int) r0
            zzx = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00f2
            r0 = 1
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zztx.<clinit>():void");
    }

    private zztx() {
    }

    static boolean zza() {
        return zzi;
    }

    static boolean zzb() {
        return zzh;
    }

    private static int zzc(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static float zzd(Object obj, long j) {
        return zzg.zzc(obj, j);
    }

    static double zze(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    static Object zzf(Object obj, long j) {
        return zzg.zza.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    public static byte zzk(Object obj, long j) {
        return (byte) (zza(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzl(Object obj, long j) {
        return (byte) (zza(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean zzm(Object obj, long j) {
        return zzk(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzn(Object obj, long j) {
        return zzl(obj, j) != 0;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzb(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static boolean zzd() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (zzpy.zza()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zze() {
        String str = "copyMemory";
        String str2 = "getLong";
        Class<Object> cls = Object.class;
        Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod(str2, new Class[]{cls, Long.TYPE});
            if (zzf() == null) {
                return false;
            }
            if (zzpy.zza()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod(str2, new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static boolean zzc(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    private static Field zzf() {
        if (zzpy.zza()) {
            Field zza2 = zza(Buffer.class, "effectiveDirectAddress");
            if (zza2 != null) {
                return zza2;
            }
        }
        Field zza3 = zza(Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    static int zza(Object obj, long j) {
        return zzg.zze(obj, j);
    }

    static long zzb(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    static Unsafe zzc() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zztz());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void zza(Object obj, long j, int i) {
        zzg.zza(obj, j, i);
    }

    static void zza(Object obj, long j, long j2) {
        zzg.zza(obj, j, j2);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((~((int) j)) & 3) << 3;
        int i2 = (255 & b) << i;
        zza(obj, j2, i2 | (zza(obj, j2) & (~(255 << i))));
    }

    static void zza(Object obj, long j, boolean z) {
        zzg.zza(obj, j, z);
    }

    static void zza(Object obj, long j, float f) {
        zzg.zza(obj, j, f);
    }

    static void zza(Object obj, long j, double d) {
        zzg.zza(obj, j, d);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzg.zza.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzg.zza(bArr, zzj + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzg.zza((Object) bArr, zzj + j, b);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zze(Object obj, long j, boolean z) {
        zzd(obj, j, z ? (byte) 1 : 0);
    }

    private static boolean zzd(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzpy.zza()) {
            return false;
        }
        try {
            Class<?> cls3 = zzd;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zza(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : 0);
    }
}
