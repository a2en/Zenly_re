package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.s8 */
/* compiled from: lambda */
public final /* synthetic */ class C6625s8 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16210a;

    public /* synthetic */ C6625s8(Core core) {
        this.f16210a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16210a.chatUpdateCursor(bArr, rxProtoObserver);
    }
}
