package p213co.znly.core;

import p389io.reactivex.functions.Function;

/* renamed from: co.znly.core.d6 */
/* compiled from: lambda */
public final /* synthetic */ class C6418d6 implements Function {

    /* renamed from: e */
    private final /* synthetic */ ZenlyCore f15997e;

    public /* synthetic */ C6418d6(ZenlyCore zenlyCore) {
        this.f15997e = zenlyCore;
    }

    public final Object apply(Object obj) {
        return this.f15997e.asProtoValue((String) obj);
    }
}
