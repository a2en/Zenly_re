package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.y7 */
/* compiled from: lambda */
public final /* synthetic */ class C6747y7 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16289a;

    public /* synthetic */ C6747y7(Core core) {
        this.f16289a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16289a.recentlySearchedStateStream(rxProtoObserver);
    }
}
