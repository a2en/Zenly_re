package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.b8 */
/* compiled from: lambda */
public final /* synthetic */ class C6386b8 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15964a;

    public /* synthetic */ C6386b8(Core core) {
        this.f15964a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15964a.userPublicFriendsState(bArr, rxProtoObserver);
    }
}
