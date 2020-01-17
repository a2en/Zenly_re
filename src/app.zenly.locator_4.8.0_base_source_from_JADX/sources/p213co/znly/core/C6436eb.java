package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.eb */
/* compiled from: lambda */
public final /* synthetic */ class C6436eb implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16015a;

    public /* synthetic */ C6436eb(Core core) {
        this.f16015a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16015a.friendSubscribe(bArr, rxProtoObserver);
    }
}
