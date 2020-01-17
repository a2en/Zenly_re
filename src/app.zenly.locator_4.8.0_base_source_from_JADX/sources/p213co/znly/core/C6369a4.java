package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.a4 */
/* compiled from: lambda */
public final /* synthetic */ class C6369a4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15947a;

    public /* synthetic */ C6369a4(Core core) {
        this.f15947a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15947a.chatGroupConversationUpdate(bArr, rxProtoObserver);
    }
}
