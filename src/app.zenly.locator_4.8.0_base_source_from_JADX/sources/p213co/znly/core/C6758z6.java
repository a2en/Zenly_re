package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.z6 */
/* compiled from: lambda */
public final /* synthetic */ class C6758z6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16300a;

    public /* synthetic */ C6758z6(Core core) {
        this.f16300a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16300a.chatSyncMessagesServer(bArr, rxProtoObserver);
    }
}
