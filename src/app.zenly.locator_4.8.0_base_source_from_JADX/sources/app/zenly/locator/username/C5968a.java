package app.zenly.locator.username;

/* renamed from: app.zenly.locator.username.a */
public enum C5968a {
    CLASSIC(0, "models/card_classic.glb", "models/card_classic.aac", "models/card_classic.md5");
    

    /* renamed from: k */
    public static final C5969a f15017k = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f15018e;

    /* renamed from: f */
    private final String f15019f;

    /* renamed from: g */
    private final String f15020g;

    /* renamed from: h */
    private final String f15021h;

    /* renamed from: app.zenly.locator.username.a$a */
    public static final class C5969a {
        private C5969a() {
        }

        /* renamed from: a */
        public final C5968a mo13702a(int i) {
            C5968a aVar;
            C5968a[] values = C5968a.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i2];
                if (aVar.f15018e == i) {
                    break;
                }
                i2++;
            }
            return aVar != null ? aVar : C5968a.CLASSIC;
        }

        public /* synthetic */ C5969a(C12928f fVar) {
            this();
        }
    }

    static {
        f15017k = new C5969a(null);
    }

    private C5968a(int i, String str, String str2, String str3) {
        this.f15018e = i;
        this.f15019f = str;
        this.f15020g = str2;
        this.f15021h = str3;
    }

    /* renamed from: b */
    public final String mo13700b() {
        return this.f15021h;
    }

    /* renamed from: c */
    public final String mo13701c() {
        return this.f15019f;
    }

    /* renamed from: a */
    public final String mo13699a() {
        return this.f15020g;
    }
}
