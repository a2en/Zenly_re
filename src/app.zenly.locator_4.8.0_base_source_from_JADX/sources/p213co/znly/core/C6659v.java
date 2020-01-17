package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.v */
/* compiled from: lambda */
public final /* synthetic */ class C6659v implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16239a;

    public /* synthetic */ C6659v(Core core) {
        this.f16239a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16239a.chatCreateGroup(bArr, rxProtoObserver);
    }
}
