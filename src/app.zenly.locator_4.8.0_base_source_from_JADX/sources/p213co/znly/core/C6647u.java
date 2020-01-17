package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u */
/* compiled from: lambda */
public final /* synthetic */ class C6647u implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16227a;

    public /* synthetic */ C6647u(Core core) {
        this.f16227a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16227a.chatMessagesStream(bArr, rxProtoObserver);
    }
}
