package app.zenly.locator.support;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.support.x */
final class C5930x implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ Function1 f14945e;

    C5930x(Function1 function1) {
        this.f14945e = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12932j.m33815a(this.f14945e.invoke(obj), "invoke(...)");
    }
}
