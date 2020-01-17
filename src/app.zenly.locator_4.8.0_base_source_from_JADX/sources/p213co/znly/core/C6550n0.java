package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.n0 */
/* compiled from: lambda */
public final /* synthetic */ class C6550n0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16135a;

    public /* synthetic */ C6550n0(Core core) {
        this.f16135a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16135a.pushNotificationCreate(bArr, rxProtoObserver);
    }
}
