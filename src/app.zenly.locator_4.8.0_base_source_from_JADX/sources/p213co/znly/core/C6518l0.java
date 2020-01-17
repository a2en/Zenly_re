package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.l0 */
/* compiled from: lambda */
public final /* synthetic */ class C6518l0 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16101a;

    public /* synthetic */ C6518l0(Core core) {
        this.f16101a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16101a.serverState(rxProtoObserver);
    }
}
