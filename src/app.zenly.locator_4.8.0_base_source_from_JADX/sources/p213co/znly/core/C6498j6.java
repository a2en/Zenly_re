package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.j6 */
/* compiled from: lambda */
public final /* synthetic */ class C6498j6 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16081a;

    public /* synthetic */ C6498j6(Core core) {
        this.f16081a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16081a.weatherStream(rxProtoObserver);
    }
}
