package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.k2 */
/* compiled from: lambda */
public final /* synthetic */ class C6507k2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16090a;

    public /* synthetic */ C6507k2(Core core) {
        this.f16090a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16090a.chatUnreadCounters(rxProtoObserver);
    }
}
