package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<WakeLock> f3399a = new SparseArray<>();

    /* renamed from: b */
    private static int f3400b = 1;

    /* renamed from: a */
    public static ComponentName m3974a(Context context, Intent intent) {
        synchronized (f3399a) {
            int i = f3400b;
            f3400b++;
            if (f3400b <= 0) {
                f3400b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f3399a.put(i, newWakeLock);
            return startService;
        }
    }

    /* renamed from: a */
    public static boolean m3975a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f3399a) {
            WakeLock wakeLock = (WakeLock) f3399a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f3399a.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }
}
