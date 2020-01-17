package com.appsflyer;

import android.util.Log;
import com.appsflyer.internal.C8752aa;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {

    /* renamed from: ˋ */
    private static long f22522 = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ˊ */
        private int f22524;

        private LogLevel(int i) {
            this.f22524 = i;
        }

        public final int getLevel() {
            return this.f22524;
        }
    }

    public static void afDebugLog(String str) {
        if (LogLevel.DEBUG.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.d(AppsFlyerLibCore.LOG_TAG, m20590(str, false));
        }
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772(null, "D", m20590(str, true));
    }

    public static void afErrorLog(String str, Throwable th) {
        m20589(str, th, false);
    }

    public static void afInfoLog(String str, boolean z) {
        if (LogLevel.INFO.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.i(AppsFlyerLibCore.LOG_TAG, m20590(str, false));
        }
        if (z) {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa.f22603.mo23772(null, "I", m20590(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.v(AppsFlyerLibCore.LOG_TAG, m20590(str, false));
        }
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772(null, "V", m20590(str, true));
    }

    public static void afWarnLog(String str) {
        m20588(str);
    }

    public static void resetDeltaTime() {
        f22522 = System.currentTimeMillis();
    }

    /* renamed from: ˊ */
    private static void m20589(String str, Throwable th, boolean z) {
        String[] strArr;
        if ((LogLevel.ERROR.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) && z) {
            Log.e(AppsFlyerLibCore.LOG_TAG, m20590(str, false), th);
        }
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa aaVar = C8752aa.f22603;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        StackTraceElement[] stackTrace = cause == null ? th.getStackTrace() : cause.getStackTrace();
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            String[] strArr2 = new String[(stackTrace.length + 1)];
            strArr2[0] = message;
            for (int i = 1; i < stackTrace.length; i++) {
                strArr2[i] = stackTrace[i].toString();
            }
            strArr = strArr2;
        }
        aaVar.mo23772("exception", simpleName, strArr);
    }

    /* renamed from: ˎ */
    private static String m20590(String str, boolean z) {
        if (!z) {
            if (LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(m20587(System.currentTimeMillis() - f22522));
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ॱ */
    static void m20591(String str) {
        if (!AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            Log.d(AppsFlyerLibCore.LOG_TAG, m20590(str, false));
        }
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772(null, "F", str);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m20589(str, th, z);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    /* renamed from: ˊ */
    static void m20588(String str) {
        if (LogLevel.WARNING.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            Log.w(AppsFlyerLibCore.LOG_TAG, m20590(str, false));
        }
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772(null, "W", m20590(str, true));
    }

    /* renamed from: ˊ */
    private static String m20587(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        long millis3 = TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds));
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis3)});
    }
}
