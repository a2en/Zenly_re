package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.maps.internal.i */
public final class C10620i {
    private C10620i() {
    }

    /* renamed from: a */
    public static void m27085a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            String str = "MapOptions";
            Parcelable a = m27084a(bundle, str);
            if (a != null) {
                m27086a(bundle2, str, a);
            }
            String str2 = "StreetViewPanoramaOptions";
            Parcelable a2 = m27084a(bundle, str2);
            if (a2 != null) {
                m27086a(bundle2, str2, a2);
            }
            String str3 = "camera";
            Parcelable a3 = m27084a(bundle, str3);
            if (a3 != null) {
                m27086a(bundle2, str3, a3);
            }
            String str4 = "position";
            if (bundle.containsKey(str4)) {
                bundle2.putString(str4, bundle.getString(str4));
            }
            String str5 = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
            if (bundle.containsKey(str5)) {
                bundle2.putBoolean(str5, bundle.getBoolean(str5, false));
            }
        }
    }

    /* renamed from: a */
    private static <T extends Parcelable> T m27084a(Bundle bundle, String str) {
        Class<C10620i> cls = C10620i.class;
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(cls.getClassLoader());
        return bundle2.getParcelable(str);
    }

    /* renamed from: a */
    public static void m27086a(Bundle bundle, String str, Parcelable parcelable) {
        Class<C10620i> cls = C10620i.class;
        bundle.setClassLoader(cls.getClassLoader());
        String str2 = "map_state";
        Bundle bundle2 = bundle.getBundle(str2);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(cls.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle(str2, bundle2);
    }
}
