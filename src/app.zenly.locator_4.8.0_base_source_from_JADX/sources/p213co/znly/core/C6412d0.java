package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.d0 */
/* compiled from: lambda */
public final /* synthetic */ class C6412d0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15991a;

    public /* synthetic */ C6412d0(Core core) {
        this.f15991a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15991a.zendeskCreateTicket(bArr, rxProtoObserver);
    }
}
