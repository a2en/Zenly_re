package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13211h;
import okhttp3.C13317r;
import okhttp3.C13317r.C13318a;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.internal.http.C13246c;
import okhttp3.internal.http.C13248d;
import okhttp3.p418f0.C13182c;

/* renamed from: okhttp3.internal.cache.b */
public final class C13218b {

    /* renamed from: a */
    public final C13331y f33982a;

    /* renamed from: b */
    public final C13167a0 f33983b;

    /* renamed from: okhttp3.internal.cache.b$a */
    public static class C13219a {

        /* renamed from: a */
        final long f33984a;

        /* renamed from: b */
        final C13331y f33985b;

        /* renamed from: c */
        final C13167a0 f33986c;

        /* renamed from: d */
        private Date f33987d;

        /* renamed from: e */
        private String f33988e;

        /* renamed from: f */
        private Date f33989f;

        /* renamed from: g */
        private String f33990g;

        /* renamed from: h */
        private Date f33991h;

        /* renamed from: i */
        private long f33992i;

        /* renamed from: j */
        private long f33993j;

        /* renamed from: k */
        private String f33994k;

        /* renamed from: l */
        private int f33995l = -1;

        public C13219a(long j, C13331y yVar, C13167a0 a0Var) {
            this.f33984a = j;
            this.f33985b = yVar;
            this.f33986c = a0Var;
            if (a0Var != null) {
                this.f33992i = a0Var.mo37804o();
                this.f33993j = a0Var.mo37802m();
                C13317r f = a0Var.mo37795f();
                int c = f.mo38266c();
                for (int i = 0; i < c; i++) {
                    String a = f.mo38260a(i);
                    String b = f.mo38263b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.f33987d = C13246c.m34782a(b);
                        this.f33988e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.f33991h = C13246c.m34782a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f33989f = C13246c.m34782a(b);
                        this.f33990g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.f33994k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.f33995l = C13248d.m34783a(b, -1);
                    }
                }
            }
        }

        /* renamed from: b */
        private long m34649b() {
            Date date = this.f33987d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f33993j - date.getTime());
            }
            int i = this.f33995l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f33993j;
            return j + (j2 - this.f33992i) + (this.f33984a - j2);
        }

        /* renamed from: c */
        private long m34650c() {
            long j;
            long j2;
            C13211h b = this.f33986c.mo37790b();
            if (b.mo37944c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b.mo37944c());
            }
            long j3 = 0;
            if (this.f33991h != null) {
                Date date = this.f33987d;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.f33993j;
                }
                long time = this.f33991h.getTime() - j2;
                if (time > 0) {
                    j3 = time;
                }
                return j3;
            }
            if (this.f33989f != null && this.f33986c.mo37803n().mo38389g().mo38294l() == null) {
                Date date2 = this.f33987d;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.f33992i;
                }
                long time2 = j - this.f33989f.getTime();
                if (time2 > 0) {
                    j3 = time2 / 10;
                }
            }
            return j3;
        }

        /* renamed from: d */
        private C13218b m34651d() {
            if (this.f33986c == null) {
                return new C13218b(this.f33985b, null);
            }
            if (this.f33985b.mo38386d() && this.f33986c.mo37794e() == null) {
                return new C13218b(this.f33985b, null);
            }
            if (!C13218b.m34647a(this.f33986c, this.f33985b)) {
                return new C13218b(this.f33985b, null);
            }
            C13211h b = this.f33985b.mo38384b();
            if (b.mo37948g() || m34648a(this.f33985b)) {
                return new C13218b(this.f33985b, null);
            }
            C13211h b2 = this.f33986c.mo37790b();
            long b3 = m34649b();
            long c = m34650c();
            if (b.mo37944c() != -1) {
                c = Math.min(c, TimeUnit.SECONDS.toMillis((long) b.mo37944c()));
            }
            long j = 0;
            long millis = b.mo37946e() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo37946e()) : 0;
            if (!b2.mo37947f() && b.mo37945d() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo37945d());
            }
            if (!b2.mo37948g()) {
                long j2 = millis + b3;
                if (j2 < j + c) {
                    C13168a j3 = this.f33986c.mo37799j();
                    String str = "Warning";
                    if (j2 >= c) {
                        j3.mo37809a(str, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (b3 > 86400000 && m34652e()) {
                        j3.mo37809a(str, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C13218b(null, j3.mo37816a());
                }
            }
            String str2 = this.f33994k;
            String str3 = "If-Modified-Since";
            if (str2 != null) {
                str3 = "If-None-Match";
            } else if (this.f33989f != null) {
                str2 = this.f33990g;
            } else if (this.f33987d == null) {
                return new C13218b(this.f33985b, null);
            } else {
                str2 = this.f33988e;
            }
            C13318a b4 = this.f33985b.mo38385c().mo38265b();
            C13182c.f33853a.mo37871a(b4, str3, str2);
            C13332a f = this.f33985b.mo38388f();
            f.mo38397a(b4.mo38272a());
            return new C13218b(f.mo38400a(), this.f33986c);
        }

        /* renamed from: e */
        private boolean m34652e() {
            return this.f33986c.mo37790b().mo37944c() == -1 && this.f33991h == null;
        }

        /* renamed from: a */
        public C13218b mo37968a() {
            C13218b d = m34651d();
            return (d.f33982a == null || !this.f33985b.mo38384b().mo37950i()) ? d : new C13218b(null, null);
        }

        /* renamed from: a */
        private static boolean m34648a(C13331y yVar) {
            return (yVar.mo38381a("If-Modified-Since") == null && yVar.mo38381a("If-None-Match") == null) ? false : true;
        }
    }

    C13218b(C13331y yVar, C13167a0 a0Var) {
        this.f33982a = yVar;
        this.f33983b = a0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo37790b().mo37942a() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m34647a(okhttp3.C13167a0 r3, okhttp3.C13331y r4) {
        /*
            int r0 = r3.mo37793d()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo37787a(r0)
            if (r0 != 0) goto L_0x005a
            okhttp3.h r0 = r3.mo37790b()
            int r0 = r0.mo37944c()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            okhttp3.h r0 = r3.mo37790b()
            boolean r0 = r0.mo37943b()
            if (r0 != 0) goto L_0x005a
            okhttp3.h r0 = r3.mo37790b()
            boolean r0 = r0.mo37942a()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            okhttp3.h r3 = r3.mo37790b()
            boolean r3 = r3.mo37949h()
            if (r3 != 0) goto L_0x006f
            okhttp3.h r3 = r4.mo38384b()
            boolean r3 = r3.mo37949h()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13218b.m34647a(okhttp3.a0, okhttp3.y):boolean");
    }
}
