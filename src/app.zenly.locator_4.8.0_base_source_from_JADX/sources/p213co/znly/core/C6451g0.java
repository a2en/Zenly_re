package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C6451g0 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16030a;

    public /* synthetic */ C6451g0(Core core) {
        this.f16030a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16030a.userMeTraits(rxProtoObserver);
    }
}
