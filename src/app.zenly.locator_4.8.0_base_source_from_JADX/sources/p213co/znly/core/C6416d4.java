package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.d4 */
/* compiled from: lambda */
public final /* synthetic */ class C6416d4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15995a;

    public /* synthetic */ C6416d4(Core core) {
        this.f15995a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15995a.blockedUsers(bArr, rxProtoObserver);
    }
}
