package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C6425e0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16004a;

    public /* synthetic */ C6425e0(Core core) {
        this.f16004a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16004a.friendGhost(bArr, rxProtoObserver);
    }
}
