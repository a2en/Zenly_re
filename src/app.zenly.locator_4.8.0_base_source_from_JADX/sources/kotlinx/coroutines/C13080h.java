package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.h */
public final class C13080h extends C13127n0<Job> {

    /* renamed from: i */
    public final C13070e<?> f33663i;

    public C13080h(Job job, C13070e<?> eVar) {
        C12932j.m33818b(job, "parent");
        C12932j.m33818b(eVar, "child");
        super(job);
        this.f33663i = eVar;
    }

    /* renamed from: a */
    public void mo37574a(Throwable th) {
        C13070e<?> eVar = this.f33663i;
        eVar.cancel(eVar.mo37545a((Job) this.f33725h));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37574a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildContinuation[");
        sb.append(this.f33663i);
        sb.append(']');
        return sb.toString();
    }
}
