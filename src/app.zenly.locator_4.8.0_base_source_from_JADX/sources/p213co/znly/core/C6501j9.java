package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.j9 */
/* compiled from: lambda */
public final /* synthetic */ class C6501j9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16084a;

    public /* synthetic */ C6501j9(Core core) {
        this.f16084a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16084a.userActionsUpdate(bArr, rxProtoObserver);
    }
}
