package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.v2 */
/* compiled from: lambda */
public final /* synthetic */ class C6662v2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16242a;

    public /* synthetic */ C6662v2(Core core) {
        this.f16242a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16242a.recentlyViewedStateStream(rxProtoObserver);
    }
}
