package p213co.znly.core.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* renamed from: co.znly.core.location.AndroidLocationManager */
public class AndroidLocationManager implements LocationListener {
    private static final String TAG = "AndroidLocationManager";
    private Handler handler;
    private HandlerThread handlerThread = new HandlerThread("co.znly.core.thread.android_location_manager", 10);
    private LocationManager systemLocationManager;

    public AndroidLocationManager(Context context) {
        this.systemLocationManager = (LocationManager) context.getSystemService("location");
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    /* access modifiers changed from: protected */
    public native void _onLocationChanged(long j, double d, double d2, double d3, double d4, double d5, double d6);

    /* renamed from: a */
    public /* synthetic */ void mo14688a(String str, long j, float f) {
        this.systemLocationManager.requestLocationUpdates(str, j, f, this, this.handlerThread.getLooper());
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            _onLocationChanged(location.getTime(), location.getLatitude(), location.getLongitude(), location.getAltitude(), (double) location.getAccuracy(), (double) location.getBearing(), location.hasSpeed() ? (double) location.getSpeed() : -1.0d);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void removeUpdates() {
        if (this.systemLocationManager != null) {
            try {
                this.handler.post(new C6532b(this));
            } catch (SecurityException unused) {
            }
        }
    }

    public void requestLocationUpdates(String str, long j, float f) {
        LocationManager locationManager = this.systemLocationManager;
        if (locationManager == null || locationManager.getProvider(str) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("provider does not exists: ");
            sb.append(str);
            Log.e(TAG, sb.toString());
            return;
        }
        try {
            Handler handler2 = this.handler;
            C6531a aVar = new C6531a(this, str, j, f);
            handler2.post(aVar);
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14687a() {
        this.systemLocationManager.removeUpdates(this);
    }
}
