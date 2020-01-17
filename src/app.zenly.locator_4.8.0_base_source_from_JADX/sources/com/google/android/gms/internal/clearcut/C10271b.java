package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b */
public class C10271b {

    /* renamed from: a */
    private static volatile UserManager f26880a;

    /* renamed from: b */
    private static volatile boolean f26881b = (!m25914a());

    private C10271b() {
    }

    /* renamed from: a */
    private static boolean m25914a() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m25915a(Context context) {
        return m25914a() && !m25916b(context);
    }

    @TargetApi(24)
    /* renamed from: b */
    private static boolean m25916b(Context context) {
        boolean z = f26881b;
        if (!z) {
            UserManager userManager = f26880a;
            if (userManager == null) {
                synchronized (C10271b.class) {
                    userManager = f26880a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        f26880a = userManager2;
                        if (userManager2 == null) {
                            f26881b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            z = userManager.isUserUnlocked();
            f26881b = z;
            if (z) {
                f26880a = null;
            }
        }
        return z;
    }
}
