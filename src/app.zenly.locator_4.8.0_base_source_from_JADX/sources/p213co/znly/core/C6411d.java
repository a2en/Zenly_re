package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.d */
/* compiled from: lambda */
public final /* synthetic */ class C6411d implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15990a;

    public /* synthetic */ C6411d(Core core) {
        this.f15990a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15990a.markAnnouncementRead(bArr, rxProtoObserver);
    }
}
