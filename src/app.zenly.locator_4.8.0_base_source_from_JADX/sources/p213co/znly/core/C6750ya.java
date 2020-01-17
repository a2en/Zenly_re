package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ya */
/* compiled from: lambda */
public final /* synthetic */ class C6750ya implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16292a;

    public /* synthetic */ C6750ya(Core core) {
        this.f16292a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16292a.friendSearchStream(bArr, rxProtoObserver);
    }
}
