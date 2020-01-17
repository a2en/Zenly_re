package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.m */
final class C13124m {

    /* renamed from: a */
    public final Object f33721a;

    /* renamed from: b */
    public final Function1<Throwable, C12956q> f33722b;

    public C13124m(Object obj, Function1<? super Throwable, C12956q> function1) {
        C12932j.m33818b(function1, "onCancellation");
        this.f33721a = obj;
        this.f33722b = function1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompletedWithCancellation[");
        sb.append(this.f33721a);
        sb.append(']');
        return sb.toString();
    }
}
