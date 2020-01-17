package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.a8 */
/* compiled from: lambda */
public final /* synthetic */ class C6373a8 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15951a;

    public /* synthetic */ C6373a8(Core core) {
        this.f15951a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15951a.userPlacesState(rxProtoObserver);
    }
}
