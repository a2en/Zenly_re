package okhttp3.internal.http2;

import okhttp3.p418f0.C13184e;
import okio.C13346d;

/* renamed from: okhttp3.internal.http2.b */
public final class C13257b {

    /* renamed from: d */
    public static final C13346d f34158d = C13346d.m35334d(":");

    /* renamed from: e */
    public static final C13346d f34159e = C13346d.m35334d(":status");

    /* renamed from: f */
    public static final C13346d f34160f = C13346d.m35334d(":method");

    /* renamed from: g */
    public static final C13346d f34161g = C13346d.m35334d(":path");

    /* renamed from: h */
    public static final C13346d f34162h = C13346d.m35334d(":scheme");

    /* renamed from: i */
    public static final C13346d f34163i = C13346d.m35334d(":authority");

    /* renamed from: a */
    public final C13346d f34164a;

    /* renamed from: b */
    public final C13346d f34165b;

    /* renamed from: c */
    final int f34166c;

    public C13257b(String str, String str2) {
        this(C13346d.m35334d(str), C13346d.m35334d(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13257b)) {
            return false;
        }
        C13257b bVar = (C13257b) obj;
        if (!this.f34164a.equals(bVar.f34164a) || !this.f34165b.equals(bVar.f34165b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f34164a.hashCode()) * 31) + this.f34165b.hashCode();
    }

    public String toString() {
        return C13184e.m34490a("%s: %s", this.f34164a.mo38532j(), this.f34165b.mo38532j());
    }

    public C13257b(C13346d dVar, String str) {
        this(dVar, C13346d.m35334d(str));
    }

    public C13257b(C13346d dVar, C13346d dVar2) {
        this.f34164a = dVar;
        this.f34165b = dVar2;
        this.f34166c = dVar.mo38528g() + 32 + dVar2.mo38528g();
    }
}
