package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C6466h0 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16044a;

    public /* synthetic */ C6466h0(Core core) {
        this.f16044a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16044a.chatConversationSyncStream(bArr, rxProtoObserver);
    }
}
