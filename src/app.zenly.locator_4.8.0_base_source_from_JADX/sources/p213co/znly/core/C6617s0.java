package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.s0 */
/* compiled from: lambda */
public final /* synthetic */ class C6617s0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16202a;

    public /* synthetic */ C6617s0(Core core) {
        this.f16202a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16202a.userUpdate(bArr, rxProtoObserver);
    }
}
