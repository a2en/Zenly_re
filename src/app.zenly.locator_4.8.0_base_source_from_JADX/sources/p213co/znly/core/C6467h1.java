package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.h1 */
/* compiled from: lambda */
public final /* synthetic */ class C6467h1 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16045a;

    public /* synthetic */ C6467h1(Core core) {
        this.f16045a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16045a.zendeskUnseenStatusRealtimeStream(rxProtoObserver);
    }
}
