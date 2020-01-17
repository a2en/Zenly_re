package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ea */
/* compiled from: lambda */
public final /* synthetic */ class C6435ea implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16014a;

    public /* synthetic */ C6435ea(Core core) {
        this.f16014a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16014a.geoReverseGeocode(bArr, rxProtoObserver);
    }
}
