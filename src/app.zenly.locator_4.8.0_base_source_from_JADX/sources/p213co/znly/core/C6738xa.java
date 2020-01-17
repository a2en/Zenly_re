package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.xa */
/* compiled from: lambda */
public final /* synthetic */ class C6738xa implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16280a;

    public /* synthetic */ C6738xa(Core core) {
        this.f16280a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16280a.chatOldMessagesServer(bArr, rxProtoObserver);
    }
}
