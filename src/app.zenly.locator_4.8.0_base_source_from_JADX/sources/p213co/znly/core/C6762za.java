package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.za */
/* compiled from: lambda */
public final /* synthetic */ class C6762za implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16304a;

    public /* synthetic */ C6762za(Core core) {
        this.f16304a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16304a.universitiesCampaignsSignup(bArr, rxProtoObserver);
    }
}
