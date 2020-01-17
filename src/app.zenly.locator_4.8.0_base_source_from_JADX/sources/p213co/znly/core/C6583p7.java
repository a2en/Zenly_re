package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.p7 */
/* compiled from: lambda */
public final /* synthetic */ class C6583p7 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16168a;

    public /* synthetic */ C6583p7(Core core) {
        this.f16168a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16168a.footstepsVisitedShapes(bArr, rxProtoObserver);
    }
}
