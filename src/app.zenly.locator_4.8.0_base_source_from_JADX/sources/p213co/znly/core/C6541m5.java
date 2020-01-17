package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.m5 */
/* compiled from: lambda */
public final /* synthetic */ class C6541m5 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16127a;

    public /* synthetic */ C6541m5(Core core) {
        this.f16127a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16127a.onboardingContactsAlready(rxProtoObserver);
    }
}
