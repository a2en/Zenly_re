package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.l9 */
/* compiled from: lambda */
public final /* synthetic */ class C6527l9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16110a;

    public /* synthetic */ C6527l9(Core core) {
        this.f16110a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16110a.footstepsContextualLabeling(bArr, rxProtoObserver);
    }
}
