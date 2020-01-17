package p250f.p251a.p252a.p263b.p264a.p267f;

/* renamed from: f.a.a.b.a.f.a */
public enum C7703a {
    _512(".512.jpg", 512);
    

    /* renamed from: i */
    public static final C7704a f19332i = null;

    /* renamed from: e */
    private final String f19333e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f19334f;

    /* renamed from: f.a.a.b.a.f.a$a */
    public static final class C7704a {
        private C7704a() {
        }

        /* renamed from: a */
        public final C7703a mo19919a(int i) {
            C7703a aVar;
            C7703a[] values = C7703a.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i2];
                if (aVar.f19334f >= i) {
                    break;
                }
                i2++;
            }
            return aVar != null ? aVar : C7703a._512;
        }

        public /* synthetic */ C7704a(C12928f fVar) {
            this();
        }
    }

    static {
        f19332i = new C7704a(null);
    }

    private C7703a(String str, int i) {
        this.f19333e = str;
        this.f19334f = i;
    }

    /* renamed from: a */
    public final String mo19918a() {
        return this.f19333e;
    }
}
