package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.g4 */
/* compiled from: lambda */
public final /* synthetic */ class C6455g4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16034a;

    public /* synthetic */ C6455g4(Core core) {
        this.f16034a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16034a.userPlace(bArr, rxProtoObserver);
    }
}
