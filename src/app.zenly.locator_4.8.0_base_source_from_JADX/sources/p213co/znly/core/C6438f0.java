package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.f0 */
/* compiled from: lambda */
public final /* synthetic */ class C6438f0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16017a;

    public /* synthetic */ C6438f0(Core core) {
        this.f16017a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16017a.chatSendMessage(bArr, rxProtoObserver);
    }
}
