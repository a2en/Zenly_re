package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.r2 */
/* compiled from: lambda */
public final /* synthetic */ class C6605r2 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16190a;

    public /* synthetic */ C6605r2(Core core) {
        this.f16190a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16190a.chatReportMessage(bArr, rxProtoObserver);
    }
}
