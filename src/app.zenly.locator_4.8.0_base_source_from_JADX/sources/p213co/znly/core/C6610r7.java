package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.r7 */
/* compiled from: lambda */
public final /* synthetic */ class C6610r7 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16195a;

    public /* synthetic */ C6610r7(Core core) {
        this.f16195a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16195a.recoPotentialMatches(bArr, rxProtoObserver);
    }
}
