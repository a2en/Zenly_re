package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.o6 */
/* compiled from: lambda */
public final /* synthetic */ class C6569o6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16154a;

    public /* synthetic */ C6569o6(Core core) {
        this.f16154a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16154a.chatResolveGroupConversation(bArr, rxProtoObserver);
    }
}
