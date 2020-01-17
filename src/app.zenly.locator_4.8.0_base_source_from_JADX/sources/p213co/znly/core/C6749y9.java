package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.y9 */
/* compiled from: lambda */
public final /* synthetic */ class C6749y9 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16291a;

    public /* synthetic */ C6749y9(Core core) {
        this.f16291a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16291a.chatUserUnreadCounters(rxProtoObserver);
    }
}
