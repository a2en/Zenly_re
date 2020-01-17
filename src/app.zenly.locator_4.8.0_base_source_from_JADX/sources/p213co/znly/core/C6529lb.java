package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.lb */
/* compiled from: lambda */
public final /* synthetic */ class C6529lb implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16112a;

    public /* synthetic */ C6529lb(Core core) {
        this.f16112a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16112a.networkState(rxProtoObserver);
    }
}
