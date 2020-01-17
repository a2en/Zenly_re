package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.t4 */
/* compiled from: lambda */
public final /* synthetic */ class C6639t4 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16220a;

    public /* synthetic */ C6639t4(Core core) {
        this.f16220a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16220a.friendRequestsStateStream(rxProtoObserver);
    }
}
