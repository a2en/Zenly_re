package app.zenly.locator.core.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.util.t */
public final class C3237t {
    /* renamed from: a */
    private static final String m10266a(Context context) {
        Object obj;
        boolean z;
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return null;
            }
            Iterator it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RunningAppProcessInfo) obj).pid == myPid) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) obj;
            if (runningAppProcessInfo != null) {
                return runningAppProcessInfo.processName;
            }
            return null;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: b */
    public static final boolean m10267b(Context context) {
        C12932j.m33818b(context, "context");
        return C12932j.m33817a((Object) m10266a(context), (Object) context.getPackageName());
    }
}
