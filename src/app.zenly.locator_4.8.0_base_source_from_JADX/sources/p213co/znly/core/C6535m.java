package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.m */
/* compiled from: lambda */
public final /* synthetic */ class C6535m implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16121a;

    public /* synthetic */ C6535m(Core core) {
        this.f16121a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16121a.userMonitoringExist(bArr, rxProtoObserver);
    }
}
