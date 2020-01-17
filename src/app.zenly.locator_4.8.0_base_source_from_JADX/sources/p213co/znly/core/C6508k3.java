package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.k3 */
/* compiled from: lambda */
public final /* synthetic */ class C6508k3 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16091a;

    public /* synthetic */ C6508k3(Core core) {
        this.f16091a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16091a.weather(bArr, rxProtoObserver);
    }
}
