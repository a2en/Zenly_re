package kotlinx.coroutines.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.internal.e */
public final class C13088e {
    static {
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static final <E> Set<E> m34155a(int i) {
        Set<E> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i));
        C12932j.m33815a((Object) newSetFromMap, "Collections.newSetFromMa…ityHashMap(expectedSize))");
        return newSetFromMap;
    }
}
