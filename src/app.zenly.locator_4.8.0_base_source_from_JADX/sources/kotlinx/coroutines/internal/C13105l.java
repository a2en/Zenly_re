package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.internal.l */
final class C13105l {

    /* renamed from: a */
    public final C13099i f33697a;

    public C13105l(C13099i iVar) {
        C12932j.m33818b(iVar, "ref");
        this.f33697a = iVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Removed[");
        sb.append(this.f33697a);
        sb.append(']');
        return sb.toString();
    }
}
