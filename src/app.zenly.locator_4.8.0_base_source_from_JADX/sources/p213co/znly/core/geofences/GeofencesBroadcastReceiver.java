package p213co.znly.core.geofences;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.location.C10564c;
import com.google.android.gms.location.Geofence;

/* renamed from: co.znly.core.geofences.GeofencesBroadcastReceiver */
public class GeofencesBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "geofences_receiver";

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("id");
            if (stringExtra != null) {
                C10564c a = C10564c.m27009a(intent);
                if (a.mo28694d()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("error while handling geofence, error code = ");
                    sb.append(a.mo28691a());
                    Log.e(TAG, sb.toString());
                    return;
                }
                int b = a.mo28692b();
                if (b == 1 || b == 2) {
                    ((PowerManager) context.getSystemService("power")).newWakeLock(1, "GeofencesManager").acquire(100);
                    a.mo28693c();
                    for (Geofence onGeofenceEvent : a.mo28693c()) {
                        GeofenceManager.onGeofenceEvent(context, stringExtra, onGeofenceEvent, a.mo28692b());
                    }
                }
            }
        }
    }
}
