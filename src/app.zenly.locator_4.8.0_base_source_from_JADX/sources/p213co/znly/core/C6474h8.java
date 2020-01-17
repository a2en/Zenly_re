package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.h8 */
/* compiled from: lambda */
public final /* synthetic */ class C6474h8 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16053a;

    public /* synthetic */ C6474h8(Core core) {
        this.f16053a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16053a.friendRequestRespond(bArr, rxProtoObserver);
    }
}
