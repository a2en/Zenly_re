package app.zenly.locator.experimental.inbox;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.experimental.inbox.g */
final class C3706g implements Predicate {

    /* renamed from: e */
    private final /* synthetic */ Function1 f9939e;

    C3706g(Function1 function1) {
        this.f9939e = function1;
    }

    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.f9939e.invoke(obj);
        C12932j.m33815a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
