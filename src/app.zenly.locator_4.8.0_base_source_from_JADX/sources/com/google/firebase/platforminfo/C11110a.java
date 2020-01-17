package com.google.firebase.platforminfo;

/* renamed from: com.google.firebase.platforminfo.a */
final class C11110a extends C11114e {

    /* renamed from: a */
    private final String f28802a;

    /* renamed from: b */
    private final String f28803b;

    C11110a(String str, String str2) {
        if (str != null) {
            this.f28802a = str;
            if (str2 != null) {
                this.f28803b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: a */
    public String mo32360a() {
        return this.f28802a;
    }

    /* renamed from: b */
    public String mo32361b() {
        return this.f28803b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11114e)) {
            return false;
        }
        C11114e eVar = (C11114e) obj;
        if (!this.f28802a.equals(eVar.mo32360a()) || !this.f28803b.equals(eVar.mo32361b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f28802a.hashCode() ^ 1000003) * 1000003) ^ this.f28803b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.f28802a);
        sb.append(", version=");
        sb.append(this.f28803b);
        sb.append("}");
        return sb.toString();
    }
}
