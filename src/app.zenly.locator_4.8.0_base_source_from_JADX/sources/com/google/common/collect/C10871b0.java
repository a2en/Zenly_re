package com.google.common.collect;

import com.google.common.base.C10850i;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.lang.Comparable;

/* renamed from: com.google.common.collect.b0 */
public final class C10871b0<C extends Comparable> extends C10873c0 implements Predicate<C>, Serializable {

    /* renamed from: g */
    private static final C10871b0<Comparable> f28414g = new C10871b0<>(C10888i.m28069b(), C10888i.m28068a());
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    final C10888i<C> f28415e;

    /* renamed from: f */
    final C10888i<C> f28416f;

    private C10871b0(C10888i<C> iVar, C10888i<C> iVar2) {
        C10850i.m28004a(iVar);
        this.f28415e = iVar;
        C10850i.m28004a(iVar2);
        this.f28416f = iVar2;
        if (iVar.compareTo(iVar2) > 0 || iVar == C10888i.m28068a() || iVar2 == C10888i.m28069b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid range: ");
            sb.append(m28039a(iVar, iVar2));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <C extends Comparable<?>> C10871b0<C> m28038a() {
        return f28414g;
    }

    /* renamed from: b */
    public boolean mo31661b(C c) {
        C10850i.m28004a(c);
        return this.f28415e.mo31700a(c) && !this.f28416f.mo31700a(c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10871b0)) {
            return false;
        }
        C10871b0 b0Var = (C10871b0) obj;
        if (!this.f28415e.equals(b0Var.f28415e) || !this.f28416f.equals(b0Var.f28416f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f28415e.hashCode() * 31) + this.f28416f.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public Object readResolve() {
        return equals(f28414g) ? m28038a() : this;
    }

    public String toString() {
        return m28039a(this.f28415e, this.f28416f);
    }

    @Deprecated
    /* renamed from: a */
    public boolean apply(C c) {
        return mo31661b(c);
    }

    /* renamed from: a */
    private static String m28039a(C10888i<?> iVar, C10888i<?> iVar2) {
        StringBuilder sb = new StringBuilder(16);
        iVar.mo31699a(sb);
        sb.append("..");
        iVar2.mo31701b(sb);
        return sb.toString();
    }

    /* renamed from: a */
    static int m28037a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
