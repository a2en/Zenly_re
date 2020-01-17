package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.y6 */
/* compiled from: lambda */
public final /* synthetic */ class C6746y6 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16288a;

    public /* synthetic */ C6746y6(Core core) {
        this.f16288a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16288a.chatCursorRealtimeStream(bArr, rxProtoObserver);
    }
}
