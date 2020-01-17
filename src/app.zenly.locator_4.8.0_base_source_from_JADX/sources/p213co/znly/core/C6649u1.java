package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u1 */
/* compiled from: lambda */
public final /* synthetic */ class C6649u1 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16229a;

    public /* synthetic */ C6649u1(Core core) {
        this.f16229a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16229a.chatConversationMute(bArr, rxProtoObserver);
    }
}
