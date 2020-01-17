package app.zenly.locator.chat.p053m5;

/* renamed from: app.zenly.locator.chat.m5.a */
public final class C2097a {

    /* renamed from: a */
    public final int f6583a;

    /* renamed from: b */
    public final String f6584b;

    /* renamed from: c */
    public final String f6585c;

    /* renamed from: d */
    public final int f6586d;

    /* renamed from: e */
    public final int f6587e;

    private C2097a(String str) {
        this.f6583a = 1;
        this.f6584b = str;
        this.f6585c = null;
        this.f6586d = 0;
        this.f6587e = 0;
    }

    /* renamed from: a */
    public static C2097a m7846a(String str) {
        return new C2097a(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ComposedMessage body=");
        sb.append(this.f6584b);
        sb.append(" image=");
        sb.append(this.f6585c);
        sb.append(">");
        return sb.toString();
    }

    /* renamed from: a */
    public static C2097a m7847a(String str, int i, int i2) {
        return new C2097a(str, i, i2);
    }

    private C2097a(String str, int i, int i2) {
        this.f6583a = 2;
        this.f6584b = null;
        this.f6585c = str;
        this.f6586d = i;
        this.f6587e = i2;
    }
}
