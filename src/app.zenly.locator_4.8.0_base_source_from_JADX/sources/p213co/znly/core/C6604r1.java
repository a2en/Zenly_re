package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.r1 */
/* compiled from: lambda */
public final /* synthetic */ class C6604r1 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16189a;

    public /* synthetic */ C6604r1(Core core) {
        this.f16189a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16189a.chatDeleteFailedMessage(bArr, rxProtoObserver);
    }
}
