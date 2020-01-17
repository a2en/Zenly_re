package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ta */
/* compiled from: lambda */
public final /* synthetic */ class C6645ta implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16226a;

    public /* synthetic */ C6645ta(Core core) {
        this.f16226a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16226a.nightsStay(bArr, rxProtoObserver);
    }
}
