package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ma */
/* compiled from: lambda */
public final /* synthetic */ class C6546ma implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16132a;

    public /* synthetic */ C6546ma(Core core) {
        this.f16132a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16132a.pingRead(bArr, rxProtoObserver);
    }
}
