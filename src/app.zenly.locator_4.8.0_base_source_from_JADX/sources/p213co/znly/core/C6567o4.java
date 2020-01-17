package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.o4 */
/* compiled from: lambda */
public final /* synthetic */ class C6567o4 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16152a;

    public /* synthetic */ C6567o4(Core core) {
        this.f16152a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16152a.pingManifestStream(bArr, rxProtoObserver);
    }
}
