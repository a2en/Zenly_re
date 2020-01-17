package app.zenly.locator.experimental.map;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.experimental.map.c */
final class C3733c implements Predicate {

    /* renamed from: e */
    private final /* synthetic */ Function1 f9987e;

    C3733c(Function1 function1) {
        this.f9987e = function1;
    }

    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.f9987e.invoke(obj);
        C12932j.m33815a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
