package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.p5 */
/* compiled from: lambda */
public final /* synthetic */ class C6581p5 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16166a;

    public /* synthetic */ C6581p5(Core core) {
        this.f16166a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16166a.sessionCreate(bArr, rxProtoObserver);
    }
}
