package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.k4 */
/* compiled from: lambda */
public final /* synthetic */ class C6509k4 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16092a;

    public /* synthetic */ C6509k4(Core core) {
        this.f16092a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16092a.gatheringsStream(rxProtoObserver);
    }
}
