package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u6 */
/* compiled from: lambda */
public final /* synthetic */ class C6654u6 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16234a;

    public /* synthetic */ C6654u6(Core core) {
        this.f16234a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16234a.descendantUsers(rxProtoObserver);
    }
}
