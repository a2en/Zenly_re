package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.l6 */
/* compiled from: lambda */
public final /* synthetic */ class C6524l6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16107a;

    public /* synthetic */ C6524l6(Core core) {
        this.f16107a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16107a.chatConversationUpdatesStream(bArr, rxProtoObserver);
    }
}
