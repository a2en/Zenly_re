package app.zenly.locator.p143s.p157t.p158a;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.t.a.a */
public final class C5512a {
    static {
        new C5512a();
    }

    private C5512a() {
    }

    @TargetApi(23)
    /* renamed from: a */
    public static final int m15630a(TelephonyManager telephonyManager) {
        C12932j.m33818b(telephonyManager, "telephonyManager");
        if (VERSION.SDK_INT >= 23) {
            return telephonyManager.getPhoneCount();
        }
        return telephonyManager.getPhoneType() == 0 ? 0 : 1;
    }

    @TargetApi(26)
    /* renamed from: a */
    public static final int m15631a(TelephonyManager telephonyManager, int i) {
        C12932j.m33818b(telephonyManager, "telephonyManager");
        if (VERSION.SDK_INT >= 26) {
            return telephonyManager.getSimState(i);
        }
        if (i == 0) {
            return telephonyManager.getSimState();
        }
        return 0;
    }
}
