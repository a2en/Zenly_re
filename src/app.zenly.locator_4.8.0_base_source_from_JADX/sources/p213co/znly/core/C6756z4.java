package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.z4 */
/* compiled from: lambda */
public final /* synthetic */ class C6756z4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16298a;

    public /* synthetic */ C6756z4(Core core) {
        this.f16298a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16298a.pingSend(bArr, rxProtoObserver);
    }
}
