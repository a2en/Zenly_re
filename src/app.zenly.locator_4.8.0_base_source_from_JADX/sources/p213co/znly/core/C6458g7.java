package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.g7 */
/* compiled from: lambda */
public final /* synthetic */ class C6458g7 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16037a;

    public /* synthetic */ C6458g7(Core core) {
        this.f16037a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16037a.friendRequestCreate(bArr, rxProtoObserver);
    }
}
