package p213co.znly.core;

import p213co.znly.zenlygocore.RxContext;
import p389io.reactivex.functions.Cancellable;

/* renamed from: co.znly.core.e9 */
/* compiled from: lambda */
public final /* synthetic */ class C6434e9 implements Cancellable {

    /* renamed from: a */
    private final /* synthetic */ RxContext f16013a;

    public /* synthetic */ C6434e9(RxContext rxContext) {
        this.f16013a = rxContext;
    }

    public final void cancel() {
        this.f16013a.cancel();
    }
}
