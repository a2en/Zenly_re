package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.v6 */
/* compiled from: lambda */
public final /* synthetic */ class C6666v6 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16246a;

    public /* synthetic */ C6666v6(Core core) {
        this.f16246a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16246a.pushNotifications(rxProtoObserver);
    }
}