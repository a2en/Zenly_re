package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.q8 */
/* compiled from: lambda */
public final /* synthetic */ class C6598q8 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16183a;

    public /* synthetic */ C6598q8(Core core) {
        this.f16183a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16183a.remoteAsset(bArr, rxProtoObserver);
    }
}
