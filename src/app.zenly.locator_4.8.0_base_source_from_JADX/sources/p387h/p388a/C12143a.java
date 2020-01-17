package p387h.p388a;

import android.os.Build.VERSION;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: h.a.a */
public final class C12143a {

    /* renamed from: a */
    private static final C12146c[] f31563a = new C12146c[0];

    /* renamed from: b */
    private static final List<C12146c> f31564b = new ArrayList();

    /* renamed from: c */
    static volatile C12146c[] f31565c = f31563a;

    /* renamed from: d */
    private static final C12146c f31566d = new C12144a();

    /* renamed from: h.a.a$a */
    static class C12144a extends C12146c {
        C12144a() {
        }

        /* renamed from: a */
        public void mo35936a(String str, Object... objArr) {
            for (C12146c a : C12143a.f31565c) {
                a.mo35936a(str, objArr);
            }
        }

        /* renamed from: b */
        public void mo35940b(Throwable th) {
            for (C12146c b : C12143a.f31565c) {
                b.mo35940b(th);
            }
        }

        /* renamed from: c */
        public void mo35942c(Throwable th, String str, Object... objArr) {
            for (C12146c c : C12143a.f31565c) {
                c.mo35942c(th, str, objArr);
            }
        }

        /* renamed from: d */
        public void mo35943d(String str, Object... objArr) {
            for (C12146c d : C12143a.f31565c) {
                d.mo35943d(str, objArr);
            }
        }

        /* renamed from: e */
        public void mo35945e(String str, Object... objArr) {
            for (C12146c e : C12143a.f31565c) {
                e.mo35945e(str, objArr);
            }
        }

        /* renamed from: f */
        public void mo35946f(String str, Object... objArr) {
            for (C12146c f : C12143a.f31565c) {
                f.mo35946f(str, objArr);
            }
        }

        /* renamed from: a */
        public void mo35938a(Throwable th, String str, Object... objArr) {
            for (C12146c a : C12143a.f31565c) {
                a.mo35938a(th, str, objArr);
            }
        }

        /* renamed from: b */
        public void mo35939b(String str, Object... objArr) {
            for (C12146c b : C12143a.f31565c) {
                b.mo35939b(str, objArr);
            }
        }

        /* renamed from: d */
        public void mo35944d(Throwable th, String str, Object... objArr) {
            for (C12146c d : C12143a.f31565c) {
                d.mo35944d(th, str, objArr);
            }
        }

        /* renamed from: a */
        public void mo35937a(Throwable th) {
            for (C12146c a : C12143a.f31565c) {
                a.mo35937a(th);
            }
        }

        /* renamed from: b */
        public void mo35941b(Throwable th, String str, Object... objArr) {
            for (C12146c b : C12143a.f31565c) {
                b.mo35941b(th, str, objArr);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9970a(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    /* renamed from: h.a.a$b */
    public static class C12145b extends C12146c {

        /* renamed from: b */
        private static final Pattern f31567b = Pattern.compile("(\\$\\d+)+$");

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo35948a(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = f31567b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String substring = className.substring(className.lastIndexOf(46) + 1);
            return (substring.length() <= 23 || VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo35947a() {
            String a = super.mo35947a();
            if (a != null) {
                return a;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return mo35948a(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }
    }

    /* renamed from: h.a.a$c */
    public static abstract class C12146c {

        /* renamed from: a */
        final ThreadLocal<String> f31568a = new ThreadLocal<>();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo35947a() {
            String str = (String) this.f31568a.get();
            if (str != null) {
                this.f31568a.remove();
            }
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo9970a(int i, String str, String str2, Throwable th);

        /* access modifiers changed from: protected */
        @Deprecated
        /* renamed from: a */
        public boolean mo35949a(int i) {
            return true;
        }

        /* renamed from: b */
        public void mo35940b(Throwable th) {
            m32052a(5, th, (String) null, new Object[0]);
        }

        /* renamed from: c */
        public void mo35942c(Throwable th, String str, Object... objArr) {
            m32052a(5, th, str, objArr);
        }

        /* renamed from: d */
        public void mo35943d(String str, Object... objArr) {
            m32052a(4, (Throwable) null, str, objArr);
        }

        /* renamed from: e */
        public void mo35945e(String str, Object... objArr) {
            m32052a(5, (Throwable) null, str, objArr);
        }

        /* renamed from: f */
        public void mo35946f(String str, Object... objArr) {
            m32052a(7, (Throwable) null, str, objArr);
        }

        /* renamed from: b */
        public void mo35939b(String str, Object... objArr) {
            m32052a(6, (Throwable) null, str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo35951c(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* renamed from: d */
        public void mo35944d(Throwable th, String str, Object... objArr) {
            m32052a(7, th, str, objArr);
        }

        /* renamed from: c */
        private String m32053c(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        /* renamed from: a */
        public void mo35936a(String str, Object... objArr) {
            m32052a(3, (Throwable) null, str, objArr);
        }

        /* renamed from: b */
        public void mo35941b(Throwable th, String str, Object... objArr) {
            m32052a(6, th, str, objArr);
        }

        /* renamed from: a */
        public void mo35938a(Throwable th, String str, Object... objArr) {
            m32052a(3, th, str, objArr);
        }

        /* renamed from: a */
        public void mo35937a(Throwable th) {
            m32052a(6, th, (String) null, new Object[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo35950a(String str, int i) {
            return mo35949a(i);
        }

        /* renamed from: a */
        private void m32052a(int i, Throwable th, String str, Object... objArr) {
            String a = mo35947a();
            if (mo35950a(a, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = mo35951c(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("\n");
                        sb.append(m32053c(th));
                        str = sb.toString();
                    }
                } else if (th != null) {
                    str = m32053c(th);
                } else {
                    return;
                }
                mo9970a(i, a, str, th);
            }
        }
    }

    private C12143a() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static void m32027a(String str, Object... objArr) {
        f31566d.mo35936a(str, objArr);
    }

    /* renamed from: b */
    public static void m32031b(Throwable th) {
        f31566d.mo35940b(th);
    }

    /* renamed from: c */
    public static void m32033c(String str, Object... objArr) {
        f31566d.mo35943d(str, objArr);
    }

    /* renamed from: d */
    public static void m32035d(String str, Object... objArr) {
        f31566d.mo35945e(str, objArr);
    }

    /* renamed from: e */
    public static void m32037e(String str, Object... objArr) {
        f31566d.mo35946f(str, objArr);
    }

    /* renamed from: a */
    public static void m32029a(Throwable th, String str, Object... objArr) {
        f31566d.mo35938a(th, str, objArr);
    }

    /* renamed from: b */
    public static void m32030b(String str, Object... objArr) {
        f31566d.mo35939b(str, objArr);
    }

    /* renamed from: c */
    public static void m32034c(Throwable th, String str, Object... objArr) {
        f31566d.mo35942c(th, str, objArr);
    }

    /* renamed from: d */
    public static void m32036d(Throwable th, String str, Object... objArr) {
        f31566d.mo35944d(th, str, objArr);
    }

    /* renamed from: a */
    public static void m32028a(Throwable th) {
        f31566d.mo35937a(th);
    }

    /* renamed from: b */
    public static void m32032b(Throwable th, String str, Object... objArr) {
        f31566d.mo35941b(th, str, objArr);
    }

    /* renamed from: a */
    public static C12146c m32025a(String str) {
        for (C12146c cVar : f31565c) {
            cVar.f31568a.set(str);
        }
        return f31566d;
    }

    /* renamed from: a */
    public static void m32026a(C12146c cVar) {
        if (cVar == null) {
            throw new NullPointerException("tree == null");
        } else if (cVar != f31566d) {
            synchronized (f31564b) {
                f31564b.add(cVar);
                f31565c = (C12146c[]) f31564b.toArray(new C12146c[f31564b.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }
}
