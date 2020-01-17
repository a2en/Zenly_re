package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ra */
/* compiled from: lambda */
public final /* synthetic */ class C6613ra implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16198a;

    public /* synthetic */ C6613ra(Core core) {
        this.f16198a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16198a.chatMessagesRealtime(bArr, rxProtoObserver);
    }
}
