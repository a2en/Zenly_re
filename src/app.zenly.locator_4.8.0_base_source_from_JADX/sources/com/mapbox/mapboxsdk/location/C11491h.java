package com.mapbox.mapboxsdk.location;

import android.location.Location;
import com.mapbox.mapboxsdk.maps.MapboxMap;

/* renamed from: com.mapbox.mapboxsdk.location.h */
public final class C11491h {
    /* renamed from: a */
    static float m29677a(MapboxMap mapboxMap, Location location) {
        if (location == null) {
            return 0.0f;
        }
        return (float) (((double) location.getAccuracy()) * (1.0d / mapboxMap.mo33570g().mo33886a(location.getLatitude())));
    }
}
