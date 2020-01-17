package com.bluelinelabs.conductor.internal;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* renamed from: com.bluelinelabs.conductor.internal.c */
public class C8848c {

    /* renamed from: com.bluelinelabs.conductor.internal.c$a */
    private static final class C8849a extends AndroidRuntimeException {
        C8849a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m21105a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new C8849a("Methods that affect the view hierarchy can can only be called from the main thread.");
        }
    }
}
