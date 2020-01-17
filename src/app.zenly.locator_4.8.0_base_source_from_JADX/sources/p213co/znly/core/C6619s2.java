package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.s2 */
/* compiled from: lambda */
public final /* synthetic */ class C6619s2 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16204a;

    public /* synthetic */ C6619s2(Core core) {
        this.f16204a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16204a.contactsAlreadySearchBatch(bArr, rxProtoObserver);
    }
}
