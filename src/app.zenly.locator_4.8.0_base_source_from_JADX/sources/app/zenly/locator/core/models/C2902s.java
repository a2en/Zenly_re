package app.zenly.locator.core.models;

import app.zenly.locator.map.C4405x0;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import com.android.volley.toolbox.C8733j;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.core.C7105g2;

/* renamed from: app.zenly.locator.core.models.s */
public final class C2902s implements UserLocationWrapper {

    /* renamed from: a */
    private final C7105g2 f8243a;

    public C2902s(C7105g2 g2Var) {
        C12932j.m33818b(g2Var, "location");
        this.f8243a = g2Var;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f8243a.getTimestamp();
        C12932j.m33815a((Object) timestamp, "location.timestamp");
        return timestamp;
    }

    public double getRawHorizontalPrecision() {
        return this.f8243a.getHorizontalPrecision();
    }

    public double getRawLatitude() {
        return this.f8243a.getLatitude();
    }

    public double getRawLongitude() {
        return this.f8243a.getLongitude();
    }

    public double getSpeed() {
        return this.f8243a.getSpeed();
    }

    public boolean isLive() {
        return ((long) ((int) (C5447b.m15475b(C5448c.m15478a()) / ((long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS)))) - getCreatedAt().getSeconds() <= C4405x0.f11893a;
    }
}
