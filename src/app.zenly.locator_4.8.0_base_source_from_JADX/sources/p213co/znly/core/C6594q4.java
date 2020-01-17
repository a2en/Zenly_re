package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.q4 */
/* compiled from: lambda */
public final /* synthetic */ class C6594q4 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16179a;

    public /* synthetic */ C6594q4(Core core) {
        this.f16179a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16179a.uiCacheEmojiPackUnlockGet(rxProtoObserver);
    }
}
