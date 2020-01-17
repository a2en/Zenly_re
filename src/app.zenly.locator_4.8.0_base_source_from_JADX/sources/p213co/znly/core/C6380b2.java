package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.b2 */
/* compiled from: lambda */
public final /* synthetic */ class C6380b2 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15958a;

    public /* synthetic */ C6380b2(Core core) {
        this.f15958a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15958a.geoReverseGeocodeAdminAreas(bArr, rxProtoObserver);
    }
}
