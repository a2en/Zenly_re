package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.qa */
/* compiled from: lambda */
public final /* synthetic */ class C6600qa implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16185a;

    public /* synthetic */ C6600qa(Core core) {
        this.f16185a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16185a.footstepsLocalitiesAt(bArr, rxProtoObserver);
    }
}
