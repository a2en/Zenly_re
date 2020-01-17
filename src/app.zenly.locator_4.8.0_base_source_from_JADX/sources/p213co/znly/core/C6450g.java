package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.g */
/* compiled from: lambda */
public final /* synthetic */ class C6450g implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16029a;

    public /* synthetic */ C6450g(Core core) {
        this.f16029a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16029a.footstepsWebGet(rxProtoObserver);
    }
}
