package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.q2 */
/* compiled from: lambda */
public final /* synthetic */ class C6592q2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16177a;

    public /* synthetic */ C6592q2(Core core) {
        this.f16177a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16177a.footstepsUpdateHistorical(rxProtoObserver);
    }
}
