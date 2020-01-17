package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.w2 */
/* compiled from: lambda */
public final /* synthetic */ class C6716w2 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16259a;

    public /* synthetic */ C6716w2(Core core) {
        this.f16259a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16259a.userUpdateDeprecated(bArr, rxProtoObserver);
    }
}
