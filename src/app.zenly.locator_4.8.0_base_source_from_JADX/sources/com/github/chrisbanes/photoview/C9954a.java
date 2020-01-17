package com.github.chrisbanes.photoview;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.github.chrisbanes.photoview.a */
class C9954a {
    /* renamed from: a */
    public static void m24885a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            m24886b(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    @TargetApi(16)
    /* renamed from: b */
    private static void m24886b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
