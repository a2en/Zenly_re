package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.k9 */
/* compiled from: lambda */
public final /* synthetic */ class C6514k9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16097a;

    public /* synthetic */ C6514k9(Core core) {
        this.f16097a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16097a.sessionRequestCall(bArr, rxProtoObserver);
    }
}
