package com.bumptech.glide.p301o;

/* renamed from: com.bumptech.glide.o.i */
public class C9215i {

    /* renamed from: a */
    private Class<?> f23884a;

    /* renamed from: b */
    private Class<?> f23885b;

    /* renamed from: c */
    private Class<?> f23886c;

    public C9215i() {
    }

    /* renamed from: a */
    public void mo24836a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f23884a = cls;
        this.f23885b = cls2;
        this.f23886c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9215i.class != obj.getClass()) {
            return false;
        }
        C9215i iVar = (C9215i) obj;
        return this.f23884a.equals(iVar.f23884a) && this.f23885b.equals(iVar.f23885b) && C9217k.m22105b((Object) this.f23886c, (Object) iVar.f23886c);
    }

    public int hashCode() {
        int hashCode = ((this.f23884a.hashCode() * 31) + this.f23885b.hashCode()) * 31;
        Class<?> cls = this.f23886c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.f23884a);
        sb.append(", second=");
        sb.append(this.f23885b);
        sb.append('}');
        return sb.toString();
    }

    public C9215i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo24836a(cls, cls2, cls3);
    }
}
