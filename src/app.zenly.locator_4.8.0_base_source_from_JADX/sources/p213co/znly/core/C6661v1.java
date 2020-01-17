package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.v1 */
/* compiled from: lambda */
public final /* synthetic */ class C6661v1 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16241a;

    public /* synthetic */ C6661v1(Core core) {
        this.f16241a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16241a.chatConversationsSearch(bArr, rxProtoObserver);
    }
}
