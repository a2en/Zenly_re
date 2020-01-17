package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.w1 */
/* compiled from: lambda */
public final /* synthetic */ class C6715w1 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16258a;

    public /* synthetic */ C6715w1(Core core) {
        this.f16258a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16258a.chatUnreadConversations(rxProtoObserver);
    }
}
