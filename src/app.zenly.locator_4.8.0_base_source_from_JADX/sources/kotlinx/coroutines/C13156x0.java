package kotlinx.coroutines;

import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.x0 */
final class C13156x0 extends C13133q0<Job> {

    /* renamed from: i */
    private final Continuation<C12956q> f33760i;

    public C13156x0(Job job, Continuation<? super C12956q> continuation) {
        C12932j.m33818b(job, "job");
        C12932j.m33818b(continuation, "continuation");
        super(job);
        this.f33760i = continuation;
    }

    /* renamed from: a */
    public void mo37574a(Throwable th) {
        Continuation<C12956q> continuation = this.f33760i;
        C12956q qVar = C12956q.f33541a;
        C12919a aVar = C12918j.f33499e;
        C12918j.m33783a(qVar);
        continuation.resumeWith(qVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37574a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResumeOnCompletion[");
        sb.append(this.f33760i);
        sb.append(']');
        return sb.toString();
    }
}
