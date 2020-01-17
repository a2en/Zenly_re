package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.Job;

/* renamed from: kotlinx.coroutines.q0 */
public abstract class C13133q0<J extends Job> extends C13126n implements DisposableHandle, Incomplete {

    /* renamed from: h */
    public final J f33725h;

    public C13133q0(J j) {
        C12932j.m33818b(j, "job");
        this.f33725h = j;
    }

    public void dispose() {
        J j = this.f33725h;
        if (j != null) {
            ((C13136r0) j).mo37640a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }

    public C13150u0 getList() {
        return null;
    }

    public boolean isActive() {
        return true;
    }
}
