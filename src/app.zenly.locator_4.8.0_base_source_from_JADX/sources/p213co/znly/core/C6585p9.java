package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.p9 */
/* compiled from: lambda */
public final /* synthetic */ class C6585p9 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16170a;

    public /* synthetic */ C6585p9(Core core) {
        this.f16170a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16170a.deviceGet(rxProtoObserver);
    }
}
