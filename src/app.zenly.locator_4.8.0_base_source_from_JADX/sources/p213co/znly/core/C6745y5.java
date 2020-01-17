package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.y5 */
/* compiled from: lambda */
public final /* synthetic */ class C6745y5 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ ZenlyCore f16287a;

    public /* synthetic */ C6745y5(ZenlyCore zenlyCore) {
        this.f16287a = zenlyCore;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16287a.mo14251b(bArr, rxProtoObserver);
    }
}
