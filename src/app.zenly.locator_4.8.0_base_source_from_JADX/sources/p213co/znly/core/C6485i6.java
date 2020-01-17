package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.i6 */
/* compiled from: lambda */
public final /* synthetic */ class C6485i6 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16066a;

    public /* synthetic */ C6485i6(Core core) {
        this.f16066a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16066a.mustUpgrade(rxProtoObserver);
    }
}
