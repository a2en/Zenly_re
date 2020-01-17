package app.zenly.locator.core.models;

import app.zenly.locator.map.C4405x0;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import com.android.volley.toolbox.C8733j;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7492v2;
import p213co.znly.models.TrackingContextProto$TrackingContext;

/* renamed from: app.zenly.locator.core.models.r */
public final class C2901r implements TrackingContextWrapper {

    /* renamed from: a */
    private final boolean f8241a;

    /* renamed from: b */
    private final TrackingContextProto$TrackingContext f8242b;

    public C2901r(TrackingContextProto$TrackingContext trackingContextProto$TrackingContext) {
        C12932j.m33818b(trackingContextProto$TrackingContext, "trackingContext");
        this.f8242b = trackingContextProto$TrackingContext;
    }

    public int getBatteryLevel() {
        return this.f8242b.getBatteryLevel();
    }

    public Timestamp getCreatedAt() {
        Timestamp createdAt = this.f8242b.getCreatedAt();
        C12932j.m33815a((Object) createdAt, "trackingContext.createdAt");
        return createdAt;
    }

    public C7492v2 getGhostType() {
        C7492v2 ghostType = this.f8242b.getGhostType();
        C12932j.m33815a((Object) ghostType, "trackingContext.ghostType");
        return ghostType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0.getState() == p213co.znly.models.TrackingContextProto$TrackingContext.WiFi.C6874c.f16858i) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getHasWifiEnabled() {
        /*
            r3 = this;
            co.znly.models.TrackingContextProto$TrackingContext r0 = r3.f8242b
            boolean r0 = r0.hasWifi()
            if (r0 == 0) goto L_0x002e
            co.znly.models.TrackingContextProto$TrackingContext r0 = r3.f8242b
            co.znly.models.TrackingContextProto$TrackingContext$WiFi r0 = r0.getWifi()
            java.lang.String r1 = "trackingContext.wifi"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            co.znly.models.TrackingContextProto$TrackingContext$WiFi$c r0 = r0.getState()
            co.znly.models.TrackingContextProto$TrackingContext$WiFi$c r2 = p213co.znly.models.TrackingContextProto$TrackingContext.WiFi.C6874c.STATE_ENABLED
            if (r0 == r2) goto L_0x002c
            co.znly.models.TrackingContextProto$TrackingContext r0 = r3.f8242b
            co.znly.models.TrackingContextProto$TrackingContext$WiFi r0 = r0.getWifi()
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            co.znly.models.TrackingContextProto$TrackingContext$WiFi$c r0 = r0.getState()
            co.znly.models.TrackingContextProto$TrackingContext$WiFi$c r1 = p213co.znly.models.TrackingContextProto$TrackingContext.WiFi.C6874c.STATE_CONNECTED
            if (r0 != r1) goto L_0x002e
        L_0x002c:
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.models.C2901r.getHasWifiEnabled():boolean");
    }

    public double getHeight() {
        return this.f8242b.getAltitude();
    }

    public double getHorizontalPrecision() {
        return this.f8242b.getHorizontalPrecision();
    }

    public double getLatitude() {
        return this.f8242b.getLatitude();
    }

    public double getLongitude() {
        return this.f8242b.getLongitude();
    }

    public double getRawHorizontalPrecision() {
        return getHorizontalPrecision();
    }

    public double getRawLatitude() {
        return getLatitude();
    }

    public double getRawLongitude() {
        return getLongitude();
    }

    public double getSpeed() {
        return this.f8242b.getSpeed();
    }

    public String getUserUuid() {
        String userUuid = this.f8242b.getUserUuid();
        C12932j.m33815a((Object) userUuid, "trackingContext.userUuid");
        return userUuid;
    }

    public boolean isCharging() {
        return this.f8242b.getIsCharging();
    }

    public boolean isInApp() {
        return this.f8242b.getIsForeground() && isLive();
    }

    public boolean isInSubway() {
        return this.f8241a;
    }

    public boolean isLive() {
        return ((long) ((int) (C5447b.m15475b(C5448c.m15478a()) / ((long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS)))) - getCreatedAt().getSeconds() <= C4405x0.f11893a;
    }
}
