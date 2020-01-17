package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u4 */
/* compiled from: lambda */
public final /* synthetic */ class C6652u4 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16232a;

    public /* synthetic */ C6652u4(Core core) {
        this.f16232a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16232a.userVisitPointsRealtimeStream(rxProtoObserver);
    }
}
