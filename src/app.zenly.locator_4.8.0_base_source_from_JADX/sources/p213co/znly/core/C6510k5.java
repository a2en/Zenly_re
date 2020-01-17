package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.k5 */
/* compiled from: lambda */
public final /* synthetic */ class C6510k5 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16093a;

    public /* synthetic */ C6510k5(Core core) {
        this.f16093a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16093a.chatConversationActivityStream(bArr, rxProtoObserver);
    }
}
