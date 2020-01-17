package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.e5 */
/* compiled from: lambda */
public final /* synthetic */ class C6430e5 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16009a;

    public /* synthetic */ C6430e5(Core core) {
        this.f16009a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16009a.userMe(rxProtoObserver);
    }
}
