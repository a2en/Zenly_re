package p333g.p382g.p383a;

/* renamed from: g.g.a.a */
public class C12124a {

    /* renamed from: a */
    public final String f31546a;

    /* renamed from: b */
    public final boolean f31547b;

    /* renamed from: c */
    public final boolean f31548c;

    public C12124a(String str, boolean z, boolean z2) {
        this.f31546a = str;
        this.f31547b = z;
        this.f31548c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12124a.class != obj.getClass()) {
            return false;
        }
        C12124a aVar = (C12124a) obj;
        if (this.f31547b == aVar.f31547b && this.f31548c == aVar.f31548c) {
            return this.f31546a.equals(aVar.f31546a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31546a.hashCode() * 31) + (this.f31547b ? 1 : 0)) * 31) + (this.f31548c ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Permission{name='");
        sb.append(this.f31546a);
        sb.append('\'');
        sb.append(", granted=");
        sb.append(this.f31547b);
        sb.append(", shouldShowRequestPermissionRationale=");
        sb.append(this.f31548c);
        sb.append('}');
        return sb.toString();
    }
}
