package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u7 */
/* compiled from: lambda */
public final /* synthetic */ class C6655u7 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16235a;

    public /* synthetic */ C6655u7(Core core) {
        this.f16235a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16235a.userVisitPointsState(bArr, rxProtoObserver);
    }
}
