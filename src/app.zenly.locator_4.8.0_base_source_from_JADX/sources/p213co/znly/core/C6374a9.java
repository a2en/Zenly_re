package p213co.znly.core;

import java.util.concurrent.Callable;
import p213co.znly.zenlygocore.Core;

/* renamed from: co.znly.core.a9 */
/* compiled from: lambda */
public final /* synthetic */ class C6374a9 implements Callable {

    /* renamed from: e */
    private final /* synthetic */ Core f15952e;

    public /* synthetic */ C6374a9(Core core) {
        this.f15952e = core;
    }

    public final Object call() {
        return Boolean.valueOf(this.f15952e.getFootstepsStarted());
    }
}
