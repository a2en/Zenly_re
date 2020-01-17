package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.l8 */
/* compiled from: lambda */
public final /* synthetic */ class C6526l8 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16109a;

    public /* synthetic */ C6526l8(Core core) {
        this.f16109a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16109a.friendsStateStream(rxProtoObserver);
    }
}
