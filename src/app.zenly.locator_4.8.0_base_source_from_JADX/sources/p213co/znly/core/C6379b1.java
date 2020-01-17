package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C6379b1 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15957a;

    public /* synthetic */ C6379b1(Core core) {
        this.f15957a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15957a.personalPlaces(rxProtoObserver);
    }
}
