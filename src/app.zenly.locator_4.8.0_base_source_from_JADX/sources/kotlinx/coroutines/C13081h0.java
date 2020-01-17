package kotlinx.coroutines;

import kotlinx.coroutines.internal.C13107n;

/* renamed from: kotlinx.coroutines.h0 */
public final class C13081h0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13107n f33664a = new C13107n("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C13107n f33665b = new C13107n("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m34141a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
