package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.l3 */
/* compiled from: lambda */
public final /* synthetic */ class C6521l3 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16104a;

    public /* synthetic */ C6521l3(Core core) {
        this.f16104a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16104a.contactsSuggestionsStateStream(rxProtoObserver);
    }
}
