package zendesk.suas;

/* renamed from: zendesk.suas.f */
public class C13609f {

    /* renamed from: a */
    public static final Filter f35143a = new C13611b();

    /* renamed from: b */
    public static final Filter f35144b = new C13612c();

    /* renamed from: zendesk.suas.f$b */
    private static class C13611b implements Filter {
        private C13611b() {
        }

        public boolean filter(Object obj, Object obj2) {
            return true;
        }
    }

    /* renamed from: zendesk.suas.f$c */
    private static class C13612c implements Filter {
        private C13612c() {
        }

        public boolean filter(Object obj, Object obj2) {
            return !obj.equals(obj2);
        }
    }
}
