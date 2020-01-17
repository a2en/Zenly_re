package com.google.android.libraries.places.api;

import android.content.Context;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzci;
import com.google.android.libraries.places.internal.zzco;
import com.google.android.libraries.places.internal.zzdb;
import com.google.android.libraries.places.internal.zzdc;
import com.google.android.libraries.places.internal.zzgg;
import java.util.Locale;

public final class Places {
    private static final zzco zza = new zzco();

    private Places() {
    }

    public static synchronized PlacesClient createClient(Context context) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzgg.zza(context, (Object) "Context must not be null.");
                zza2 = zza(context, zzdb.zza(context).zzb());
            } catch (Error | RuntimeException e) {
                zzdc.zza(e);
                throw e;
            }
        }
        return zza2;
    }

    public static void initialize(Context context, String str) {
        try {
            zza(context, str, null, false);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public static synchronized boolean isInitialized() {
        boolean zza2;
        synchronized (Places.class) {
            try {
                zza2 = zza.zza();
            } catch (Error | RuntimeException e) {
                zzdc.zza(e);
                throw e;
            }
        }
        return zza2;
    }

    private static synchronized void zza(Context context, String str, Locale locale, boolean z) {
        synchronized (Places.class) {
            try {
                zzgg.zza(context, (Object) "Application context must not be null.");
                zzgg.zza(str, (Object) "API Key must not be null.");
                zzgg.zza(!str.isEmpty(), (Object) "API Key must not be empty.");
                zzdc.zza(context.getApplicationContext(), false);
                zza.zza(str, locale, false);
            } catch (Error | RuntimeException e) {
                zzdc.zza(e);
                throw e;
            }
        }
    }

    public static synchronized void initialize(Context context, String str, Locale locale) {
        synchronized (Places.class) {
            try {
                zza(context, str, locale, false);
            } catch (Error | RuntimeException e) {
                zzdc.zza(e);
                throw e;
            }
        }
    }

    public static synchronized PlacesClient zza(Context context, zzdb zzdb) {
        PlacesClient zzb;
        synchronized (Places.class) {
            try {
                zzgg.zza(context, (Object) "Context must not be null.");
                zzgg.zza(zzdb, (Object) "ClientProfile must not be null.");
                zzgg.zzb(isInitialized(), (Object) "Places must be initialized first.");
                zzb = zzci.zza().zza(context).zza(zza).zza(zzdb).zza().zzb();
            } catch (Error | RuntimeException e) {
                zzdc.zza(e);
                throw e;
            }
        }
        return zzb;
    }
}
