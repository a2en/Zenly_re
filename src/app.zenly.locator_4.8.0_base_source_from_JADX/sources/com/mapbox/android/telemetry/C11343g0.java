package com.mapbox.android.telemetry;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mapbox.android.telemetry.Event.C11300a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mapbox.android.telemetry.g0 */
public class C11343g0 {

    /* renamed from: b */
    private static final Map<Integer, String> f29422b = new C11344a();

    /* renamed from: a */
    private final Map<C11300a, C11340f0> f29423a = new C11345b();

    /* renamed from: com.mapbox.android.telemetry.g0$a */
    static class C11344a extends HashMap<Integer, String> {
        C11344a() {
            put(Integer.valueOf(2), "Landscape");
            put(Integer.valueOf(1), "Portrait");
        }
    }

    /* renamed from: com.mapbox.android.telemetry.g0$b */
    class C11345b extends HashMap<C11300a, C11340f0> {

        /* renamed from: com.mapbox.android.telemetry.g0$b$a */
        class C11346a implements C11340f0 {
            C11346a() {
            }

            /* renamed from: a */
            public Event mo32983a(C11350h0 h0Var) {
                return C11343g0.this.m29201a(h0Var);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.g0$b$b */
        class C11347b implements C11340f0 {
            C11347b() {
            }

            /* renamed from: a */
            public Event mo32983a(C11350h0 h0Var) {
                return C11343g0.this.m29208b(h0Var);
            }
        }

        C11345b() {
            put(C11300a.MAP_CLICK, new C11346a());
            put(C11300a.MAP_DRAGEND, new C11347b());
        }
    }

    public C11343g0() {
        if (C11354i0.f29434n == null) {
            throw new IllegalStateException("Create a MapboxTelemetry instance before calling this method.");
        }
    }

    /* renamed from: c */
    private String m29211c(Context context) {
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        return TextUtils.isEmpty(networkOperatorName) ? "EMPTY_CARRIER" : networkOperatorName;
    }

    /* renamed from: d */
    private Boolean m29214d(Context context) {
        return Boolean.valueOf(m29203a(context));
    }

    /* renamed from: e */
    private float m29215e(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    /* renamed from: f */
    private String m29216f(Context context) {
        return (String) f29422b.get(Integer.valueOf(context.getResources().getConfiguration().orientation));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public MapDragendEvent m29208b(C11350h0 h0Var) {
        MapDragendEvent a = new MapDragendEvent(h0Var).mo32862a(C11354i0.f29434n);
        a.mo32865b(m29216f(C11354i0.f29434n));
        a.mo32863a(m29211c(C11354i0.f29434n));
        a.mo32864a(m29214d(C11354i0.f29434n).booleanValue());
        return a;
    }

    /* renamed from: a */
    public Event mo32986a(C11300a aVar) {
        m29212c(aVar);
        return m29202a();
    }

    /* renamed from: c */
    private void m29212c(C11300a aVar) {
        if (aVar != C11300a.MAP_LOAD) {
            throw new IllegalArgumentException("Type must be a load map event.");
        }
    }

    /* renamed from: a */
    public Event mo32987a(C11300a aVar, C11350h0 h0Var) {
        m29210b(aVar, h0Var);
        return ((C11340f0) this.f29423a.get(aVar)).mo32983a(h0Var);
    }

    /* renamed from: b */
    private float m29206b(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    /* renamed from: c */
    private void m29213c(C11350h0 h0Var) {
        if (h0Var == null) {
            throw new IllegalArgumentException("MapState cannot be null.");
        }
    }

    /* renamed from: a */
    public Event mo32988a(String str, Double d, Double d2, String str2) {
        OfflineDownloadStartEvent offlineDownloadStartEvent = new OfflineDownloadStartEvent(str, d, d2);
        offlineDownloadStartEvent.mo32951a(str2);
        return offlineDownloadStartEvent;
    }

    /* renamed from: b */
    private void m29210b(C11300a aVar, C11350h0 h0Var) {
        m29209b(aVar);
        m29213c(h0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MapClickEvent m29201a(C11350h0 h0Var) {
        MapClickEvent a = new MapClickEvent(h0Var).mo32854a(C11354i0.f29434n);
        a.mo32857b(m29216f(C11354i0.f29434n));
        a.mo32855a(m29211c(C11354i0.f29434n));
        a.mo32856a(m29214d(C11354i0.f29434n).booleanValue());
        return a;
    }

    /* renamed from: b */
    private void m29209b(C11300a aVar) {
        if (!Event.f29210e.contains(aVar)) {
            throw new IllegalArgumentException("Type must be a gesture map event.");
        }
    }

    /* renamed from: a */
    private boolean m29203a(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            return m29205a(wifiManager, wifiManager.getConnectionInfo());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m29205a(WifiManager wifiManager, WifiInfo wifiInfo) {
        return wifiManager.isWifiEnabled() && m29204a(wifiInfo);
    }

    /* renamed from: a */
    private boolean m29204a(WifiInfo wifiInfo) {
        return wifiInfo.getNetworkId() != -1;
    }

    /* renamed from: a */
    private MapLoadEvent m29202a() {
        MapLoadEvent a = new MapLoadEvent(C11330b1.m29174c()).mo32870a(C11354i0.f29434n);
        a.mo32875b(m29216f(C11354i0.f29434n));
        a.mo32871a(m29206b(C11354i0.f29434n));
        a.mo32872a(m29211c(C11354i0.f29434n));
        a.mo32874b(m29215e(C11354i0.f29434n));
        a.mo32873a(m29214d(C11354i0.f29434n).booleanValue());
        return a;
    }
}
