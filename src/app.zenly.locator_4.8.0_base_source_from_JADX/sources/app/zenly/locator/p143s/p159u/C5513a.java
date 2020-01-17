package app.zenly.locator.p143s.p159u;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import app.zenly.locator.p143s.p157t.p158a.C5512a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.collections.C12819b0;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12963e;

/* renamed from: app.zenly.locator.s.u.a */
public final class C5513a {
    static {
        new C5513a();
    }

    private C5513a() {
    }

    /* renamed from: a */
    public static final Integer m15632a(Context context) {
        C12932j.m33818b(context, "context");
        Integer num = null;
        if (VERSION.SDK_INT < 28) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            SignalStrength signalStrength = telephonyManager.getSignalStrength();
            if (signalStrength != null) {
                num = Integer.valueOf(signalStrength.getGsmSignalStrength());
            }
        }
        return num;
    }

    /* renamed from: b */
    public static final int m15633b(Context context) {
        C12932j.m33818b(context, "context");
        Object systemService = context.getSystemService("phone");
        if (systemService == null) {
            return -1;
        }
        if (systemService != null) {
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int i = 0;
            C12963e d = C12973l.m33894d(0, C5512a.m15630a(telephonyManager));
            if (!(d instanceof Collection) || !((Collection) d).isEmpty()) {
                Iterator it = d.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (C5512a.m15631a(telephonyManager, ((C12819b0) it).mo37031a()) == 5) {
                        i2++;
                        if (i2 < 0) {
                            C12844m.m33610b();
                            throw null;
                        }
                    }
                }
                i = i2;
            }
            return i;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }
}
