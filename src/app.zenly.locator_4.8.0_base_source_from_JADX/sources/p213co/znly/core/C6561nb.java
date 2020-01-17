package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.nb */
/* compiled from: lambda */
public final /* synthetic */ class C6561nb implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16146a;

    public /* synthetic */ C6561nb(Core core) {
        this.f16146a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16146a.footstepsLinkViewsStream(rxProtoObserver);
    }
}
