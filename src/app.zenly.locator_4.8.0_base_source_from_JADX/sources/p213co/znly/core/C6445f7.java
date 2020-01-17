package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.f7 */
/* compiled from: lambda */
public final /* synthetic */ class C6445f7 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16024a;

    public /* synthetic */ C6445f7(Core core) {
        this.f16024a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16024a.uiCacheEmojiPackUnlockSet(bArr, rxProtoObserver);
    }
}
