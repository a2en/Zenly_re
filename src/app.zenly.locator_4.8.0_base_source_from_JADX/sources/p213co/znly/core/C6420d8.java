package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.d8 */
/* compiled from: lambda */
public final /* synthetic */ class C6420d8 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15999a;

    public /* synthetic */ C6420d8(Core core) {
        this.f15999a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15999a.nightsTimeline(rxProtoObserver);
    }
}
