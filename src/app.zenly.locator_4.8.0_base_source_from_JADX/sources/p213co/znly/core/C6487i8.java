package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.i8 */
/* compiled from: lambda */
public final /* synthetic */ class C6487i8 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16068a;

    public /* synthetic */ C6487i8(Core core) {
        this.f16068a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16068a.deprecatedUserPlaces(rxProtoObserver);
    }
}
