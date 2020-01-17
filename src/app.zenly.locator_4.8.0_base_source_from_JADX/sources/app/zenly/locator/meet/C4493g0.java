package app.zenly.locator.meet;

import app.zenly.locator.core.util.C3225m;
import p213co.znly.models.TrackingContextProto$TrackingContext;
import p213co.znly.models.core.C7105g2;
import p389io.reactivex.functions.BiFunction;

/* renamed from: app.zenly.locator.meet.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C4493g0 implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C4493g0 f12072a = new C4493g0();

    private /* synthetic */ C4493g0() {
    }

    public final Object apply(Object obj, Object obj2) {
        return Float.valueOf(C3225m.m10225a(((C7105g2) obj).getLatitude(), ((C7105g2) obj).getLongitude(), ((TrackingContextProto$TrackingContext) obj2).getLatitude(), ((TrackingContextProto$TrackingContext) obj2).getLongitude()));
    }
}
