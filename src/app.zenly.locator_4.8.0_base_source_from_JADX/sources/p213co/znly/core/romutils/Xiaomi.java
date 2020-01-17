package p213co.znly.core.romutils;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;

/* renamed from: co.znly.core.romutils.Xiaomi */
final class Xiaomi {

    /* renamed from: co.znly.core.romutils.Xiaomi$AutoStart */
    static final class AutoStart {
        private AutoStart() {
        }

        static Boolean hasAutoStartOp(Context context) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Integer opByName = AppOpsManagerEx.getOpByName(appOpsManager, "OP_AUTO_START");
            if (opByName == null) {
                return null;
            }
            int checkOpNoThrow = AppOpsManagerEx.checkOpNoThrow(appOpsManager, opByName.intValue(), Binder.getCallingUid(), context.getPackageName());
            boolean z = true;
            if (checkOpNoThrow != 0 && checkOpNoThrow != 1) {
                return null;
            }
            if (checkOpNoThrow != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        static Intent newIntent(Context context) {
            int i = VERSION.SDK_INT;
            if (i < 26 || i > 28) {
                return new Intent("miui.intent.action.OP_AUTO_START").addCategory("android.intent.category.DEFAULT");
            }
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", context.getPackageName(), null));
        }
    }

    private Xiaomi() {
    }
}
