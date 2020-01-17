package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.a2 */
/* compiled from: lambda */
public final /* synthetic */ class C6367a2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15945a;

    public /* synthetic */ C6367a2(Core core) {
        this.f15945a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15945a.mapViewportStream(rxProtoObserver);
    }
}
