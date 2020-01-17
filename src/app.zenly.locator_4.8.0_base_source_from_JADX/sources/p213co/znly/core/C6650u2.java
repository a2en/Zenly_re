package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.u2 */
/* compiled from: lambda */
public final /* synthetic */ class C6650u2 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16230a;

    public /* synthetic */ C6650u2(Core core) {
        this.f16230a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16230a.contactsSearch(bArr, rxProtoObserver);
    }
}
