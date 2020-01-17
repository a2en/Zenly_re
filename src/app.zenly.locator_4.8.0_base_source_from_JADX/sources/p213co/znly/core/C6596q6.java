package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.q6 */
/* compiled from: lambda */
public final /* synthetic */ class C6596q6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16181a;

    public /* synthetic */ C6596q6(Core core) {
        this.f16181a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16181a.debugUser(bArr, rxProtoObserver);
    }
}
