package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.e3 */
/* compiled from: lambda */
public final /* synthetic */ class C6428e3 implements OutputCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16007a;

    public /* synthetic */ C6428e3(Core core) {
        this.f16007a = core;
    }

    public final RxContext call(RxProtoObserver rxProtoObserver) {
        return this.f16007a.zendeskGetFeedbackCategories(rxProtoObserver);
    }
}
