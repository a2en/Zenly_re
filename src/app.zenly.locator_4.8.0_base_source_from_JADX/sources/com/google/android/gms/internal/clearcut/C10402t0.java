package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzca;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.t0 */
final class C10402t0<FieldDescriptorType extends zzca<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C10402t0 f27210d = new C10402t0(true);

    /* renamed from: a */
    private final C10377p2<FieldDescriptorType, Object> f27211a = C10377p2.m26438b(16);

    /* renamed from: b */
    private boolean f27212b;

    /* renamed from: c */
    private boolean f27213c = false;

    private C10402t0() {
    }

    private C10402t0(boolean z) {
        mo28137h();
    }

    /* renamed from: a */
    static int m26517a(C10399s3 s3Var, int i, Object obj) {
        int e = zzbn.m26689e(i);
        if (s3Var == C10399s3.GROUP) {
            C10292d1.m26021a((zzdo) obj);
            e <<= 1;
        }
        return e + m26523b(s3Var, obj);
    }

    /* renamed from: a */
    private final Object m26518a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f27211a.get(fielddescriptortype);
        if (!(obj instanceof C10306f1)) {
            return obj;
        }
        C10306f1.m26088c();
        throw null;
    }

    /* renamed from: a */
    private static Object m26519a(Object obj) {
        if (obj instanceof zzdv) {
            return ((zzdv) obj).zzci();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.C10306f1) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.zzcj) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m26520a(com.google.android.gms.internal.clearcut.C10399s3 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.clearcut.C10292d1.m26018a(r3)
            int[] r0 = com.google.android.gms.internal.clearcut.C10408u0.f27222a
            com.google.android.gms.internal.clearcut.x3 r2 = r2.mo28124a()
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
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzdo
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C10306f1
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzcj
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C10431y
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
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
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10402t0.m26520a(com.google.android.gms.internal.clearcut.s3, java.lang.Object):void");
    }

    /* renamed from: a */
    private final void m26521a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzaw()) {
            m26520a(fielddescriptortype.zzau(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m26520a(fielddescriptortype.zzau(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof C10306f1) {
            this.f27213c = true;
        }
        this.f27211a.put(fielddescriptortype, r6);
    }

    /* renamed from: a */
    private static boolean m26522a(Entry<FieldDescriptorType, Object> entry) {
        zzca zzca = (zzca) entry.getKey();
        if (zzca.zzav() == C10429x3.MESSAGE) {
            boolean zzaw = zzca.zzaw();
            Object value = entry.getValue();
            if (zzaw) {
                for (zzdo isInitialized : (List) value) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof zzdo) {
                if (!((zzdo) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof C10306f1) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m26523b(C10399s3 s3Var, Object obj) {
        switch (C10408u0.f27223b[s3Var.ordinal()]) {
            case 1:
                return zzbn.m26670b(((Double) obj).doubleValue());
            case 2:
                return zzbn.m26671b(((Float) obj).floatValue());
            case 3:
                return zzbn.m26688d(((Long) obj).longValue());
            case 4:
                return zzbn.m26691e(((Long) obj).longValue());
            case 5:
                return zzbn.m26692f(((Integer) obj).intValue());
            case 6:
                return zzbn.m26699g(((Long) obj).longValue());
            case 7:
                return zzbn.m26704i(((Integer) obj).intValue());
            case 8:
                return zzbn.m26679b(((Boolean) obj).booleanValue());
            case 9:
                return zzbn.m26678b((zzdo) obj);
            case 10:
                return obj instanceof C10306f1 ? zzbn.m26663a((C10332j1) (C10306f1) obj) : zzbn.m26665a((zzdo) obj);
            case 11:
                return obj instanceof C10431y ? zzbn.m26664a((C10431y) obj) : zzbn.m26667a((String) obj);
            case 12:
                return obj instanceof C10431y ? zzbn.m26664a((C10431y) obj) : zzbn.m26680b((byte[]) obj);
            case 13:
                return zzbn.m26696g(((Integer) obj).intValue());
            case 14:
                return zzbn.m26707j(((Integer) obj).intValue());
            case 15:
                return zzbn.m26703h(((Long) obj).longValue());
            case 16:
                return zzbn.m26700h(((Integer) obj).intValue());
            case 17:
                return zzbn.m26695f(((Long) obj).longValue());
            case 18:
                return obj instanceof zzcj ? zzbn.m26709k(((zzcj) obj).zzc()) : zzbn.m26709k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m26524b(zzca<?> zzca, Object obj) {
        C10399s3 zzau = zzca.zzau();
        int zzc = zzca.zzc();
        if (!zzca.zzaw()) {
            return m26517a(zzau, zzc, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (zzca.zzax()) {
            for (Object b : list) {
                i += m26523b(zzau, b);
            }
            return zzbn.m26689e(zzc) + i + zzbn.m26712m(i);
        }
        for (Object a : list) {
            i += m26517a(zzau, zzc, a);
        }
        return i;
    }

    /* renamed from: b */
    private final void m26525b(Entry<FieldDescriptorType, Object> entry) {
        zzca zzca = (zzca) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C10306f1) {
            C10306f1.m26088c();
            throw null;
        } else if (zzca.zzaw()) {
            Object a = m26518a((FieldDescriptorType) zzca);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m26519a(a2));
            }
            this.f27211a.put(zzca, a);
        } else if (zzca.zzav() == C10429x3.MESSAGE) {
            Object a3 = m26518a((FieldDescriptorType) zzca);
            if (a3 == null) {
                this.f27211a.put(zzca, m26519a(value));
            } else {
                this.f27211a.put(zzca, a3 instanceof zzdv ? zzca.zza((zzdv) a3, (zzdv) value) : zzca.zza(((zzdo) a3).zzbc(), (zzdo) value).zzbj());
            }
        } else {
            this.f27211a.put(zzca, m26519a(value));
        }
    }

    /* renamed from: c */
    private static int m26526c(Entry<FieldDescriptorType, Object> entry) {
        zzca zzca = (zzca) entry.getKey();
        Object value = entry.getValue();
        if (zzca.zzav() != C10429x3.MESSAGE || zzca.zzaw() || zzca.zzax()) {
            return m26524b(zzca, value);
        }
        boolean z = value instanceof C10306f1;
        int zzc = ((zzca) entry.getKey()).zzc();
        return z ? zzbn.m26674b(zzc, (C10332j1) (C10306f1) value) : zzbn.m26687d(zzc, (zzdo) value);
    }

    /* renamed from: i */
    public static <T extends zzca<T>> C10402t0<T> m26527i() {
        return f27210d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo28127a() {
        return this.f27213c ? new C10326i1(this.f27211a.mo28095d().iterator()) : this.f27211a.mo28095d().iterator();
    }

    /* renamed from: a */
    public final void mo28128a(C10402t0<FieldDescriptorType> t0Var) {
        for (int i = 0; i < t0Var.f27211a.mo28091b(); i++) {
            m26525b(t0Var.f27211a.mo28089a(i));
        }
        for (Entry b : t0Var.f27211a.mo28092c()) {
            m26525b(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo28129b() {
        return this.f27211a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo28130c() {
        return this.f27212b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C10402t0 t0Var = new C10402t0();
        for (int i = 0; i < this.f27211a.mo28091b(); i++) {
            Entry a = this.f27211a.mo28089a(i);
            t0Var.m26521a((FieldDescriptorType) (zzca) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f27211a.mo28092c()) {
            t0Var.m26521a((FieldDescriptorType) (zzca) entry.getKey(), entry.getValue());
        }
        t0Var.f27213c = this.f27213c;
        return t0Var;
    }

    /* renamed from: d */
    public final boolean mo28132d() {
        for (int i = 0; i < this.f27211a.mo28091b(); i++) {
            if (!m26522a(this.f27211a.mo28089a(i))) {
                return false;
            }
        }
        for (Entry a : this.f27211a.mo28092c()) {
            if (!m26522a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo28133e() {
        return this.f27213c ? new C10326i1(this.f27211a.entrySet().iterator()) : this.f27211a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10402t0)) {
            return false;
        }
        return this.f27211a.equals(((C10402t0) obj).f27211a);
    }

    /* renamed from: f */
    public final int mo28135f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f27211a.mo28091b(); i2++) {
            Entry a = this.f27211a.mo28089a(i2);
            i += m26524b((zzca) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f27211a.mo28092c()) {
            i += m26524b((zzca) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: g */
    public final int mo28136g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f27211a.mo28091b(); i2++) {
            i += m26526c(this.f27211a.mo28089a(i2));
        }
        for (Entry c : this.f27211a.mo28092c()) {
            i += m26526c(c);
        }
        return i;
    }

    /* renamed from: h */
    public final void mo28137h() {
        if (!this.f27212b) {
            this.f27211a.mo28096e();
            this.f27212b = true;
        }
    }

    public final int hashCode() {
        return this.f27211a.hashCode();
    }
}
