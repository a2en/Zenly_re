package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.m3 */
/* compiled from: lambda */
public final /* synthetic */ class C6539m3 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16125a;

    public /* synthetic */ C6539m3(Core core) {
        this.f16125a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16125a.geoReverseGeocodeStreet(bArr, rxProtoObserver);
    }
}
