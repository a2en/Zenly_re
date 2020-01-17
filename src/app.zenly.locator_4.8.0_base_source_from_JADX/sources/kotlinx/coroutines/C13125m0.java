package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.m0 */
final class C13125m0 extends C13133q0<Job> {

    /* renamed from: i */
    private final Function1<Throwable, C12956q> f33723i;

    public C13125m0(Job job, Function1<? super Throwable, C12956q> function1) {
        C12932j.m33818b(job, "job");
        C12932j.m33818b(function1, "handler");
        super(job);
        this.f33723i = function1;
    }

    /* renamed from: a */
    public void mo37574a(Throwable th) {
        this.f33723i.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37574a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCompletion[");
        sb.append(C13151v.m34329a((Object) this));
        sb.append('@');
        sb.append(C13151v.m34331b(this));
        sb.append(']');
        return sb.toString();
    }
}
