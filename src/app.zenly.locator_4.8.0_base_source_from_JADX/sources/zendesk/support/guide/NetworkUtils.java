package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.zendesk.logger.Logger;

class NetworkUtils {
    @SuppressLint({"MissingPermission"})
    static NetworkInfo getActiveNetworkInfo(Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (!(connectivityManager == null || context == null)) {
            String str = "NetworkUtils";
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                Logger.m31613c(str, "Getting active network information", new Object[0]);
                return connectivityManager.getActiveNetworkInfo();
            }
            Logger.m31614d(str, "Will not return if network is available because we do not have the permission to do so: ACCESS_NETWORK_STATE", new Object[0]);
        }
        return null;
    }

    static ConnectivityManager getConnectivityManager(Context context) {
        String str = "NetworkUtils";
        if (context == null) {
            Logger.m31614d(str, "Context is null. Cannot get ConnectivityManager", new Object[0]);
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Logger.m31614d(str, "Connectivity manager is null", new Object[0]);
        }
        return connectivityManager;
    }

    static boolean isConnectedOrConnecting(Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnectedOrConnecting();
        }
        return false;
    }
}
