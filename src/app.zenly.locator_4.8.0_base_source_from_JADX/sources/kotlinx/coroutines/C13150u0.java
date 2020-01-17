package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.internal.C13097g;
import kotlinx.coroutines.internal.C13099i;

/* renamed from: kotlinx.coroutines.u0 */
public final class C13150u0 extends C13097g implements Incomplete {
    /* renamed from: a */
    public final String mo37692a(String str) {
        C12932j.m33818b(str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object a = mo37592a();
        if (a != null) {
            boolean z = true;
            for (C13099i iVar = (C13099i) a; !C12932j.m33817a((Object) iVar, (Object) this); iVar = iVar.mo37594b()) {
                if (iVar instanceof C13133q0) {
                    C13133q0 q0Var = (C13133q0) iVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(q0Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C12932j.m33815a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public C13150u0 getList() {
        return this;
    }

    public boolean isActive() {
        return true;
    }

    public String toString() {
        return C13149u.m34326b() ? mo37692a("Active") : super.toString();
    }
}
