package com.mapbox.mapboxsdk.module.telemetry;

import android.os.Bundle;
import com.mapbox.android.telemetry.AppUserTurnstile;
import com.mapbox.android.telemetry.C11324a1;
import com.mapbox.android.telemetry.C11324a1.C11327c;
import com.mapbox.android.telemetry.C11343g0;
import com.mapbox.android.telemetry.C11350h0;
import com.mapbox.android.telemetry.C11354i0;
import com.mapbox.android.telemetry.C11393t0;
import com.mapbox.android.telemetry.Event;
import com.mapbox.android.telemetry.Event.C11300a;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.maps.TelemetryDefinition;
import com.mapbox.mapboxsdk.offline.OfflineRegionDefinition;
import com.mapbox.mapboxsdk.offline.OfflineTilePyramidRegionDefinition;
import java.util.UUID;

/* renamed from: com.mapbox.mapboxsdk.module.telemetry.a */
public class C11576a implements TelemetryDefinition {

    /* renamed from: a */
    private C11354i0 f30035a = new C11354i0(C11451d.m29567b(), C11451d.m29565a(), "mapbox-maps-android/7.3.0");

    public C11576a() {
        if (C11327c.ENABLED.equals(C11324a1.m29163b())) {
            this.f30035a.mo33001b();
        }
    }

    public void onAppUserTurnstileEvent() {
        this.f30035a.mo32998a((Event) new AppUserTurnstile("mapbox-maps-android", "7.3.0"));
        this.f30035a.mo32998a(new C11343g0().mo32986a(C11300a.MAP_LOAD));
    }

    public void onCreateOfflineRegion(OfflineRegionDefinition offlineRegionDefinition) {
        this.f30035a.mo32998a(new C11343g0().mo32988a(offlineRegionDefinition instanceof OfflineTilePyramidRegionDefinition ? "tileregion" : "shaperegion", Double.valueOf(offlineRegionDefinition.getMinZoom()), Double.valueOf(offlineRegionDefinition.getMaxZoom()), offlineRegionDefinition.getStyleURL()));
    }

    public void onGestureInteraction(String str, double d, double d2, double d3) {
        C11343g0 g0Var = new C11343g0();
        C11350h0 h0Var = new C11350h0(d, d2, d3);
        String str2 = str;
        h0Var.mo32992a(str);
        this.f30035a.mo32998a(g0Var.mo32987a(C11300a.MAP_CLICK, h0Var));
    }

    public void onPerformanceEvent(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            this.f30035a.mo32998a((Event) new PerformanceEvent(UUID.randomUUID().toString(), bundle));
        }
    }

    public void setDebugLoggingEnabled(boolean z) {
        this.f30035a.mo32996a(z);
    }

    public boolean setSessionIdRotationInterval(int i) {
        return this.f30035a.mo32999a(new C11393t0(i));
    }

    public void setUserTelemetryRequestState(boolean z) {
        if (z) {
            C11324a1.m29161a(C11327c.ENABLED);
            this.f30035a.mo33001b();
            return;
        }
        this.f30035a.mo32997a();
        C11324a1.m29161a(C11327c.DISABLED);
    }
}
