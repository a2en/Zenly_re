package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.o7 */
/* compiled from: lambda */
public final /* synthetic */ class C6570o7 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16155a;

    public /* synthetic */ C6570o7(Core core) {
        this.f16155a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16155a.contactsSoonStateStream(rxProtoObserver);
    }
}
