package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.z0 */
/* compiled from: lambda */
public final /* synthetic */ class C6752z0 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16294a;

    public /* synthetic */ C6752z0(Core core) {
        this.f16294a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16294a.sessionGet(rxProtoObserver);
    }
}
