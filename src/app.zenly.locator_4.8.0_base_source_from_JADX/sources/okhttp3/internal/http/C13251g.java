package okhttp3.internal.http;

import okhttp3.C13170b0;
import okhttp3.C13321t;
import okio.BufferedSource;

/* renamed from: okhttp3.internal.http.g */
public final class C13251g extends C13170b0 {

    /* renamed from: f */
    private final String f34136f;

    /* renamed from: g */
    private final long f34137g;

    /* renamed from: h */
    private final BufferedSource f34138h;

    public C13251g(String str, long j, BufferedSource bufferedSource) {
        this.f34136f = str;
        this.f34137g = j;
        this.f34138h = bufferedSource;
    }

    /* renamed from: d */
    public long mo37827d() {
        return this.f34137g;
    }

    /* renamed from: e */
    public C13321t mo37828e() {
        String str = this.f34136f;
        if (str != null) {
            return C13321t.m35172b(str);
        }
        return null;
    }

    /* renamed from: f */
    public BufferedSource mo37829f() {
        return this.f34138h;
    }
}
