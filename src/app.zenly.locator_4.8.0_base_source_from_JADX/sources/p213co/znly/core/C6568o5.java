package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.o5 */
/* compiled from: lambda */
public final /* synthetic */ class C6568o5 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16153a;

    public /* synthetic */ C6568o5(Core core) {
        this.f16153a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16153a.recoAcknowledgeRecommendation(bArr, rxProtoObserver);
    }
}
