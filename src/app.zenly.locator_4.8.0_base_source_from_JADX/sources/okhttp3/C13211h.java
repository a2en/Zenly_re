package okhttp3;

import java.util.concurrent.TimeUnit;

/* renamed from: okhttp3.h */
public final class C13211h {

    /* renamed from: n */
    public static final C13211h f33947n;

    /* renamed from: a */
    private final boolean f33948a;

    /* renamed from: b */
    private final boolean f33949b;

    /* renamed from: c */
    private final int f33950c;

    /* renamed from: d */
    private final int f33951d;

    /* renamed from: e */
    private final boolean f33952e;

    /* renamed from: f */
    private final boolean f33953f;

    /* renamed from: g */
    private final boolean f33954g;

    /* renamed from: h */
    private final int f33955h;

    /* renamed from: i */
    private final int f33956i;

    /* renamed from: j */
    private final boolean f33957j;

    /* renamed from: k */
    private final boolean f33958k;

    /* renamed from: l */
    private final boolean f33959l;

    /* renamed from: m */
    String f33960m;

    /* renamed from: okhttp3.h$a */
    public static final class C13212a {

        /* renamed from: a */
        boolean f33961a;

        /* renamed from: b */
        boolean f33962b;

        /* renamed from: c */
        int f33963c = -1;

        /* renamed from: d */
        int f33964d = -1;

        /* renamed from: e */
        int f33965e = -1;

        /* renamed from: f */
        boolean f33966f;

        /* renamed from: g */
        boolean f33967g;

        /* renamed from: h */
        boolean f33968h;

        /* renamed from: a */
        public C13212a mo37952a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f33964d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public C13212a mo37954b() {
            this.f33961a = true;
            return this;
        }

        /* renamed from: c */
        public C13212a mo37955c() {
            this.f33962b = true;
            return this;
        }

        /* renamed from: d */
        public C13212a mo37956d() {
            this.f33966f = true;
            return this;
        }

        /* renamed from: a */
        public C13211h mo37953a() {
            return new C13211h(this);
        }
    }

    static {
        C13212a aVar = new C13212a();
        aVar.mo37954b();
        aVar.mo37953a();
        C13212a aVar2 = new C13212a();
        aVar2.mo37956d();
        aVar2.mo37952a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        f33947n = aVar2.mo37953a();
    }

    private C13211h(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f33948a = z;
        this.f33949b = z2;
        this.f33950c = i;
        this.f33951d = i2;
        this.f33952e = z3;
        this.f33953f = z4;
        this.f33954g = z5;
        this.f33955h = i3;
        this.f33956i = i4;
        this.f33957j = z6;
        this.f33958k = z7;
        this.f33959l = z8;
        this.f33960m = str;
    }

    /* renamed from: j */
    private String m34618j() {
        StringBuilder sb = new StringBuilder();
        if (this.f33948a) {
            sb.append("no-cache, ");
        }
        if (this.f33949b) {
            sb.append("no-store, ");
        }
        String str = ", ";
        if (this.f33950c != -1) {
            sb.append("max-age=");
            sb.append(this.f33950c);
            sb.append(str);
        }
        if (this.f33951d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f33951d);
            sb.append(str);
        }
        if (this.f33952e) {
            sb.append("private, ");
        }
        if (this.f33953f) {
            sb.append("public, ");
        }
        if (this.f33954g) {
            sb.append("must-revalidate, ");
        }
        if (this.f33955h != -1) {
            sb.append("max-stale=");
            sb.append(this.f33955h);
            sb.append(str);
        }
        if (this.f33956i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f33956i);
            sb.append(str);
        }
        if (this.f33957j) {
            sb.append("only-if-cached, ");
        }
        if (this.f33958k) {
            sb.append("no-transform, ");
        }
        if (this.f33959l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo37942a() {
        return this.f33952e;
    }

    /* renamed from: b */
    public boolean mo37943b() {
        return this.f33953f;
    }

    /* renamed from: c */
    public int mo37944c() {
        return this.f33950c;
    }

    /* renamed from: d */
    public int mo37945d() {
        return this.f33955h;
    }

    /* renamed from: e */
    public int mo37946e() {
        return this.f33956i;
    }

    /* renamed from: f */
    public boolean mo37947f() {
        return this.f33954g;
    }

    /* renamed from: g */
    public boolean mo37948g() {
        return this.f33948a;
    }

    /* renamed from: h */
    public boolean mo37949h() {
        return this.f33949b;
    }

    /* renamed from: i */
    public boolean mo37950i() {
        return this.f33957j;
    }

    public String toString() {
        String str = this.f33960m;
        if (str != null) {
            return str;
        }
        String j = m34618j();
        this.f33960m = j;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.C13211h m34617a(okhttp3.C13317r r22) {
        /*
            r0 = r22
            int r1 = r22.mo38266c()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0146
            java.lang.String r2 = r0.mo38260a(r6)
            java.lang.String r4 = r0.mo38263b(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x013f
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x013f
            java.lang.String r3 = "=,;"
            int r3 = okhttp3.internal.http.C13248d.m34784a(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = okhttp3.internal.http.C13248d.m34791b(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = okhttp3.internal.http.C13248d.m34784a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = okhttp3.internal.http.C13248d.m34784a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x013a
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x013a
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c5
            r5 = -1
            int r0 = okhttp3.internal.http.C13248d.m34783a(r0, r5)
            r11 = r0
            goto L_0x013a
        L_0x00c5:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d5
            r5 = -1
            int r0 = okhttp3.internal.http.C13248d.m34783a(r0, r5)
            r12 = r0
            goto L_0x013a
        L_0x00d5:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e0
            r5 = -1
            r13 = 1
            goto L_0x013a
        L_0x00e0:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00eb
            r5 = -1
            r14 = 1
            goto L_0x013a
        L_0x00eb:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f6
            r5 = -1
            r15 = 1
            goto L_0x013a
        L_0x00f6:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0109
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = okhttp3.internal.http.C13248d.m34783a(r0, r2)
            r16 = r0
            r5 = -1
            goto L_0x013a
        L_0x0109:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0119
            r5 = -1
            int r0 = okhttp3.internal.http.C13248d.m34783a(r0, r5)
            r17 = r0
            goto L_0x013a
        L_0x0119:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r18 = 1
            goto L_0x013a
        L_0x0125:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0130
            r19 = 1
            goto L_0x013a
        L_0x0130:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x013a
            r20 = 1
        L_0x013a:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x013f:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0146:
            if (r7 != 0) goto L_0x014b
            r21 = 0
            goto L_0x014d
        L_0x014b:
            r21 = r8
        L_0x014d:
            okhttp3.h r0 = new okhttp3.h
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13211h.m34617a(okhttp3.r):okhttp3.h");
    }

    C13211h(C13212a aVar) {
        this.f33948a = aVar.f33961a;
        this.f33949b = aVar.f33962b;
        this.f33950c = aVar.f33963c;
        this.f33951d = -1;
        this.f33952e = false;
        this.f33953f = false;
        this.f33954g = false;
        this.f33955h = aVar.f33964d;
        this.f33956i = aVar.f33965e;
        this.f33957j = aVar.f33966f;
        this.f33958k = aVar.f33967g;
        this.f33959l = aVar.f33968h;
    }
}
