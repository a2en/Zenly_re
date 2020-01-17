package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.x */
/* compiled from: lambda */
public final /* synthetic */ class C6727x implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16269a;

    public /* synthetic */ C6727x(Core core) {
        this.f16269a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16269a.bubblesStream(rxProtoObserver);
    }
}
