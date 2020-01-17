package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.kb */
/* compiled from: lambda */
public final /* synthetic */ class C6516kb implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16099a;

    public /* synthetic */ C6516kb(Core core) {
        this.f16099a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16099a.footstepsRecordCacheGet(bArr, rxProtoObserver);
    }
}
