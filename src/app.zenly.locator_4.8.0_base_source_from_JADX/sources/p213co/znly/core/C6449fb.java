package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.fb */
/* compiled from: lambda */
public final /* synthetic */ class C6449fb implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16028a;

    public /* synthetic */ C6449fb(Core core) {
        this.f16028a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16028a.userTodayWatchersStream(rxProtoObserver);
    }
}
