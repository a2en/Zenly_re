package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.la */
/* compiled from: lambda */
public final /* synthetic */ class C6528la implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16111a;

    public /* synthetic */ C6528la(Core core) {
        this.f16111a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16111a.chatGroupConversationKick(bArr, rxProtoObserver);
    }
}
