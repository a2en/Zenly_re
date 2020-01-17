package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.InputOutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;
import p213co.znly.zenlygocore.RxProtoObservable;

/* renamed from: co.znly.core.j2 */
/* compiled from: lambda */
public final /* synthetic */ class C6494j2 implements InputOutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16075a;

    public /* synthetic */ C6494j2(Core core) {
        this.f16075a = core;
    }

    public final RxContext call(RxProtoObservable rxProtoObservable, RxProtoObserver rxProtoObserver) {
        return this.f16075a.mapSpinnersStream(rxProtoObservable, rxProtoObserver);
    }
}
