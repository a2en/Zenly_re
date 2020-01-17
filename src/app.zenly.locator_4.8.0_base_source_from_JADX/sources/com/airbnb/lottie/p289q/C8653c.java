package com.airbnb.lottie.p289q;

import android.util.Log;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.q.c */
public class C8653c implements LottieLogger {

    /* renamed from: a */
    private static final Set<String> f22215a = new HashSet();

    public void debug(String str) {
        debug(str, null);
    }

    public void warning(String str) {
        warning(str, null);
    }

    public void debug(String str, Throwable th) {
        if (C8505b.f21751a) {
            Log.d("LOTTIE", str, th);
        }
    }

    public void warning(String str, Throwable th) {
        if (!f22215a.contains(str)) {
            Log.w("LOTTIE", str, th);
            f22215a.add(str);
        }
    }
}
