package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.w9 */
/* compiled from: lambda */
public final /* synthetic */ class C6723w9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16266a;

    public /* synthetic */ C6723w9(Core core) {
        this.f16266a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16266a.requestMedia(bArr, rxProtoObserver);
    }
}
