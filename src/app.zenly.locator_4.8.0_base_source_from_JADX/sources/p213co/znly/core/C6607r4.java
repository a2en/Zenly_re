package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.r4 */
/* compiled from: lambda */
public final /* synthetic */ class C6607r4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16192a;

    public /* synthetic */ C6607r4(Core core) {
        this.f16192a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16192a.pingStatsStream(bArr, rxProtoObserver);
    }
}
