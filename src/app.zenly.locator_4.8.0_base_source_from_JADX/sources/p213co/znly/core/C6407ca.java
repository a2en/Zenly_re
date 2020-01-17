package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ca */
/* compiled from: lambda */
public final /* synthetic */ class C6407ca implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15984a;

    public /* synthetic */ C6407ca(Core core) {
        this.f15984a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f15984a.inboxHide(bArr, rxProtoObserver);
    }
}
