package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.appsflyer.internal.e */
public final class C8766e {

    /* renamed from: ˏ */
    private IntentFilter f22694 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.e$a */
    static final class C8767a {

        /* renamed from: ˎ */
        static final C8766e f22695 = new C8766e();
    }

    /* renamed from: com.appsflyer.internal.e$c */
    public static final class C8768c {

        /* renamed from: ˋ */
        public final String f22696;

        /* renamed from: ˎ */
        public final float f22697;

        C8768c(float f, String str) {
            this.f22697 = f;
            this.f22696 = str;
        }

        C8768c() {
        }
    }

    C8766e() {
    }

    /* renamed from: ˊ */
    public static C8766e m20725() {
        return C8767a.f22695;
    }

    /* renamed from: ॱ */
    public final C8768c mo23788(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.f22694);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C8768c(f, str);
    }
}
