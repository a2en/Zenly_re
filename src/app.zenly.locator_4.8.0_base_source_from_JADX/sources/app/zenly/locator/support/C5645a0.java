package app.zenly.locator.support;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.a0 */
final class C5645a0 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ Function1 f14398e;

    C5645a0(Function1 function1) {
        this.f14398e = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12932j.m33815a(this.f14398e.invoke(obj), "invoke(...)");
    }
}
