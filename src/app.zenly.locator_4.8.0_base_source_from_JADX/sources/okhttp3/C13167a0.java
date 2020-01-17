package okhttp3;

import java.io.Closeable;
import okhttp3.C13317r.C13318a;
import okhttp3.internal.connection.C13231d;

/* renamed from: okhttp3.a0 */
public final class C13167a0 implements Closeable {

    /* renamed from: e */
    final C13331y f33791e;

    /* renamed from: f */
    final C13328w f33792f;

    /* renamed from: g */
    final int f33793g;

    /* renamed from: h */
    final String f33794h;

    /* renamed from: i */
    final C13316q f33795i;

    /* renamed from: j */
    final C13317r f33796j;

    /* renamed from: k */
    final C13170b0 f33797k;

    /* renamed from: l */
    final C13167a0 f33798l;

    /* renamed from: m */
    final C13167a0 f33799m;

    /* renamed from: n */
    final C13167a0 f33800n;

    /* renamed from: o */
    final long f33801o;

    /* renamed from: p */
    final long f33802p;

    /* renamed from: q */
    final C13231d f33803q;

    /* renamed from: r */
    private volatile C13211h f33804r;

    /* renamed from: okhttp3.a0$a */
    public static class C13168a {

        /* renamed from: a */
        C13331y f33805a;

        /* renamed from: b */
        C13328w f33806b;

        /* renamed from: c */
        int f33807c;

        /* renamed from: d */
        String f33808d;

        /* renamed from: e */
        C13316q f33809e;

        /* renamed from: f */
        C13318a f33810f;

        /* renamed from: g */
        C13170b0 f33811g;

        /* renamed from: h */
        C13167a0 f33812h;

        /* renamed from: i */
        C13167a0 f33813i;

        /* renamed from: j */
        C13167a0 f33814j;

        /* renamed from: k */
        long f33815k;

        /* renamed from: l */
        long f33816l;

        /* renamed from: m */
        C13231d f33817m;

        public C13168a() {
            this.f33807c = -1;
            this.f33810f = new C13318a();
        }

        /* renamed from: d */
        private void m34415d(C13167a0 a0Var) {
            if (a0Var.f33797k != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C13168a mo37815a(C13331y yVar) {
            this.f33805a = yVar;
            return this;
        }

        /* renamed from: b */
        public C13168a mo37819b(String str, String str2) {
            this.f33810f.mo38277d(str, str2);
            return this;
        }

        /* renamed from: c */
        public C13168a mo37821c(C13167a0 a0Var) {
            if (a0Var != null) {
                m34415d(a0Var);
            }
            this.f33814j = a0Var;
            return this;
        }

        /* renamed from: a */
        public C13168a mo37814a(C13328w wVar) {
            this.f33806b = wVar;
            return this;
        }

        /* renamed from: b */
        public C13168a mo37820b(C13167a0 a0Var) {
            if (a0Var != null) {
                m34414a("networkResponse", a0Var);
            }
            this.f33812h = a0Var;
            return this;
        }

        /* renamed from: a */
        public C13168a mo37806a(int i) {
            this.f33807c = i;
            return this;
        }

        C13168a(C13167a0 a0Var) {
            this.f33807c = -1;
            this.f33805a = a0Var.f33791e;
            this.f33806b = a0Var.f33792f;
            this.f33807c = a0Var.f33793g;
            this.f33808d = a0Var.f33794h;
            this.f33809e = a0Var.f33795i;
            this.f33810f = a0Var.f33796j.mo38265b();
            this.f33811g = a0Var.f33797k;
            this.f33812h = a0Var.f33798l;
            this.f33813i = a0Var.f33799m;
            this.f33814j = a0Var.f33800n;
            this.f33815k = a0Var.f33801o;
            this.f33816l = a0Var.f33802p;
            this.f33817m = a0Var.f33803q;
        }

        /* renamed from: a */
        public C13168a mo37808a(String str) {
            this.f33808d = str;
            return this;
        }

        /* renamed from: b */
        public C13168a mo37818b(long j) {
            this.f33815k = j;
            return this;
        }

        /* renamed from: a */
        public C13168a mo37812a(C13316q qVar) {
            this.f33809e = qVar;
            return this;
        }

        /* renamed from: a */
        public C13168a mo37809a(String str, String str2) {
            this.f33810f.mo38271a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C13168a mo37813a(C13317r rVar) {
            this.f33810f = rVar.mo38265b();
            return this;
        }

        /* renamed from: a */
        public C13168a mo37811a(C13170b0 b0Var) {
            this.f33811g = b0Var;
            return this;
        }

        /* renamed from: a */
        public C13168a mo37810a(C13167a0 a0Var) {
            if (a0Var != null) {
                m34414a("cacheResponse", a0Var);
            }
            this.f33813i = a0Var;
            return this;
        }

        /* renamed from: a */
        private void m34414a(String str, C13167a0 a0Var) {
            if (a0Var.f33797k != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (a0Var.f33798l != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (a0Var.f33799m != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (a0Var.f33800n != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* renamed from: a */
        public C13168a mo37807a(long j) {
            this.f33816l = j;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo37817a(C13231d dVar) {
            this.f33817m = dVar;
        }

        /* renamed from: a */
        public C13167a0 mo37816a() {
            if (this.f33805a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f33806b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f33807c < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("code < 0: ");
                sb.append(this.f33807c);
                throw new IllegalStateException(sb.toString());
            } else if (this.f33808d != null) {
                return new C13167a0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    C13167a0(C13168a aVar) {
        this.f33791e = aVar.f33805a;
        this.f33792f = aVar.f33806b;
        this.f33793g = aVar.f33807c;
        this.f33794h = aVar.f33808d;
        this.f33795i = aVar.f33809e;
        this.f33796j = aVar.f33810f.mo38272a();
        this.f33797k = aVar.f33811g;
        this.f33798l = aVar.f33812h;
        this.f33799m = aVar.f33813i;
        this.f33800n = aVar.f33814j;
        this.f33801o = aVar.f33815k;
        this.f33802p = aVar.f33816l;
        this.f33803q = aVar.f33817m;
    }

    /* renamed from: a */
    public String mo37787a(String str) {
        return mo37788a(str, null);
    }

    /* renamed from: b */
    public C13211h mo37790b() {
        C13211h hVar = this.f33804r;
        if (hVar != null) {
            return hVar;
        }
        C13211h a = C13211h.m34617a(this.f33796j);
        this.f33804r = a;
        return a;
    }

    /* renamed from: c */
    public C13167a0 mo37791c() {
        return this.f33799m;
    }

    public void close() {
        C13170b0 b0Var = this.f33797k;
        if (b0Var != null) {
            b0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: d */
    public int mo37793d() {
        return this.f33793g;
    }

    /* renamed from: e */
    public C13316q mo37794e() {
        return this.f33795i;
    }

    /* renamed from: f */
    public C13317r mo37795f() {
        return this.f33796j;
    }

    /* renamed from: g */
    public boolean mo37796g() {
        int i = this.f33793g;
        return i >= 200 && i < 300;
    }

    /* renamed from: h */
    public String mo37797h() {
        return this.f33794h;
    }

    /* renamed from: i */
    public C13167a0 mo37798i() {
        return this.f33798l;
    }

    /* renamed from: j */
    public C13168a mo37799j() {
        return new C13168a(this);
    }

    /* renamed from: k */
    public C13167a0 mo37800k() {
        return this.f33800n;
    }

    /* renamed from: l */
    public C13328w mo37801l() {
        return this.f33792f;
    }

    /* renamed from: m */
    public long mo37802m() {
        return this.f33802p;
    }

    /* renamed from: n */
    public C13331y mo37803n() {
        return this.f33791e;
    }

    /* renamed from: o */
    public long mo37804o() {
        return this.f33801o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.f33792f);
        sb.append(", code=");
        sb.append(this.f33793g);
        sb.append(", message=");
        sb.append(this.f33794h);
        sb.append(", url=");
        sb.append(this.f33791e.mo38389g());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public String mo37788a(String str, String str2) {
        String a = this.f33796j.mo38261a(str);
        return a != null ? a : str2;
    }

    /* renamed from: a */
    public C13170b0 mo37789a() {
        return this.f33797k;
    }
}
