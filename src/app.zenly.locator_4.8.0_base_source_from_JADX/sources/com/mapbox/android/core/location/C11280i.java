package com.mapbox.android.core.location;

import android.location.Location;

/* renamed from: com.mapbox.android.core.location.i */
final class C11280i {
    /* renamed from: a */
    static <T> T m28974a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m28976a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m28975a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > 120000;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean a = m28977a(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && a;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m28977a(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }
}
