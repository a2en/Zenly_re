package com.mapbox.android.core.location;

import android.content.Context;
import com.google.android.gms.common.C10067c;

/* renamed from: com.mapbox.android.core.location.d */
public final class C11272d {
    /* renamed from: a */
    public static LocationEngine m28942a(Context context) {
        C11280i.m28974a(context, "context == null");
        boolean a = C11280i.m28976a("com.google.android.gms.location.LocationServices");
        if (C11280i.m28976a("com.google.android.gms.common.GoogleApiAvailability")) {
            a &= C10067c.m25293a().mo27284a(context) == 0;
        }
        return m28943a(context, a);
    }

    /* renamed from: a */
    private static LocationEngine m28943a(Context context, boolean z) {
        if (z) {
            return new C11273e(new C11268b(context.getApplicationContext()));
        }
        return new C11273e(new C11278h(context.getApplicationContext()));
    }
}
