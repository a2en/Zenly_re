package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.j3 */
/* compiled from: lambda */
public final /* synthetic */ class C6495j3 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16076a;

    public /* synthetic */ C6495j3(Core core) {
        this.f16076a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16076a.userMonitoringUpsert(bArr, rxProtoObserver);
    }
}
