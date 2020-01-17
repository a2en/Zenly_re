package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ba */
/* compiled from: lambda */
public final /* synthetic */ class C6388ba implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15966a;

    public /* synthetic */ C6388ba(Core core) {
        this.f15966a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15966a.sessionVerify(bArr, rxProtoObserver);
    }
}
