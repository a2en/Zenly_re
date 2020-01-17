package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.i */
/* compiled from: lambda */
public final /* synthetic */ class C6478i implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16057a;

    public /* synthetic */ C6478i(Core core) {
        this.f16057a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16057a.userHeadingStream(rxProtoObserver);
    }
}
