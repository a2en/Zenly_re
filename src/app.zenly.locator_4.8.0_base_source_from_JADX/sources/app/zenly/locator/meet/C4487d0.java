package app.zenly.locator.meet;

import p213co.znly.models.TrackingContextProto$TrackingContext;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.meet.d0 */
/* compiled from: lambda */
public final /* synthetic */ class C4487d0 implements Predicate {

    /* renamed from: e */
    private final /* synthetic */ String f12066e;

    public /* synthetic */ C4487d0(String str) {
        this.f12066e = str;
    }

    public final boolean test(Object obj) {
        return ((TrackingContextProto$TrackingContext) obj).getUserUuid().equals(this.f12066e);
    }
}
