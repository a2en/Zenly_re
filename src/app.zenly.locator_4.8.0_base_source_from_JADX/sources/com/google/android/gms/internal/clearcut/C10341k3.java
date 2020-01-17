package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.k3 */
final class C10341k3 {

    /* renamed from: a */
    private static final Logger f27069a = Logger.getLogger(C10341k3.class.getName());

    /* renamed from: b */
    private static final Unsafe f27070b = m26219d();

    /* renamed from: c */
    private static final Class<?> f27071c = C10395s.m26493b();

    /* renamed from: d */
    private static final boolean f27072d = m26216c(Long.TYPE);

    /* renamed from: e */
    private static final boolean f27073e = m26216c(Integer.TYPE);

    /* renamed from: f */
    private static final C10345d f27074f;

    /* renamed from: g */
    private static final boolean f27075g = m26226f();

    /* renamed from: h */
    private static final boolean f27076h = m26224e();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f27077i = ((long) m26191a(byte[].class));

    /* renamed from: j */
    private static final long f27078j = m26209b(m26228g());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final boolean f27079k = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.clearcut.k3$a */
    static final class C10342a extends C10345d {
        C10342a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo27993a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final void mo27994a(Object obj, long j, byte b) {
            if (C10341k3.f27079k) {
                C10341k3.m26197a(obj, j, b);
            } else {
                C10341k3.m26210b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo27995a(Object obj, long j, double d) {
            mo28006a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo27996a(Object obj, long j, float f) {
            mo28005a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo27997a(Object obj, long j, boolean z) {
            if (C10341k3.f27079k) {
                C10341k3.m26211b(obj, j, z);
            } else {
                C10341k3.m26214c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo27998a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        /* renamed from: c */
        public final boolean mo27999c(Object obj, long j) {
            return C10341k3.f27079k ? C10341k3.m26231i(obj, j) : C10341k3.m26232j(obj, j);
        }

        /* renamed from: d */
        public final float mo28000d(Object obj, long j) {
            return Float.intBitsToFloat(mo28003a(obj, j));
        }

        /* renamed from: e */
        public final double mo28001e(Object obj, long j) {
            return Double.longBitsToDouble(mo28007b(obj, j));
        }

        /* renamed from: f */
        public final byte mo28002f(Object obj, long j) {
            return C10341k3.f27079k ? C10341k3.m26227g(obj, j) : C10341k3.m26229h(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.k3$b */
    static final class C10343b extends C10345d {
        C10343b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo27993a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final void mo27994a(Object obj, long j, byte b) {
            if (C10341k3.f27079k) {
                C10341k3.m26197a(obj, j, b);
            } else {
                C10341k3.m26210b(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo27995a(Object obj, long j, double d) {
            mo28006a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo27996a(Object obj, long j, float f) {
            mo28005a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo27997a(Object obj, long j, boolean z) {
            if (C10341k3.f27079k) {
                C10341k3.m26211b(obj, j, z);
            } else {
                C10341k3.m26214c(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo27998a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        /* renamed from: c */
        public final boolean mo27999c(Object obj, long j) {
            return C10341k3.f27079k ? C10341k3.m26231i(obj, j) : C10341k3.m26232j(obj, j);
        }

        /* renamed from: d */
        public final float mo28000d(Object obj, long j) {
            return Float.intBitsToFloat(mo28003a(obj, j));
        }

        /* renamed from: e */
        public final double mo28001e(Object obj, long j) {
            return Double.longBitsToDouble(mo28007b(obj, j));
        }

        /* renamed from: f */
        public final byte mo28002f(Object obj, long j) {
            return C10341k3.f27079k ? C10341k3.m26227g(obj, j) : C10341k3.m26229h(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.k3$c */
    static final class C10344c extends C10345d {
        C10344c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo27993a(long j, byte b) {
            this.f27080a.putByte(j, b);
        }

        /* renamed from: a */
        public final void mo27994a(Object obj, long j, byte b) {
            this.f27080a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo27995a(Object obj, long j, double d) {
            this.f27080a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo27996a(Object obj, long j, float f) {
            this.f27080a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo27997a(Object obj, long j, boolean z) {
            this.f27080a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public final void mo27998a(byte[] bArr, long j, long j2, long j3) {
            this.f27080a.copyMemory(bArr, C10341k3.f27077i + j, null, j2, j3);
        }

        /* renamed from: c */
        public final boolean mo27999c(Object obj, long j) {
            return this.f27080a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public final float mo28000d(Object obj, long j) {
            return this.f27080a.getFloat(obj, j);
        }

        /* renamed from: e */
        public final double mo28001e(Object obj, long j) {
            return this.f27080a.getDouble(obj, j);
        }

        /* renamed from: f */
        public final byte mo28002f(Object obj, long j) {
            return this.f27080a.getByte(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.k3$d */
    static abstract class C10345d {

        /* renamed from: a */
        Unsafe f27080a;

        C10345d(Unsafe unsafe) {
            this.f27080a = unsafe;
        }

        /* renamed from: a */
        public final int mo28003a(Object obj, long j) {
            return this.f27080a.getInt(obj, j);
        }

        /* renamed from: a */
        public final long mo28004a(Field field) {
            return this.f27080a.objectFieldOffset(field);
        }

        /* renamed from: a */
        public abstract void mo27993a(long j, byte b);

        /* renamed from: a */
        public abstract void mo27994a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo27995a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo27996a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo28005a(Object obj, long j, int i) {
            this.f27080a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo28006a(Object obj, long j, long j2) {
            this.f27080a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo27997a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo27998a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public final long mo28007b(Object obj, long j) {
            return this.f27080a.getLong(obj, j);
        }

        /* renamed from: c */
        public abstract boolean mo27999c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo28000d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo28001e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo28002f(Object obj, long j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c6  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.clearcut.k3> r6 = com.google.android.gms.internal.clearcut.C10341k3.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            f27069a = r6
            sun.misc.Unsafe r6 = m26219d()
            f27070b = r6
            java.lang.Class r6 = com.google.android.gms.internal.clearcut.C10395s.m26493b()
            f27071c = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = m26216c(r6)
            f27072d = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = m26216c(r6)
            f27073e = r6
            sun.misc.Unsafe r6 = f27070b
            r7 = 0
            if (r6 != 0) goto L_0x003b
        L_0x0039:
            r6 = r7
            goto L_0x0060
        L_0x003b:
            boolean r6 = com.google.android.gms.internal.clearcut.C10395s.m26492a()
            if (r6 == 0) goto L_0x0059
            boolean r6 = f27072d
            if (r6 == 0) goto L_0x004d
            com.google.android.gms.internal.clearcut.k3$b r6 = new com.google.android.gms.internal.clearcut.k3$b
            sun.misc.Unsafe r8 = f27070b
            r6.<init>(r8)
            goto L_0x0060
        L_0x004d:
            boolean r6 = f27073e
            if (r6 == 0) goto L_0x0039
            com.google.android.gms.internal.clearcut.k3$a r6 = new com.google.android.gms.internal.clearcut.k3$a
            sun.misc.Unsafe r8 = f27070b
            r6.<init>(r8)
            goto L_0x0060
        L_0x0059:
            com.google.android.gms.internal.clearcut.k3$c r6 = new com.google.android.gms.internal.clearcut.k3$c
            sun.misc.Unsafe r8 = f27070b
            r6.<init>(r8)
        L_0x0060:
            f27074f = r6
            boolean r6 = m26226f()
            f27075g = r6
            boolean r6 = m26224e()
            f27076h = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m26191a(r6)
            long r8 = (long) r6
            f27077i = r8
            m26191a(r5)
            m26207b(r5)
            m26191a(r4)
            m26207b(r4)
            m26191a(r3)
            m26207b(r3)
            m26191a(r2)
            m26207b(r2)
            m26191a(r1)
            m26207b(r1)
            m26191a(r0)
            m26207b(r0)
            java.lang.reflect.Field r0 = m26228g()
            long r0 = m26209b(r0)
            f27078j = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = m26195a(r0, r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.Class r1 = r0.getType()
            java.lang.Class<char[]> r2 = char[].class
            if (r1 != r2) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r0 = r7
        L_0x00b9:
            m26209b(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00c6
            r0 = 1
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            f27079k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10341k3.<clinit>():void");
    }

    private C10341k3() {
    }

    /* renamed from: a */
    static byte m26190a(byte[] bArr, long j) {
        return f27074f.mo28002f(bArr, f27077i + j);
    }

    /* renamed from: a */
    private static int m26191a(Class<?> cls) {
        if (f27076h) {
            return f27074f.f27080a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m26192a(Object obj, long j) {
        return f27074f.mo28003a(obj, j);
    }

    /* renamed from: a */
    static long m26193a(Field field) {
        return f27074f.mo28004a(field);
    }

    /* renamed from: a */
    static long m26194a(ByteBuffer byteBuffer) {
        return f27074f.mo28007b(byteBuffer, f27078j);
    }

    /* renamed from: a */
    private static Field m26195a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m26196a(long j, byte b) {
        f27074f.mo27993a(j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m26197a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((~((int) j)) & 3) << 3;
        int i2 = (255 & b) << i;
        m26200a(obj, j2, i2 | (m26192a(obj, j2) & (~(255 << i))));
    }

    /* renamed from: a */
    static void m26198a(Object obj, long j, double d) {
        f27074f.mo27995a(obj, j, d);
    }

    /* renamed from: a */
    static void m26199a(Object obj, long j, float f) {
        f27074f.mo27996a(obj, j, f);
    }

    /* renamed from: a */
    static void m26200a(Object obj, long j, int i) {
        f27074f.mo28005a(obj, j, i);
    }

    /* renamed from: a */
    static void m26201a(Object obj, long j, long j2) {
        f27074f.mo28006a(obj, j, j2);
    }

    /* renamed from: a */
    static void m26202a(Object obj, long j, Object obj2) {
        f27074f.f27080a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static void m26203a(Object obj, long j, boolean z) {
        f27074f.mo27997a(obj, j, z);
    }

    /* renamed from: a */
    static void m26204a(byte[] bArr, long j, byte b) {
        f27074f.mo27994a((Object) bArr, f27077i + j, b);
    }

    /* renamed from: a */
    static void m26205a(byte[] bArr, long j, long j2, long j3) {
        f27074f.mo27998a(bArr, j, j2, j3);
    }

    /* renamed from: b */
    private static int m26207b(Class<?> cls) {
        if (f27076h) {
            return f27074f.f27080a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    static long m26208b(Object obj, long j) {
        return f27074f.mo28007b(obj, j);
    }

    /* renamed from: b */
    private static long m26209b(Field field) {
        if (field != null) {
            C10345d dVar = f27074f;
            if (dVar != null) {
                return dVar.mo28004a(field);
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m26210b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m26200a(obj, j2, ((255 & b) << i) | (m26192a(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m26211b(Object obj, long j, boolean z) {
        m26197a(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    static boolean m26212b() {
        return f27076h;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m26214c(Object obj, long j, boolean z) {
        m26210b(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: c */
    static boolean m26215c() {
        return f27075g;
    }

    /* renamed from: c */
    private static boolean m26216c(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C10395s.m26492a()) {
            return false;
        }
        try {
            Class<?> cls3 = f27071c;
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

    /* renamed from: c */
    static boolean m26217c(Object obj, long j) {
        return f27074f.mo27999c(obj, j);
    }

    /* renamed from: d */
    static float m26218d(Object obj, long j) {
        return f27074f.mo28000d(obj, j);
    }

    /* renamed from: d */
    static Unsafe m26219d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C10354l3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    static double m26222e(Object obj, long j) {
        return f27074f.mo28001e(obj, j);
    }

    /* renamed from: e */
    private static boolean m26224e() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f27070b;
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
            if (C10395s.m26492a()) {
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
            Logger logger = f27069a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: f */
    static Object m26225f(Object obj, long j) {
        return f27074f.f27080a.getObject(obj, j);
    }

    /* renamed from: f */
    private static boolean m26226f() {
        String str = "copyMemory";
        String str2 = "getLong";
        Class<Object> cls = Object.class;
        Unsafe unsafe = f27070b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod(str2, new Class[]{cls, Long.TYPE});
            if (m26228g() == null) {
                return false;
            }
            if (C10395s.m26492a()) {
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
            Logger logger = f27069a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static byte m26227g(Object obj, long j) {
        return (byte) (m26192a(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: g */
    private static Field m26228g() {
        if (C10395s.m26492a()) {
            Field a = m26195a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m26195a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static byte m26229h(Object obj, long j) {
        return (byte) (m26192a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m26231i(Object obj, long j) {
        return m26227g(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m26232j(Object obj, long j) {
        return m26229h(obj, j) != 0;
    }
}
