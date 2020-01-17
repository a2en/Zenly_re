package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.wa */
/* compiled from: lambda */
public final /* synthetic */ class C6724wa implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16267a;

    public /* synthetic */ C6724wa(Core core) {
        this.f16267a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16267a.notificationsStream(rxProtoObserver);
    }
}
