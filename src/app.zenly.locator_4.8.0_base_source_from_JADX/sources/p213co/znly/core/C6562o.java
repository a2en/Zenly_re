package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.o */
/* compiled from: lambda */
public final /* synthetic */ class C6562o implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16147a;

    public /* synthetic */ C6562o(Core core) {
        this.f16147a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16147a.inboxNextPage(rxProtoObserver);
    }
}
