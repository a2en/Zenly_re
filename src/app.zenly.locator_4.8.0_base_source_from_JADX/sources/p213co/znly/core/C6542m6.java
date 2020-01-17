package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.m6 */
/* compiled from: lambda */
public final /* synthetic */ class C6542m6 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16128a;

    public /* synthetic */ C6542m6(Core core) {
        this.f16128a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16128a.contactsInvalidationTracker(rxProtoObserver);
    }
}
