package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.b2 */
final class C10279b2<T> implements C10359m2<T> {

    /* renamed from: r */
    private static final Unsafe f26901r = C10341k3.m26219d();

    /* renamed from: a */
    private final int[] f26902a;

    /* renamed from: b */
    private final Object[] f26903b;

    /* renamed from: c */
    private final int f26904c;

    /* renamed from: d */
    private final int f26905d;

    /* renamed from: e */
    private final int f26906e;

    /* renamed from: f */
    private final zzdo f26907f;

    /* renamed from: g */
    private final boolean f26908g;

    /* renamed from: h */
    private final boolean f26909h;

    /* renamed from: i */
    private final boolean f26910i;

    /* renamed from: j */
    private final int[] f26911j;

    /* renamed from: k */
    private final int[] f26912k;

    /* renamed from: l */
    private final int[] f26913l;

    /* renamed from: m */
    private final C10293d2 f26914m;

    /* renamed from: n */
    private final C10352l1 f26915n;

    /* renamed from: o */
    private final C10294d3<?, ?> f26916o;

    /* renamed from: p */
    private final C10375p0<?> f26917p;

    /* renamed from: q */
    private final C10415v1 f26918q;

    private C10279b2(int[] iArr, Object[] objArr, int i, int i2, int i3, zzdo zzdo, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, C10293d2 d2Var, C10352l1 l1Var, C10294d3<?, ?> d3Var, C10375p0<?> p0Var, C10415v1 v1Var) {
        zzdo zzdo2 = zzdo;
        C10375p0<?> p0Var2 = p0Var;
        this.f26902a = iArr;
        this.f26903b = objArr;
        this.f26904c = i;
        this.f26905d = i2;
        this.f26906e = i3;
        boolean z3 = zzdo2 instanceof C10273b1;
        this.f26909h = z;
        this.f26908g = p0Var2 != null && p0Var2.mo28077a(zzdo);
        this.f26910i = false;
        this.f26911j = iArr2;
        this.f26912k = iArr3;
        this.f26913l = iArr4;
        this.f26914m = d2Var;
        this.f26915n = l1Var;
        this.f26916o = d3Var;
        this.f26917p = p0Var2;
        this.f26907f = zzdo2;
        this.f26918q = v1Var;
    }

    /* renamed from: a */
    private static int m25937a(int i, byte[] bArr, int i2, int i3, Object obj, C10407u uVar) throws IOException {
        return C10401t.m26503a(i, bArr, i2, i3, m25969d(obj), uVar);
    }

    /* renamed from: a */
    private static <UT, UB> int m25938a(C10294d3<UT, UB> d3Var, T t) {
        return d3Var.mo27871b(d3Var.mo27874c(t));
    }

    /* renamed from: a */
    private static int m25939a(C10359m2<?> m2Var, int i, byte[] bArr, int i2, int i3, zzcn<?> zzcn, C10407u uVar) throws IOException {
        int a = m25941a((C10359m2) m2Var, bArr, i2, i3, uVar);
        while (true) {
            zzcn.add(uVar.f27221c);
            if (a >= i3) {
                break;
            }
            int a2 = C10401t.m26508a(bArr, a, uVar);
            if (i != uVar.f27219a) {
                break;
            }
            a = m25941a((C10359m2) m2Var, bArr, a2, i3, uVar);
        }
        return a;
    }

    /* renamed from: a */
    private static int m25940a(C10359m2 m2Var, byte[] bArr, int i, int i2, int i3, C10407u uVar) throws IOException {
        C10279b2 b2Var = (C10279b2) m2Var;
        Object a = b2Var.mo27829a();
        int a2 = b2Var.m25945a((T) a, bArr, i, i2, i3, uVar);
        b2Var.zzc(a);
        uVar.f27221c = a;
        return a2;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m25941a(com.google.android.gms.internal.clearcut.C10359m2 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.clearcut.C10407u r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26506a(r8, r7, r0, r10)
            int r8 = r10.f27219a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo27829a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo27832a(r1, r2, r3, r4, r5)
            r6.zzc(r9)
            r10.f27221c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.clearcut.zzco r6 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.m25941a(com.google.android.gms.internal.clearcut.m2, byte[], int, int, com.google.android.gms.internal.clearcut.u):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016f, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25942a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.clearcut.C10407u r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f26901r
            int[] r7 = r0.f26902a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0164;
                case 52: goto L_0x0154;
                case 53: goto L_0x0144;
                case 54: goto L_0x0144;
                case 55: goto L_0x0137;
                case 56: goto L_0x012b;
                case 57: goto L_0x0120;
                case 58: goto L_0x010a;
                case 59: goto L_0x00de;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a2;
                case 62: goto L_0x0137;
                case 63: goto L_0x0074;
                case 64: goto L_0x0120;
                case 65: goto L_0x012b;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0178
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0178
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.clearcut.m2 r2 = r0.m25947a(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = m25940a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f27221c
            if (r15 != 0) goto L_0x0052
            goto L_0x0150
        L_0x0052:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10292d1.m26019a(r15, r3)
            goto L_0x0150
        L_0x0058:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r4, r11)
            long r3 = r11.f27220b
            long r3 = com.google.android.gms.internal.clearcut.C10319h0.m26124a(r3)
            goto L_0x014c
        L_0x0066:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r11)
            int r3 = r11.f27219a
            int r3 = com.google.android.gms.internal.clearcut.C10319h0.m26123a(r3)
            goto L_0x013f
        L_0x0074:
            if (r5 != 0) goto L_0x0178
            int r3 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r11)
            int r4 = r11.f27219a
            com.google.android.gms.internal.clearcut.zzck r5 = r0.m25965c(r6)
            if (r5 == 0) goto L_0x0098
            com.google.android.gms.internal.clearcut.zzcj r5 = r5.zzb(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            com.google.android.gms.internal.clearcut.e3 r1 = m25969d(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo27889a(r2, r4)
            r2 = r3
            goto L_0x0179
        L_0x0098:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0174
        L_0x00a2:
            if (r5 != r15) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r11)
            int r4 = r11.f27219a
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.clearcut.y r3 = com.google.android.gms.internal.clearcut.C10431y.f27328f
            goto L_0x0150
        L_0x00b0:
            com.google.android.gms.internal.clearcut.y r3 = com.google.android.gms.internal.clearcut.C10431y.m26593a(r3, r2, r4)
            r12.putObject(r1, r9, r3)
        L_0x00b7:
            int r2 = r2 + r4
            goto L_0x0174
        L_0x00ba:
            if (r5 != r15) goto L_0x0178
            com.google.android.gms.internal.clearcut.m2 r2 = r0.m25947a(r6)
            r5 = r20
            int r2 = m25941a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d1
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d2
        L_0x00d1:
            r15 = 0
        L_0x00d2:
            java.lang.Object r3 = r11.f27221c
            if (r15 != 0) goto L_0x00d8
            goto L_0x0150
        L_0x00d8:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10292d1.m26019a(r15, r3)
            goto L_0x0150
        L_0x00de:
            if (r5 != r15) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r11)
            int r4 = r11.f27219a
            if (r4 != 0) goto L_0x00eb
            java.lang.String r3 = ""
            goto L_0x0150
        L_0x00eb:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00ff
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.clearcut.C10360m3.m26329a(r3, r2, r5)
            if (r5 == 0) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26833e()
            throw r1
        L_0x00ff:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.clearcut.C10292d1.f26951a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00b7
        L_0x010a:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r4, r11)
            long r3 = r11.f27220b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x011a
            r15 = 1
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0150
        L_0x0120:
            if (r5 != r7) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26507a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x015e
        L_0x012b:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            long r2 = com.google.android.gms.internal.clearcut.C10401t.m26511b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x016f
        L_0x0137:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r11)
            int r3 = r11.f27219a
        L_0x013f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0150
        L_0x0144:
            if (r5 != 0) goto L_0x0178
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r4, r11)
            long r3 = r11.f27220b
        L_0x014c:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0150:
            r12.putObject(r1, r9, r3)
            goto L_0x0174
        L_0x0154:
            if (r5 != r7) goto L_0x0178
            float r2 = com.google.android.gms.internal.clearcut.C10401t.m26514d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x015e:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0174
        L_0x0164:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            double r2 = com.google.android.gms.internal.clearcut.C10401t.m26512c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x016f:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0174:
            r12.putInt(r1, r13, r8)
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.m25942a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.clearcut.u):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0232, code lost:
        if (r7.f27220b != 0) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0234, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0236, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0237, code lost:
        r11.addBoolean(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023a, code lost:
        if (r4 >= r5) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023c, code lost:
        r6 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0242, code lost:
        if (r2 != r7.f27219a) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0244, code lost:
        r4 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024c, code lost:
        if (r7.f27220b == 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r4 == 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        r11.add(com.google.android.gms.internal.clearcut.C10431y.f27328f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r11.add(com.google.android.gms.internal.clearcut.C10431y.m26593a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014a, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        if (r2 != r7.f27219a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7);
        r4 = r7.f27219a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r4 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25943a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.clearcut.C10407u r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f26901r
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzcn r11 = (com.google.android.gms.internal.clearcut.zzcn) r11
            boolean r12 = r11.zzu()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.clearcut.zzcn r11 = r11.zzi(r12)
            sun.misc.Unsafe r12 = f26901r
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x035d;
                case 19: goto L_0x031f;
                case 20: goto L_0x02e7;
                case 21: goto L_0x02e7;
                case 22: goto L_0x02cd;
                case 23: goto L_0x028e;
                case 24: goto L_0x024f;
                case 25: goto L_0x01fe;
                case 26: goto L_0x0177;
                case 27: goto L_0x015d;
                case 28: goto L_0x0132;
                case 29: goto L_0x02cd;
                case 30: goto L_0x00fa;
                case 31: goto L_0x024f;
                case 32: goto L_0x028e;
                case 33: goto L_0x00ba;
                case 34: goto L_0x007a;
                case 35: goto L_0x035d;
                case 36: goto L_0x031f;
                case 37: goto L_0x02e7;
                case 38: goto L_0x02e7;
                case 39: goto L_0x02cd;
                case 40: goto L_0x028e;
                case 41: goto L_0x024f;
                case 42: goto L_0x01fe;
                case 43: goto L_0x02cd;
                case 44: goto L_0x00fa;
                case 45: goto L_0x024f;
                case 46: goto L_0x028e;
                case 47: goto L_0x00ba;
                case 48: goto L_0x007a;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x039b
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x039b
            com.google.android.gms.internal.clearcut.m2 r1 = r0.m25947a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = m25940a(r22, r23, r24, r25, r26, r27)
        L_0x005a:
            java.lang.Object r8 = r7.f27221c
            r11.add(r8)
            if (r4 >= r5) goto L_0x039b
            int r8 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r9 = r7.f27219a
            if (r2 != r9) goto L_0x039b
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = m25940a(r22, r23, r24, r25, r26, r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r10) goto L_0x009e
            com.google.android.gms.internal.clearcut.p1 r11 = (com.google.android.gms.internal.clearcut.C10376p1) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r2 = r7.f27219a
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r1, r7)
            long r4 = r7.f27220b
            long r4 = com.google.android.gms.internal.clearcut.C10319h0.m26124a(r4)
            r11.mo28080a(r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x039c
        L_0x0099:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x039b
            com.google.android.gms.internal.clearcut.p1 r11 = (com.google.android.gms.internal.clearcut.C10376p1) r11
        L_0x00a2:
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r4, r7)
            long r8 = r7.f27220b
            long r8 = com.google.android.gms.internal.clearcut.C10319h0.m26124a(r8)
            r11.mo28080a(r8)
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r10) goto L_0x00de
            com.google.android.gms.internal.clearcut.c1 r11 = (com.google.android.gms.internal.clearcut.C10285c1) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r2 = r7.f27219a
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r4 = r7.f27219a
            int r4 = com.google.android.gms.internal.clearcut.C10319h0.m26123a(r4)
            r11.mo27843a(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x039c
        L_0x00d9:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x039b
            com.google.android.gms.internal.clearcut.c1 r11 = (com.google.android.gms.internal.clearcut.C10285c1) r11
        L_0x00e2:
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r4 = r7.f27219a
            int r4 = com.google.android.gms.internal.clearcut.C10319h0.m26123a(r4)
            r11.mo27843a(r4)
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r10) goto L_0x0101
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26509a(r3, r4, r11, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x039b
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26505a(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.clearcut.b1 r1 = (com.google.android.gms.internal.clearcut.C10273b1) r1
            com.google.android.gms.internal.clearcut.e3 r3 = r1.zzjp
            com.google.android.gms.internal.clearcut.e3 r4 = com.google.android.gms.internal.clearcut.C10301e3.m26061d()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.clearcut.zzck r4 = r0.m25965c(r8)
            com.google.android.gms.internal.clearcut.d3<?, ?> r5 = r0.f26916o
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10371o2.m26372a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.clearcut.e3 r3 = (com.google.android.gms.internal.clearcut.C10301e3) r3
            if (r3 == 0) goto L_0x012f
            r1.zzjp = r3
        L_0x012f:
            r1 = r2
            goto L_0x039c
        L_0x0132:
            if (r6 != r10) goto L_0x039b
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r4 = r7.f27219a
            if (r4 != 0) goto L_0x0142
        L_0x013c:
            com.google.android.gms.internal.clearcut.y r4 = com.google.android.gms.internal.clearcut.C10431y.f27328f
            r11.add(r4)
            goto L_0x014a
        L_0x0142:
            com.google.android.gms.internal.clearcut.y r6 = com.google.android.gms.internal.clearcut.C10431y.m26593a(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x014a:
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r4 = r7.f27219a
            if (r4 != 0) goto L_0x0142
            goto L_0x013c
        L_0x015d:
            if (r6 != r10) goto L_0x039b
            com.google.android.gms.internal.clearcut.m2 r1 = r0.m25947a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = m25939a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x039c
        L_0x0177:
            if (r6 != r10) goto L_0x039b
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            if (r6 != 0) goto L_0x01b6
            int r6 = r7.f27219a
            if (r6 != 0) goto L_0x0190
        L_0x018c:
            r11.add(r1)
            goto L_0x019b
        L_0x0190:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C10292d1.f26951a
            r8.<init>(r3, r4, r6, r9)
        L_0x0197:
            r11.add(r8)
            int r4 = r4 + r6
        L_0x019b:
            if (r4 >= r5) goto L_0x039b
            int r6 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r8 = r7.f27219a
            if (r2 != r8) goto L_0x039b
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r6, r7)
            int r6 = r7.f27219a
            if (r6 != 0) goto L_0x01ae
            goto L_0x018c
        L_0x01ae:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C10292d1.f26951a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x0197
        L_0x01b6:
            int r6 = r7.f27219a
            if (r6 != 0) goto L_0x01be
        L_0x01ba:
            r11.add(r1)
            goto L_0x01d1
        L_0x01be:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.clearcut.C10360m3.m26329a(r3, r4, r8)
            if (r9 == 0) goto L_0x01f9
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C10292d1.f26951a
            r9.<init>(r3, r4, r6, r10)
        L_0x01cd:
            r11.add(r9)
            r4 = r8
        L_0x01d1:
            if (r4 >= r5) goto L_0x039b
            int r6 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r8 = r7.f27219a
            if (r2 != r8) goto L_0x039b
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r6, r7)
            int r6 = r7.f27219a
            if (r6 != 0) goto L_0x01e4
            goto L_0x01ba
        L_0x01e4:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.clearcut.C10360m3.m26329a(r3, r4, r8)
            if (r9 == 0) goto L_0x01f4
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C10292d1.f26951a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01cd
        L_0x01f4:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26833e()
            throw r1
        L_0x01f9:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26833e()
            throw r1
        L_0x01fe:
            r1 = 0
            if (r6 != r10) goto L_0x0226
            com.google.android.gms.internal.clearcut.v r11 = (com.google.android.gms.internal.clearcut.C10413v) r11
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r4 = r7.f27219a
            int r4 = r4 + r2
        L_0x020a:
            if (r2 >= r4) goto L_0x021d
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r2, r7)
            long r5 = r7.f27220b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0218
            r5 = 1
            goto L_0x0219
        L_0x0218:
            r5 = 0
        L_0x0219:
            r11.addBoolean(r5)
            goto L_0x020a
        L_0x021d:
            if (r2 != r4) goto L_0x0221
            goto L_0x012f
        L_0x0221:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x0226:
            if (r6 != 0) goto L_0x039b
            com.google.android.gms.internal.clearcut.v r11 = (com.google.android.gms.internal.clearcut.C10413v) r11
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r4, r7)
            long r8 = r7.f27220b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0236
        L_0x0234:
            r6 = 1
            goto L_0x0237
        L_0x0236:
            r6 = 0
        L_0x0237:
            r11.addBoolean(r6)
            if (r4 >= r5) goto L_0x039b
            int r6 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r8 = r7.f27219a
            if (r2 != r8) goto L_0x039b
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r6, r7)
            long r8 = r7.f27220b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0236
            goto L_0x0234
        L_0x024f:
            if (r6 != r10) goto L_0x026f
            com.google.android.gms.internal.clearcut.c1 r11 = (com.google.android.gms.internal.clearcut.C10285c1) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r2 = r7.f27219a
            int r2 = r2 + r1
        L_0x025a:
            if (r1 >= r2) goto L_0x0266
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26507a(r3, r1)
            r11.mo27843a(r4)
            int r1 = r1 + 4
            goto L_0x025a
        L_0x0266:
            if (r1 != r2) goto L_0x026a
            goto L_0x039c
        L_0x026a:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x026f:
            if (r6 != r9) goto L_0x039b
            com.google.android.gms.internal.clearcut.c1 r11 = (com.google.android.gms.internal.clearcut.C10285c1) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26507a(r18, r19)
            r11.mo27843a(r1)
        L_0x027a:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26507a(r3, r4)
            r11.mo27843a(r1)
            goto L_0x027a
        L_0x028e:
            if (r6 != r10) goto L_0x02ae
            com.google.android.gms.internal.clearcut.p1 r11 = (com.google.android.gms.internal.clearcut.C10376p1) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r2 = r7.f27219a
            int r2 = r2 + r1
        L_0x0299:
            if (r1 >= r2) goto L_0x02a5
            long r4 = com.google.android.gms.internal.clearcut.C10401t.m26511b(r3, r1)
            r11.mo28080a(r4)
            int r1 = r1 + 8
            goto L_0x0299
        L_0x02a5:
            if (r1 != r2) goto L_0x02a9
            goto L_0x039c
        L_0x02a9:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x02ae:
            if (r6 != r13) goto L_0x039b
            com.google.android.gms.internal.clearcut.p1 r11 = (com.google.android.gms.internal.clearcut.C10376p1) r11
            long r8 = com.google.android.gms.internal.clearcut.C10401t.m26511b(r18, r19)
            r11.mo28080a(r8)
        L_0x02b9:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            long r8 = com.google.android.gms.internal.clearcut.C10401t.m26511b(r3, r4)
            r11.mo28080a(r8)
            goto L_0x02b9
        L_0x02cd:
            if (r6 != r10) goto L_0x02d5
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26509a(r3, r4, r11, r7)
            goto L_0x039c
        L_0x02d5:
            if (r6 != 0) goto L_0x039b
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26505a(r21, r22, r23, r24, r25, r26)
            goto L_0x039c
        L_0x02e7:
            if (r6 != r10) goto L_0x0307
            com.google.android.gms.internal.clearcut.p1 r11 = (com.google.android.gms.internal.clearcut.C10376p1) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r2 = r7.f27219a
            int r2 = r2 + r1
        L_0x02f2:
            if (r1 >= r2) goto L_0x02fe
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r1, r7)
            long r4 = r7.f27220b
            r11.mo28080a(r4)
            goto L_0x02f2
        L_0x02fe:
            if (r1 != r2) goto L_0x0302
            goto L_0x039c
        L_0x0302:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x0307:
            if (r6 != 0) goto L_0x039b
            com.google.android.gms.internal.clearcut.p1 r11 = (com.google.android.gms.internal.clearcut.C10376p1) r11
        L_0x030b:
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r3, r4, r7)
            long r8 = r7.f27220b
            r11.mo28080a(r8)
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            goto L_0x030b
        L_0x031f:
            if (r6 != r10) goto L_0x033e
            com.google.android.gms.internal.clearcut.z0 r11 = (com.google.android.gms.internal.clearcut.C10438z0) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r2 = r7.f27219a
            int r2 = r2 + r1
        L_0x032a:
            if (r1 >= r2) goto L_0x0336
            float r4 = com.google.android.gms.internal.clearcut.C10401t.m26514d(r3, r1)
            r11.mo28203a(r4)
            int r1 = r1 + 4
            goto L_0x032a
        L_0x0336:
            if (r1 != r2) goto L_0x0339
            goto L_0x039c
        L_0x0339:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x033e:
            if (r6 != r9) goto L_0x039b
            com.google.android.gms.internal.clearcut.z0 r11 = (com.google.android.gms.internal.clearcut.C10438z0) r11
            float r1 = com.google.android.gms.internal.clearcut.C10401t.m26514d(r18, r19)
            r11.mo28203a(r1)
        L_0x0349:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            float r1 = com.google.android.gms.internal.clearcut.C10401t.m26514d(r3, r4)
            r11.mo28203a(r1)
            goto L_0x0349
        L_0x035d:
            if (r6 != r10) goto L_0x037c
            com.google.android.gms.internal.clearcut.m0 r11 = (com.google.android.gms.internal.clearcut.C10357m0) r11
            int r1 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r4, r7)
            int r2 = r7.f27219a
            int r2 = r2 + r1
        L_0x0368:
            if (r1 >= r2) goto L_0x0374
            double r4 = com.google.android.gms.internal.clearcut.C10401t.m26512c(r3, r1)
            r11.mo28054a(r4)
            int r1 = r1 + 8
            goto L_0x0368
        L_0x0374:
            if (r1 != r2) goto L_0x0377
            goto L_0x039c
        L_0x0377:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.m26829a()
            throw r1
        L_0x037c:
            if (r6 != r13) goto L_0x039b
            com.google.android.gms.internal.clearcut.m0 r11 = (com.google.android.gms.internal.clearcut.C10357m0) r11
            double r8 = com.google.android.gms.internal.clearcut.C10401t.m26512c(r18, r19)
            r11.mo28054a(r8)
        L_0x0387:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039c
            int r4 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r3, r1, r7)
            int r6 = r7.f27219a
            if (r2 != r6) goto L_0x039c
            double r8 = com.google.android.gms.internal.clearcut.C10401t.m26512c(r3, r4)
            r11.mo28054a(r8)
            goto L_0x0387
        L_0x039b:
            r1 = r4
        L_0x039c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.m25943a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.u):int");
    }

    /* renamed from: a */
    private final <K, V> int m25944a(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, C10407u uVar) throws IOException {
        Unsafe unsafe = f26901r;
        Object b = m25959b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f26918q.mo28166d(object)) {
            Object b2 = this.f26918q.mo28164b(b);
            this.f26918q.zzb(b2, object);
            unsafe.putObject(t, j, b2);
        }
        this.f26918q.mo28163a(b);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v11, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v4, types: [int] */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r0v14, types: [int] */
    /* JADX WARNING: type inference failed for: r1v10, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r30v1 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r30v2 */
    /* JADX WARNING: type inference failed for: r30v3 */
    /* JADX WARNING: type inference failed for: r30v4 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r30v5 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r30v6 */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v9, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r30v7 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [int] */
    /* JADX WARNING: type inference failed for: r30v8 */
    /* JADX WARNING: type inference failed for: r30v9 */
    /* JADX WARNING: type inference failed for: r1v16, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r12v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r12v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r12v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r12v22, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r12v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r12v25, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r12v27, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: type inference failed for: r12v28, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v29 */
    /* JADX WARNING: type inference failed for: r9v31 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r12v30 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r12v31, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r9v36, types: [int] */
    /* JADX WARNING: type inference failed for: r12v33, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r12v34, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v38 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r9v39 */
    /* JADX WARNING: type inference failed for: r12v36, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: type inference failed for: r1v40, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v42 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r9v44 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r1v46, types: [int] */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r7v35 */
    /* JADX WARNING: type inference failed for: r30v25 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r1v50 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r9v45 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r9v46 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r9v47 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r9v48 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r9v49 */
    /* JADX WARNING: type inference failed for: r9v50 */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r12v58 */
    /* JADX WARNING: type inference failed for: r9v52 */
    /* JADX WARNING: type inference failed for: r12v59 */
    /* JADX WARNING: type inference failed for: r12v60 */
    /* JADX WARNING: type inference failed for: r9v53 */
    /* JADX WARNING: type inference failed for: r12v61 */
    /* JADX WARNING: type inference failed for: r12v62 */
    /* JADX WARNING: type inference failed for: r12v63 */
    /* JADX WARNING: type inference failed for: r9v54 */
    /* JADX WARNING: type inference failed for: r12v64 */
    /* JADX WARNING: type inference failed for: r9v55 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f8, code lost:
        if (r0 == r15) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0353, code lost:
        if (r0 == r15) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0355, code lost:
        r7 = r30;
        r6 = r32;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0016, code lost:
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        r5 = r4;
        r30 = r7;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d6, code lost:
        r12 = r29;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0123, code lost:
        r13 = r31;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013a, code lost:
        r6 = r6 | r21;
        r13 = r31;
        r0 = r2;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        r1 = r9;
        r9 = r11;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018e, code lost:
        r10.putObject(r14, r7, r1);
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c8, code lost:
        r6 = r6 | r21;
        r7 = r30;
        r13 = r5;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ef, code lost:
        r5 = r4;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0258, code lost:
        r6 = r6 | r21;
        r7 = r30;
        r13 = r31;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025e, code lost:
        r1 = r9;
        r9 = r11;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0260, code lost:
        r8 = -1;
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0261, code lost:
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0265, code lost:
        r20 = r30;
        r2 = r5;
        r21 = r6;
        r7 = r9;
        r26 = r10;
        r6 = r32;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v11, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r29v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v6
      assigns: []
      uses: []
      mth insns count: 510
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 56 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m25945a(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.clearcut.C10407u r33) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            sun.misc.Unsafe r10 = f26901r
            r16 = 0
            r8 = -1
            r0 = r30
            r1 = 0
            r6 = 0
            r7 = -1
        L_0x0016:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r18 = 0
            if (r0 >= r13) goto L_0x038f
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26506a(r0, r12, r1, r9)
            int r1 = r9.f27219a
            r4 = r0
            r5 = r1
            goto L_0x002e
        L_0x002c:
            r5 = r0
            r4 = r1
        L_0x002e:
            int r3 = r5 >>> 3
            r2 = r5 & 7
            int r1 = r15.m25972f(r3)
            if (r1 == r8) goto L_0x035b
            int[] r0 = r15.f26902a
            int r19 = r1 + 1
            r8 = r0[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r30 = r5
            r5 = r8 & r17
            long r12 = (long) r5
            r5 = 17
            r19 = r8
            if (r11 > r5) goto L_0x0271
            int r5 = r1 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r8 = 1
            int r21 = r8 << r5
            r0 = r0 & r17
            r5 = -1
            if (r0 == r7) goto L_0x0069
            if (r7 == r5) goto L_0x0063
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0063:
            long r6 = (long) r0
            int r6 = r10.getInt(r14, r6)
            r7 = r0
        L_0x0069:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0242;
                case 1: goto L_0x022c;
                case 2: goto L_0x0208;
                case 3: goto L_0x0208;
                case 4: goto L_0x01f2;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01b2;
                case 7: goto L_0x0192;
                case 8: goto L_0x016f;
                case 9: goto L_0x0143;
                case 10: goto L_0x0126;
                case 11: goto L_0x01f2;
                case 12: goto L_0x00f1;
                case 13: goto L_0x01b2;
                case 14: goto L_0x01cf;
                case 15: goto L_0x00d9;
                case 16: goto L_0x00b3;
                case 17: goto L_0x0078;
                default: goto L_0x006d;
            }
        L_0x006d:
            r12 = r29
            r9 = r30
            r11 = r33
        L_0x0073:
            r5 = r4
            r30 = r7
            goto L_0x0265
        L_0x0078:
            r0 = 3
            if (r2 != r0) goto L_0x00ae
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.clearcut.m2 r0 = r15.m25947a(r1)
            r1 = r29
            r2 = r4
            r3 = r31
            r4 = r8
            r9 = r30
            r8 = -1
            r5 = r33
            int r0 = m25940a(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            r11 = r33
            if (r1 != 0) goto L_0x009b
            java.lang.Object r1 = r11.f27221c
            goto L_0x00a5
        L_0x009b:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r11.f27221c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C10292d1.m26019a(r1, r2)
        L_0x00a5:
            r10.putObject(r14, r12, r1)
            r6 = r6 | r21
            r12 = r29
            goto L_0x0123
        L_0x00ae:
            r9 = r30
            r11 = r33
            goto L_0x00d6
        L_0x00b3:
            r9 = r30
            r11 = r33
            r8 = -1
            if (r2 != 0) goto L_0x00d6
            r2 = r12
            r12 = r29
            int r13 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r12, r4, r11)
            long r0 = r11.f27220b
            long r4 = com.google.android.gms.internal.clearcut.C10319h0.m26124a(r0)
            r0 = r10
            r1 = r28
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r1 = r9
            r9 = r11
            r0 = r13
            r13 = r31
            goto L_0x0261
        L_0x00d6:
            r12 = r29
            goto L_0x0073
        L_0x00d9:
            r9 = r30
            r11 = r33
            r0 = r12
            r8 = -1
            r12 = r29
            if (r2 != 0) goto L_0x0073
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r12, r4, r11)
            int r3 = r11.f27219a
            int r3 = com.google.android.gms.internal.clearcut.C10319h0.m26123a(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x013a
        L_0x00f1:
            r9 = r30
            r11 = r33
            r22 = r12
            r8 = -1
            r12 = r29
            if (r2 != 0) goto L_0x0073
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r12, r4, r11)
            int r2 = r11.f27219a
            com.google.android.gms.internal.clearcut.zzck r1 = r15.m25965c(r1)
            if (r1 == 0) goto L_0x011c
            com.google.android.gms.internal.clearcut.zzcj r1 = r1.zzb(r2)
            if (r1 == 0) goto L_0x010f
            goto L_0x011c
        L_0x010f:
            com.google.android.gms.internal.clearcut.e3 r1 = m25969d(r28)
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo27889a(r9, r2)
            goto L_0x0123
        L_0x011c:
            r3 = r22
            r10.putInt(r14, r3, r2)
            r6 = r6 | r21
        L_0x0123:
            r13 = r31
            goto L_0x013f
        L_0x0126:
            r9 = r30
            r11 = r33
            r0 = r12
            r3 = 2
            r8 = -1
            r12 = r29
            if (r2 != r3) goto L_0x0073
            int r2 = com.google.android.gms.internal.clearcut.C10401t.m26516e(r12, r4, r11)
            java.lang.Object r3 = r11.f27221c
            r10.putObject(r14, r0, r3)
        L_0x013a:
            r6 = r6 | r21
            r13 = r31
            r0 = r2
        L_0x013f:
            r1 = r9
            r9 = r11
            goto L_0x0261
        L_0x0143:
            r9 = r30
            r11 = r33
            r30 = r7
            r7 = r12
            r3 = 2
            r12 = r29
            if (r2 != r3) goto L_0x016b
            com.google.android.gms.internal.clearcut.m2 r0 = r15.m25947a(r1)
            r5 = r31
            int r0 = m25941a(r0, r12, r4, r5, r11)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x0160
            java.lang.Object r1 = r11.f27221c
            goto L_0x018e
        L_0x0160:
            java.lang.Object r1 = r10.getObject(r14, r7)
            java.lang.Object r2 = r11.f27221c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C10292d1.m26019a(r1, r2)
            goto L_0x018e
        L_0x016b:
            r5 = r31
            goto L_0x01ef
        L_0x016f:
            r9 = r30
            r5 = r31
            r11 = r33
            r30 = r7
            r7 = r12
            r0 = 2
            r12 = r29
            if (r2 != r0) goto L_0x01ef
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x0188
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26513c(r12, r4, r11)
            goto L_0x018c
        L_0x0188:
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26515d(r12, r4, r11)
        L_0x018c:
            java.lang.Object r1 = r11.f27221c
        L_0x018e:
            r10.putObject(r14, r7, r1)
            goto L_0x01c8
        L_0x0192:
            r9 = r30
            r5 = r31
            r11 = r33
            r30 = r7
            r7 = r12
            r12 = r29
            if (r2 != 0) goto L_0x01ef
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r12, r4, r11)
            long r1 = r11.f27220b
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x01ad
            r1 = 1
            goto L_0x01ae
        L_0x01ad:
            r1 = 0
        L_0x01ae:
            com.google.android.gms.internal.clearcut.C10341k3.m26203a(r14, r7, r1)
            goto L_0x01c8
        L_0x01b2:
            r9 = r30
            r5 = r31
            r11 = r33
            r30 = r7
            r7 = r12
            r12 = r29
            if (r2 != r0) goto L_0x01ef
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26507a(r12, r4)
            r10.putInt(r14, r7, r0)
            int r0 = r4 + 4
        L_0x01c8:
            r6 = r6 | r21
            r7 = r30
            r13 = r5
            goto L_0x025e
        L_0x01cf:
            r9 = r30
            r5 = r31
            r11 = r33
            r30 = r7
            r7 = r12
            r0 = 1
            r12 = r29
            if (r2 != r0) goto L_0x01ef
            long r17 = com.google.android.gms.internal.clearcut.C10401t.m26511b(r12, r4)
            r0 = r10
            r1 = r28
            r2 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0258
        L_0x01ef:
            r5 = r4
            goto L_0x0265
        L_0x01f2:
            r9 = r30
            r11 = r33
            r5 = r4
            r30 = r7
            r7 = r12
            r12 = r29
            if (r2 != 0) goto L_0x0265
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r12, r5, r11)
            int r1 = r11.f27219a
            r10.putInt(r14, r7, r1)
            goto L_0x0258
        L_0x0208:
            r9 = r30
            r11 = r33
            r5 = r4
            r30 = r7
            r7 = r12
            r12 = r29
            if (r2 != 0) goto L_0x0265
            int r17 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r12, r5, r11)
            long r4 = r11.f27220b
            r0 = r10
            r1 = r28
            r2 = r7
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r7 = r30
            r13 = r31
            r1 = r9
            r9 = r11
            r0 = r17
            goto L_0x0260
        L_0x022c:
            r9 = r30
            r11 = r33
            r5 = r4
            r30 = r7
            r7 = r12
            r12 = r29
            if (r2 != r0) goto L_0x0265
            float r0 = com.google.android.gms.internal.clearcut.C10401t.m26514d(r12, r5)
            com.google.android.gms.internal.clearcut.C10341k3.m26199a(r14, r7, r0)
            int r0 = r5 + 4
            goto L_0x0258
        L_0x0242:
            r9 = r30
            r11 = r33
            r5 = r4
            r30 = r7
            r7 = r12
            r0 = 1
            r12 = r29
            if (r2 != r0) goto L_0x0265
            double r0 = com.google.android.gms.internal.clearcut.C10401t.m26512c(r12, r5)
            com.google.android.gms.internal.clearcut.C10341k3.m26198a(r14, r7, r0)
            int r0 = r5 + 8
        L_0x0258:
            r6 = r6 | r21
            r7 = r30
            r13 = r31
        L_0x025e:
            r1 = r9
            r9 = r11
        L_0x0260:
            r8 = -1
        L_0x0261:
            r11 = r32
            goto L_0x0016
        L_0x0265:
            r20 = r30
            r2 = r5
            r21 = r6
            r7 = r9
            r26 = r10
            r6 = r32
            goto L_0x0369
        L_0x0271:
            r9 = r30
            r5 = r4
            r20 = r7
            r7 = r12
            r12 = r29
            r0 = 27
            if (r11 != r0) goto L_0x02c6
            r0 = 2
            if (r2 != r0) goto L_0x02bf
            java.lang.Object r0 = r10.getObject(r14, r7)
            com.google.android.gms.internal.clearcut.zzcn r0 = (com.google.android.gms.internal.clearcut.zzcn) r0
            boolean r2 = r0.zzu()
            if (r2 != 0) goto L_0x029e
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0295
            r2 = 10
            goto L_0x0297
        L_0x0295:
            int r2 = r2 << 1
        L_0x0297:
            com.google.android.gms.internal.clearcut.zzcn r0 = r0.zzi(r2)
            r10.putObject(r14, r7, r0)
        L_0x029e:
            r7 = r0
            com.google.android.gms.internal.clearcut.m2 r0 = r15.m25947a(r1)
            r1 = r9
            r2 = r29
            r3 = r5
            r4 = r31
            r5 = r7
            r21 = r6
            r6 = r33
            int r0 = m25939a(r0, r1, r2, r3, r4, r5, r6)
            r13 = r31
            r11 = r32
            r7 = r20
            r6 = r21
            r8 = -1
            r9 = r33
            goto L_0x0016
        L_0x02bf:
            r21 = r6
            r15 = r5
            r30 = r9
            goto L_0x0362
        L_0x02c6:
            r21 = r6
            r0 = 49
            if (r11 > r0) goto L_0x030c
            r6 = r19
            long r13 = (long) r6
            r0 = r27
            r19 = r1
            r1 = r28
            r6 = r2
            r2 = r29
            r22 = r3
            r3 = r5
            r4 = r31
            r15 = r5
            r5 = r9
            r23 = r6
            r6 = r22
            r24 = r7
            r7 = r23
            r8 = r19
            r30 = r9
            r26 = r10
            r9 = r13
            r14 = r32
            r12 = r24
            r14 = r33
            int r0 = r0.m25943a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02fc
            goto L_0x0355
        L_0x02fc:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            goto L_0x0386
        L_0x030c:
            r23 = r2
            r22 = r3
            r15 = r5
            r24 = r7
            r30 = r9
            r26 = r10
            r6 = r19
            r19 = r1
            r0 = 50
            r7 = r23
            if (r11 != r0) goto L_0x033a
            r0 = 2
            if (r7 == r0) goto L_0x0325
            goto L_0x0364
        L_0x0325:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r22
            r7 = r24
            r9 = r33
            r0.m25944a(r1, r2, r3, r4, r5, r6, r7, r9)
            throw r18
        L_0x033a:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r30
            r8 = r6
            r6 = r22
            r9 = r11
            r10 = r24
            r12 = r19
            r13 = r33
            int r0 = r0.m25942a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02fc
        L_0x0355:
            r7 = r30
            r6 = r32
            r2 = r0
            goto L_0x0369
        L_0x035b:
            r15 = r4
            r30 = r5
            r21 = r6
            r20 = r7
        L_0x0362:
            r26 = r10
        L_0x0364:
            r7 = r30
            r6 = r32
            r2 = r15
        L_0x0369:
            if (r7 != r6) goto L_0x036d
            if (r6 != 0) goto L_0x0398
        L_0x036d:
            r0 = r7
            r1 = r29
            r3 = r31
            r4 = r28
            r5 = r33
            int r0 = m25937a(r0, r1, r2, r3, r4, r5)
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r9 = r33
            r11 = r6
            r1 = r7
        L_0x0386:
            r7 = r20
            r6 = r21
            r10 = r26
            r8 = -1
            goto L_0x0016
        L_0x038f:
            r21 = r6
            r20 = r7
            r26 = r10
            r6 = r11
            r2 = r0
            r7 = r1
        L_0x0398:
            r0 = r20
            r1 = r21
            r3 = -1
            if (r0 == r3) goto L_0x03a8
            long r3 = (long) r0
            r0 = r28
            r5 = r26
            r5.putInt(r0, r3, r1)
            goto L_0x03aa
        L_0x03a8:
            r0 = r28
        L_0x03aa:
            r8 = r27
            int[] r1 = r8.f26912k
            if (r1 == 0) goto L_0x03ee
            int r3 = r1.length
            r5 = r18
            r4 = 0
        L_0x03b4:
            if (r4 >= r3) goto L_0x03e7
            r9 = r1[r4]
            com.google.android.gms.internal.clearcut.d3<?, ?> r10 = r8.f26916o
            int[] r11 = r8.f26902a
            r11 = r11[r9]
            int r12 = r8.m25967d(r9)
            r12 = r12 & r17
            long r12 = (long) r12
            java.lang.Object r12 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r0, r12)
            if (r12 != 0) goto L_0x03cc
            goto L_0x03d2
        L_0x03cc:
            com.google.android.gms.internal.clearcut.zzck r13 = r8.m25965c(r9)
            if (r13 != 0) goto L_0x03d7
        L_0x03d2:
            com.google.android.gms.internal.clearcut.e3 r5 = (com.google.android.gms.internal.clearcut.C10301e3) r5
            int r4 = r4 + 1
            goto L_0x03b4
        L_0x03d7:
            com.google.android.gms.internal.clearcut.v1 r0 = r8.f26918q
            java.util.Map r3 = r0.mo28168f(r12)
            r0 = r27
            r1 = r9
            r2 = r11
            r4 = r13
            r6 = r10
            r0.m25948a(r1, r2, r3, r4, (UB) r5, r6)
            throw r18
        L_0x03e7:
            if (r5 == 0) goto L_0x03ee
            com.google.android.gms.internal.clearcut.d3<?, ?> r1 = r8.f26916o
            r1.mo27873b(r0, r5)
        L_0x03ee:
            r0 = r31
            if (r6 != 0) goto L_0x03fa
            if (r2 != r0) goto L_0x03f5
            goto L_0x03fe
        L_0x03f5:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.m26832d()
            throw r0
        L_0x03fa:
            if (r2 > r0) goto L_0x03ff
            if (r7 != r6) goto L_0x03ff
        L_0x03fe:
            return r2
        L_0x03ff:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.m26832d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.m25945a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.u):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016b A[EDGE_INSN: B:74:0x016b->B:70:0x016b ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.clearcut.C10279b2<T> m25946a(java.lang.Class<T> r23, com.google.android.gms.internal.clearcut.C10433y1 r24, com.google.android.gms.internal.clearcut.C10293d2 r25, com.google.android.gms.internal.clearcut.C10352l1 r26, com.google.android.gms.internal.clearcut.C10294d3<?, ?> r27, com.google.android.gms.internal.clearcut.C10375p0<?> r28, com.google.android.gms.internal.clearcut.C10415v1 r29) {
        /*
            r0 = r24
            boolean r1 = r0 instanceof com.google.android.gms.internal.clearcut.C10333j2
            r2 = 0
            if (r1 == 0) goto L_0x0189
            com.google.android.gms.internal.clearcut.j2 r0 = (com.google.android.gms.internal.clearcut.C10333j2) r0
            int r1 = r0.mo27956a()
            int r3 = com.google.android.gms.internal.clearcut.C10273b1.C10278e.f26898j
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x0015
            r13 = 1
            goto L_0x0016
        L_0x0015:
            r13 = 0
        L_0x0016:
            int r1 = r0.mo27959d()
            if (r1 != 0) goto L_0x0020
            r6 = 0
            r9 = 0
            r10 = 0
            goto L_0x002e
        L_0x0020:
            int r1 = r0.mo27961f()
            int r3 = r0.mo27962g()
            int r6 = r0.mo27966k()
            r9 = r1
            r10 = r3
        L_0x002e:
            int r1 = r6 << 2
            int[] r7 = new int[r1]
            int r1 = r6 << 1
            java.lang.Object[] r8 = new java.lang.Object[r1]
            int r1 = r0.mo27963h()
            if (r1 <= 0) goto L_0x0045
            int r1 = r0.mo27963h()
            int[] r1 = new int[r1]
            r16 = r1
            goto L_0x0047
        L_0x0045:
            r16 = r2
        L_0x0047:
            int r1 = r0.mo27964i()
            if (r1 <= 0) goto L_0x0053
            int r1 = r0.mo27964i()
            int[] r2 = new int[r1]
        L_0x0053:
            r17 = r2
            com.google.android.gms.internal.clearcut.k2 r1 = r0.mo27960e()
            boolean r2 = r1.mo27978a()
            if (r2 == 0) goto L_0x016b
            int r2 = r1.mo27979b()
            r3 = 0
            r6 = 0
            r11 = 0
        L_0x0066:
            int r12 = r0.mo27967l()
            if (r2 >= r12) goto L_0x007e
            int r12 = r2 - r9
            int r12 = r12 << 2
            if (r3 >= r12) goto L_0x007e
            r12 = 0
        L_0x0073:
            r14 = 4
            if (r12 >= r14) goto L_0x0167
            int r14 = r3 + r12
            r15 = -1
            r7[r14] = r15
            int r12 = r12 + 1
            goto L_0x0073
        L_0x007e:
            boolean r2 = r1.mo27981d()
            if (r2 == 0) goto L_0x0098
            java.lang.reflect.Field r2 = r1.mo27982e()
            long r14 = com.google.android.gms.internal.clearcut.C10341k3.m26193a(r2)
            int r2 = (int) r14
            java.lang.reflect.Field r12 = r1.mo27983f()
            long r14 = com.google.android.gms.internal.clearcut.C10341k3.m26193a(r12)
            int r12 = (int) r14
        L_0x0096:
            r14 = 0
            goto L_0x00b7
        L_0x0098:
            java.lang.reflect.Field r2 = r1.mo27984g()
            long r14 = com.google.android.gms.internal.clearcut.C10341k3.m26193a(r2)
            int r2 = (int) r14
            boolean r12 = r1.mo27985h()
            if (r12 == 0) goto L_0x00b5
            java.lang.reflect.Field r12 = r1.mo27986i()
            long r14 = com.google.android.gms.internal.clearcut.C10341k3.m26193a(r12)
            int r12 = (int) r14
            int r14 = r1.mo27987j()
            goto L_0x00b7
        L_0x00b5:
            r12 = 0
            goto L_0x0096
        L_0x00b7:
            int r15 = r1.mo27979b()
            r7[r3] = r15
            int r15 = r3 + 1
            boolean r18 = r1.mo27989l()
            if (r18 == 0) goto L_0x00c8
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00ca
        L_0x00c8:
            r18 = 0
        L_0x00ca:
            boolean r19 = r1.mo27988k()
            if (r19 == 0) goto L_0x00d3
            r19 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x00d5
        L_0x00d3:
            r19 = 0
        L_0x00d5:
            r18 = r18 | r19
            int r19 = r1.mo27980c()
            int r19 = r19 << 20
            r18 = r18 | r19
            r2 = r18 | r2
            r7[r15] = r2
            int r2 = r3 + 2
            int r14 = r14 << 20
            r12 = r12 | r14
            r7[r2] = r12
            java.lang.Object r2 = r1.mo27992o()
            if (r2 == 0) goto L_0x0117
            int r2 = r3 / 4
            int r2 = r2 << r4
            java.lang.Object r12 = r1.mo27992o()
            r8[r2] = r12
            java.lang.Object r12 = r1.mo27990m()
            if (r12 == 0) goto L_0x0108
            int r2 = r2 + 1
            java.lang.Object r12 = r1.mo27990m()
            r8[r2] = r12
            goto L_0x0138
        L_0x0108:
            java.lang.Object r12 = r1.mo27991n()
            if (r12 == 0) goto L_0x0138
            int r2 = r2 + 1
            java.lang.Object r12 = r1.mo27991n()
            r8[r2] = r12
            goto L_0x0138
        L_0x0117:
            java.lang.Object r2 = r1.mo27990m()
            if (r2 == 0) goto L_0x0128
            int r2 = r3 / 4
            int r2 = r2 << r4
            int r2 = r2 + r4
            java.lang.Object r12 = r1.mo27990m()
            r8[r2] = r12
            goto L_0x0138
        L_0x0128:
            java.lang.Object r2 = r1.mo27991n()
            if (r2 == 0) goto L_0x0138
            int r2 = r3 / 4
            int r2 = r2 << r4
            int r2 = r2 + r4
            java.lang.Object r12 = r1.mo27991n()
            r8[r2] = r12
        L_0x0138:
            int r2 = r1.mo27980c()
            com.google.android.gms.internal.clearcut.w0 r12 = com.google.android.gms.internal.clearcut.C10420w0.MAP
            int r12 = r12.ordinal()
            if (r2 != r12) goto L_0x014a
            int r2 = r6 + 1
            r16[r6] = r3
            r6 = r2
            goto L_0x015d
        L_0x014a:
            r12 = 18
            if (r2 < r12) goto L_0x015d
            r12 = 49
            if (r2 > r12) goto L_0x015d
            int r2 = r11 + 1
            r12 = r7[r15]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r12 & r14
            r17[r11] = r12
            r11 = r2
        L_0x015d:
            boolean r2 = r1.mo27978a()
            if (r2 == 0) goto L_0x016b
            int r2 = r1.mo27979b()
        L_0x0167:
            int r3 = r3 + 4
            goto L_0x0066
        L_0x016b:
            com.google.android.gms.internal.clearcut.b2 r1 = new com.google.android.gms.internal.clearcut.b2
            r6 = r1
            int r11 = r0.mo27967l()
            com.google.android.gms.internal.clearcut.zzdo r12 = r0.mo27958c()
            r14 = 0
            int[] r15 = r0.mo27965j()
            r18 = r25
            r19 = r26
            r20 = r27
            r21 = r28
            r22 = r29
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        L_0x0189:
            com.google.android.gms.internal.clearcut.z2 r0 = (com.google.android.gms.internal.clearcut.C10440z2) r0
            r0.mo27956a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.m25946a(java.lang.Class, com.google.android.gms.internal.clearcut.y1, com.google.android.gms.internal.clearcut.d2, com.google.android.gms.internal.clearcut.l1, com.google.android.gms.internal.clearcut.d3, com.google.android.gms.internal.clearcut.p0, com.google.android.gms.internal.clearcut.v1):com.google.android.gms.internal.clearcut.b2");
    }

    /* renamed from: a */
    private final C10359m2 m25947a(int i) {
        int i2 = (i / 4) << 1;
        C10359m2 m2Var = (C10359m2) this.f26903b[i2];
        if (m2Var != null) {
            return m2Var;
        }
        C10359m2 a = C10321h2.m26127a().mo27925a((Class) this.f26903b[i2 + 1]);
        this.f26903b[i2] = a;
        return a;
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m25948a(int i, int i2, Map<K, V> map, zzck<?> zzck, UB ub, C10294d3<UT, UB> d3Var) {
        this.f26918q.mo28163a(m25959b(i));
        throw null;
    }

    /* renamed from: a */
    private static <E> List<E> m25949a(Object obj, long j) {
        return (List) C10341k3.m26225f(obj, j);
    }

    /* renamed from: a */
    private static void m25950a(int i, Object obj, C10435y3 y3Var) throws IOException {
        if (obj instanceof String) {
            y3Var.zza(i, (String) obj);
        } else {
            y3Var.mo28013a(i, (C10431y) obj);
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m25951a(C10294d3<UT, UB> d3Var, T t, C10435y3 y3Var) throws IOException {
        d3Var.mo27869a(d3Var.mo27874c(t), y3Var);
    }

    /* renamed from: a */
    private final <K, V> void m25952a(C10435y3 y3Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f26918q.mo28163a(m25959b(i2));
            throw null;
        }
    }

    /* renamed from: a */
    private final void m25953a(T t, T t2, int i) {
        long d = (long) (m25967d(i) & 1048575);
        if (m25954a(t2, i)) {
            Object f = C10341k3.m26225f(t, d);
            Object f2 = C10341k3.m26225f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C10341k3.m26202a((Object) t, d, f2);
                    m25960b(t, i);
                }
                return;
            }
            C10341k3.m26202a((Object) t, d, C10292d1.m26019a(f, f2));
            m25960b(t, i);
        }
    }

    /* renamed from: a */
    private final boolean m25954a(T t, int i) {
        if (this.f26909h) {
            int d = m25967d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C10341k3.m26222e(t, j) != 0.0d;
                case 1:
                    return C10341k3.m26218d(t, j) != 0.0f;
                case 2:
                    return C10341k3.m26208b(t, j) != 0;
                case 3:
                    return C10341k3.m26208b(t, j) != 0;
                case 4:
                    return C10341k3.m26192a((Object) t, j) != 0;
                case 5:
                    return C10341k3.m26208b(t, j) != 0;
                case 6:
                    return C10341k3.m26192a((Object) t, j) != 0;
                case 7:
                    return C10341k3.m26217c(t, j);
                case 8:
                    Object f = C10341k3.m26225f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C10431y) {
                        return !C10431y.f27328f.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C10341k3.m26225f(t, j) != null;
                case 10:
                    return !C10431y.f27328f.equals(C10341k3.m26225f(t, j));
                case 11:
                    return C10341k3.m26192a((Object) t, j) != 0;
                case 12:
                    return C10341k3.m26192a((Object) t, j) != 0;
                case 13:
                    return C10341k3.m26192a((Object) t, j) != 0;
                case 14:
                    return C10341k3.m26208b(t, j) != 0;
                case 15:
                    return C10341k3.m26192a((Object) t, j) != 0;
                case 16:
                    return C10341k3.m26208b(t, j) != 0;
                case 17:
                    return C10341k3.m26225f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m25970e(i);
            return (C10341k3.m26192a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m25955a(T t, int i, int i2) {
        return C10341k3.m26192a((Object) t, (long) (m25970e(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final boolean m25956a(T t, int i, int i2, int i3) {
        return this.f26909h ? m25954a(t, i) : (i2 & i3) != 0;
    }

    /* renamed from: a */
    private static boolean m25957a(Object obj, int i, C10359m2 m2Var) {
        return m2Var.mo27833a(C10341k3.m26225f(obj, (long) (i & 1048575)));
    }

    /* renamed from: b */
    private static <T> double m25958b(T t, long j) {
        return ((Double) C10341k3.m26225f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final Object m25959b(int i) {
        return this.f26903b[(i / 4) << 1];
    }

    /* renamed from: b */
    private final void m25960b(T t, int i) {
        if (!this.f26909h) {
            int e = m25970e(i);
            long j = (long) (e & 1048575);
            C10341k3.m26200a((Object) t, j, C10341k3.m26192a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: b */
    private final void m25961b(T t, int i, int i2) {
        C10341k3.m26200a((Object) t, (long) (m25970e(i2) & 1048575), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x027e, code lost:
        com.google.android.gms.internal.clearcut.C10371o2.m26416j(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x028e, code lost:
        com.google.android.gms.internal.clearcut.C10371o2.m26407g(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029e, code lost:
        com.google.android.gms.internal.clearcut.C10371o2.m26418l(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ae, code lost:
        com.google.android.gms.internal.clearcut.C10371o2.m26419m(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02be, code lost:
        com.google.android.gms.internal.clearcut.C10371o2.m26413i(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0477, code lost:
        r5 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0274, code lost:
        com.google.android.gms.internal.clearcut.C10371o2.m26401e(r4, r9, r2, r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m25962b(T r19, com.google.android.gms.internal.clearcut.C10435y3 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f26908g
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.clearcut.p0<?> r3 = r0.f26917p
            com.google.android.gms.internal.clearcut.t0 r3 = r3.mo28075a(r1)
            boolean r5 = r3.mo28129b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo28133e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f26902a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f26901r
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x047b
            int r12 = r0.m25967d(r5)
            int[] r13 = r0.f26902a
            r14 = r13[r5]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f26909h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0060
            r4 = 17
            if (r15 > r4) goto L_0x0060
            int r4 = r5 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0056
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            goto L_0x0057
        L_0x0056:
            r13 = r6
        L_0x0057:
            int r4 = r4 >>> 20
            r6 = 1
            int r9 = r6 << r4
            r6 = r13
            r10 = r17
            goto L_0x0065
        L_0x0060:
            r17 = r10
            r10 = r17
            r9 = 0
        L_0x0065:
            if (r10 == 0) goto L_0x0084
            com.google.android.gms.internal.clearcut.p0<?> r4 = r0.f26917p
            int r4 = r4.mo28074a(r10)
            if (r4 > r14) goto L_0x0084
            com.google.android.gms.internal.clearcut.p0<?> r4 = r0.f26917p
            r4.mo28076a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0082
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0065
        L_0x0082:
            r10 = 0
            goto L_0x0065
        L_0x0084:
            r4 = r12 & r16
            long r12 = (long) r4
            switch(r15) {
                case 0: goto L_0x046b;
                case 1: goto L_0x045e;
                case 2: goto L_0x0451;
                case 3: goto L_0x0444;
                case 4: goto L_0x0437;
                case 5: goto L_0x042a;
                case 6: goto L_0x041d;
                case 7: goto L_0x0410;
                case 8: goto L_0x0402;
                case 9: goto L_0x03f0;
                case 10: goto L_0x03e0;
                case 11: goto L_0x03d2;
                case 12: goto L_0x03c4;
                case 13: goto L_0x03b6;
                case 14: goto L_0x03a8;
                case 15: goto L_0x039a;
                case 16: goto L_0x038c;
                case 17: goto L_0x037a;
                case 18: goto L_0x036a;
                case 19: goto L_0x035a;
                case 20: goto L_0x034a;
                case 21: goto L_0x033a;
                case 22: goto L_0x032a;
                case 23: goto L_0x031a;
                case 24: goto L_0x030a;
                case 25: goto L_0x02fa;
                case 26: goto L_0x02eb;
                case 27: goto L_0x02d8;
                case 28: goto L_0x02c9;
                case 29: goto L_0x02b9;
                case 30: goto L_0x02a9;
                case 31: goto L_0x0299;
                case 32: goto L_0x0289;
                case 33: goto L_0x0279;
                case 34: goto L_0x0269;
                case 35: goto L_0x0259;
                case 36: goto L_0x0249;
                case 37: goto L_0x0239;
                case 38: goto L_0x0229;
                case 39: goto L_0x0219;
                case 40: goto L_0x0209;
                case 41: goto L_0x01f9;
                case 42: goto L_0x01e9;
                case 43: goto L_0x01e2;
                case 44: goto L_0x01db;
                case 45: goto L_0x01d4;
                case 46: goto L_0x01cd;
                case 47: goto L_0x01c6;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r15 = 0
            goto L_0x0477
        L_0x008d:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r5)
            r2.mo28020b(r14, r4, r9)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            long r12 = m25971e(r1, r12)
            r2.zzb(r14, r12)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            int r4 = m25968d(r1, r12)
            r2.zze(r14, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            long r12 = m25971e(r1, r12)
            r2.mo28012a(r14, r12)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            int r4 = m25968d(r1, r12)
            r2.mo28018b(r14, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            int r4 = m25968d(r1, r12)
            r2.mo28011a(r14, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            int r4 = m25968d(r1, r12)
            r2.zzd(r14, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.y r4 = (com.google.android.gms.internal.clearcut.C10431y) r4
            r2.mo28013a(r14, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r5)
            r2.mo28014a(r14, r4, r9)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r12)
            m25950a(r14, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            boolean r4 = m25973f(r1, r12)
            r2.mo28016a(r14, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            int r4 = m25968d(r1, r12)
            r2.zzf(r14, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            long r12 = m25971e(r1, r12)
            r2.zzc(r14, r12)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            int r4 = m25968d(r1, r12)
            r2.zzc(r14, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            long r12 = m25971e(r1, r12)
            r2.zza(r14, r12)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            long r12 = m25971e(r1, r12)
            r2.mo28019b(r14, r12)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            float r4 = m25964c(r1, r12)
            r2.zza(r14, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.m25955a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008a
            double r12 = m25958b((T) r1, r12)
            r2.zza(r14, r12)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r12)
            r0.m25952a(r2, r14, r4, r5)
            goto L_0x008a
        L_0x01a6:
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.m2 r12 = r0.m25947a(r5)
            com.google.android.gms.internal.clearcut.C10371o2.m26388b(r4, r9, r2, r12)
            goto L_0x008a
        L_0x01b9:
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 1
            goto L_0x0274
        L_0x01c6:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            goto L_0x027e
        L_0x01cd:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            goto L_0x028e
        L_0x01d4:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            goto L_0x029e
        L_0x01db:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            goto L_0x02ae
        L_0x01e2:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            goto L_0x02be
        L_0x01e9:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26420n(r4, r9, r2, r14)
            goto L_0x008a
        L_0x01f9:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26417k(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0209:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26404f(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0219:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26410h(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0229:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26397d(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0239:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26393c(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0249:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26389b(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0259:
            r14 = 1
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26375a(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0269:
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 0
        L_0x0274:
            com.google.android.gms.internal.clearcut.C10371o2.m26401e(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0279:
            r14 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
        L_0x027e:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26416j(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0289:
            r14 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
        L_0x028e:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26407g(r4, r9, r2, r14)
            goto L_0x008a
        L_0x0299:
            r14 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
        L_0x029e:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26418l(r4, r9, r2, r14)
            goto L_0x008a
        L_0x02a9:
            r14 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
        L_0x02ae:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26419m(r4, r9, r2, r14)
            goto L_0x008a
        L_0x02b9:
            r14 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
        L_0x02be:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26413i(r4, r9, r2, r14)
            goto L_0x008a
        L_0x02c9:
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26387b(r4, r9, r2)
            goto L_0x008a
        L_0x02d8:
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.m2 r12 = r0.m25947a(r5)
            com.google.android.gms.internal.clearcut.C10371o2.m26374a(r4, r9, r2, r12)
            goto L_0x008a
        L_0x02eb:
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26373a(r4, r9, r2)
            goto L_0x008a
        L_0x02fa:
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r15 = 0
            com.google.android.gms.internal.clearcut.C10371o2.m26420n(r4, r9, r2, r15)
            goto L_0x0477
        L_0x030a:
            r15 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26417k(r4, r9, r2, r15)
            goto L_0x0477
        L_0x031a:
            r15 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26404f(r4, r9, r2, r15)
            goto L_0x0477
        L_0x032a:
            r15 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26410h(r4, r9, r2, r15)
            goto L_0x0477
        L_0x033a:
            r15 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26397d(r4, r9, r2, r15)
            goto L_0x0477
        L_0x034a:
            r15 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26393c(r4, r9, r2, r15)
            goto L_0x0477
        L_0x035a:
            r15 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26389b(r4, r9, r2, r15)
            goto L_0x0477
        L_0x036a:
            r15 = 0
            int[] r4 = r0.f26902a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26375a(r4, r9, r2, r15)
            goto L_0x0477
        L_0x037a:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r5)
            r2.mo28020b(r14, r4, r9)
            goto L_0x0477
        L_0x038c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            long r12 = r8.getLong(r1, r12)
            r2.zzb(r14, r12)
            goto L_0x0477
        L_0x039a:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            int r4 = r8.getInt(r1, r12)
            r2.zze(r14, r4)
            goto L_0x0477
        L_0x03a8:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            long r12 = r8.getLong(r1, r12)
            r2.mo28012a(r14, r12)
            goto L_0x0477
        L_0x03b6:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            int r4 = r8.getInt(r1, r12)
            r2.mo28018b(r14, r4)
            goto L_0x0477
        L_0x03c4:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            int r4 = r8.getInt(r1, r12)
            r2.mo28011a(r14, r4)
            goto L_0x0477
        L_0x03d2:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            int r4 = r8.getInt(r1, r12)
            r2.zzd(r14, r4)
            goto L_0x0477
        L_0x03e0:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.y r4 = (com.google.android.gms.internal.clearcut.C10431y) r4
            r2.mo28013a(r14, r4)
            goto L_0x0477
        L_0x03f0:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r5)
            r2.mo28014a(r14, r4, r9)
            goto L_0x0477
        L_0x0402:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            java.lang.Object r4 = r8.getObject(r1, r12)
            m25950a(r14, r4, r2)
            goto L_0x0477
        L_0x0410:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            boolean r4 = com.google.android.gms.internal.clearcut.C10341k3.m26217c(r1, r12)
            r2.mo28016a(r14, r4)
            goto L_0x0477
        L_0x041d:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            int r4 = r8.getInt(r1, r12)
            r2.zzf(r14, r4)
            goto L_0x0477
        L_0x042a:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            long r12 = r8.getLong(r1, r12)
            r2.zzc(r14, r12)
            goto L_0x0477
        L_0x0437:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            int r4 = r8.getInt(r1, r12)
            r2.zzc(r14, r4)
            goto L_0x0477
        L_0x0444:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            long r12 = r8.getLong(r1, r12)
            r2.zza(r14, r12)
            goto L_0x0477
        L_0x0451:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            long r12 = r8.getLong(r1, r12)
            r2.mo28019b(r14, r12)
            goto L_0x0477
        L_0x045e:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            float r4 = com.google.android.gms.internal.clearcut.C10341k3.m26218d(r1, r12)
            r2.zza(r14, r4)
            goto L_0x0477
        L_0x046b:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0477
            double r12 = com.google.android.gms.internal.clearcut.C10341k3.m26222e(r1, r12)
            r2.zza(r14, r12)
        L_0x0477:
            int r5 = r5 + 4
            goto L_0x002c
        L_0x047b:
            r17 = r10
            r4 = r17
        L_0x047f:
            if (r4 == 0) goto L_0x0495
            com.google.android.gms.internal.clearcut.p0<?> r5 = r0.f26917p
            r5.mo28076a(r2, r4)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0493
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x047f
        L_0x0493:
            r4 = 0
            goto L_0x047f
        L_0x0495:
            com.google.android.gms.internal.clearcut.d3<?, ?> r3 = r0.f26916o
            m25951a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.m25962b(java.lang.Object, com.google.android.gms.internal.clearcut.y3):void");
    }

    /* renamed from: b */
    private final void m25963b(T t, T t2, int i) {
        int d = m25967d(i);
        int i2 = this.f26902a[i];
        long j = (long) (d & 1048575);
        if (m25955a(t2, i2, i)) {
            Object f = C10341k3.m26225f(t, j);
            Object f2 = C10341k3.m26225f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C10341k3.m26202a((Object) t, j, f2);
                    m25961b(t, i2, i);
                }
                return;
            }
            C10341k3.m26202a((Object) t, j, C10292d1.m26019a(f, f2));
            m25961b(t, i2, i);
        }
    }

    /* renamed from: c */
    private static <T> float m25964c(T t, long j) {
        return ((Float) C10341k3.m26225f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final zzck<?> m25965c(int i) {
        return (zzck) this.f26903b[((i / 4) << 1) + 1];
    }

    /* renamed from: c */
    private final boolean m25966c(T t, T t2, int i) {
        return m25954a(t, i) == m25954a(t2, i);
    }

    /* renamed from: d */
    private final int m25967d(int i) {
        return this.f26902a[i + 1];
    }

    /* renamed from: d */
    private static <T> int m25968d(T t, long j) {
        return ((Integer) C10341k3.m26225f(t, j)).intValue();
    }

    /* renamed from: d */
    private static C10301e3 m25969d(Object obj) {
        C10273b1 b1Var = (C10273b1) obj;
        C10301e3 e3Var = b1Var.zzjp;
        if (e3Var != C10301e3.m26061d()) {
            return e3Var;
        }
        C10301e3 e = C10301e3.m26062e();
        b1Var.zzjp = e;
        return e;
    }

    /* renamed from: e */
    private final int m25970e(int i) {
        return this.f26902a[i + 2];
    }

    /* renamed from: e */
    private static <T> long m25971e(T t, long j) {
        return ((Long) C10341k3.m26225f(t, j)).longValue();
    }

    /* renamed from: f */
    private final int m25972f(int i) {
        int i2 = this.f26904c;
        if (i >= i2) {
            int i3 = this.f26906e;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.f26902a[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.f26905d) {
                int i5 = i3 - i2;
                int length = (this.f26902a.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.f26902a[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: f */
    private static <T> boolean m25973f(T t, long j) {
        return ((Boolean) C10341k3.m26225f(t, j)).booleanValue();
    }

    /* renamed from: a */
    public final T mo27829a() {
        return this.f26914m.mo27865a(this.f26907f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0385, code lost:
        r15.mo28020b(r9, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r8 & 1048575)), m25947a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a0, code lost:
        r15.zzb(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b1, code lost:
        r15.zze(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c2, code lost:
        r15.mo28012a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d3, code lost:
        r15.mo28018b(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e4, code lost:
        r15.mo28011a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f5, code lost:
        r15.zzd(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0400, code lost:
        r15.mo28013a(r9, (com.google.android.gms.internal.clearcut.C10431y) com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0413, code lost:
        r15.mo28014a(r9, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r8 & 1048575)), m25947a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0428, code lost:
        m25950a(r9, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x043f, code lost:
        r15.mo28016a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0450, code lost:
        r15.zzf(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0460, code lost:
        r15.zzc(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0470, code lost:
        r15.zzc(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0480, code lost:
        r15.zza(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0490, code lost:
        r15.mo28019b(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a0, code lost:
        r15.zza(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b0, code lost:
        r15.zza(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0843, code lost:
        r15.mo28020b(r10, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r9 & 1048575)), m25947a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x085e, code lost:
        r15.zzb(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x086f, code lost:
        r15.zze(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0880, code lost:
        r15.mo28012a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0891, code lost:
        r15.mo28018b(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08a2, code lost:
        r15.mo28011a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08b3, code lost:
        r15.zzd(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08be, code lost:
        r15.mo28013a(r10, (com.google.android.gms.internal.clearcut.C10431y) com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08d1, code lost:
        r15.mo28014a(r10, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r9 & 1048575)), m25947a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08e6, code lost:
        m25950a(r10, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08fd, code lost:
        r15.mo28016a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090e, code lost:
        r15.zzf(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x091e, code lost:
        r15.zzc(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x092e, code lost:
        r15.zzc(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x093e, code lost:
        r15.zza(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x094e, code lost:
        r15.mo28019b(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x095e, code lost:
        r15.zza(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x096e, code lost:
        r15.zza(r10, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0977  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27830a(T r14, com.google.android.gms.internal.clearcut.C10435y3 r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo28009a()
            int r1 = com.google.android.gms.internal.clearcut.C10273b1.C10278e.f26900l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04cf
            com.google.android.gms.internal.clearcut.d3<?, ?> r0 = r13.f26916o
            m25951a(r0, (T) r14, r15)
            boolean r0 = r13.f26908g
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.clearcut.p0<?> r0 = r13.f26917p
            com.google.android.gms.internal.clearcut.t0 r0 = r0.mo28075a(r14)
            boolean r1 = r0.mo28129b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo28127a()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f26902a
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0037:
            if (r7 < 0) goto L_0x04b7
            int r8 = r13.m25967d(r7)
            int[] r9 = r13.f26902a
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.clearcut.p0<?> r10 = r13.f26917p
            int r10 = r10.mo28074a(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.clearcut.p0<?> r10 = r13.f26917p
            r10.mo28076a(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a4;
                case 1: goto L_0x0494;
                case 2: goto L_0x0484;
                case 3: goto L_0x0474;
                case 4: goto L_0x0464;
                case 5: goto L_0x0454;
                case 6: goto L_0x0444;
                case 7: goto L_0x0433;
                case 8: goto L_0x0422;
                case 9: goto L_0x040d;
                case 10: goto L_0x03fa;
                case 11: goto L_0x03e9;
                case 12: goto L_0x03d8;
                case 13: goto L_0x03c7;
                case 14: goto L_0x03b6;
                case 15: goto L_0x03a5;
                case 16: goto L_0x0394;
                case 17: goto L_0x037f;
                case 18: goto L_0x036e;
                case 19: goto L_0x035d;
                case 20: goto L_0x034c;
                case 21: goto L_0x033b;
                case 22: goto L_0x032a;
                case 23: goto L_0x0319;
                case 24: goto L_0x0308;
                case 25: goto L_0x02f7;
                case 26: goto L_0x02e6;
                case 27: goto L_0x02d1;
                case 28: goto L_0x02c0;
                case 29: goto L_0x02af;
                case 30: goto L_0x029e;
                case 31: goto L_0x028d;
                case 32: goto L_0x027c;
                case 33: goto L_0x026b;
                case 34: goto L_0x025a;
                case 35: goto L_0x0249;
                case 36: goto L_0x0238;
                case 37: goto L_0x0227;
                case 38: goto L_0x0216;
                case 39: goto L_0x0205;
                case 40: goto L_0x01f4;
                case 41: goto L_0x01e3;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c1;
                case 44: goto L_0x01b0;
                case 45: goto L_0x019f;
                case 46: goto L_0x018e;
                case 47: goto L_0x017d;
                case 48: goto L_0x016c;
                case 49: goto L_0x0157;
                case 50: goto L_0x014c;
                case 51: goto L_0x013e;
                case 52: goto L_0x0130;
                case 53: goto L_0x0122;
                case 54: goto L_0x0114;
                case 55: goto L_0x0106;
                case 56: goto L_0x00f8;
                case 57: goto L_0x00ea;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00d4;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00c4;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x007e;
                case 67: goto L_0x0070;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x04b3
        L_0x0068:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0385
        L_0x0070:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m25971e(r14, r10)
            goto L_0x03a0
        L_0x007e:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m25968d(r14, r10)
            goto L_0x03b1
        L_0x008c:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m25971e(r14, r10)
            goto L_0x03c2
        L_0x009a:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m25968d(r14, r10)
            goto L_0x03d3
        L_0x00a8:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m25968d(r14, r10)
            goto L_0x03e4
        L_0x00b6:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m25968d(r14, r10)
            goto L_0x03f5
        L_0x00c4:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0400
        L_0x00cc:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0413
        L_0x00d4:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0428
        L_0x00dc:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m25973f(r14, r10)
            goto L_0x043f
        L_0x00ea:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m25968d(r14, r10)
            goto L_0x0450
        L_0x00f8:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m25971e(r14, r10)
            goto L_0x0460
        L_0x0106:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m25968d(r14, r10)
            goto L_0x0470
        L_0x0114:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m25971e(r14, r10)
            goto L_0x0480
        L_0x0122:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m25971e(r14, r10)
            goto L_0x0490
        L_0x0130:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m25964c(r14, r10)
            goto L_0x04a0
        L_0x013e:
            boolean r10 = r13.m25955a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m25958b((T) r14, r10)
            goto L_0x04b0
        L_0x014c:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            r13.m25952a(r15, r9, r8, r7)
            goto L_0x04b3
        L_0x0157:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.m2 r10 = r13.m25947a(r7)
            com.google.android.gms.internal.clearcut.C10371o2.m26388b(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x016c:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26401e(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x017d:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26416j(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x018e:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26407g(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x019f:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26418l(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01b0:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26419m(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01c1:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26413i(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01d2:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26420n(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01e3:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26417k(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01f4:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26404f(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0205:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26410h(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0216:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26397d(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0227:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26393c(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0238:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26389b(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0249:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26375a(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x025a:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26401e(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x026b:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26416j(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x027c:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26407g(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x028d:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26418l(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x029e:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26419m(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02af:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26413i(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02c0:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26387b(r9, r8, r15)
            goto L_0x04b3
        L_0x02d1:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.m2 r10 = r13.m25947a(r7)
            com.google.android.gms.internal.clearcut.C10371o2.m26374a(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x02e6:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26373a(r9, r8, r15)
            goto L_0x04b3
        L_0x02f7:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26420n(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0308:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26417k(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0319:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26404f(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x032a:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26410h(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x033b:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26397d(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x034c:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26393c(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x035d:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26389b(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x036e:
            int[] r9 = r13.f26902a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C10371o2.m26375a(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x037f:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0385:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            com.google.android.gms.internal.clearcut.m2 r10 = r13.m25947a(r7)
            r15.mo28020b(r9, r8, r10)
            goto L_0x04b3
        L_0x0394:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r10)
        L_0x03a0:
            r15.zzb(r9, r10)
            goto L_0x04b3
        L_0x03a5:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r10)
        L_0x03b1:
            r15.zze(r9, r8)
            goto L_0x04b3
        L_0x03b6:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r10)
        L_0x03c2:
            r15.mo28012a(r9, r10)
            goto L_0x04b3
        L_0x03c7:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r10)
        L_0x03d3:
            r15.mo28018b(r9, r8)
            goto L_0x04b3
        L_0x03d8:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r10)
        L_0x03e4:
            r15.mo28011a(r9, r8)
            goto L_0x04b3
        L_0x03e9:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r10)
        L_0x03f5:
            r15.zzd(r9, r8)
            goto L_0x04b3
        L_0x03fa:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0400:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            com.google.android.gms.internal.clearcut.y r8 = (com.google.android.gms.internal.clearcut.C10431y) r8
            r15.mo28013a(r9, r8)
            goto L_0x04b3
        L_0x040d:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0413:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            com.google.android.gms.internal.clearcut.m2 r10 = r13.m25947a(r7)
            r15.mo28014a(r9, r8, r10)
            goto L_0x04b3
        L_0x0422:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0428:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r10)
            m25950a(r9, r8, r15)
            goto L_0x04b3
        L_0x0433:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.clearcut.C10341k3.m26217c(r14, r10)
        L_0x043f:
            r15.mo28016a(r9, r8)
            goto L_0x04b3
        L_0x0444:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r10)
        L_0x0450:
            r15.zzf(r9, r8)
            goto L_0x04b3
        L_0x0454:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r10)
        L_0x0460:
            r15.zzc(r9, r10)
            goto L_0x04b3
        L_0x0464:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r10)
        L_0x0470:
            r15.zzc(r9, r8)
            goto L_0x04b3
        L_0x0474:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r10)
        L_0x0480:
            r15.zza(r9, r10)
            goto L_0x04b3
        L_0x0484:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r10)
        L_0x0490:
            r15.mo28019b(r9, r10)
            goto L_0x04b3
        L_0x0494:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.clearcut.C10341k3.m26218d(r14, r10)
        L_0x04a0:
            r15.zza(r9, r8)
            goto L_0x04b3
        L_0x04a4:
            boolean r10 = r13.m25954a((T) r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.clearcut.C10341k3.m26222e(r14, r10)
        L_0x04b0:
            r15.zza(r9, r10)
        L_0x04b3:
            int r7 = r7 + -4
            goto L_0x0037
        L_0x04b7:
            if (r1 == 0) goto L_0x04ce
            com.google.android.gms.internal.clearcut.p0<?> r14 = r13.f26917p
            r14.mo28076a(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04cc
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x04b7
        L_0x04cc:
            r1 = r3
            goto L_0x04b7
        L_0x04ce:
            return
        L_0x04cf:
            boolean r0 = r13.f26909h
            if (r0 == 0) goto L_0x0992
            boolean r0 = r13.f26908g
            if (r0 == 0) goto L_0x04ee
            com.google.android.gms.internal.clearcut.p0<?> r0 = r13.f26917p
            com.google.android.gms.internal.clearcut.t0 r0 = r0.mo28075a(r14)
            boolean r1 = r0.mo28129b()
            if (r1 != 0) goto L_0x04ee
            java.util.Iterator r0 = r0.mo28133e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04f0
        L_0x04ee:
            r0 = r3
            r1 = r0
        L_0x04f0:
            int[] r7 = r13.f26902a
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x04f5:
            if (r1 >= r7) goto L_0x0975
            int r9 = r13.m25967d(r1)
            int[] r10 = r13.f26902a
            r10 = r10[r1]
        L_0x04ff:
            if (r8 == 0) goto L_0x051d
            com.google.android.gms.internal.clearcut.p0<?> r11 = r13.f26917p
            int r11 = r11.mo28074a(r8)
            if (r11 > r10) goto L_0x051d
            com.google.android.gms.internal.clearcut.p0<?> r11 = r13.f26917p
            r11.mo28076a(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x051b
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x04ff
        L_0x051b:
            r8 = r3
            goto L_0x04ff
        L_0x051d:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0962;
                case 1: goto L_0x0952;
                case 2: goto L_0x0942;
                case 3: goto L_0x0932;
                case 4: goto L_0x0922;
                case 5: goto L_0x0912;
                case 6: goto L_0x0902;
                case 7: goto L_0x08f1;
                case 8: goto L_0x08e0;
                case 9: goto L_0x08cb;
                case 10: goto L_0x08b8;
                case 11: goto L_0x08a7;
                case 12: goto L_0x0896;
                case 13: goto L_0x0885;
                case 14: goto L_0x0874;
                case 15: goto L_0x0863;
                case 16: goto L_0x0852;
                case 17: goto L_0x083d;
                case 18: goto L_0x082c;
                case 19: goto L_0x081b;
                case 20: goto L_0x080a;
                case 21: goto L_0x07f9;
                case 22: goto L_0x07e8;
                case 23: goto L_0x07d7;
                case 24: goto L_0x07c6;
                case 25: goto L_0x07b5;
                case 26: goto L_0x07a4;
                case 27: goto L_0x078f;
                case 28: goto L_0x077e;
                case 29: goto L_0x076d;
                case 30: goto L_0x075c;
                case 31: goto L_0x074b;
                case 32: goto L_0x073a;
                case 33: goto L_0x0729;
                case 34: goto L_0x0718;
                case 35: goto L_0x0707;
                case 36: goto L_0x06f6;
                case 37: goto L_0x06e5;
                case 38: goto L_0x06d4;
                case 39: goto L_0x06c3;
                case 40: goto L_0x06b2;
                case 41: goto L_0x06a1;
                case 42: goto L_0x0690;
                case 43: goto L_0x067f;
                case 44: goto L_0x066e;
                case 45: goto L_0x065d;
                case 46: goto L_0x064c;
                case 47: goto L_0x063b;
                case 48: goto L_0x062a;
                case 49: goto L_0x0615;
                case 50: goto L_0x060a;
                case 51: goto L_0x05fc;
                case 52: goto L_0x05ee;
                case 53: goto L_0x05e0;
                case 54: goto L_0x05d2;
                case 55: goto L_0x05c4;
                case 56: goto L_0x05b6;
                case 57: goto L_0x05a8;
                case 58: goto L_0x059a;
                case 59: goto L_0x0592;
                case 60: goto L_0x058a;
                case 61: goto L_0x0582;
                case 62: goto L_0x0574;
                case 63: goto L_0x0566;
                case 64: goto L_0x0558;
                case 65: goto L_0x054a;
                case 66: goto L_0x053c;
                case 67: goto L_0x052e;
                case 68: goto L_0x0526;
                default: goto L_0x0524;
            }
        L_0x0524:
            goto L_0x0971
        L_0x0526:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x0843
        L_0x052e:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m25971e(r14, r11)
            goto L_0x085e
        L_0x053c:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m25968d(r14, r11)
            goto L_0x086f
        L_0x054a:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m25971e(r14, r11)
            goto L_0x0880
        L_0x0558:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m25968d(r14, r11)
            goto L_0x0891
        L_0x0566:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m25968d(r14, r11)
            goto L_0x08a2
        L_0x0574:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m25968d(r14, r11)
            goto L_0x08b3
        L_0x0582:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x08be
        L_0x058a:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x08d1
        L_0x0592:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            goto L_0x08e6
        L_0x059a:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m25973f(r14, r11)
            goto L_0x08fd
        L_0x05a8:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m25968d(r14, r11)
            goto L_0x090e
        L_0x05b6:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m25971e(r14, r11)
            goto L_0x091e
        L_0x05c4:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m25968d(r14, r11)
            goto L_0x092e
        L_0x05d2:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m25971e(r14, r11)
            goto L_0x093e
        L_0x05e0:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m25971e(r14, r11)
            goto L_0x094e
        L_0x05ee:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m25964c(r14, r11)
            goto L_0x095e
        L_0x05fc:
            boolean r11 = r13.m25955a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m25958b((T) r14, r11)
            goto L_0x096e
        L_0x060a:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            r13.m25952a(r15, r10, r9, r1)
            goto L_0x0971
        L_0x0615:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.m2 r11 = r13.m25947a(r1)
            com.google.android.gms.internal.clearcut.C10371o2.m26388b(r10, r9, r15, r11)
            goto L_0x0971
        L_0x062a:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26401e(r10, r9, r15, r4)
            goto L_0x0971
        L_0x063b:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26416j(r10, r9, r15, r4)
            goto L_0x0971
        L_0x064c:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26407g(r10, r9, r15, r4)
            goto L_0x0971
        L_0x065d:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26418l(r10, r9, r15, r4)
            goto L_0x0971
        L_0x066e:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26419m(r10, r9, r15, r4)
            goto L_0x0971
        L_0x067f:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26413i(r10, r9, r15, r4)
            goto L_0x0971
        L_0x0690:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26420n(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06a1:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26417k(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06b2:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26404f(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06c3:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26410h(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06d4:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26397d(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06e5:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26393c(r10, r9, r15, r4)
            goto L_0x0971
        L_0x06f6:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26389b(r10, r9, r15, r4)
            goto L_0x0971
        L_0x0707:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26375a(r10, r9, r15, r4)
            goto L_0x0971
        L_0x0718:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26401e(r10, r9, r15, r5)
            goto L_0x0971
        L_0x0729:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26416j(r10, r9, r15, r5)
            goto L_0x0971
        L_0x073a:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26407g(r10, r9, r15, r5)
            goto L_0x0971
        L_0x074b:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26418l(r10, r9, r15, r5)
            goto L_0x0971
        L_0x075c:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26419m(r10, r9, r15, r5)
            goto L_0x0971
        L_0x076d:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26413i(r10, r9, r15, r5)
            goto L_0x0971
        L_0x077e:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26387b(r10, r9, r15)
            goto L_0x0971
        L_0x078f:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.m2 r11 = r13.m25947a(r1)
            com.google.android.gms.internal.clearcut.C10371o2.m26374a(r10, r9, r15, r11)
            goto L_0x0971
        L_0x07a4:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26373a(r10, r9, r15)
            goto L_0x0971
        L_0x07b5:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26420n(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07c6:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26417k(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07d7:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26404f(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07e8:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26410h(r10, r9, r15, r5)
            goto L_0x0971
        L_0x07f9:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26397d(r10, r9, r15, r5)
            goto L_0x0971
        L_0x080a:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26393c(r10, r9, r15, r5)
            goto L_0x0971
        L_0x081b:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26389b(r10, r9, r15, r5)
            goto L_0x0971
        L_0x082c:
            int[] r10 = r13.f26902a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C10371o2.m26375a(r10, r9, r15, r5)
            goto L_0x0971
        L_0x083d:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x0843:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            com.google.android.gms.internal.clearcut.m2 r11 = r13.m25947a(r1)
            r15.mo28020b(r10, r9, r11)
            goto L_0x0971
        L_0x0852:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r11)
        L_0x085e:
            r15.zzb(r10, r11)
            goto L_0x0971
        L_0x0863:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r11)
        L_0x086f:
            r15.zze(r10, r9)
            goto L_0x0971
        L_0x0874:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r11)
        L_0x0880:
            r15.mo28012a(r10, r11)
            goto L_0x0971
        L_0x0885:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r11)
        L_0x0891:
            r15.mo28018b(r10, r9)
            goto L_0x0971
        L_0x0896:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r11)
        L_0x08a2:
            r15.mo28011a(r10, r9)
            goto L_0x0971
        L_0x08a7:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r11)
        L_0x08b3:
            r15.zzd(r10, r9)
            goto L_0x0971
        L_0x08b8:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x08be:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            com.google.android.gms.internal.clearcut.y r9 = (com.google.android.gms.internal.clearcut.C10431y) r9
            r15.mo28013a(r10, r9)
            goto L_0x0971
        L_0x08cb:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x08d1:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            com.google.android.gms.internal.clearcut.m2 r11 = r13.m25947a(r1)
            r15.mo28014a(r10, r9, r11)
            goto L_0x0971
        L_0x08e0:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
        L_0x08e6:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r14, r11)
            m25950a(r10, r9, r15)
            goto L_0x0971
        L_0x08f1:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.clearcut.C10341k3.m26217c(r14, r11)
        L_0x08fd:
            r15.mo28016a(r10, r9)
            goto L_0x0971
        L_0x0902:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r11)
        L_0x090e:
            r15.zzf(r10, r9)
            goto L_0x0971
        L_0x0912:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r11)
        L_0x091e:
            r15.zzc(r10, r11)
            goto L_0x0971
        L_0x0922:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r14, r11)
        L_0x092e:
            r15.zzc(r10, r9)
            goto L_0x0971
        L_0x0932:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r11)
        L_0x093e:
            r15.zza(r10, r11)
            goto L_0x0971
        L_0x0942:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r14, r11)
        L_0x094e:
            r15.mo28019b(r10, r11)
            goto L_0x0971
        L_0x0952:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.clearcut.C10341k3.m26218d(r14, r11)
        L_0x095e:
            r15.zza(r10, r9)
            goto L_0x0971
        L_0x0962:
            boolean r11 = r13.m25954a((T) r14, r1)
            if (r11 == 0) goto L_0x0971
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.clearcut.C10341k3.m26222e(r14, r11)
        L_0x096e:
            r15.zza(r10, r11)
        L_0x0971:
            int r1 = r1 + 4
            goto L_0x04f5
        L_0x0975:
            if (r8 == 0) goto L_0x098c
            com.google.android.gms.internal.clearcut.p0<?> r1 = r13.f26917p
            r1.mo28076a(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x098a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0975
        L_0x098a:
            r8 = r3
            goto L_0x0975
        L_0x098c:
            com.google.android.gms.internal.clearcut.d3<?, ?> r0 = r13.f26916o
            m25951a(r0, (T) r14, r15)
            return
        L_0x0992:
            r13.m25962b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.mo27830a(java.lang.Object, com.google.android.gms.internal.clearcut.y3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        com.google.android.gms.internal.clearcut.C10341k3.m26202a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r8, r2));
        m25961b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.google.android.gms.internal.clearcut.C10341k3.m26202a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        com.google.android.gms.internal.clearcut.C10341k3.m26200a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        com.google.android.gms.internal.clearcut.C10341k3.m26201a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.C10341k3.m26208b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        m25960b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27831a(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0105
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f26902a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m25967d(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f26902a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.m25955a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m25963b((T) r7, (T) r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m25955a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r8, r2)
            com.google.android.gms.internal.clearcut.C10341k3.m26202a(r7, r2, r1)
            r6.m25961b((T) r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.clearcut.v1 r1 = r6.f26918q
            com.google.android.gms.internal.clearcut.C10371o2.m26378a(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.clearcut.l1 r1 = r6.f26915n
            r1.mo28050a(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m25953a((T) r7, (T) r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r8, r2)
            com.google.android.gms.internal.clearcut.C10341k3.m26202a(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.clearcut.C10341k3.m26217c(r8, r2)
            com.google.android.gms.internal.clearcut.C10341k3.m26203a(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r8, r2)
            com.google.android.gms.internal.clearcut.C10341k3.m26200a(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r8, r2)
            com.google.android.gms.internal.clearcut.C10341k3.m26201a(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.clearcut.C10341k3.m26218d(r8, r2)
            com.google.android.gms.internal.clearcut.C10341k3.m26199a(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m25954a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.clearcut.C10341k3.m26222e(r8, r2)
            com.google.android.gms.internal.clearcut.C10341k3.m26198a(r7, r2, r4)
        L_0x00eb:
            r6.m25960b((T) r7, r0)
        L_0x00ee:
            int r0 = r0 + 4
            goto L_0x0003
        L_0x00f2:
            boolean r0 = r6.f26909h
            if (r0 != 0) goto L_0x0104
            com.google.android.gms.internal.clearcut.d3<?, ?> r0 = r6.f26916o
            com.google.android.gms.internal.clearcut.C10371o2.m26376a(r0, r7, r8)
            boolean r0 = r6.f26908g
            if (r0 == 0) goto L_0x0104
            com.google.android.gms.internal.clearcut.p0<?> r0 = r6.f26917p
            com.google.android.gms.internal.clearcut.C10371o2.m26377a(r0, r7, r8)
        L_0x0104:
            return
        L_0x0105:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.mo27831a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r16v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v8, types: [int] */
    /* JADX WARNING: type inference failed for: r1v2, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v6, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v6, types: [int] */
    /* JADX WARNING: type inference failed for: r1v9, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r1v25, types: [int] */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = r11.f27221c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r12, r10, r11);
        r1 = r11.f27219a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r15) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a0, code lost:
        if (r0 == r15) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r24v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 200
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27832a(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.C10407u r27) throws java.io.IOException {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.f26909h
            if (r0 == 0) goto L_0x01cd
            sun.misc.Unsafe r9 = f26901r
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c4
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26506a(r0, r12, r1, r11)
            int r1 = r11.f27219a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.m25972f(r6)
            if (r8 < 0) goto L_0x01a4
            int[] r0 = r15.f26902a
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0106
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0091;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x00ce;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c1;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a4
        L_0x004d:
            if (r7 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r12, r10, r11)
            long r0 = r11.f27220b
            long r4 = com.google.android.gms.internal.clearcut.C10319h0.m26124a(r0)
            goto L_0x00e3
        L_0x005b:
            if (r7 != 0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r12, r10, r11)
            int r1 = r11.f27219a
            int r1 = com.google.android.gms.internal.clearcut.C10319h0.m26123a(r1)
            goto L_0x00d6
        L_0x0069:
            if (r7 != 0) goto L_0x01a4
            goto L_0x00d0
        L_0x006d:
            if (r7 != r1) goto L_0x01a4
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26516e(r12, r10, r11)
        L_0x0073:
            java.lang.Object r1 = r11.f27221c
        L_0x0075:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0079:
            if (r7 != r1) goto L_0x01a4
            com.google.android.gms.internal.clearcut.m2 r0 = r15.m25947a(r8)
            int r0 = m25941a(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x008a
            goto L_0x0073
        L_0x008a:
            java.lang.Object r4 = r11.f27221c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C10292d1.m26019a(r1, r4)
            goto L_0x0075
        L_0x0091:
            if (r7 != r1) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x009d
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26513c(r12, r10, r11)
            goto L_0x0073
        L_0x009d:
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26515d(r12, r10, r11)
            goto L_0x0073
        L_0x00a2:
            if (r7 != 0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r12, r10, r11)
            long r4 = r11.f27220b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            com.google.android.gms.internal.clearcut.C10341k3.m26203a(r14, r2, r6)
            goto L_0x0012
        L_0x00b7:
            if (r7 != r0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26507a(r12, r10)
            r9.putInt(r14, r2, r0)
            goto L_0x00f5
        L_0x00c1:
            if (r7 != r6) goto L_0x01a4
            long r4 = com.google.android.gms.internal.clearcut.C10401t.m26511b(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0102
        L_0x00ce:
            if (r7 != 0) goto L_0x01a4
        L_0x00d0:
            int r0 = com.google.android.gms.internal.clearcut.C10401t.m26508a(r12, r10, r11)
            int r1 = r11.f27219a
        L_0x00d6:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00db:
            if (r7 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.clearcut.C10401t.m26510b(r12, r10, r11)
            long r4 = r11.f27220b
        L_0x00e3:
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ec:
            if (r7 != r0) goto L_0x01a4
            float r0 = com.google.android.gms.internal.clearcut.C10401t.m26514d(r12, r10)
            com.google.android.gms.internal.clearcut.C10341k3.m26199a(r14, r2, r0)
        L_0x00f5:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00f9:
            if (r7 != r6) goto L_0x01a4
            double r0 = com.google.android.gms.internal.clearcut.C10401t.m26512c(r12, r10)
            com.google.android.gms.internal.clearcut.C10341k3.m26198a(r14, r2, r0)
        L_0x0102:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0106:
            r0 = 27
            if (r4 != r0) goto L_0x013e
            if (r7 != r1) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.clearcut.zzcn r0 = (com.google.android.gms.internal.clearcut.zzcn) r0
            boolean r1 = r0.zzu()
            if (r1 != 0) goto L_0x012a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0121
            r1 = 10
            goto L_0x0123
        L_0x0121:
            int r1 = r1 << 1
        L_0x0123:
            com.google.android.gms.internal.clearcut.zzcn r0 = r0.zzi(r1)
            r9.putObject(r14, r2, r0)
        L_0x012a:
            r5 = r0
            com.google.android.gms.internal.clearcut.m2 r0 = r15.m25947a(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = m25939a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x013e:
            r0 = 49
            if (r4 > r0) goto L_0x0167
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.m25943a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x01b6
            goto L_0x01a2
        L_0x0167:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x018a
            if (r7 == r1) goto L_0x0177
            goto L_0x01a7
        L_0x0177:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r7 = r19
            r9 = r27
            r0.m25944a(r1, r2, r3, r4, r5, r6, r7, r9)
            r0 = 0
            throw r0
        L_0x018a:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.m25942a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x01b6
        L_0x01a2:
            r2 = r0
            goto L_0x01a8
        L_0x01a4:
            r21 = r9
            r15 = r10
        L_0x01a7:
            r2 = r15
        L_0x01a8:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = m25937a(r0, r1, r2, r3, r4, r5)
        L_0x01b6:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x01c4:
            r4 = r13
            if (r0 != r4) goto L_0x01c8
            return
        L_0x01c8:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.m26832d()
            throw r0
        L_0x01cd:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.m25945a((T) r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.mo27832a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.u):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27833a(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int[] r2 = r0.f26911j
            r3 = 1
            if (r2 == 0) goto L_0x00fe
            int r4 = r2.length
            if (r4 != 0) goto L_0x000e
            goto L_0x00fe
        L_0x000e:
            r4 = -1
            int r5 = r2.length
            r6 = 0
            r4 = 0
            r7 = -1
            r8 = 0
        L_0x0014:
            if (r4 >= r5) goto L_0x00eb
            r9 = r2[r4]
            int r10 = r0.m25972f(r9)
            int r11 = r0.m25967d(r10)
            boolean r12 = r0.f26909h
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r12 != 0) goto L_0x0042
            int[] r12 = r0.f26902a
            int r14 = r10 + 2
            r12 = r12[r14]
            r14 = r12 & r13
            int r12 = r12 >>> 20
            int r12 = r3 << r12
            if (r14 == r7) goto L_0x0040
            sun.misc.Unsafe r7 = f26901r
            r15 = r4
            long r3 = (long) r14
            int r3 = r7.getInt(r1, r3)
            r8 = r3
            r7 = r14
            goto L_0x0044
        L_0x0040:
            r15 = r4
            goto L_0x0044
        L_0x0042:
            r15 = r4
            r12 = 0
        L_0x0044:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r11
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 == 0) goto L_0x0055
            boolean r3 = r0.m25956a((T) r1, r10, r8, r12)
            if (r3 != 0) goto L_0x0055
            return r6
        L_0x0055:
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r11
            int r3 = r3 >>> 20
            r4 = 9
            if (r3 == r4) goto L_0x00d5
            r4 = 17
            if (r3 == r4) goto L_0x00d5
            r4 = 27
            if (r3 == r4) goto L_0x00a8
            r4 = 60
            if (r3 == r4) goto L_0x0097
            r4 = 68
            if (r3 == r4) goto L_0x0097
            r4 = 49
            if (r3 == r4) goto L_0x00a8
            r4 = 50
            if (r3 == r4) goto L_0x0078
            goto L_0x00e6
        L_0x0078:
            com.google.android.gms.internal.clearcut.v1 r3 = r0.f26918q
            r4 = r11 & r13
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r11)
            java.util.Map r3 = r3.mo28167e(r4)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x008c
            goto L_0x00e6
        L_0x008c:
            java.lang.Object r1 = r0.m25959b(r10)
            com.google.android.gms.internal.clearcut.v1 r2 = r0.f26918q
            r2.mo28163a(r1)
            r1 = 0
            throw r1
        L_0x0097:
            boolean r3 = r0.m25955a((T) r1, r9, r10)
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.internal.clearcut.m2 r3 = r0.m25947a(r10)
            boolean r3 = m25957a(r1, r11, r3)
            if (r3 != 0) goto L_0x00e6
            return r6
        L_0x00a8:
            r3 = r11 & r13
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r3)
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x00d1
            com.google.android.gms.internal.clearcut.m2 r4 = r0.m25947a(r10)
            r9 = 0
        L_0x00bc:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x00d1
            java.lang.Object r10 = r3.get(r9)
            boolean r10 = r4.mo27833a(r10)
            if (r10 != 0) goto L_0x00ce
            r3 = 0
            goto L_0x00d2
        L_0x00ce:
            int r9 = r9 + 1
            goto L_0x00bc
        L_0x00d1:
            r3 = 1
        L_0x00d2:
            if (r3 != 0) goto L_0x00e6
            return r6
        L_0x00d5:
            boolean r3 = r0.m25956a((T) r1, r10, r8, r12)
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.internal.clearcut.m2 r3 = r0.m25947a(r10)
            boolean r3 = m25957a(r1, r11, r3)
            if (r3 != 0) goto L_0x00e6
            return r6
        L_0x00e6:
            int r4 = r15 + 1
            r3 = 1
            goto L_0x0014
        L_0x00eb:
            boolean r2 = r0.f26908g
            if (r2 == 0) goto L_0x00fc
            com.google.android.gms.internal.clearcut.p0<?> r2 = r0.f26917p
            com.google.android.gms.internal.clearcut.t0 r1 = r2.mo28075a(r1)
            boolean r1 = r1.mo28132d()
            if (r1 != 0) goto L_0x00fc
            return r6
        L_0x00fc:
            r1 = 1
            return r1
        L_0x00fe:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.mo27833a(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m25968d(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m25971e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.clearcut.C10292d1.m26016a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.clearcut.C10292d1.m26015a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27834b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f26902a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.m25967d(r1)
            int[] r4 = r8.f26902a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = m25973f(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m25968d(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m25971e(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = m25964c(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.m25955a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = m25958b((T) r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.clearcut.C10341k3.m26217c(r9, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.clearcut.C10292d1.m26016a(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.clearcut.C10341k3.m26218d(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.clearcut.C10341k3.m26222e(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.clearcut.C10292d1.m26015a(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.d3<?, ?> r0 = r8.f26916o
            java.lang.Object r0 = r0.mo27874c(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f26908g
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.p0<?> r0 = r8.f26917p
            com.google.android.gms.internal.clearcut.t0 r9 = r0.mo28075a(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.mo27834b(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.clearcut.C10371o2.m26381a(com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6), com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.clearcut.C10371o2.m26381a(com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6), com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.clearcut.C10371o2.m26381a(com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6), com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.clearcut.C10371o2.m26381a(com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6), com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26217c(r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26217c(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26192a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6) == com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.C10371o2.m26381a(com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6), com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)) != false) goto L_0x01a3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27835b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f26902a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01aa
            int r4 = r9.m25967d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01a3
        L_0x001c:
            int r4 = r9.m25970e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r4)
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r4)
            if (r8 != r4) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C10371o2.m26381a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)
            boolean r3 = com.google.android.gms.internal.clearcut.C10371o2.m26381a(r3, r4)
            goto L_0x01a3
        L_0x004a:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C10371o2.m26381a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0060:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x0074:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0086:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x009a:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00ac:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x00be:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00d0:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C10371o2.m26381a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x00e6:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C10371o2.m26381a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x00fc:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C10371o2.m26381a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x0112:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            boolean r4 = com.google.android.gms.internal.clearcut.C10341k3.m26217c(r10, r6)
            boolean r5 = com.google.android.gms.internal.clearcut.C10341k3.m26217c(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0124:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0135:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0148:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0159:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x016c:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x017f:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r11, r6)
            if (r4 == r5) goto L_0x01a3
        L_0x018f:
            goto L_0x01a2
        L_0x0190:
            boolean r4 = r9.m25966c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            if (r3 != 0) goto L_0x01a6
            return r1
        L_0x01a6:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01aa:
            com.google.android.gms.internal.clearcut.d3<?, ?> r0 = r9.f26916o
            java.lang.Object r0 = r0.mo27874c(r10)
            com.google.android.gms.internal.clearcut.d3<?, ?> r2 = r9.f26916o
            java.lang.Object r2 = r2.mo27874c(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bd
            return r1
        L_0x01bd:
            boolean r0 = r9.f26908g
            if (r0 == 0) goto L_0x01d2
            com.google.android.gms.internal.clearcut.p0<?> r0 = r9.f26917p
            com.google.android.gms.internal.clearcut.t0 r10 = r0.mo28075a(r10)
            com.google.android.gms.internal.clearcut.p0<?> r0 = r9.f26917p
            com.google.android.gms.internal.clearcut.t0 r11 = r0.mo28075a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.mo27835b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.clearcut.zzbn.m26689e(r3) + com.google.android.gms.internal.clearcut.zzbn.m26696g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26683c(r3, (com.google.android.gms.internal.clearcut.zzdo) com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5), m25947a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26694f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26701h(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26702h(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26708j(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26710k(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26697g(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26681c(r3, (com.google.android.gms.internal.clearcut.C10431y) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = com.google.android.gms.internal.clearcut.C10371o2.m26364a(r3, com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5), m25947a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.C10431y) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26676b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26677b(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26705i(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26698g(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26693f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26690e(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26685d(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26673b(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m26672b(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0417, code lost:
        if (m25955a(r1, r15, r3) != false) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0437, code lost:
        if (m25955a(r1, r15, r3) != false) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x043f, code lost:
        if (m25955a(r1, r15, r3) != false) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x045f, code lost:
        if (m25955a(r1, r15, r3) != false) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0467, code lost:
        if (m25955a(r1, r15, r3) != false) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0477, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.C10431y) != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x047f, code lost:
        if (m25955a(r1, r15, r3) != false) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0517, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0529, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x053b, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x054d, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x055f, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0571, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0583, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0595, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05a6, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b7, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05c8, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05d9, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05ea, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fb, code lost:
        if (r0.f26910i != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fd, code lost:
        r2.putInt(r1, (long) r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0601, code lost:
        r9 = (com.google.android.gms.internal.clearcut.zzbn.m26689e(r15) + com.google.android.gms.internal.clearcut.zzbn.m26696g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06ac, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06ae, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b7, code lost:
        if ((r12 & r18) != 0) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06b9, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26683c(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r1, r9), m25947a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06d0, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26694f(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06dd, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26701h(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06e4, code lost:
        if ((r12 & r18) != 0) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06e6, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26702h(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ef, code lost:
        if ((r12 & r18) != 0) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f1, code lost:
        r9 = com.google.android.gms.internal.clearcut.zzbn.m26708j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06f6, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0700, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26710k(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x070d, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26697g(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0714, code lost:
        if ((r12 & r18) != 0) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0716, code lost:
        r4 = r2.getObject(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x071a, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26681c(r15, (com.google.android.gms.internal.clearcut.C10431y) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0723, code lost:
        if ((r12 & r18) != 0) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0725, code lost:
        r4 = com.google.android.gms.internal.clearcut.C10371o2.m26364a(r15, r2.getObject(r1, r9), m25947a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.C10431y) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x073d, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.C10431y) != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0740, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26676b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x074a, code lost:
        if ((r12 & r18) != 0) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x074c, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m26677b(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0799, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x07bb, code lost:
        r3 = r3 + 4;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.f26910i != false) goto L_0x020d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27836c(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f26909h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03b8
            sun.misc.Unsafe r2 = f26901r
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f26902a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b0
            int r14 = r0.m25967d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f26902a
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.clearcut.w0 r14 = com.google.android.gms.internal.clearcut.C10420w0.DOUBLE_LIST_PACKED
            int r14 = r14.mo28175a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.clearcut.w0 r14 = com.google.android.gms.internal.clearcut.C10420w0.SINT64_LIST_PACKED
            int r14 = r14.mo28175a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f26902a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0380;
                case 3: goto L_0x0370;
                case 4: goto L_0x0360;
                case 5: goto L_0x0354;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x0311;
                case 10: goto L_0x0300;
                case 11: goto L_0x02f1;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d7;
                case 14: goto L_0x02cc;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0299;
                case 18: goto L_0x028e;
                case 19: goto L_0x0285;
                case 20: goto L_0x027c;
                case 21: goto L_0x0273;
                case 22: goto L_0x026a;
                case 23: goto L_0x028e;
                case 24: goto L_0x0285;
                case 25: goto L_0x0261;
                case 26: goto L_0x0258;
                case 27: goto L_0x024b;
                case 28: goto L_0x0242;
                case 29: goto L_0x0239;
                case 30: goto L_0x0230;
                case 31: goto L_0x0285;
                case 32: goto L_0x028e;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03aa
        L_0x0047:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x029f
        L_0x004f:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m25971e(r1, r5)
            goto L_0x02b8
        L_0x005b:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m25968d(r1, r5)
            goto L_0x02c7
        L_0x0067:
            boolean r5 = r0.m25955a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02d2
        L_0x006f:
            boolean r5 = r0.m25955a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02dd
        L_0x0077:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m25968d(r1, r5)
            goto L_0x02ec
        L_0x0083:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m25968d(r1, r5)
            goto L_0x02fb
        L_0x008f:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0306
        L_0x0097:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0317
        L_0x009f:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.C10431y
            if (r6 == 0) goto L_0x0334
            goto L_0x0333
        L_0x00af:
            boolean r5 = r0.m25955a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0342
        L_0x00b7:
            boolean r5 = r0.m25955a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x034e
        L_0x00bf:
            boolean r5 = r0.m25955a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x035a
        L_0x00c7:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m25968d(r1, r5)
            goto L_0x036a
        L_0x00d3:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m25971e(r1, r5)
            goto L_0x037a
        L_0x00df:
            boolean r14 = r0.m25955a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m25971e(r1, r5)
            goto L_0x038a
        L_0x00eb:
            boolean r5 = r0.m25955a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x00f3:
            boolean r5 = r0.m25955a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x03a2
        L_0x00fb:
            com.google.android.gms.internal.clearcut.v1 r14 = r0.f26918q
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5)
            java.lang.Object r6 = r0.m25959b(r12)
            int r3 = r14.mo28162a(r3, r5, r6)
            goto L_0x0296
        L_0x010b:
            java.util.List r5 = m25949a(r1, r5)
            com.google.android.gms.internal.clearcut.m2 r6 = r0.m25947a(r12)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26383b(r3, r5, r6)
            goto L_0x0296
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26391c(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26406g(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26412i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26409h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26395d(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26403f(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26415j(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26409h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26412i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26399e(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26385b(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26368a(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26409h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.clearcut.C10371o2.m26412i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f26910i
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26689e(r3)
            int r6 = com.google.android.gms.internal.clearcut.zzbn.m26696g(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0296
        L_0x021d:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26390c(r3, r5, r11)
            goto L_0x0296
        L_0x0227:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26405g(r3, r5, r11)
            goto L_0x0296
        L_0x0230:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26394d(r3, r5, r11)
            goto L_0x0296
        L_0x0239:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26402f(r3, r5, r11)
            goto L_0x0296
        L_0x0242:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26382b(r3, r5)
            goto L_0x0296
        L_0x024b:
            java.util.List r5 = m25949a(r1, r5)
            com.google.android.gms.internal.clearcut.m2 r6 = r0.m25947a(r12)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26366a(r3, r5, r6)
            goto L_0x0296
        L_0x0258:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26365a(r3, r5)
            goto L_0x0296
        L_0x0261:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26414j(r3, r5, r11)
            goto L_0x0296
        L_0x026a:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26398e(r3, r5, r11)
            goto L_0x0296
        L_0x0273:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26384b(r3, r5, r11)
            goto L_0x0296
        L_0x027c:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26367a(r3, r5, r11)
            goto L_0x0296
        L_0x0285:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26408h(r3, r5, r11)
            goto L_0x0296
        L_0x028e:
            java.util.List r5 = m25949a(r1, r5)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26411i(r3, r5, r11)
        L_0x0296:
            int r13 = r13 + r3
            goto L_0x03aa
        L_0x0299:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x029f:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5)
            com.google.android.gms.internal.clearcut.zzdo r5 = (com.google.android.gms.internal.clearcut.zzdo) r5
            com.google.android.gms.internal.clearcut.m2 r6 = r0.m25947a(r12)
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26683c(r3, r5, r6)
            goto L_0x0296
        L_0x02ae:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r1, r5)
        L_0x02b8:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26694f(r3, r5)
            goto L_0x0296
        L_0x02bd:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r1, r5)
        L_0x02c7:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26701h(r3, r5)
            goto L_0x0296
        L_0x02cc:
            boolean r5 = r0.m25954a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02d2:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26702h(r3, r9)
            goto L_0x0296
        L_0x02d7:
            boolean r5 = r0.m25954a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02dd:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26708j(r3, r11)
            goto L_0x0296
        L_0x02e2:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r1, r5)
        L_0x02ec:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26710k(r3, r5)
            goto L_0x0296
        L_0x02f1:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r1, r5)
        L_0x02fb:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26697g(r3, r5)
            goto L_0x0296
        L_0x0300:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0306:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5)
        L_0x030a:
            com.google.android.gms.internal.clearcut.y r5 = (com.google.android.gms.internal.clearcut.C10431y) r5
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26681c(r3, r5)
            goto L_0x0296
        L_0x0311:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0317:
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5)
            com.google.android.gms.internal.clearcut.m2 r6 = r0.m25947a(r12)
            int r3 = com.google.android.gms.internal.clearcut.C10371o2.m26364a(r3, r5, r6)
            goto L_0x0296
        L_0x0325:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C10341k3.m26225f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.C10431y
            if (r6 == 0) goto L_0x0334
        L_0x0333:
            goto L_0x030a
        L_0x0334:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26676b(r3, r5)
            goto L_0x0296
        L_0x033c:
            boolean r5 = r0.m25954a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0342:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26677b(r3, r7)
            goto L_0x0296
        L_0x0348:
            boolean r5 = r0.m25954a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x034e:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26705i(r3, r11)
            goto L_0x0296
        L_0x0354:
            boolean r5 = r0.m25954a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x035a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26698g(r3, r9)
            goto L_0x0296
        L_0x0360:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.clearcut.C10341k3.m26192a(r1, r5)
        L_0x036a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26693f(r3, r5)
            goto L_0x0296
        L_0x0370:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r1, r5)
        L_0x037a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26690e(r3, r5)
            goto L_0x0296
        L_0x0380:
            boolean r14 = r0.m25954a((T) r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.clearcut.C10341k3.m26208b(r1, r5)
        L_0x038a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26685d(r3, r5)
            goto L_0x0296
        L_0x0390:
            boolean r5 = r0.m25954a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0396:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26673b(r3, r4)
            goto L_0x0296
        L_0x039c:
            boolean r5 = r0.m25954a((T) r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x03a2:
            r5 = 0
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m26672b(r3, r5)
            goto L_0x0296
        L_0x03aa:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b0:
            com.google.android.gms.internal.clearcut.d3<?, ?> r2 = r0.f26916o
            int r1 = m25938a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x03b8:
            sun.misc.Unsafe r2 = f26901r
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x03bf:
            int[] r13 = r0.f26902a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x07c2
            int r13 = r0.m25967d(r3)
            int[] r14 = r0.f26902a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03eb
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r6) goto L_0x03e8
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            goto L_0x03e9
        L_0x03e8:
            r14 = r6
        L_0x03e9:
            r6 = r14
            goto L_0x040b
        L_0x03eb:
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0408
            com.google.android.gms.internal.clearcut.w0 r9 = com.google.android.gms.internal.clearcut.C10420w0.DOUBLE_LIST_PACKED
            int r9 = r9.mo28175a()
            if (r4 < r9) goto L_0x0408
            com.google.android.gms.internal.clearcut.w0 r9 = com.google.android.gms.internal.clearcut.C10420w0.SINT64_LIST_PACKED
            int r9 = r9.mo28175a()
            if (r4 > r9) goto L_0x0408
            int[] r9 = r0.f26902a
            int r10 = r3 + 2
            r9 = r9[r10]
            r11 = r9 & r8
            goto L_0x0409
        L_0x0408:
            r11 = 0
        L_0x0409:
            r18 = 0
        L_0x040b:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r4) {
                case 0: goto L_0x07ac;
                case 1: goto L_0x079c;
                case 2: goto L_0x078a;
                case 3: goto L_0x077a;
                case 4: goto L_0x076a;
                case 5: goto L_0x075e;
                case 6: goto L_0x0752;
                case 7: goto L_0x0748;
                case 8: goto L_0x0733;
                case 9: goto L_0x0721;
                case 10: goto L_0x0712;
                case 11: goto L_0x0705;
                case 12: goto L_0x06f8;
                case 13: goto L_0x06ed;
                case 14: goto L_0x06e2;
                case 15: goto L_0x06d5;
                case 16: goto L_0x06c8;
                case 17: goto L_0x06b5;
                case 18: goto L_0x06a1;
                case 19: goto L_0x0695;
                case 20: goto L_0x0689;
                case 21: goto L_0x067d;
                case 22: goto L_0x0671;
                case 23: goto L_0x06a1;
                case 24: goto L_0x0695;
                case 25: goto L_0x0665;
                case 26: goto L_0x065a;
                case 27: goto L_0x064b;
                case 28: goto L_0x0640;
                case 29: goto L_0x0634;
                case 30: goto L_0x0627;
                case 31: goto L_0x0695;
                case 32: goto L_0x06a1;
                case 33: goto L_0x061a;
                case 34: goto L_0x060d;
                case 35: goto L_0x05ed;
                case 36: goto L_0x05dc;
                case 37: goto L_0x05cb;
                case 38: goto L_0x05ba;
                case 39: goto L_0x05a9;
                case 40: goto L_0x0598;
                case 41: goto L_0x0587;
                case 42: goto L_0x0575;
                case 43: goto L_0x0563;
                case 44: goto L_0x0551;
                case 45: goto L_0x053f;
                case 46: goto L_0x052d;
                case 47: goto L_0x051b;
                case 48: goto L_0x0509;
                case 49: goto L_0x04f9;
                case 50: goto L_0x04e9;
                case 51: goto L_0x04db;
                case 52: goto L_0x04ce;
                case 53: goto L_0x04be;
                case 54: goto L_0x04ae;
                case 55: goto L_0x049e;
                case 56: goto L_0x0490;
                case 57: goto L_0x0483;
                case 58: goto L_0x047b;
                case 59: goto L_0x046b;
                case 60: goto L_0x0463;
                case 61: goto L_0x045b;
                case 62: goto L_0x044f;
                case 63: goto L_0x0443;
                case 64: goto L_0x043b;
                case 65: goto L_0x0433;
                case 66: goto L_0x0427;
                case 67: goto L_0x041b;
                case 68: goto L_0x0413;
                default: goto L_0x0411;
            }
        L_0x0411:
            goto L_0x06ad
        L_0x0413:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            goto L_0x06b9
        L_0x041b:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            long r9 = m25971e(r1, r9)
            goto L_0x06d0
        L_0x0427:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            int r4 = m25968d(r1, r9)
            goto L_0x06dd
        L_0x0433:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            goto L_0x06e6
        L_0x043b:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            goto L_0x06f1
        L_0x0443:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            int r4 = m25968d(r1, r9)
            goto L_0x0700
        L_0x044f:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            int r4 = m25968d(r1, r9)
            goto L_0x070d
        L_0x045b:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            goto L_0x0716
        L_0x0463:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            goto L_0x0725
        L_0x046b:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.clearcut.C10431y
            if (r9 == 0) goto L_0x0740
            goto L_0x073f
        L_0x047b:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            goto L_0x074c
        L_0x0483:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26705i(r15, r4)
            goto L_0x06f6
        L_0x0490:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26698g(r15, r9)
            goto L_0x06ac
        L_0x049e:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            int r4 = m25968d(r1, r9)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26693f(r15, r4)
            goto L_0x06ac
        L_0x04ae:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            long r9 = m25971e(r1, r9)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26690e(r15, r9)
            goto L_0x06ac
        L_0x04be:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            long r9 = m25971e(r1, r9)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26685d(r15, r9)
            goto L_0x06ac
        L_0x04ce:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26673b(r15, r4)
            goto L_0x06f6
        L_0x04db:
            boolean r4 = r0.m25955a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x06ad
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26672b(r15, r9)
            goto L_0x06ac
        L_0x04e9:
            com.google.android.gms.internal.clearcut.v1 r4 = r0.f26918q
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.m25959b(r3)
            int r4 = r4.mo28162a(r15, r9, r10)
            goto L_0x06ac
        L_0x04f9:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r3)
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26383b(r15, r4, r9)
            goto L_0x06ac
        L_0x0509:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26391c(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x051b:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26406g(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x052d:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26412i(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x053f:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26409h(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0551:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26395d(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0563:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26403f(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0575:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26415j(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0587:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26409h(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0598:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26412i(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05a9:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26399e(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05ba:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26385b(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05cb:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26368a(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05dc:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26409h(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05ed:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26412i(r4)
            if (r4 <= 0) goto L_0x06ad
            boolean r9 = r0.f26910i
            if (r9 == 0) goto L_0x0601
        L_0x05fd:
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0601:
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26689e(r15)
            int r10 = com.google.android.gms.internal.clearcut.zzbn.m26696g(r4)
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x06f6
        L_0x060d:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26390c(r15, r4, r11)
            goto L_0x06ac
        L_0x061a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26405g(r15, r4, r11)
            goto L_0x06ac
        L_0x0627:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26394d(r15, r4, r11)
            goto L_0x06ac
        L_0x0634:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26402f(r15, r4, r11)
            goto L_0x06ac
        L_0x0640:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26382b(r15, r4)
            goto L_0x06ac
        L_0x064b:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r3)
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26366a(r15, r4, r9)
            goto L_0x06ac
        L_0x065a:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26365a(r15, r4)
            goto L_0x06ac
        L_0x0665:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26414j(r15, r4, r11)
            goto L_0x06ac
        L_0x0671:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26398e(r15, r4, r11)
            goto L_0x06ac
        L_0x067d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26384b(r15, r4, r11)
            goto L_0x06ac
        L_0x0689:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26367a(r15, r4, r11)
            goto L_0x06ac
        L_0x0695:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26408h(r15, r4, r11)
            goto L_0x06ac
        L_0x06a1:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26411i(r15, r4, r11)
        L_0x06ac:
            int r5 = r5 + r4
        L_0x06ad:
            r4 = 0
        L_0x06ae:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x07bb
        L_0x06b5:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
        L_0x06b9:
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzdo r4 = (com.google.android.gms.internal.clearcut.zzdo) r4
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r3)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26683c(r15, r4, r9)
            goto L_0x06ac
        L_0x06c8:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
            long r9 = r2.getLong(r1, r9)
        L_0x06d0:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26694f(r15, r9)
            goto L_0x06ac
        L_0x06d5:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
            int r4 = r2.getInt(r1, r9)
        L_0x06dd:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26701h(r15, r4)
            goto L_0x06ac
        L_0x06e2:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
        L_0x06e6:
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26702h(r15, r9)
            goto L_0x06ac
        L_0x06ed:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
        L_0x06f1:
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26708j(r15, r4)
        L_0x06f6:
            int r5 = r5 + r9
            goto L_0x06ad
        L_0x06f8:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
            int r4 = r2.getInt(r1, r9)
        L_0x0700:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26710k(r15, r4)
            goto L_0x06ac
        L_0x0705:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
            int r4 = r2.getInt(r1, r9)
        L_0x070d:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26697g(r15, r4)
            goto L_0x06ac
        L_0x0712:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
        L_0x0716:
            java.lang.Object r4 = r2.getObject(r1, r9)
        L_0x071a:
            com.google.android.gms.internal.clearcut.y r4 = (com.google.android.gms.internal.clearcut.C10431y) r4
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26681c(r15, r4)
            goto L_0x06ac
        L_0x0721:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
        L_0x0725:
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.m2 r9 = r0.m25947a(r3)
            int r4 = com.google.android.gms.internal.clearcut.C10371o2.m26364a(r15, r4, r9)
            goto L_0x06ac
        L_0x0733:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.clearcut.C10431y
            if (r9 == 0) goto L_0x0740
        L_0x073f:
            goto L_0x071a
        L_0x0740:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26676b(r15, r4)
            goto L_0x06ac
        L_0x0748:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
        L_0x074c:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m26677b(r15, r7)
            goto L_0x06ac
        L_0x0752:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ad
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26705i(r15, r4)
            int r5 = r5 + r9
            goto L_0x06ae
        L_0x075e:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x079a
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26698g(r15, r13)
            goto L_0x0799
        L_0x076a:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x079a
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26693f(r15, r9)
            goto L_0x0799
        L_0x077a:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x079a
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26690e(r15, r9)
            goto L_0x0799
        L_0x078a:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x079a
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m26685d(r15, r9)
        L_0x0799:
            int r5 = r5 + r9
        L_0x079a:
            r9 = 0
            goto L_0x07a9
        L_0x079c:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x079a
            r9 = 0
            int r10 = com.google.android.gms.internal.clearcut.zzbn.m26673b(r15, r9)
            int r5 = r5 + r10
        L_0x07a9:
            r10 = 0
            goto L_0x07bb
        L_0x07ac:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x07a9
            r10 = 0
            int r15 = com.google.android.gms.internal.clearcut.zzbn.m26672b(r15, r10)
            int r5 = r5 + r15
        L_0x07bb:
            int r3 = r3 + 4
            r9 = r13
            r4 = 0
            r11 = 0
            goto L_0x03bf
        L_0x07c2:
            com.google.android.gms.internal.clearcut.d3<?, ?> r2 = r0.f26916o
            int r2 = m25938a(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.f26908g
            if (r2 == 0) goto L_0x07d8
            com.google.android.gms.internal.clearcut.p0<?> r2 = r0.f26917p
            com.google.android.gms.internal.clearcut.t0 r1 = r2.mo28075a(r1)
            int r1 = r1.mo28135f()
            int r5 = r5 + r1
        L_0x07d8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10279b2.mo27836c(java.lang.Object):int");
    }

    public final void zzc(T t) {
        int[] iArr = this.f26912k;
        if (iArr != null) {
            for (int d : iArr) {
                long d2 = (long) (m25967d(d) & 1048575);
                Object f = C10341k3.m26225f(t, d2);
                if (f != null) {
                    this.f26918q.mo28165c(f);
                    C10341k3.m26202a((Object) t, d2, f);
                }
            }
        }
        int[] iArr2 = this.f26913l;
        if (iArr2 != null) {
            for (int i : iArr2) {
                this.f26915n.mo28049a(t, (long) i);
            }
        }
        this.f26916o.mo27867a(t);
        if (this.f26908g) {
            this.f26917p.mo28079c(t);
        }
    }
}
