package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.m7 */
/* compiled from: lambda */
public final /* synthetic */ class C6543m7 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16129a;

    public /* synthetic */ C6543m7(Core core) {
        this.f16129a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16129a.contactsRaw(rxProtoObserver);
    }
}
