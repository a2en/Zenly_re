package app.zenly.locator.meet;

import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.meet.z */
/* compiled from: lambda */
public final /* synthetic */ class C4521z implements Function {

    /* renamed from: e */
    public static final /* synthetic */ C4521z f12138e = new C4521z();

    private /* synthetic */ C4521z() {
    }

    public final Object apply(Object obj) {
        return C5448c.m15478a().geoReverseGeocodeFormattedAddress(((TrackingContextProto$TrackingContext) obj).getLatitude(), ((TrackingContextProto$TrackingContext) obj).getLongitude()).mo36504k(C4491f0.f12070e);
    }
}
