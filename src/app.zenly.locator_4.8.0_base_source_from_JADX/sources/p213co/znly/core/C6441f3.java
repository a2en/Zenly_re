package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.f3 */
/* compiled from: lambda */
public final /* synthetic */ class C6441f3 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16020a;

    public /* synthetic */ C6441f3(Core core) {
        this.f16020a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16020a.pingMostSentEmojiStream(bArr, rxProtoObserver);
    }
}
