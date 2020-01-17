package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.t0 */
/* compiled from: lambda */
public final /* synthetic */ class C6635t0 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16216a;

    public /* synthetic */ C6635t0(Core core) {
        this.f16216a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16216a.pinContextSubscribe(rxProtoObserver);
    }
}
