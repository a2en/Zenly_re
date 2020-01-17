package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ob */
/* compiled from: lambda */
public final /* synthetic */ class C6574ob implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16159a;

    public /* synthetic */ C6574ob(Core core) {
        this.f16159a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16159a.userBlock(bArr, rxProtoObserver);
    }
}
