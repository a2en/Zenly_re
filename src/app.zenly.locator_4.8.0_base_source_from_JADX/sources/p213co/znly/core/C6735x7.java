package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.x7 */
/* compiled from: lambda */
public final /* synthetic */ class C6735x7 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16277a;

    public /* synthetic */ C6735x7(Core core) {
        this.f16277a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16277a.contactsSuggestedDismissUser(bArr, rxProtoObserver);
    }
}
