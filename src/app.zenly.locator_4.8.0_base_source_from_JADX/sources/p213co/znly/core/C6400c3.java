package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.c3 */
/* compiled from: lambda */
public final /* synthetic */ class C6400c3 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f15977a;

    public /* synthetic */ C6400c3(Core core) {
        this.f15977a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f15977a.deprecatedDevicesGet(rxProtoObserver);
    }
}
