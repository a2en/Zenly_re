package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.x4 */
/* compiled from: lambda */
public final /* synthetic */ class C6732x4 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16274a;

    public /* synthetic */ C6732x4(Core core) {
        this.f16274a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16274a.topFriendsStateStream(rxProtoObserver);
    }
}
