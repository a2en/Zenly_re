package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.s1 */
/* compiled from: lambda */
public final /* synthetic */ class C6618s1 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16203a;

    public /* synthetic */ C6618s1(Core core) {
        this.f16203a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16203a.userEngagementStats(rxProtoObserver);
    }
}
