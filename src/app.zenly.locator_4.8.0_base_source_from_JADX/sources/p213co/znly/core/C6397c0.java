package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.c0 */
/* compiled from: lambda */
public final /* synthetic */ class C6397c0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15974a;

    public /* synthetic */ C6397c0(Core core) {
        this.f15974a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15974a.tstResetMutualLove(bArr, rxProtoObserver);
    }
}