package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.jb */
/* compiled from: lambda */
public final /* synthetic */ class C6503jb implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16086a;

    public /* synthetic */ C6503jb(Core core) {
        this.f16086a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16086a.footstepsWebSet(bArr, rxProtoObserver);
    }
}
