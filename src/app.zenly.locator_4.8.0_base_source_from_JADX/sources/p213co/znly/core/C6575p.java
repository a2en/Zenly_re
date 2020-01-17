package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.p */
/* compiled from: lambda */
public final /* synthetic */ class C6575p implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16160a;

    public /* synthetic */ C6575p(Core core) {
        this.f16160a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16160a.contactsAlreadyStateStream(rxProtoObserver);
    }
}
