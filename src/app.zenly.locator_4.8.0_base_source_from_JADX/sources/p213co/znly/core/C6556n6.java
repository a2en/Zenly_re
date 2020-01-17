package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.n6 */
/* compiled from: lambda */
public final /* synthetic */ class C6556n6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16141a;

    public /* synthetic */ C6556n6(Core core) {
        this.f16141a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16141a.nightsHideLocation(bArr, rxProtoObserver);
    }
}
