package app.zenly.locator.onboarding;

import p213co.znly.models.core.StatesProto$ContactsSuggestionsState;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.onboarding.y2 */
/* compiled from: lambda */
public final /* synthetic */ class C4946y2 implements Predicate {

    /* renamed from: e */
    public static final /* synthetic */ C4946y2 f12940e = new C4946y2();

    private /* synthetic */ C4946y2() {
    }

    public final boolean test(Object obj) {
        return ((StatesProto$ContactsSuggestionsState) obj).hasState();
    }
}
