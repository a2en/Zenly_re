package p213co.znly.core.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import p213co.znly.core.wifi.Scan.Result;
import p213co.znly.core.wifi.Scan.Results;
import p213co.znly.core.wifi.Scan.Results.Builder;

/* renamed from: co.znly.core.wifi.AndroidWifiManager */
public class AndroidWifiManager {
    private static final String TAG = "AndroidWifiManager";
    private final BroadcastReceiver connectivityReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                AndroidWifiManager.this.onWifiChanged();
            }
        }
    };
    private final Context context;
    private final WifiManager wifiManager;

    public AndroidWifiManager(Context context2) {
        this.context = context2;
        this.wifiManager = (WifiManager) context2.getSystemService("wifi");
    }

    /* access modifiers changed from: private */
    public void onWifiChanged() {
        WifiInfo connectionInfo = this.wifiManager.getConnectionInfo();
        _onWifiChanged(this.wifiManager.isWifiEnabled(), connectionInfo.getNetworkId() != -1, connectionInfo.getSSID(), connectionInfo.getBSSID(), connectionInfo.getRssi());
    }

    /* access modifiers changed from: protected */
    public native void _onWifiChanged(boolean z, boolean z2, String str, String str2, int i);

    public byte[] getScanResults() {
        Builder newBuilder = Results.newBuilder();
        for (ScanResult scanResult : this.wifiManager.getScanResults()) {
            Result.Builder newBuilder2 = Result.newBuilder();
            newBuilder2.setFrequency(scanResult.frequency);
            newBuilder2.setLevel(scanResult.level);
            newBuilder2.setTimestamp(scanResult.timestamp);
            newBuilder2.setSsid(scanResult.SSID);
            newBuilder2.setBssid(scanResult.BSSID);
            newBuilder2.setCapabilities(scanResult.capabilities);
            newBuilder.addResults(newBuilder2);
        }
        return ((Results) newBuilder.build()).toByteArray();
    }

    public boolean isWifiEnabled() {
        return this.wifiManager.isWifiEnabled();
    }

    public void removeUpdates() {
        this.context.unregisterReceiver(this.connectivityReceiver);
    }

    public void requestUpdates() {
        this.context.registerReceiver(this.connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        onWifiChanged();
    }
}
