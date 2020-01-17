package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.y4 */
/* compiled from: lambda */
public final /* synthetic */ class C6744y4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16286a;

    public /* synthetic */ C6744y4(Core core) {
        this.f16286a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16286a.contactsSearchBatch(bArr, rxProtoObserver);
    }
}
