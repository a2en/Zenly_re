package com.mapbox.android.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectivityReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private Context f29096a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C11266a> f29097b;

    /* renamed from: c */
    private Boolean f29098c;

    /* renamed from: a */
    private static boolean m28921a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            return connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
        } catch (Exception unused) {
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        boolean a = m28920a();
        Iterator it = this.f29097b.iterator();
        while (it.hasNext()) {
            ((C11266a) it.next()).onConnectivityChanged(a);
        }
    }

    /* renamed from: a */
    private boolean m28920a() {
        Boolean bool = this.f29098c;
        if (bool == null) {
            return m28921a(this.f29096a);
        }
        return bool.booleanValue();
    }
}
