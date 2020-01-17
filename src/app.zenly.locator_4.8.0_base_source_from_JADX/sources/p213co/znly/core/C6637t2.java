package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.t2 */
/* compiled from: lambda */
public final /* synthetic */ class C6637t2 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16218a;

    public /* synthetic */ C6637t2(Core core) {
        this.f16218a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16218a.requestMediaRead(bArr, rxProtoObserver);
    }
}
