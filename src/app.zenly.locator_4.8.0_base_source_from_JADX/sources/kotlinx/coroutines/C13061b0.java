package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.b0 */
final class C13061b0 extends C13063c {

    /* renamed from: e */
    private final DisposableHandle f33643e;

    public C13061b0(DisposableHandle disposableHandle) {
        C12932j.m33818b(disposableHandle, "handle");
        this.f33643e = disposableHandle;
    }

    /* renamed from: a */
    public void mo37503a(Throwable th) {
        this.f33643e.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37503a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisposeOnCancel[");
        sb.append(this.f33643e);
        sb.append(']');
        return sb.toString();
    }
}
