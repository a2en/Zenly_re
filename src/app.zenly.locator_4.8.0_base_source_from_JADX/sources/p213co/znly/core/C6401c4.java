package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.c4 */
/* compiled from: lambda */
public final /* synthetic */ class C6401c4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15978a;

    public /* synthetic */ C6401c4(Core core) {
        this.f15978a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15978a.deprecatedUserPublicFriends(bArr, rxProtoObserver);
    }
}
