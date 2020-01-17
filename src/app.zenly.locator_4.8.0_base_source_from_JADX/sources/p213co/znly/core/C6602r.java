package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.r */
/* compiled from: lambda */
public final /* synthetic */ class C6602r implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16187a;

    public /* synthetic */ C6602r(Core core) {
        this.f16187a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16187a.userUpdateAvatar(bArr, rxProtoObserver);
    }
}
