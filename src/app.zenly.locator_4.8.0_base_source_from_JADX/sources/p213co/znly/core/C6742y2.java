package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.y2 */
/* compiled from: lambda */
public final /* synthetic */ class C6742y2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16284a;

    public /* synthetic */ C6742y2(Core core) {
        this.f16284a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16284a.usernameGenerate(rxProtoObserver);
    }
}
