package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.common.executors.g */
public class C9520g extends C9517d {

    /* renamed from: b */
    private static C9520g f24705b;

    private C9520g() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static C9520g m23241a() {
        if (f24705b == null) {
            f24705b = new C9520g();
        }
        return f24705b;
    }

    public void execute(Runnable runnable) {
        if (isHandlerThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
