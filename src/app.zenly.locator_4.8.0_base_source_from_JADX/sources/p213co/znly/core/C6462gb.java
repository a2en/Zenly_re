package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.gb */
/* compiled from: lambda */
public final /* synthetic */ class C6462gb implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16041a;

    public /* synthetic */ C6462gb(Core core) {
        this.f16041a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16041a.userActionsFetchStream(bArr, rxProtoObserver);
    }
}
