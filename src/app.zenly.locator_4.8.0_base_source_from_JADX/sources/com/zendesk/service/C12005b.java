package com.zendesk.service;

/* renamed from: com.zendesk.service.b */
public class C12005b {

    /* renamed from: a */
    private final String f31280a;

    /* renamed from: b */
    private final String f31281b;

    public C12005b(String str, String str2) {
        this.f31280a = str;
        this.f31281b = str2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C12005b.class != obj.getClass()) {
            return false;
        }
        C12005b bVar = (C12005b) obj;
        String str = this.f31280a;
        if (str == null ? bVar.f31280a != null : !str.equals(bVar.f31280a)) {
            return false;
        }
        String str2 = this.f31281b;
        String str3 = bVar.f31281b;
        if (str2 == null ? str3 != null : !str2.equals(str3)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f31280a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31281b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Header{name='");
        sb.append(this.f31280a);
        sb.append('\'');
        sb.append(", value='");
        sb.append(this.f31281b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
