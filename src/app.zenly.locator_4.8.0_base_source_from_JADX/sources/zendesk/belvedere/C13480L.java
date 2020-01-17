package zendesk.belvedere;

import android.util.Log;

/* renamed from: zendesk.belvedere.L */
class C13480L {

    /* renamed from: a */
    private static Logger f34961a = new C13481a();

    /* renamed from: zendesk.belvedere.L$Logger */
    public interface Logger {
        /* renamed from: d */
        void mo38821d(String str, String str2);

        /* renamed from: e */
        void mo38822e(String str, String str2);

        /* renamed from: e */
        void mo38823e(String str, String str2, Throwable th);

        void setLoggable(boolean z);

        /* renamed from: w */
        void mo38825w(String str, String str2);
    }

    /* renamed from: zendesk.belvedere.L$a */
    static class C13481a implements Logger {

        /* renamed from: a */
        private boolean f34962a = false;

        C13481a() {
        }

        /* renamed from: d */
        public void mo38821d(String str, String str2) {
            if (this.f34962a) {
                Log.d(str, str2);
            }
        }

        /* renamed from: e */
        public void mo38822e(String str, String str2) {
            if (this.f34962a) {
                Log.e(str, str2);
            }
        }

        public void setLoggable(boolean z) {
            this.f34962a = z;
        }

        /* renamed from: w */
        public void mo38825w(String str, String str2) {
            if (this.f34962a) {
                Log.w(str, str2);
            }
        }

        /* renamed from: e */
        public void mo38823e(String str, String str2, Throwable th) {
            if (this.f34962a) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    static void m35694a(Logger logger) {
        f34961a = logger;
    }

    /* renamed from: b */
    static void m35695b(String str, String str2) {
        f34961a.mo38822e(str, str2);
    }

    /* renamed from: c */
    static void m35696c(String str, String str2) {
        f34961a.mo38825w(str, str2);
    }

    /* renamed from: a */
    static void m35692a(String str, String str2) {
        f34961a.mo38821d(str, str2);
    }

    /* renamed from: a */
    static void m35693a(String str, String str2, Throwable th) {
        f34961a.mo38823e(str, str2, th);
    }
}
