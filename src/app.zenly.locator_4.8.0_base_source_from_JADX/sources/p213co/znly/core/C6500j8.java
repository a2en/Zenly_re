package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.j8 */
/* compiled from: lambda */
public final /* synthetic */ class C6500j8 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16083a;

    public /* synthetic */ C6500j8(Core core) {
        this.f16083a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16083a.userRequest(bArr, rxProtoObserver);
    }
}
