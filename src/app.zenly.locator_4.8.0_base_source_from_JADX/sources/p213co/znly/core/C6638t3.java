package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.t3 */
/* compiled from: lambda */
public final /* synthetic */ class C6638t3 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16219a;

    public /* synthetic */ C6638t3(Core core) {
        this.f16219a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16219a.resolveUserUsername(bArr, rxProtoObserver);
    }
}
