package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.w6 */
/* compiled from: lambda */
public final /* synthetic */ class C6720w6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16263a;

    public /* synthetic */ C6720w6(Core core) {
        this.f16263a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16263a.chatGroupConversationAdd(bArr, rxProtoObserver);
    }
}
