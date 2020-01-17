package p213co.znly.core;

import java.util.concurrent.Callable;
import p213co.znly.zenlygocore.Core;

/* renamed from: co.znly.core.b9 */
/* compiled from: lambda */
public final /* synthetic */ class C6387b9 implements Callable {

    /* renamed from: e */
    private final /* synthetic */ Core f15965e;

    public /* synthetic */ C6387b9(Core core) {
        this.f15965e = core;
    }

    public final Object call() {
        return this.f15965e.deviceGetPhoneNumber();
    }
}
