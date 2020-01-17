package app.zenly.locator.onboarding;

import app.zenly.locator.p135r.p137b1.C5144e;
import p213co.znly.models.core.StatesProto$ContactsSuggestionsState;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.onboarding.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C4805g0 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ C5144e f12722e;

    public /* synthetic */ C4805g0(C5144e eVar) {
        this.f12722e = eVar;
    }

    public final void accept(Object obj) {
        this.f12722e.mo12505f(((StatesProto$ContactsSuggestionsState) obj).getState().getStateList());
    }
}
