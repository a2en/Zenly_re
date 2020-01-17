package com.mapbox.android.telemetry.location;

import android.location.Location;
import com.mapbox.android.telemetry.LocationEvent;
import java.math.BigDecimal;

/* renamed from: com.mapbox.android.telemetry.location.d */
public class C11375d {
    /* renamed from: a */
    private static double m29294a(double d, double d2, double d3) {
        double d4 = d3 - d2;
        return ((((d - d2) % d4) + d4) % d4) + d2;
    }

    /* renamed from: a */
    public static LocationEvent m29295a(Location location, String str) {
        return m29296a(location, "unknown", str);
    }

    /* renamed from: b */
    private static double m29298b(double d) {
        return (d < -180.0d || d > 180.0d) ? m29294a(d, -180.0d, 180.0d) : d;
    }

    /* renamed from: a */
    private static LocationEvent m29296a(Location location, String str, String str2) {
        LocationEvent locationEvent = new LocationEvent(str2, m29293a(location.getLatitude()), m29298b(m29293a(location.getLongitude())), str);
        m29299b(location, locationEvent);
        m29297a(location, locationEvent);
        return locationEvent;
    }

    /* renamed from: b */
    private static void m29299b(Location location, LocationEvent locationEvent) {
        if (location.hasAltitude()) {
            locationEvent.mo32848a(Double.valueOf((double) Math.round(location.getAltitude())));
        }
    }

    /* renamed from: a */
    private static double m29293a(double d) {
        return new BigDecimal(d).setScale(7, 1).doubleValue();
    }

    /* renamed from: a */
    private static void m29297a(Location location, LocationEvent locationEvent) {
        if (location.hasAccuracy()) {
            locationEvent.mo32849a(Float.valueOf((float) Math.round(location.getAccuracy())));
        }
    }
}
