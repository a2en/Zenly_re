package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.z2 */
/* compiled from: lambda */
public final /* synthetic */ class C6754z2 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16296a;

    public /* synthetic */ C6754z2(Core core) {
        this.f16296a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16296a.friendshipsStateStream(rxProtoObserver);
    }
}
