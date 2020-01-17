package p389io.reactivex.p405m;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.m.f */
final class C12784f implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ Function1 f33332e;

    C12784f(Function1 function1) {
        this.f33332e = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C12932j.m33815a(this.f33332e.invoke(t), "invoke(...)");
    }
}
