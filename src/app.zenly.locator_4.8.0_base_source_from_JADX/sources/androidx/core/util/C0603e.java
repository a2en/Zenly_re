package androidx.core.util;

/* renamed from: androidx.core.util.e */
public class C0603e<F, S> {

    /* renamed from: a */
    public final F f2729a;

    /* renamed from: b */
    public final S f2730b;

    public C0603e(F f, S s) {
        this.f2729a = f;
        this.f2730b = s;
    }

    /* renamed from: a */
    public static <A, B> C0603e<A, B> m2769a(A a, B b) {
        return new C0603e<>(a, b);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0603e)) {
            return false;
        }
        C0603e eVar = (C0603e) obj;
        if (C0602d.m2768a(eVar.f2729a, this.f2729a) && C0602d.m2768a(eVar.f2730b, this.f2730b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        F f = this.f2729a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f2730b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f2729a));
        sb.append(" ");
        sb.append(String.valueOf(this.f2730b));
        sb.append("}");
        return sb.toString();
    }
}
