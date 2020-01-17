package app.zenly.locator.p017a0.p024p.p025d;

/* renamed from: app.zenly.locator.a0.p.d.b */
public final class C1564b {

    /* renamed from: a */
    private final int f5496a;

    /* renamed from: b */
    private final int f5497b;

    /* renamed from: c */
    private final int f5498c;

    public C1564b(int i, int i2, int i3) {
        this.f5496a = i;
        this.f5497b = i2;
        this.f5498c = i3;
    }

    /* renamed from: a */
    public static /* synthetic */ C1564b m6772a(C1564b bVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bVar.f5496a;
        }
        if ((i4 & 2) != 0) {
            i2 = bVar.f5497b;
        }
        if ((i4 & 4) != 0) {
            i3 = bVar.f5498c;
        }
        return bVar.mo7111a(i, i2, i3);
    }

    /* renamed from: a */
    public final int mo7110a() {
        return this.f5496a;
    }

    /* renamed from: a */
    public final C1564b mo7111a(int i, int i2, int i3) {
        return new C1564b(i, i2, i3);
    }

    /* renamed from: b */
    public final int mo7112b() {
        return this.f5497b;
    }

    /* renamed from: c */
    public final int mo7113c() {
        return this.f5498c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1564b) {
                C1564b bVar = (C1564b) obj;
                if (this.f5496a == bVar.f5496a) {
                    if (this.f5497b == bVar.f5497b) {
                        if (this.f5498c == bVar.f5498c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Integer.valueOf(this.f5496a).hashCode() * 31) + Integer.valueOf(this.f5497b).hashCode()) * 31) + Integer.valueOf(this.f5498c).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SettingsPreferences(mapProvider=");
        sb.append(this.f5496a);
        sb.append(", mapType=");
        sb.append(this.f5497b);
        sb.append(", unitsFormatting=");
        sb.append(this.f5498c);
        sb.append(")");
        return sb.toString();
    }
}
