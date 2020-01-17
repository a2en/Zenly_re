package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.q7 */
/* compiled from: lambda */
public final /* synthetic */ class C6597q7 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16182a;

    public /* synthetic */ C6597q7(Core core) {
        this.f16182a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16182a.footstepsRecordState(bArr, rxProtoObserver);
    }
}
