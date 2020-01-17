package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C13174c0;

/* renamed from: okhttp3.internal.connection.h */
final class C13238h {

    /* renamed from: a */
    private final Set<C13174c0> f34093a = new LinkedHashSet();

    C13238h() {
    }

    /* renamed from: a */
    public synchronized void mo38046a(C13174c0 c0Var) {
        this.f34093a.remove(c0Var);
    }

    /* renamed from: b */
    public synchronized void mo38047b(C13174c0 c0Var) {
        this.f34093a.add(c0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo38048c(C13174c0 c0Var) {
        return this.f34093a.contains(c0Var);
    }
}
