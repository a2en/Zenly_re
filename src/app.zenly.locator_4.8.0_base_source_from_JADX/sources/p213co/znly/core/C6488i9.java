package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.i9 */
/* compiled from: lambda */
public final /* synthetic */ class C6488i9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16069a;

    public /* synthetic */ C6488i9(Core core) {
        this.f16069a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16069a.brumpCountersState(bArr, rxProtoObserver);
    }
}
