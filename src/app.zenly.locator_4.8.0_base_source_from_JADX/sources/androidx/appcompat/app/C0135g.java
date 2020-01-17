package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0541b;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.g */
class C0135g {

    /* renamed from: d */
    private static C0135g f394d;

    /* renamed from: a */
    private final Context f395a;

    /* renamed from: b */
    private final LocationManager f396b;

    /* renamed from: c */
    private final C0136a f397c = new C0136a();

    /* renamed from: androidx.appcompat.app.g$a */
    private static class C0136a {

        /* renamed from: a */
        boolean f398a;

        /* renamed from: b */
        long f399b;

        /* renamed from: c */
        long f400c;

        /* renamed from: d */
        long f401d;

        /* renamed from: e */
        long f402e;

        /* renamed from: f */
        long f403f;

        C0136a() {
        }
    }

    C0135g(Context context, LocationManager locationManager) {
        this.f395a = context;
        this.f396b = locationManager;
    }

    /* renamed from: a */
    static C0135g m425a(Context context) {
        if (f394d == null) {
            Context applicationContext = context.getApplicationContext();
            f394d = new C0135g(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f394d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m427b() {
        Location location = null;
        Location a = C0541b.m2550b(this.f395a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m424a("network") : null;
        if (C0541b.m2550b(this.f395a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m424a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: c */
    private boolean m428c() {
        return this.f397c.f403f > System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo571a() {
        C0136a aVar = this.f397c;
        if (m428c()) {
            return aVar.f398a;
        }
        Location b = m427b();
        if (b != null) {
            m426a(b);
            return aVar.f398a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: a */
    private Location m424a(String str) {
        try {
            if (this.f396b.isProviderEnabled(str)) {
                return this.f396b.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    private void m426a(Location location) {
        long j;
        C0136a aVar = this.f397c;
        long currentTimeMillis = System.currentTimeMillis();
        C0134f a = C0134f.m422a();
        C0134f fVar = a;
        fVar.mo570a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f391a;
        fVar.mo570a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f393c == 1;
        long j3 = a.f392b;
        long j4 = j2;
        long j5 = a.f391a;
        long j6 = j3;
        boolean z2 = z;
        a.mo570a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f392b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.f398a = z2;
        aVar.f399b = j4;
        aVar.f400c = j6;
        aVar.f401d = j5;
        aVar.f402e = j7;
        aVar.f403f = j;
    }
}
