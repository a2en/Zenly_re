package com.facebook.imagepipeline.systrace;

public class FrescoSystrace {

    /* renamed from: a */
    public static final ArgsBuilder f25993a = new C9888b();

    /* renamed from: b */
    private static volatile Systrace f25994b = null;

    public interface ArgsBuilder {
        ArgsBuilder arg(String str, double d);

        ArgsBuilder arg(String str, int i);

        ArgsBuilder arg(String str, long j);

        ArgsBuilder arg(String str, Object obj);

        void flush();
    }

    public interface Systrace {
        void beginSection(String str);

        ArgsBuilder beginSectionWithArgs(String str);

        void endSection();

        boolean isTracing();
    }

    /* renamed from: com.facebook.imagepipeline.systrace.FrescoSystrace$b */
    private static final class C9888b implements ArgsBuilder {
        private C9888b() {
        }

        public ArgsBuilder arg(String str, double d) {
            return this;
        }

        public ArgsBuilder arg(String str, int i) {
            return this;
        }

        public ArgsBuilder arg(String str, long j) {
            return this;
        }

        public ArgsBuilder arg(String str, Object obj) {
            return this;
        }

        public void flush() {
        }
    }

    private FrescoSystrace() {
    }

    /* renamed from: a */
    public static void m24703a(String str) {
        m24704b().beginSection(str);
    }

    /* renamed from: b */
    private static Systrace m24704b() {
        if (f25994b == null) {
            synchronized (FrescoSystrace.class) {
                if (f25994b == null) {
                    f25994b = new C9889a();
                }
            }
        }
        return f25994b;
    }

    /* renamed from: c */
    public static boolean m24705c() {
        return m24704b().isTracing();
    }

    /* renamed from: a */
    public static void m24702a() {
        m24704b().endSection();
    }
}
