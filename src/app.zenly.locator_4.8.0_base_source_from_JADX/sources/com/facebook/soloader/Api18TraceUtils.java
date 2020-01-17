package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
@C9911d
class Api18TraceUtils {
    Api18TraceUtils() {
    }

    /* renamed from: a */
    public static void m24761a(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: a */
    public static void m24760a() {
        Trace.endSection();
    }
}
