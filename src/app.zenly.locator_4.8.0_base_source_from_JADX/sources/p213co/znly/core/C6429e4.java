package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.e4 */
/* compiled from: lambda */
public final /* synthetic */ class C6429e4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16008a;

    public /* synthetic */ C6429e4(Core core) {
        this.f16008a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16008a.bestFriendsHide(bArr, rxProtoObserver);
    }
}
