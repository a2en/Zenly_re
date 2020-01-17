package p213co.znly.core;

import java.util.concurrent.Callable;
import p213co.znly.zenlygocore.Core;

/* renamed from: co.znly.core.b4 */
/* compiled from: lambda */
public final /* synthetic */ class C6382b4 implements Callable {

    /* renamed from: e */
    private final /* synthetic */ Core f15960e;

    public /* synthetic */ C6382b4(Core core) {
        this.f15960e = core;
    }

    public final Object call() {
        return Long.valueOf(this.f15960e.deviceGetCountryCode());
    }
}
