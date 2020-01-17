package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.InputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;
import p213co.znly.zenlygocore.RxProtoObservable;

/* renamed from: co.znly.core.m2 */
/* compiled from: lambda */
public final /* synthetic */ class C6538m2 implements InputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16124a;

    public /* synthetic */ C6538m2(Core core) {
        this.f16124a = core;
    }

    public final RxContext call(RxProtoObservable rxProtoObservable) {
        return this.f16124a.trackingContextViewport(rxProtoObservable);
    }
}
