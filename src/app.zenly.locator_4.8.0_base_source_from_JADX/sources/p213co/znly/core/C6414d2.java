package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.d2 */
/* compiled from: lambda */
public final /* synthetic */ class C6414d2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15993a;

    public /* synthetic */ C6414d2(Core core) {
        this.f15993a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15993a.trackingContextSubscribe(rxProtoObserver);
    }
}
