package zendesk.core;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12010a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class ZendeskNetworkInfoProvider implements NetworkInfoProvider, NetworkAware {
    private final BroadcastReceiver broadcastReceiver = new NetworkAvailabilityBroadcastReceiver();
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private CurrentState currentState = null;
    private boolean isBroadcastReceiverRegistered = false;
    private final Map<Integer, WeakReference<NetworkAware>> listeners = new HashMap();
    private NetworkCallback networkCallback;
    private final Map<Integer, WeakReference<RetryAction>> retryActions = new HashMap();

    private enum CurrentState {
        CONNECTED,
        DISCONNECTED
    }

    class NetworkAvailabilityBroadcastReceiver extends BroadcastReceiver {
        NetworkAvailabilityBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (intent.getBooleanExtra("noConnectivity", false)) {
                        ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
                    } else {
                        ZendeskNetworkInfoProvider.this.onNetworkAvailable();
                    }
                    return;
                }
            }
            Logger.m31614d("NetAvailabilityReceiver", "onReceive: intent was null or getAction() was mismatched", new Object[0]);
        }
    }

    ZendeskNetworkInfoProvider(Context context2, ConnectivityManager connectivityManager2) {
        this.context = context2;
        this.connectivityManager = connectivityManager2;
    }

    private static boolean isConnectedOrConnecting(ConnectivityManager connectivityManager2) {
        NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private void registerForNetworkCallbacks() {
        String str = "ZendeskNetworkInfoProvider";
        if (VERSION.SDK_INT < 21) {
            Logger.m31608a(str, "Adding pre-Lollipop network callbacks...", new Object[0]);
            if (!this.isBroadcastReceiverRegistered) {
                this.context.registerReceiver(this.broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.isBroadcastReceiverRegistered = true;
                return;
            }
            return;
        }
        Logger.m31608a(str, "Adding Lollipop network callbacks...", new Object[0]);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.networkCallback = new NetworkCallback() {
            public void onAvailable(Network network) {
                handler.post(new Runnable() {
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkAvailable();
                    }
                });
            }

            public void onLost(Network network) {
                handler.post(new Runnable() {
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
                    }
                });
            }
        };
        this.connectivityManager.registerNetworkCallback(new Builder().build(), this.networkCallback);
    }

    @TargetApi(21)
    private void unregisterForNetworkCallbacks() {
        if (this.isBroadcastReceiverRegistered) {
            this.context.unregisterReceiver(this.broadcastReceiver);
            this.isBroadcastReceiverRegistered = false;
        }
        if (VERSION.SDK_INT >= 21) {
            NetworkCallback networkCallback2 = this.networkCallback;
            if (networkCallback2 != null) {
                this.connectivityManager.unregisterNetworkCallback(networkCallback2);
                this.networkCallback = null;
            }
        }
    }

    public void addNetworkAwareListener(Integer num, NetworkAware networkAware) {
        if (num != null && networkAware != null) {
            this.listeners.put(num, new WeakReference(networkAware));
        }
    }

    public void addRetryAction(Integer num, RetryAction retryAction) {
        if (num != null && retryAction != null) {
            this.retryActions.put(num, new WeakReference(retryAction));
        }
    }

    public void clearNetworkAwareListeners() {
        this.listeners.clear();
    }

    public void clearRetryActions() {
        this.retryActions.clear();
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void onNetworkAvailable() {
        if (CurrentState.CONNECTED != this.currentState && isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = CurrentState.CONNECTED;
            Map a = C12010a.m31634a(this.listeners);
            Map a2 = C12010a.m31634a(this.retryActions);
            for (WeakReference weakReference : a.values()) {
                if (weakReference.get() != null) {
                    ((NetworkAware) weakReference.get()).onNetworkAvailable();
                }
            }
            for (WeakReference weakReference2 : a2.values()) {
                if (weakReference2.get() != null) {
                    ((RetryAction) weakReference2.get()).onRetry();
                }
            }
            this.retryActions.clear();
        }
    }

    public void onNetworkUnavailable() {
        if (CurrentState.DISCONNECTED != this.currentState && !isConnectedOrConnecting(this.connectivityManager)) {
            this.currentState = CurrentState.DISCONNECTED;
            for (WeakReference weakReference : C12010a.m31634a(this.listeners).values()) {
                if (weakReference.get() != null) {
                    ((NetworkAware) weakReference.get()).onNetworkUnavailable();
                }
            }
        }
    }

    public void register() {
        registerForNetworkCallbacks();
    }

    public void removeNetworkAwareListener(Integer num) {
        this.listeners.remove(num);
    }

    public void removeRetryAction(Integer num) {
        this.retryActions.remove(num);
    }

    public void unregister() {
        unregisterForNetworkCallbacks();
    }
}
