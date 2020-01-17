package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.y3 */
/* compiled from: lambda */
public final /* synthetic */ class C6743y3 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16285a;

    public /* synthetic */ C6743y3(Core core) {
        this.f16285a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16285a.timeTogetherState(rxProtoObserver);
    }
}
