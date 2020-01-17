package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.C13237g;

/* renamed from: okhttp3.k */
public final class C13306k {

    /* renamed from: a */
    final C13237g f34407a;

    public C13306k() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C13306k(int i, long j, TimeUnit timeUnit) {
        this.f34407a = new C13237g(i, j, timeUnit);
    }
}
