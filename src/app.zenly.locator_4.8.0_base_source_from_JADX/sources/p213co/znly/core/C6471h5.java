package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.h5 */
/* compiled from: lambda */
public final /* synthetic */ class C6471h5 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16050a;

    public /* synthetic */ C6471h5(Core core) {
        this.f16050a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16050a.geoRoutePolyline(bArr, rxProtoObserver);
    }
}