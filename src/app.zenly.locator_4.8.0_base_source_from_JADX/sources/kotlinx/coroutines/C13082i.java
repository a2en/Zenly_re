package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.i */
public final class C13082i extends C13127n0<C13136r0> implements ChildHandle {

    /* renamed from: i */
    public final ChildJob f33666i;

    public C13082i(C13136r0 r0Var, ChildJob childJob) {
        C12932j.m33818b(r0Var, "parent");
        C12932j.m33818b(childJob, "childJob");
        super(r0Var);
        this.f33666i = childJob;
    }

    /* renamed from: a */
    public void mo37574a(Throwable th) {
        this.f33666i.parentCancelled((ParentJob) this.f33725h);
    }

    public boolean childCancelled(Throwable th) {
        C12932j.m33818b(th, "cause");
        return ((C13136r0) this.f33725h).mo37646b(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37574a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildHandle[");
        sb.append(this.f33666i);
        sb.append(']');
        return sb.toString();
    }
}
