package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10278e;

/* renamed from: com.google.android.gms.internal.clearcut.q1 */
final class C10382q1 implements C10365n2 {

    /* renamed from: b */
    private static final C10439z1 f27169b = new C10391r1();

    /* renamed from: a */
    private final C10439z1 f27170a;

    public C10382q1() {
        this(new C10397s1(C10266a1.m25903a(), m26459a()));
    }

    private C10382q1(C10439z1 z1Var) {
        C10292d1.m26020a(z1Var, "messageInfoFactory");
        this.f27170a = z1Var;
    }

    /* renamed from: a */
    private static C10439z1 m26459a() {
        try {
            return (C10439z1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f27169b;
        }
    }

    /* renamed from: a */
    private static boolean m26460a(C10433y1 y1Var) {
        return y1Var.mo27956a() == C10278e.f26897i;
    }

    /* renamed from: a */
    public final <T> C10359m2<T> mo28066a(Class<T> cls) {
        Class<C10273b1> cls2 = C10273b1.class;
        C10371o2.m26379a(cls);
        C10433y1 zzb = this.f27170a.zzb(cls);
        if (zzb.mo27957b()) {
            return cls2.isAssignableFrom(cls) ? C10286c2.m25994a(C10371o2.m26392c(), C10396s0.m26495b(), zzb.mo27958c()) : C10286c2.m25994a(C10371o2.m26369a(), C10396s0.m26496c(), zzb.mo27958c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean a = m26460a(zzb);
            C10293d2 b = C10307f2.m26090b();
            C10352l1 b2 = C10352l1.m26303b();
            C10294d3 c = C10371o2.m26392c();
            if (a) {
                return C10279b2.m25946a(cls, zzb, b, b2, c, C10396s0.m26495b(), C10427x1.m26589b());
            }
            return C10279b2.m25946a(cls, zzb, b, b2, c, null, C10427x1.m26589b());
        }
        boolean a2 = m26460a(zzb);
        C10293d2 a3 = C10307f2.m26089a();
        C10352l1 a4 = C10352l1.m26302a();
        if (a2) {
            return C10279b2.m25946a(cls, zzb, a3, a4, C10371o2.m26369a(), C10396s0.m26496c(), C10427x1.m26588a());
        }
        return C10279b2.m25946a(cls, zzb, a3, a4, C10371o2.m26386b(), null, C10427x1.m26588a());
    }
}
