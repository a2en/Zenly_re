package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u9 */
/* compiled from: lambda */
public final /* synthetic */ class C6657u9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16237a;

    public /* synthetic */ C6657u9(Core core) {
        this.f16237a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16237a.geoReverseGeocodeFormattedAddress(bArr, rxProtoObserver);
    }
}
