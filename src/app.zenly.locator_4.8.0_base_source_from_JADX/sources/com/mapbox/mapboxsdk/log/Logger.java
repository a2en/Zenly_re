package com.mapbox.mapboxsdk.log;

import android.util.Log;
import androidx.annotation.Keep;

@Keep
public final class Logger {
    private static final LoggerDefinition DEFAULT = new C11492a();
    private static volatile LoggerDefinition logger = DEFAULT;

    /* renamed from: com.mapbox.mapboxsdk.log.Logger$a */
    static class C11492a implements LoggerDefinition {
        C11492a() {
        }

        /* renamed from: d */
        public void mo33474d(String str, String str2) {
            Log.d(str, str2);
        }

        /* renamed from: e */
        public void mo33476e(String str, String str2) {
            Log.e(str, str2);
        }

        /* renamed from: i */
        public void mo33478i(String str, String str2) {
            Log.i(str, str2);
        }

        /* renamed from: v */
        public void mo33480v(String str, String str2) {
            Log.v(str, str2);
        }

        /* renamed from: w */
        public void mo33482w(String str, String str2) {
            Log.w(str, str2);
        }

        /* renamed from: d */
        public void mo33475d(String str, String str2, Throwable th) {
            Log.d(str, str2, th);
        }

        /* renamed from: e */
        public void mo33477e(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        /* renamed from: i */
        public void mo33479i(String str, String str2, Throwable th) {
            Log.i(str, str2, th);
        }

        /* renamed from: v */
        public void mo33481v(String str, String str2, Throwable th) {
            Log.v(str, str2, th);
        }

        /* renamed from: w */
        public void mo33483w(String str, String str2, Throwable th) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m29678d(String str, String str2) {
        logger.mo33474d(str, str2);
    }

    /* renamed from: e */
    public static void m29680e(String str, String str2) {
        logger.mo33476e(str, str2);
    }

    /* renamed from: i */
    public static void m29682i(String str, String str2) {
        logger.mo33478i(str, str2);
    }

    public static void log(int i, String str, String str2) {
        if (i == 2) {
            m29684v(str, str2);
        } else if (i == 3) {
            m29678d(str, str2);
        } else if (i == 4) {
            m29682i(str, str2);
        } else if (i == 5) {
            m29686w(str, str2);
        } else if (i == 6) {
            m29680e(str, str2);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void setLoggerDefinition(LoggerDefinition loggerDefinition) {
        logger = loggerDefinition;
    }

    /* renamed from: v */
    public static void m29684v(String str, String str2) {
        logger.mo33480v(str, str2);
    }

    /* renamed from: w */
    public static void m29686w(String str, String str2) {
        logger.mo33482w(str, str2);
    }

    /* renamed from: d */
    public static void m29679d(String str, String str2, Throwable th) {
        logger.mo33475d(str, str2, th);
    }

    /* renamed from: e */
    public static void m29681e(String str, String str2, Throwable th) {
        logger.mo33477e(str, str2, th);
    }

    /* renamed from: i */
    public static void m29683i(String str, String str2, Throwable th) {
        logger.mo33479i(str, str2, th);
    }

    /* renamed from: v */
    public static void m29685v(String str, String str2, Throwable th) {
        logger.mo33481v(str, str2, th);
    }

    /* renamed from: w */
    public static void m29687w(String str, String str2, Throwable th) {
        logger.mo33483w(str, str2, th);
    }
}
