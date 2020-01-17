package com.mapbox.mapboxsdk.utils;

import android.os.Looper;
import com.mapbox.mapboxsdk.exceptions.CalledFromWorkerThreadException;

/* renamed from: com.mapbox.mapboxsdk.utils.e */
public class C11598e {
    /* renamed from: a */
    public static void m30384a(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new CalledFromWorkerThreadException(String.format("%s interactions should happen on the UI thread.", new Object[]{str}));
        }
    }
}
