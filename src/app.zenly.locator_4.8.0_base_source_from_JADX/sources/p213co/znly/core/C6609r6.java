package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.r6 */
/* compiled from: lambda */
public final /* synthetic */ class C6609r6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16194a;

    public /* synthetic */ C6609r6(Core core) {
        this.f16194a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16194a.userUnblock(bArr, rxProtoObserver);
    }
}
