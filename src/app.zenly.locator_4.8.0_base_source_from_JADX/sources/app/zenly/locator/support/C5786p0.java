package app.zenly.locator.support;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.p0 */
final class C5786p0 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ Function1 f14657e;

    C5786p0(Function1 function1) {
        this.f14657e = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12932j.m33815a(this.f14657e.invoke(obj), "invoke(...)");
    }
}
