package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.b */
/* compiled from: lambda */
public final /* synthetic */ class C6377b implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15955a;

    public /* synthetic */ C6377b(Core core) {
        this.f15955a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15955a.recoAcknowledgePotentialMatch(bArr, rxProtoObserver);
    }
}
