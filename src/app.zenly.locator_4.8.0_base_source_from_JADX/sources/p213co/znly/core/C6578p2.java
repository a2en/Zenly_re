package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.p2 */
/* compiled from: lambda */
public final /* synthetic */ class C6578p2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16163a;

    public /* synthetic */ C6578p2(Core core) {
        this.f16163a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16163a.userStartDeletionProcess(rxProtoObserver);
    }
}
