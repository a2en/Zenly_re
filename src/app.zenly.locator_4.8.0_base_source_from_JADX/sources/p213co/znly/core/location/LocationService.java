package p213co.znly.core.location;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.core.content.C0540a;

/* renamed from: co.znly.core.location.LocationService */
public class LocationService extends Service {
    private static final String TAG = "LocationService";
    private static final ServiceConnection connection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(LocationService.TAG, "onServiceConnected");
            synchronized (LocationService.class) {
                LocationService.instance = ((LocalBinder) iBinder).getService();
                LocationService.instance.show(LocationService.shouldShow);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(LocationService.TAG, "LocationService.onServiceDisconnected");
        }
    };
    /* access modifiers changed from: private */
    public static LocationService instance = null;
    private static NotificationProvider provider = null;
    /* access modifiers changed from: private */
    public static boolean shouldShow = false;
    private static boolean shown = false;
    private final LocalBinder binder = new LocalBinder();

    /* renamed from: co.znly.core.location.LocationService$LocalBinder */
    public class LocalBinder extends Binder {
        public LocalBinder() {
        }

        /* access modifiers changed from: 0000 */
        public LocationService getService() {
            return LocationService.this;
        }
    }

    public static synchronized void setNotificationProvider(NotificationProvider notificationProvider) {
        synchronized (LocationService.class) {
            provider = notificationProvider;
        }
    }

    /* access modifiers changed from: private */
    public synchronized void show(boolean z) {
        if (z) {
            try {
                if (!shown) {
                    Log.d(TAG, "show");
                    C0540a.m2539a((Context) this, new Intent(this, LocationService.class));
                    startForeground(1337, provider.getNotification());
                    shown = true;
                }
            } finally {
            }
        }
        if (!z && shown) {
            Log.d(TAG, "hide");
            stopForeground(true);
            stopSelf();
            shown = false;
        }
    }

    public static synchronized void start(Context context) {
        synchronized (LocationService.class) {
            Log.d(TAG, "start");
            shouldShow = true;
            if (instance == null) {
                context.bindService(new Intent(context, LocationService.class), connection, 1);
            } else {
                instance.show(shouldShow);
            }
        }
    }

    public static synchronized void stop(Context context) {
        synchronized (LocationService.class) {
            Log.d(TAG, "stop");
            shouldShow = false;
            if (instance != null) {
                instance.show(shouldShow);
                Log.d(TAG, "unbind");
                context.unbindService(connection);
                instance = null;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.binder;
    }
}
