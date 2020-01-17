package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.i5 */
/* compiled from: lambda */
public final /* synthetic */ class C6484i5 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16065a;

    public /* synthetic */ C6484i5(Core core) {
        this.f16065a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16065a.reverseGeoCodeViewports(bArr, rxProtoObserver);
    }
}
