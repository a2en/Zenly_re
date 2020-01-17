package app.zenly.locator.map.p111j1;

import java.util.Objects;

/* renamed from: app.zenly.locator.map.j1.a */
public class C4079a {

    /* renamed from: a */
    public String f10694a;

    /* renamed from: b */
    public String f10695b;

    /* renamed from: c */
    public String f10696c;

    /* renamed from: d */
    public int f10697d = Integer.MAX_VALUE;

    /* renamed from: e */
    public boolean f10698e;

    public C4079a() {
        String str = "";
        this.f10694a = str;
        this.f10695b = str;
        this.f10696c = str;
    }

    /* renamed from: a */
    public void mo10734a(C4079a aVar) {
        this.f10694a = aVar.f10694a;
        this.f10695b = aVar.f10695b;
        this.f10696c = aVar.f10696c;
        this.f10697d = aVar.f10697d;
        this.f10698e = aVar.f10698e;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4079a.class != obj.getClass()) {
            return false;
        }
        C4079a aVar = (C4079a) obj;
        if (this.f10697d != aVar.f10697d || !Objects.equals(this.f10694a, aVar.f10694a) || !Objects.equals(this.f10695b, aVar.f10695b) || !Objects.equals(this.f10696c, aVar.f10696c) || this.f10698e != aVar.f10698e) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f10694a, this.f10695b, this.f10696c, Integer.valueOf(this.f10697d), Boolean.valueOf(this.f10698e)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContextualLabeling{label='");
        sb.append(this.f10694a);
        sb.append('\'');
        sb.append(", meta='");
        sb.append(this.f10695b);
        sb.append('\'');
        sb.append(", street='");
        sb.append(this.f10696c);
        sb.append('\'');
        sb.append(", type=");
        sb.append(this.f10697d);
        sb.append(", isOutdated=");
        sb.append(this.f10698e);
        sb.append('}');
        return sb.toString();
    }

    public C4079a(String str, int i) {
        String str2 = "";
        this.f10694a = str2;
        this.f10695b = str2;
        this.f10696c = str2;
        this.f10694a = str;
        this.f10697d = i;
    }
}
