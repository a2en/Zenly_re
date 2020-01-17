package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.o8 */
/* compiled from: lambda */
public final /* synthetic */ class C6571o8 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16156a;

    public /* synthetic */ C6571o8(Core core) {
        this.f16156a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16156a.timeTogetherFriendState(bArr, rxProtoObserver);
    }
}
