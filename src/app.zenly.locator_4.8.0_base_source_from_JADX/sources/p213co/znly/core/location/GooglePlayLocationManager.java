package p213co.znly.core.location;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.location.C10559a;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.C10568e;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;

/* renamed from: co.znly.core.location.GooglePlayLocationManager */
public class GooglePlayLocationManager extends C10566d {
    private static final String TAG = "GPLayLocationManager";
    private Context context;
    private C10559a fusedLocationClient;
    private Handler handler;
    private HandlerThread handlerThread = new HandlerThread("co.znly.core.thread.google_play_location_manager", 10);

    public GooglePlayLocationManager(Context context2) {
        Log.d(TAG, "GooglePlayLocationManager ctor");
        this.context = context2;
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    private void onLocationChanged(Location location) {
        if (location != null) {
            _onLocationChanged(location.getTime(), location.getLatitude(), location.getLongitude(), location.getAltitude(), (double) location.getAccuracy(), (double) location.getBearing(), location.hasSpeed() ? (double) location.getSpeed() : -1.0d);
        }
    }

    /* access modifiers changed from: protected */
    public native void _onLocationChanged(long j, double d, double d2, double d3, double d4, double d5, double d6);

    /* renamed from: a */
    public /* synthetic */ void mo14697a(LocationRequest locationRequest) {
        if (this.fusedLocationClient == null) {
            this.fusedLocationClient = C10568e.m27017a(this.context);
        }
        this.fusedLocationClient.mo28682a(locationRequest, this, this.handlerThread.getLooper());
    }

    public void onLocationResult(LocationResult locationResult) {
        onLocationChanged(locationResult.mo28661a());
    }

    public void removeLocationUpdates() {
        this.handler.post(new C6534d(this));
    }

    public void requestLocationUpdates(int i, int i2, float f) throws InterruptedException, SecurityException {
        Log.d(TAG, "GooglePlayLocationManager requestLocationUpdates");
        LocationRequest create = LocationRequest.create();
        create.setPriority(i);
        long j = (long) i2;
        create.setInterval(j);
        create.setFastestInterval(j);
        create.setMaxWaitTime(j);
        create.setSmallestDisplacement(f);
        this.handler.post(new C6533c(this, create));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14696a() {
        C10559a aVar = this.fusedLocationClient;
        if (aVar != null) {
            aVar.mo28684e();
            this.fusedLocationClient.mo28683a((C10566d) this);
            this.fusedLocationClient = null;
        }
    }
}
