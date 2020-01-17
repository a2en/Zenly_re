package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.j0 */
/* compiled from: lambda */
public final /* synthetic */ class C6492j0 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16073a;

    public /* synthetic */ C6492j0(Core core) {
        this.f16073a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16073a.onboardingContactsSuggestions(rxProtoObserver);
    }
}
