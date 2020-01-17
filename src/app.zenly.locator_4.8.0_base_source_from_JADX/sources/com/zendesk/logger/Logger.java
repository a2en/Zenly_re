package com.zendesk.logger;

import android.os.Build.VERSION;
import android.util.Log;
import com.appsflyer.share.Constants;
import com.zendesk.service.ErrorResponse;
import com.zendesk.util.C12017g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class Logger {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final TimeZone f31264a = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    private static final List<LogAppender> f31265b = new ArrayList();

    /* renamed from: c */
    private static LogAppender f31266c;

    /* renamed from: d */
    private static boolean f31267d = false;

    public interface LogAppender {
        void log(C12001c cVar, String str, String str2, Throwable th);
    }

    /* renamed from: com.zendesk.logger.Logger$a */
    static class C11999a implements LogAppender {
        C11999a() {
        }

        /* renamed from: a */
        private boolean m31615a(String str) {
            return C12017g.m31658b(str) && (str.endsWith("Provider") || str.endsWith("Service"));
        }

        public void log(C12001c cVar, String str, String str2, Throwable th) {
            String a = C12002a.m31618a(str);
            if (m31615a(str) && C12001c.ERROR == cVar) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                simpleDateFormat.setTimeZone(Logger.f31264a);
                int a2 = C12001c.ERROR.f31274e;
                StringBuilder sb = new StringBuilder();
                sb.append("Time in UTC: ");
                sb.append(simpleDateFormat.format(new Date()));
                Log.println(a2, a, sb.toString());
            }
            if (th != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(C12017g.f31298b);
                sb2.append(Log.getStackTraceString(th));
                str2 = sb2.toString();
            }
            for (String println : C12002a.m31619a(str2, 4000)) {
                Log.println(cVar == null ? C12001c.INFO.f31274e : cVar.f31274e, a, println);
            }
        }
    }

    /* renamed from: com.zendesk.logger.Logger$b */
    static class C12000b implements LogAppender {
        C12000b() {
        }

        public void log(C12001c cVar, String str, String str2, Throwable th) {
            char c;
            StringBuilder sb = new StringBuilder(100);
            sb.append("[");
            sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(new Date()));
            sb.append("]");
            sb.append(" ");
            if (cVar == null) {
                c = C12002a.m31617a(C12001c.INFO.f31274e);
            } else {
                c = C12002a.m31617a(cVar.f31274e);
            }
            sb.append(c);
            sb.append(Constants.URL_PATH_DELIMITER);
            if (!C12017g.m31658b(str)) {
                str = "UNKNOWN";
            }
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            System.out.println(sb.toString());
            if (th != null) {
                th.printStackTrace(System.out);
            }
        }
    }

    /* renamed from: com.zendesk.logger.Logger$c */
    public enum C12001c {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);
        
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final int f31274e;

        private C12001c(int i) {
            this.f31274e = i;
        }
    }

    static {
        C12000b bVar;
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                f31266c = new C11999a();
            }
            if (f31266c == null) {
                bVar = new C12000b();
                f31266c = bVar;
            }
        } catch (ClassNotFoundException unused) {
            if (f31266c == null) {
                bVar = new C12000b();
            }
        } catch (Throwable th) {
            if (f31266c == null) {
                f31266c = new C12000b();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m31611b() {
        return f31267d;
    }

    /* renamed from: c */
    public static void m31612c(String str, String str2, Throwable th, Object... objArr) {
        m31605a(C12001c.WARN, str, str2, th, objArr);
    }

    /* renamed from: d */
    public static void m31614d(String str, String str2, Object... objArr) {
        m31605a(C12001c.WARN, str, str2, null, objArr);
    }

    /* renamed from: a */
    public static void m31607a(String str, String str2, Throwable th, Object... objArr) {
        m31605a(C12001c.ERROR, str, str2, th, objArr);
    }

    /* renamed from: b */
    public static void m31610b(String str, String str2, Object... objArr) {
        m31605a(C12001c.ERROR, str, str2, null, objArr);
    }

    /* renamed from: c */
    public static void m31613c(String str, String str2, Object... objArr) {
        m31605a(C12001c.INFO, str, str2, null, objArr);
    }

    /* renamed from: a */
    public static void m31608a(String str, String str2, Object... objArr) {
        m31605a(C12001c.DEBUG, str, str2, null, objArr);
    }

    /* renamed from: b */
    public static void m31609b(String str, String str2, Throwable th, Object... objArr) {
        m31605a(C12001c.INFO, str, str2, th, objArr);
    }

    /* renamed from: a */
    public static void m31606a(String str, ErrorResponse errorResponse) {
        StringBuilder sb = new StringBuilder();
        if (errorResponse != null) {
            sb.append("Network Error: ");
            sb.append(errorResponse.isNetworkError());
            sb.append(", Status Code: ");
            sb.append(errorResponse.getStatus());
            if (C12017g.m31658b(errorResponse.getReason())) {
                sb.append(", Reason: ");
                sb.append(errorResponse.getReason());
            }
        }
        String sb2 = sb.toString();
        C12001c cVar = C12001c.ERROR;
        if (!C12017g.m31658b(sb2)) {
            sb2 = "Unknown error";
        }
        m31605a(cVar, str, sb2, null, new Object[0]);
    }

    /* renamed from: a */
    private static void m31605a(C12001c cVar, String str, String str2, Throwable th, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (f31267d) {
            f31266c.log(cVar, str, str2, th);
            for (LogAppender log : f31265b) {
                log.log(cVar, str, str2, th);
            }
        }
    }
}
