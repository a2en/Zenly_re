package kotlinx.coroutines;

import kotlin.C12918j;
import kotlin.C12949k;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.k */
public final class C13120k {
    /* renamed from: a */
    public static final <T> Object m34249a(Object obj) {
        if (C12918j.m33786d(obj)) {
            C12949k.m33849a(obj);
            return obj;
        }
        Throwable b = C12918j.m33784b(obj);
        if (b != null) {
            return new C13118j(b, false, 2, null);
        }
        C12932j.m33814a();
        throw null;
    }
}
