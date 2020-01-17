package p213co.znly.core;

import java.util.concurrent.Callable;
import p213co.znly.zenlygocore.Core;

/* renamed from: co.znly.core.b0 */
/* compiled from: lambda */
public final /* synthetic */ class C6378b0 implements Callable {

    /* renamed from: e */
    private final /* synthetic */ Core f15956e;

    public /* synthetic */ C6378b0(Core core) {
        this.f15956e = core;
    }

    public final Object call() {
        return Boolean.valueOf(this.f15956e.getFootstepsOnboardingDone());
    }
}
