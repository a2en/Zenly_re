package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.o1 */
/* compiled from: lambda */
public final /* synthetic */ class C6564o1 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16149a;

    public /* synthetic */ C6564o1(Core core) {
        this.f16149a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16149a.recoSendRecommendation(bArr, rxProtoObserver);
    }
}
