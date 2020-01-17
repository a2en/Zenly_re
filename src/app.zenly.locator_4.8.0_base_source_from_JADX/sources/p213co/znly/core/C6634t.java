package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.t */
/* compiled from: lambda */
public final /* synthetic */ class C6634t implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16215a;

    public /* synthetic */ C6634t(Core core) {
        this.f16215a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16215a.geoRouteUserETA(bArr, rxProtoObserver);
    }
}
