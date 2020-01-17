package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.k */
/* compiled from: lambda */
public final /* synthetic */ class C6504k implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16087a;

    public /* synthetic */ C6504k(Core core) {
        this.f16087a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16087a.nightsLocations(rxProtoObserver);
    }
}
