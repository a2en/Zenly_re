package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.q */
/* compiled from: lambda */
public final /* synthetic */ class C6589q implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16174a;

    public /* synthetic */ C6589q(Core core) {
        this.f16174a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16174a.fogWarUpdate(rxProtoObserver);
    }
}
