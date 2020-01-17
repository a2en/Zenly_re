package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.q0 */
/* compiled from: lambda */
public final /* synthetic */ class C6590q0 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16175a;

    public /* synthetic */ C6590q0(Core core) {
        this.f16175a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16175a.bestFriendsHidden(rxProtoObserver);
    }
}
