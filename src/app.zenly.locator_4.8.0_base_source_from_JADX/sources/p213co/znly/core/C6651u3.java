package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u3 */
/* compiled from: lambda */
public final /* synthetic */ class C6651u3 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16231a;

    public /* synthetic */ C6651u3(Core core) {
        this.f16231a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16231a.phoneNumberSupportedRegions(rxProtoObserver);
    }
}
