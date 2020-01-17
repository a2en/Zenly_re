package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.m0 */
/* compiled from: lambda */
public final /* synthetic */ class C6536m0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16122a;

    public /* synthetic */ C6536m0(Core core) {
        this.f16122a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16122a.friendRequestSearch(bArr, rxProtoObserver);
    }
}
