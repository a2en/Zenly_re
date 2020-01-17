package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.c */
/* compiled from: lambda */
public final /* synthetic */ class C6396c implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15973a;

    public /* synthetic */ C6396c(Core core) {
        this.f15973a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15973a.footstepsVisitedLocalitiesState(rxProtoObserver);
    }
}
