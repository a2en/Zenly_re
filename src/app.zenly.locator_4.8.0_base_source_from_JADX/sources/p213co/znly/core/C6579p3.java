package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.p3 */
/* compiled from: lambda */
public final /* synthetic */ class C6579p3 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16164a;

    public /* synthetic */ C6579p3(Core core) {
        this.f16164a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16164a.universitiesCampaignsSubscription(bArr, rxProtoObserver);
    }
}
