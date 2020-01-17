package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.j1 */
/* compiled from: lambda */
public final /* synthetic */ class C6493j1 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16074a;

    public /* synthetic */ C6493j1(Core core) {
        this.f16074a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16074a.friendDelete(bArr, rxProtoObserver);
    }
}
