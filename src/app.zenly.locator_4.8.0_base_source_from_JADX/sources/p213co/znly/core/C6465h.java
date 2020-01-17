package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.h */
/* compiled from: lambda */
public final /* synthetic */ class C6465h implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16043a;

    public /* synthetic */ C6465h(Core core) {
        this.f16043a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16043a.userGet(bArr, rxProtoObserver);
    }
}
