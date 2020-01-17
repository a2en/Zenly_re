package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.k2 */
final class C10340k2 {

    /* renamed from: A */
    private int f27037A;

    /* renamed from: B */
    private int f27038B;

    /* renamed from: C */
    private Field f27039C;

    /* renamed from: D */
    private Object f27040D;

    /* renamed from: E */
    private Object f27041E;

    /* renamed from: F */
    private Object f27042F;

    /* renamed from: a */
    private final C10353l2 f27043a;

    /* renamed from: b */
    private final Object[] f27044b;

    /* renamed from: c */
    private Class<?> f27045c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f27046d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f27047e;

    /* renamed from: f */
    private final int f27048f;

    /* renamed from: g */
    private final int f27049g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f27050h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f27051i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f27052j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f27053k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f27054l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final int f27055m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int[] f27056n;

    /* renamed from: o */
    private int f27057o;

    /* renamed from: p */
    private int f27058p;

    /* renamed from: q */
    private int f27059q = Integer.MAX_VALUE;

    /* renamed from: r */
    private int f27060r = Integer.MIN_VALUE;

    /* renamed from: s */
    private int f27061s = 0;

    /* renamed from: t */
    private int f27062t = 0;

    /* renamed from: u */
    private int f27063u = 0;

    /* renamed from: v */
    private int f27064v = 0;

    /* renamed from: w */
    private int f27065w = 0;

    /* renamed from: x */
    private int f27066x;

    /* renamed from: y */
    private int f27067y;

    /* renamed from: z */
    private int f27068z;

    C10340k2(Class<?> cls, String str, Object[] objArr) {
        this.f27045c = cls;
        this.f27043a = new C10353l2(str);
        this.f27044b = objArr;
        this.f27046d = this.f27043a.mo28052b();
        this.f27047e = this.f27043a.mo28052b();
        int[] iArr = null;
        if (this.f27047e == 0) {
            this.f27048f = 0;
            this.f27049g = 0;
            this.f27050h = 0;
            this.f27051i = 0;
            this.f27052j = 0;
            this.f27054l = 0;
            this.f27053k = 0;
            this.f27055m = 0;
            this.f27056n = null;
            return;
        }
        this.f27048f = this.f27043a.mo28052b();
        this.f27049g = this.f27043a.mo28052b();
        this.f27050h = this.f27043a.mo28052b();
        this.f27051i = this.f27043a.mo28052b();
        this.f27054l = this.f27043a.mo28052b();
        this.f27053k = this.f27043a.mo28052b();
        this.f27052j = this.f27043a.mo28052b();
        this.f27055m = this.f27043a.mo28052b();
        int b = this.f27043a.mo28052b();
        if (b != 0) {
            iArr = new int[b];
        }
        this.f27056n = iArr;
        this.f27057o = (this.f27048f << 1) + this.f27049g;
    }

    /* renamed from: a */
    private static Field m26164a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: p */
    private final Object m26173p() {
        Object[] objArr = this.f27044b;
        int i = this.f27057o;
        this.f27057o = i + 1;
        return objArr[i];
    }

    /* renamed from: q */
    private final boolean m26174q() {
        return (this.f27046d & 1) == 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        if (m26174q() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        if (r1 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        if (m26174q() != false) goto L_0x00d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27978a() {
        /*
            r5 = this;
            com.google.android.gms.internal.clearcut.l2 r0 = r5.f27043a
            boolean r0 = r0.mo28051a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.android.gms.internal.clearcut.l2 r0 = r5.f27043a
            int r0 = r0.mo28052b()
            r5.f27066x = r0
            com.google.android.gms.internal.clearcut.l2 r0 = r5.f27043a
            int r0 = r0.mo28052b()
            r5.f27067y = r0
            int r0 = r5.f27067y
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5.f27068z = r0
            int r0 = r5.f27066x
            int r2 = r5.f27059q
            if (r0 >= r2) goto L_0x0028
            r5.f27059q = r0
        L_0x0028:
            int r0 = r5.f27066x
            int r2 = r5.f27060r
            if (r0 <= r2) goto L_0x0030
            r5.f27060r = r0
        L_0x0030:
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.MAP
            int r2 = r2.mo28175a()
            r3 = 1
            if (r0 != r2) goto L_0x0041
            int r0 = r5.f27061s
            int r0 = r0 + r3
            r5.f27061s = r0
            goto L_0x005a
        L_0x0041:
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.DOUBLE_LIST
            int r2 = r2.mo28175a()
            if (r0 < r2) goto L_0x005a
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.GROUP_LIST
            int r2 = r2.mo28175a()
            if (r0 > r2) goto L_0x005a
            int r0 = r5.f27062t
            int r0 = r0 + r3
            r5.f27062t = r0
        L_0x005a:
            int r0 = r5.f27065w
            int r0 = r0 + r3
            r5.f27065w = r0
            int r0 = r5.f27059q
            int r2 = r5.f27066x
            int r4 = r5.f27065w
            boolean r0 = com.google.android.gms.internal.clearcut.C10371o2.m26380a(r0, r2, r4)
            if (r0 == 0) goto L_0x0076
            int r0 = r5.f27066x
            int r0 = r0 + r3
            r5.f27064v = r0
            int r0 = r5.f27064v
            int r2 = r5.f27059q
            int r0 = r0 - r2
            goto L_0x0079
        L_0x0076:
            int r0 = r5.f27063u
            int r0 = r0 + r3
        L_0x0079:
            r5.f27063u = r0
            int r0 = r5.f27067y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            if (r0 == 0) goto L_0x0092
            int[] r0 = r5.f27056n
            int r2 = r5.f27058p
            int r4 = r2 + 1
            r5.f27058p = r4
            int r4 = r5.f27066x
            r0[r2] = r4
        L_0x0092:
            r0 = 0
            r5.f27040D = r0
            r5.f27041E = r0
            r5.f27042F = r0
            boolean r0 = r5.mo27981d()
            if (r0 == 0) goto L_0x00e2
            com.google.android.gms.internal.clearcut.l2 r0 = r5.f27043a
            int r0 = r0.mo28052b()
            r5.f27037A = r0
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r1 = com.google.android.gms.internal.clearcut.C10420w0.MESSAGE
            int r1 = r1.mo28175a()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00da
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r1 = com.google.android.gms.internal.clearcut.C10420w0.GROUP
            int r1 = r1.mo28175a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00c0
            goto L_0x00da
        L_0x00c0:
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r1 = com.google.android.gms.internal.clearcut.C10420w0.ENUM
            int r1 = r1.mo28175a()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x0171
            boolean r0 = r5.m26174q()
            if (r0 == 0) goto L_0x0171
        L_0x00d2:
            java.lang.Object r0 = r5.m26173p()
            r5.f27041E = r0
            goto L_0x0171
        L_0x00da:
            java.lang.Object r0 = r5.m26173p()
        L_0x00de:
            r5.f27040D = r0
            goto L_0x0171
        L_0x00e2:
            java.lang.Class<?> r0 = r5.f27045c
            java.lang.Object r2 = r5.m26173p()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r0 = m26164a(r0, r2)
            r5.f27039C = r0
            boolean r0 = r5.mo27985h()
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.internal.clearcut.l2 r0 = r5.f27043a
            int r0 = r0.mo28052b()
            r5.f27038B = r0
        L_0x00fe:
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.MESSAGE
            int r2 = r2.mo28175a()
            if (r0 == r2) goto L_0x0169
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.GROUP
            int r2 = r2.mo28175a()
            if (r0 != r2) goto L_0x0113
            goto L_0x0169
        L_0x0113:
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.MESSAGE_LIST
            int r2 = r2.mo28175a()
            if (r0 == r2) goto L_0x00da
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.GROUP_LIST
            int r2 = r2.mo28175a()
            if (r0 != r2) goto L_0x0128
            goto L_0x00da
        L_0x0128:
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.ENUM
            int r2 = r2.mo28175a()
            if (r0 == r2) goto L_0x0161
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.ENUM_LIST
            int r2 = r2.mo28175a()
            if (r0 == r2) goto L_0x0161
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.ENUM_LIST_PACKED
            int r2 = r2.mo28175a()
            if (r0 != r2) goto L_0x0147
            goto L_0x0161
        L_0x0147:
            int r0 = r5.f27068z
            com.google.android.gms.internal.clearcut.w0 r2 = com.google.android.gms.internal.clearcut.C10420w0.MAP
            int r2 = r2.mo28175a()
            if (r0 != r2) goto L_0x0171
            java.lang.Object r0 = r5.m26173p()
            r5.f27042F = r0
            int r0 = r5.f27067y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x015e
            r1 = 1
        L_0x015e:
            if (r1 == 0) goto L_0x0171
            goto L_0x0167
        L_0x0161:
            boolean r0 = r5.m26174q()
            if (r0 == 0) goto L_0x0171
        L_0x0167:
            goto L_0x00d2
        L_0x0169:
            java.lang.reflect.Field r0 = r5.f27039C
            java.lang.Class r0 = r0.getType()
            goto L_0x00de
        L_0x0171:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10340k2.mo27978a():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo27979b() {
        return this.f27066x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo27980c() {
        return this.f27068z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo27981d() {
        return this.f27068z > C10420w0.MAP.mo28175a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Field mo27982e() {
        int i = this.f27037A << 1;
        Object obj = this.f27044b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m26164a(this.f27045c, (String) obj);
        this.f27044b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Field mo27983f() {
        int i = (this.f27037A << 1) + 1;
        Object obj = this.f27044b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m26164a(this.f27045c, (String) obj);
        this.f27044b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final Field mo27984g() {
        return this.f27039C;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo27985h() {
        return m26174q() && this.f27068z <= C10420w0.GROUP.mo28175a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final Field mo27986i() {
        int i = (this.f27048f << 1) + (this.f27038B / 32);
        Object obj = this.f27044b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m26164a(this.f27045c, (String) obj);
        this.f27044b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo27987j() {
        return this.f27038B % 32;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo27988k() {
        return (this.f27067y & 256) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo27989l() {
        return (this.f27067y & 512) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final Object mo27990m() {
        return this.f27040D;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final Object mo27991n() {
        return this.f27041E;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final Object mo27992o() {
        return this.f27042F;
    }
}
