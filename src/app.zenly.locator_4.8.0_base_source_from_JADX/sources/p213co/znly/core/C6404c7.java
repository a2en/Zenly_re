package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.c7 */
/* compiled from: lambda */
public final /* synthetic */ class C6404c7 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15981a;

    public /* synthetic */ C6404c7(Core core) {
        this.f15981a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15981a.inboxStream(rxProtoObserver);
    }
}
