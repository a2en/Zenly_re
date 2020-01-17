package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.l4 */
/* compiled from: lambda */
public final /* synthetic */ class C6522l4 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16105a;

    public /* synthetic */ C6522l4(Core core) {
        this.f16105a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16105a.zendeskGetProblemCategories(rxProtoObserver);
    }
}
