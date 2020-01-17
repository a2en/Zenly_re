package androidx.navigation;

import android.os.Bundle;

/* renamed from: androidx.navigation.f */
public final class C0953f {

    /* renamed from: a */
    private final C0978p f3662a;

    /* renamed from: b */
    private final boolean f3663b;

    /* renamed from: c */
    private final boolean f3664c;

    /* renamed from: d */
    private final Object f3665d;

    /* renamed from: androidx.navigation.f$a */
    public static final class C0954a {

        /* renamed from: a */
        private C0978p<?> f3666a;

        /* renamed from: b */
        private boolean f3667b = false;

        /* renamed from: c */
        private Object f3668c;

        /* renamed from: d */
        private boolean f3669d = false;

        /* renamed from: a */
        public C0954a mo4692a(C0978p<?> pVar) {
            this.f3666a = pVar;
            return this;
        }

        /* renamed from: a */
        public C0954a mo4694a(boolean z) {
            this.f3667b = z;
            return this;
        }

        /* renamed from: a */
        public C0954a mo4693a(Object obj) {
            this.f3668c = obj;
            this.f3669d = true;
            return this;
        }

        /* renamed from: a */
        public C0953f mo4695a() {
            if (this.f3666a == null) {
                this.f3666a = C0978p.m4386a(this.f3668c);
            }
            return new C0953f(this.f3666a, this.f3667b, this.f3668c, this.f3669d);
        }
    }

    C0953f(C0978p<?> pVar, boolean z, Object obj, boolean z2) {
        if (!pVar.mo4772b() && z) {
            StringBuilder sb = new StringBuilder();
            sb.append(pVar.mo4770a());
            sb.append(" does not allow nullable values");
            throw new IllegalArgumentException(sb.toString());
        } else if (z || !z2 || obj != null) {
            this.f3662a = pVar;
            this.f3663b = z;
            this.f3665d = obj;
            this.f3664c = z2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Argument with type ");
            sb2.append(pVar.mo4770a());
            sb2.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public Object mo4684a() {
        return this.f3665d;
    }

    /* renamed from: b */
    public C0978p<?> mo4686b() {
        return this.f3662a;
    }

    /* renamed from: c */
    public boolean mo4688c() {
        return this.f3664c;
    }

    /* renamed from: d */
    public boolean mo4689d() {
        return this.f3663b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0953f.class != obj.getClass()) {
            return false;
        }
        C0953f fVar = (C0953f) obj;
        if (this.f3663b != fVar.f3663b || this.f3664c != fVar.f3664c || !this.f3662a.equals(fVar.f3662a)) {
            return false;
        }
        Object obj2 = this.f3665d;
        Object obj3 = fVar.f3665d;
        if (obj2 != null) {
            z = obj2.equals(obj3);
        } else if (obj3 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((this.f3662a.hashCode() * 31) + (this.f3663b ? 1 : 0)) * 31) + (this.f3664c ? 1 : 0)) * 31;
        Object obj = this.f3665d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4685a(String str, Bundle bundle) {
        if (this.f3664c) {
            this.f3662a.mo4771a(bundle, str, this.f3665d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4687b(String str, Bundle bundle) {
        if (!this.f3663b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f3662a.mo4767a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
