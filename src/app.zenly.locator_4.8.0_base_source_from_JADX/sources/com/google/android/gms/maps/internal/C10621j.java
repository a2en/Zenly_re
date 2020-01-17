package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.dynamic.C10186b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.internal.j */
public class C10621j {

    /* renamed from: a */
    private static final String f27608a = "j";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f27609b;

    /* renamed from: c */
    private static zze f27610c;

    /* renamed from: a */
    public static zze m27087a(Context context) throws GooglePlayServicesNotAvailableException {
        zze zze;
        C10123l.m25505a(context);
        zze zze2 = f27610c;
        if (zze2 != null) {
            return zze2;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable == 0) {
            Log.i(f27608a, "Making Creator dynamically");
            IBinder iBinder = (IBinder) m27089a(m27090b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
            if (iBinder == null) {
                zze = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                if (queryLocalInterface instanceof zze) {
                    zze = (zze) queryLocalInterface;
                } else {
                    zze = new C10623l(iBinder);
                }
            }
            f27610c = zze;
            try {
                f27610c.zza(C10186b.m25715a(m27090b(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return f27610c;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    /* renamed from: b */
    private static Context m27090b(Context context) {
        Context context2 = f27609b;
        if (context2 != null) {
            return context2;
        }
        Context c = m27091c(context);
        f27609b = c;
        return c;
    }

    /* renamed from: c */
    private static Context m27091c(Context context) {
        try {
            return DynamiteModule.m25722a(context, DynamiteModule.f26758i, "com.google.android.gms.maps_dynamite").mo27652a();
        } catch (Exception e) {
            Log.e(f27608a, "Failed to load maps module, use legacy", e);
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }

    /* renamed from: a */
    private static <T> T m27089a(ClassLoader classLoader, String str) {
        try {
            C10123l.m25505a(classLoader);
            return m27088a(classLoader.loadClass(str));
        } catch (ClassNotFoundException unused) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: a */
    private static <T> T m27088a(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String str = "Unable to instantiate the dynamic class ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException unused2) {
            String str2 = "Unable to call the default constructor of ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }
}
