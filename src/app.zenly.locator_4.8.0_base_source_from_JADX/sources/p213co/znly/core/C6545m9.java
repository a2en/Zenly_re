package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.m9 */
/* compiled from: lambda */
public final /* synthetic */ class C6545m9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16131a;

    public /* synthetic */ C6545m9(Core core) {
        this.f16131a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16131a.getAnnouncements(bArr, rxProtoObserver);
    }
}
