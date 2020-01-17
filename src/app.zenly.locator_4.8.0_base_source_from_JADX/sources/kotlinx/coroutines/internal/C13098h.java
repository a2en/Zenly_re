package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C13098h {

    /* renamed from: a */
    private static final Object f33682a = new C13107n("CONDITION_FALSE");

    static {
        new C13107n("ALREADY_REMOVED");
        new C13107n("LIST_EMPTY");
        new C13107n("REMOVE_PREPARED");
    }

    /* renamed from: a */
    public static final Object m34167a() {
        return f33682a;
    }

    /* renamed from: a */
    public static final C13099i m34168a(Object obj) {
        C12932j.m33818b(obj, "$this$unwrap");
        C13105l lVar = (C13105l) (!(obj instanceof C13105l) ? null : obj);
        if (lVar != null) {
            C13099i iVar = lVar.f33697a;
            if (iVar != null) {
                return iVar;
            }
        }
        return (C13099i) obj;
    }
}
