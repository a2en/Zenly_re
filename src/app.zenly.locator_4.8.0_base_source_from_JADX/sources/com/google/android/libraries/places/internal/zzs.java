package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzs {
    private static final long zza = TimeUnit.MINUTES.toMicros(1);
    private final WifiManager zzb;
    private final zzb zzc;

    zzs(WifiManager wifiManager, zzb zzb2) {
        this.zzb = wifiManager;
        this.zzc = zzb2;
    }

    public final zzgv<zzq> zza() {
        boolean z;
        if (VERSION.SDK_INT < 17) {
            return zzgv.zza();
        }
        WifiManager wifiManager = this.zzb;
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return zzgv.zza();
        }
        List<ScanResult> scanResults = this.zzb.getScanResults();
        if (scanResults == null) {
            return zzgv.zza();
        }
        ArrayList arrayList = new ArrayList();
        WifiInfo connectionInfo = this.zzb.getConnectionInfo();
        for (ScanResult scanResult : scanResults) {
            boolean z2 = false;
            if (VERSION.SDK_INT >= 17 && scanResult != null && !TextUtils.isEmpty(scanResult.SSID)) {
                boolean z3 = (this.zzc.zza() * 1000) - scanResult.timestamp > zza;
                String str = scanResult.SSID;
                if (str != null) {
                    if (str.indexOf(95) >= 0) {
                        String lowerCase = str.toLowerCase(Locale.ENGLISH);
                        if (lowerCase.contains("_nomap") || lowerCase.contains("_optout")) {
                            z = true;
                            if (!z3 && !z) {
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                    z2 = true;
                } else {
                    throw new IllegalArgumentException("Null SSID.");
                }
            }
            if (z2) {
                arrayList.add(new zzq(connectionInfo, scanResult));
            }
        }
        return zzgv.zza((Collection<? extends E>) arrayList);
    }
}
