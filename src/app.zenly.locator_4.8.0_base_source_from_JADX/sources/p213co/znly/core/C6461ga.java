package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ga */
/* compiled from: lambda */
public final /* synthetic */ class C6461ga implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16040a;

    public /* synthetic */ C6461ga(Core core) {
        this.f16040a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16040a.userMonitoringDelete(bArr, rxProtoObserver);
    }
}
