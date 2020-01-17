package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.t6 */
/* compiled from: lambda */
public final /* synthetic */ class C6641t6 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16222a;

    public /* synthetic */ C6641t6(Core core) {
        this.f16222a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16222a.userLocationStream(rxProtoObserver);
    }
}
