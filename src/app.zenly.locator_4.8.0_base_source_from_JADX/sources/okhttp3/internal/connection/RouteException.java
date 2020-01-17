package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.p418f0.C13184e;

public final class RouteException extends RuntimeException {

    /* renamed from: e */
    private IOException f34037e;

    /* renamed from: f */
    private IOException f34038f;

    RouteException(IOException iOException) {
        super(iOException);
        this.f34037e = iOException;
        this.f34038f = iOException;
    }

    /* renamed from: a */
    public IOException mo37996a() {
        return this.f34037e;
    }

    /* renamed from: b */
    public IOException mo37998b() {
        return this.f34038f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo37997a(IOException iOException) {
        C13184e.m34504a((Throwable) this.f34037e, (Throwable) iOException);
        this.f34038f = iOException;
    }
}
