package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.d9 */
/* compiled from: lambda */
public final /* synthetic */ class C6421d9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16000a;

    public /* synthetic */ C6421d9(Core core) {
        this.f16000a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16000a.userReport(bArr, rxProtoObserver);
    }
}
