package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.maps.internal.C10621j;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.C10635b;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.c */
public final class C10605c {

    /* renamed from: a */
    private static boolean f27603a = false;

    /* renamed from: a */
    public static synchronized int m27078a(Context context) {
        synchronized (C10605c.class) {
            C10123l.m25506a(context, (Object) "Context is null");
            if (f27603a) {
                return 0;
            }
            try {
                zze a = C10621j.m27087a(context);
                try {
                    C10604b.m27077a(a.zze());
                    C10635b.m27173a(a.zzf());
                    f27603a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.f26262e;
            }
        }
    }
}
