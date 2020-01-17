package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.w5 */
/* compiled from: lambda */
public final /* synthetic */ class C6719w5 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ ZenlyCore f16262a;

    public /* synthetic */ C6719w5(ZenlyCore zenlyCore) {
        this.f16262a = zenlyCore;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16262a.mo14248a(bArr, rxProtoObserver);
    }
}
