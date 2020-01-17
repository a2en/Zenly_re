package app.zenly.locator.chat.panel.emojis.p057f0;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.panel.emojis.f0.a */
public final class C2238a {

    /* renamed from: e */
    public static final C2238a f6847e;

    /* renamed from: f */
    public static final C2238a f6848f;

    /* renamed from: a */
    private final String f6849a;

    /* renamed from: b */
    private final String f6850b;

    /* renamed from: c */
    private final String f6851c;

    /* renamed from: d */
    private final boolean f6852d;

    /* renamed from: app.zenly.locator.chat.panel.emojis.f0.a$a */
    public static final class C2239a {
        private C2239a() {
        }

        public /* synthetic */ C2239a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2239a(null);
        C2238a aVar = new C2238a("", "", "", false, 8, null);
        f6847e = aVar;
        String str = "";
        f6848f = new C2238a("REQUEST_PIC", str, str, true);
    }

    public C2238a(String str, String str2, String str3) {
        this(str, str2, str3, false, 8, null);
    }

    public C2238a(String str, String str2, String str3, boolean z) {
        C12932j.m33818b(str, "uuid");
        C12932j.m33818b(str2, "utf8");
        C12932j.m33818b(str3, "url");
        this.f6849a = str;
        this.f6850b = str2;
        this.f6851c = str3;
        this.f6852d = z;
    }

    /* renamed from: a */
    public final String mo8096a() {
        return this.f6851c;
    }

    /* renamed from: b */
    public final String mo8097b() {
        return this.f6850b;
    }

    /* renamed from: c */
    public final String mo8098c() {
        return this.f6849a;
    }

    /* renamed from: d */
    public final boolean mo8099d() {
        return this.f6852d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2238a) {
                C2238a aVar = (C2238a) obj;
                if (C12932j.m33817a((Object) this.f6849a, (Object) aVar.f6849a) && C12932j.m33817a((Object) this.f6850b, (Object) aVar.f6850b) && C12932j.m33817a((Object) this.f6851c, (Object) aVar.f6851c)) {
                    if (this.f6852d == aVar.f6852d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6849a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6850b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6851c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f6852d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Emoji(uuid=");
        sb.append(this.f6849a);
        sb.append(", utf8=");
        sb.append(this.f6850b);
        sb.append(", url=");
        sb.append(this.f6851c);
        sb.append(", isPowerEmoji=");
        sb.append(this.f6852d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2238a(String str, String str2, String str3, boolean z, int i, C12928f fVar) {
        if ((i & 8) != 0) {
            z = false;
        }
        this(str, str2, str3, z);
    }
}
