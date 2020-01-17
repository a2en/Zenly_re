package p213co.znly.core.sync_adapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: co.znly.core.sync_adapter.ZenlyCoreSyncService */
public class ZenlyCoreSyncService extends Service {
    private static ZenlyCoreSyncAdapter syncAdapter;

    public IBinder onBind(Intent intent) {
        return syncAdapter.getSyncAdapterBinder();
    }

    public synchronized void onCreate() {
        if (syncAdapter == null) {
            syncAdapter = new ZenlyCoreSyncAdapter(getApplicationContext(), true);
        }
    }
}
