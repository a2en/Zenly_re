package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.c2 */
final class C10286c2<T> implements C10359m2<T> {

    /* renamed from: a */
    private final zzdo f26932a;

    /* renamed from: b */
    private final C10294d3<?, ?> f26933b;

    /* renamed from: c */
    private final boolean f26934c;

    /* renamed from: d */
    private final C10375p0<?> f26935d;

    private C10286c2(C10294d3<?, ?> d3Var, C10375p0<?> p0Var, zzdo zzdo) {
        this.f26933b = d3Var;
        this.f26934c = p0Var.mo28077a(zzdo);
        this.f26935d = p0Var;
        this.f26932a = zzdo;
    }

    /* renamed from: a */
    static <T> C10286c2<T> m25994a(C10294d3<?, ?> d3Var, C10375p0<?> p0Var, zzdo zzdo) {
        return new C10286c2<>(d3Var, p0Var, zzdo);
    }

    /* renamed from: a */
    public final T mo27829a() {
        return this.f26932a.zzbd().zzbi();
    }

    /* renamed from: a */
    public final void mo27830a(T t, C10435y3 y3Var) throws IOException {
        Iterator e = this.f26935d.mo28075a((Object) t).mo28133e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            zzca zzca = (zzca) entry.getKey();
            if (zzca.zzav() != C10429x3.MESSAGE || zzca.zzaw() || zzca.zzax()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            y3Var.zza(zzca.zzc(), entry instanceof C10320h1 ? ((C10320h1) entry).mo27921a().mo27955b() : entry.getValue());
        }
        C10294d3<?, ?> d3Var = this.f26933b;
        d3Var.mo27872b(d3Var.mo27874c(t), y3Var);
    }

    /* renamed from: a */
    public final void mo27831a(T t, T t2) {
        C10371o2.m26376a(this.f26933b, t, t2);
        if (this.f26934c) {
            C10371o2.m26377a(this.f26935d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo27832a(T t, byte[] bArr, int i, int i2, C10407u uVar) throws IOException {
        C10273b1 b1Var = (C10273b1) t;
        C10301e3 e3Var = b1Var.zzjp;
        if (e3Var == C10301e3.m26061d()) {
            e3Var = C10301e3.m26062e();
            b1Var.zzjp = e3Var;
        }
        C10301e3 e3Var2 = e3Var;
        while (i < i2) {
            int a = C10401t.m26508a(bArr, i, uVar);
            int i3 = uVar.f27219a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? C10401t.m26503a(i3, bArr, a, i2, e3Var2, uVar) : C10401t.m26504a(i3, bArr, a, i2, uVar);
            } else {
                int i4 = 0;
                C10431y yVar = null;
                while (a < i2) {
                    a = C10401t.m26508a(bArr, a, uVar);
                    int i5 = uVar.f27219a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            a = C10401t.m26516e(bArr, a, uVar);
                            yVar = (C10431y) uVar.f27221c;
                        }
                    } else if (i7 == 0) {
                        a = C10401t.m26508a(bArr, a, uVar);
                        i4 = uVar.f27219a;
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a = C10401t.m26504a(i5, bArr, a, i2, uVar);
                }
                if (yVar != null) {
                    e3Var2.mo27889a((i4 << 3) | 2, (Object) yVar);
                }
                i = a;
            }
        }
        if (i != i2) {
            throw zzco.m26832d();
        }
    }

    /* renamed from: a */
    public final boolean mo27833a(T t) {
        return this.f26935d.mo28075a((Object) t).mo28132d();
    }

    /* renamed from: b */
    public final int mo27834b(T t) {
        int hashCode = this.f26933b.mo27874c(t).hashCode();
        return this.f26934c ? (hashCode * 53) + this.f26935d.mo28075a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final boolean mo27835b(T t, T t2) {
        if (!this.f26933b.mo27874c(t).equals(this.f26933b.mo27874c(t2))) {
            return false;
        }
        if (this.f26934c) {
            return this.f26935d.mo28075a((Object) t).equals(this.f26935d.mo28075a((Object) t2));
        }
        return true;
    }

    /* renamed from: c */
    public final int mo27836c(T t) {
        C10294d3<?, ?> d3Var = this.f26933b;
        int d = d3Var.mo27876d(d3Var.mo27874c(t)) + 0;
        return this.f26934c ? d + this.f26935d.mo28075a((Object) t).mo28136g() : d;
    }

    public final void zzc(T t) {
        this.f26933b.mo27867a(t);
        this.f26935d.mo28079c(t);
    }
}
