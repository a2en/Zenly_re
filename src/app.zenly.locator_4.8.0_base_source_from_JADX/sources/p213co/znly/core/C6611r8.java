package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.r8 */
/* compiled from: lambda */
public final /* synthetic */ class C6611r8 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16196a;

    public /* synthetic */ C6611r8(Core core) {
        this.f16196a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16196a.sessionCacheSet(bArr, rxProtoObserver);
    }
}
