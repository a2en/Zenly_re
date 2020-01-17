package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseInstanceIdListener;
import com.appsflyer.internal.C8762b.C8763b.C8764a;
import com.google.firebase.iid.FirebaseInstanceIdService;

/* renamed from: com.appsflyer.internal.l */
public final class C8775l {

    /* renamed from: com.appsflyer.internal.l$a */
    public static final class C8776a {

        /* renamed from: ˊ */
        public final String f22728;

        /* renamed from: ˋ */
        public final String f22729;

        /* renamed from: ॱ */
        public final String f22730;

        C8776a(String str, String str2, String str3) {
            this.f22729 = str;
            this.f22728 = str2;
            this.f22730 = str3;
        }

        @Deprecated
        /* renamed from: ˊ */
        public static boolean m20738(Context context) {
            String str = "com.google.firebase.INSTANCE_ID_EVENT";
            if (AppsFlyerLib.getInstance().isTrackingStopped()) {
                return false;
            }
            try {
                Class.forName("com.google.firebase.iid.FirebaseInstanceIdService");
                Intent intent = new Intent(str, null, context, FirebaseInstanceIdListener.class);
                Intent intent2 = new Intent(str, null, context, FirebaseInstanceIdService.class);
                if (!(context.getPackageManager().queryIntentServices(intent, 0).size() > 0)) {
                    if (!(context.getPackageManager().queryIntentServices(intent2, 0).size() > 0)) {
                        AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                        return false;
                    }
                }
                return true;
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
            }
        }

        /* renamed from: ॱ */
        public static void m20739(Context context, String str) {
            AFLogger.afInfoLog("updateServerUninstallToken called with: ".concat(String.valueOf(str)));
            String str2 = "afUninstallToken";
            C8764a r0 = C8764a.m20718(AppsFlyerProperties.getInstance().getString(str2));
            if (AppsFlyerLibCore.m20625(context).getBoolean("sentRegisterRequestToAF", false)) {
                String str3 = r0.f22681;
                if (str3 != null && str3.equals(str)) {
                    return;
                }
            }
            AppsFlyerProperties.getInstance().set(str2, str);
            AppsFlyerLibCore.getInstance().mo23711(context, str);
        }

        C8776a() {
        }
    }

    /* renamed from: com.appsflyer.internal.l$b */
    static final class C8777b {

        /* renamed from: ॱ */
        static final C8775l f22731 = new C8775l();
    }

    C8775l() {
    }

    /* renamed from: ˏ */
    public static C8775l m20736() {
        return C8777b.f22731;
    }

    /* renamed from: ॱ */
    public static C8776a m20737(Context context) {
        String str;
        String str2 = "unknown";
        String str3 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            String str4 = "MOBILE";
            String str5 = "WIFI";
            if (connectivityManager != null) {
                boolean z = false;
                if (21 <= VERSION.SDK_INT) {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    int length = allNetworks.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                        if (!(networkInfo != null && networkInfo.isConnectedOrConnecting())) {
                            i++;
                        } else if (1 != networkInfo.getType()) {
                            if (networkInfo.getType() == 0) {
                            }
                        }
                    }
                } else {
                    NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                    if (!(networkInfo2 != null && networkInfo2.isConnectedOrConnecting())) {
                        NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                        if (!(networkInfo3 != null && networkInfo3.isConnectedOrConnecting())) {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                                z = true;
                            }
                            if (z) {
                                if (1 != activeNetworkInfo.getType()) {
                                    if (activeNetworkInfo.getType() == 0) {
                                    }
                                }
                            }
                        }
                        str2 = str4;
                    }
                }
                str2 = str5;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str = telephonyManager.getSimOperatorName();
            try {
                str3 = telephonyManager.getNetworkOperatorName();
                if ((str3 == null || str3.isEmpty()) && 2 == telephonyManager.getPhoneType()) {
                    str3 = "CDMA";
                }
            } catch (Throwable th) {
                th = th;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                return new C8776a(str2, str3, str);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
            AFLogger.afErrorLog("Exception while collecting network info. ", th);
            return new C8776a(str2, str3, str);
        }
        return new C8776a(str2, str3, str);
    }
}
