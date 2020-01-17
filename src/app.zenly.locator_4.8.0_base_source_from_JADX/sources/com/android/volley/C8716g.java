package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.android.volley.g */
public class C8716g {

    /* renamed from: a */
    public static String f22460a = "Volley";

    /* renamed from: b */
    public static boolean f22461b = Log.isLoggable(f22460a, 2);

    /* renamed from: c */
    private static final String f22462c = C8716g.class.getName();

    /* renamed from: com.android.volley.g$a */
    static class C8717a {

        /* renamed from: c */
        public static final boolean f22463c = C8716g.f22461b;

        /* renamed from: a */
        private final List<C8718a> f22464a = new ArrayList();

        /* renamed from: b */
        private boolean f22465b = false;

        /* renamed from: com.android.volley.g$a$a */
        private static class C8718a {

            /* renamed from: a */
            public final String f22466a;

            /* renamed from: b */
            public final long f22467b;

            /* renamed from: c */
            public final long f22468c;

            public C8718a(String str, long j, long j2) {
                this.f22466a = str;
                this.f22467b = j;
                this.f22468c = j2;
            }
        }

        C8717a() {
        }

        /* renamed from: a */
        public synchronized void mo23580a(String str, long j) {
            if (!this.f22465b) {
                List<C8718a> list = this.f22464a;
                C8718a aVar = new C8718a(str, j, SystemClock.elapsedRealtime());
                list.add(aVar);
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            if (!this.f22465b) {
                mo23579a("Request on the loose");
                C8716g.m20508c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        public synchronized void mo23579a(String str) {
            this.f22465b = true;
            long a = m20511a();
            if (a > 0) {
                long j = ((C8718a) this.f22464a.get(0)).f22468c;
                C8716g.m20507b("(%-4d ms) %s", Long.valueOf(a), str);
                for (C8718a aVar : this.f22464a) {
                    long j2 = aVar.f22468c;
                    C8716g.m20507b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(aVar.f22467b), aVar.f22466a);
                    j = j2;
                }
            }
        }

        /* renamed from: a */
        private long m20511a() {
            if (this.f22464a.size() == 0) {
                return 0;
            }
            long j = ((C8718a) this.f22464a.get(0)).f22468c;
            List<C8718a> list = this.f22464a;
            return ((C8718a) list.get(list.size() - 1)).f22468c - j;
        }
    }

    /* renamed from: a */
    public static void m20506a(Throwable th, String str, Object... objArr) {
        Log.e(f22460a, m20505a(str, objArr), th);
    }

    /* renamed from: b */
    public static void m20507b(String str, Object... objArr) {
        Log.d(f22460a, m20505a(str, objArr));
    }

    /* renamed from: c */
    public static void m20508c(String str, Object... objArr) {
        Log.e(f22460a, m20505a(str, objArr));
    }

    /* renamed from: d */
    public static void m20509d(String str, Object... objArr) {
        if (f22461b) {
            Log.v(f22460a, m20505a(str, objArr));
        }
    }

    /* renamed from: e */
    public static void m20510e(String str, Object... objArr) {
        Log.wtf(f22460a, m20505a(str, objArr));
    }

    /* renamed from: a */
    private static String m20505a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f22462c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                StringBuilder sb = new StringBuilder();
                sb.append(substring2);
                sb.append(".");
                sb.append(stackTrace[i].getMethodName());
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
