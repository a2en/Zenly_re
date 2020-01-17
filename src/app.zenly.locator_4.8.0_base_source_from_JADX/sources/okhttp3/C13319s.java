package okhttp3;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.p418f0.C13184e;
import okio.C13342c;

/* renamed from: okhttp3.s */
public final class C13319s {

    /* renamed from: j */
    private static final char[] f34462j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f34463a;

    /* renamed from: b */
    private final String f34464b;

    /* renamed from: c */
    private final String f34465c;

    /* renamed from: d */
    final String f34466d;

    /* renamed from: e */
    final int f34467e;

    /* renamed from: f */
    private final List<String> f34468f;

    /* renamed from: g */
    private final List<String> f34469g;

    /* renamed from: h */
    private final String f34470h;

    /* renamed from: i */
    private final String f34471i;

    /* renamed from: okhttp3.s$a */
    public static final class C13320a {

        /* renamed from: a */
        String f34472a;

        /* renamed from: b */
        String f34473b;

        /* renamed from: c */
        String f34474c;

        /* renamed from: d */
        String f34475d;

        /* renamed from: e */
        int f34476e = -1;

        /* renamed from: f */
        final List<String> f34477f = new ArrayList();

        /* renamed from: g */
        List<String> f34478g;

        /* renamed from: h */
        String f34479h;

        public C13320a() {
            String str = "";
            this.f34473b = str;
            this.f34474c = str;
            this.f34477f.add(str);
        }

        /* renamed from: g */
        private boolean m35156g(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: h */
        private boolean m35157h(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: a */
        public C13320a mo38300a(int i) {
            if (i <= 0 || i > 65535) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected port: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f34476e = i;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo38305b() {
            int i = this.f34476e;
            return i != -1 ? i : C13319s.m35125d(this.f34472a);
        }

        /* renamed from: c */
        public C13320a mo38309c(String str) {
            if (str != null) {
                String a = m35148a(str, 0, str.length());
                if (a != null) {
                    this.f34475d = a;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: d */
        public C13320a mo38310d(String str) {
            if (str != null) {
                this.f34474c = C13319s.m35116a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: e */
        public C13320a mo38311e(String str) {
            if (str != null) {
                String str2 = "http";
                if (str.equalsIgnoreCase(str2)) {
                    this.f34472a = str2;
                } else {
                    String str3 = "https";
                    if (str.equalsIgnoreCase(str3)) {
                        this.f34472a = str3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unexpected scheme: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: f */
        public C13320a mo38312f(String str) {
            if (str != null) {
                this.f34473b = C13319s.m35116a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f34472a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f34473b.isEmpty() || !this.f34474c.isEmpty()) {
                sb.append(this.f34473b);
                if (!this.f34474c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f34474c);
                }
                sb.append('@');
            }
            String str2 = this.f34475d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f34475d);
                    sb.append(']');
                } else {
                    sb.append(this.f34475d);
                }
            }
            if (!(this.f34476e == -1 && this.f34472a == null)) {
                int b = mo38305b();
                String str3 = this.f34472a;
                if (str3 == null || b != C13319s.m35125d(str3)) {
                    sb.append(':');
                    sb.append(b);
                }
            }
            C13319s.m35124b(sb, this.f34477f);
            if (this.f34478g != null) {
                sb.append('?');
                C13319s.m35120a(sb, this.f34478g);
            }
            if (this.f34479h != null) {
                sb.append('#');
                sb.append(this.f34479h);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public C13320a mo38306b(String str) {
            List<String> list;
            if (str != null) {
                list = C13319s.m35128g(C13319s.m35116a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f34478g = list;
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: d */
        private void m35153d(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f34477f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f34477f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f34477f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.p418f0.C13184e.m34485a(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m35149a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13319s.C13320a.m35153d(java.lang.String, int, int):void");
        }

        /* renamed from: f */
        private static int m35155f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        public C13320a mo38301a(String str) {
            if (str != null) {
                m35149a(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        /* renamed from: a */
        public C13320a mo38302a(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f34478g == null) {
                    this.f34478g = new ArrayList();
                }
                this.f34478g.add(C13319s.m35116a(str, " \"'<>#&=", true, false, true, true));
                List<String> list = this.f34478g;
                if (str2 != null) {
                    str3 = C13319s.m35116a(str2, " \"'<>#&=", true, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: b */
        public C13320a mo38307b(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f34478g == null) {
                    this.f34478g = new ArrayList();
                }
                this.f34478g.add(C13319s.m35116a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                List<String> list = this.f34478g;
                if (str2 != null) {
                    str3 = C13319s.m35116a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C13320a mo38308c() {
            int size = this.f34477f.size();
            for (int i = 0; i < size; i++) {
                this.f34477f.set(i, C13319s.m35116a((String) this.f34477f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f34478g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = (String) this.f34478g.get(i2);
                    if (str != null) {
                        this.f34478g.set(i2, C13319s.m35116a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f34479h;
            if (str2 != null) {
                this.f34479h = C13319s.m35116a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: e */
        private static int m35154e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: d */
        private void m35152d() {
            List<String> list = this.f34477f;
            String str = "";
            if (!((String) list.remove(list.size() - 1)).isEmpty() || this.f34477f.isEmpty()) {
                this.f34477f.add(str);
                return;
            }
            List<String> list2 = this.f34477f;
            list2.set(list2.size() - 1, str);
        }

        /* renamed from: b */
        private static int m35150b(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C13319s.m35114a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: a */
        public C13319s mo38304a() {
            if (this.f34472a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f34475d != null) {
                return new C13319s(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* renamed from: c */
        private static int m35151c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13320a mo38303a(C13319s sVar, String str) {
            int a;
            int i;
            C13319s sVar2 = sVar;
            String str2 = str;
            int b = C13184e.m34512b(str2, 0, str.length());
            int c = C13184e.m34518c(str2, b, str.length());
            int e = m35154e(str2, b, c);
            if (e != -1) {
                if (str.regionMatches(true, b, "https:", 0, 6)) {
                    this.f34472a = "https";
                    b += 6;
                } else {
                    if (str.regionMatches(true, b, "http:", 0, 5)) {
                        this.f34472a = "http";
                        b += 5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        sb.append(str2.substring(0, e));
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (sVar2 != null) {
                this.f34472a = sVar2.f34463a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int f = m35155f(str2, b, c);
            char c2 = '?';
            char c3 = '#';
            if (f >= 2 || sVar2 == null || !sVar2.f34463a.equals(this.f34472a)) {
                int i2 = b + f;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C13184e.m34485a(str2, i2, c, "@/\\?#");
                    char charAt = a != c ? str2.charAt(a) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = a;
                        int c4 = m35151c(str2, i2, i3);
                        int i4 = c4 + 1;
                    } else {
                        if (charAt == '@') {
                            String str3 = "%40";
                            if (!z) {
                                int a2 = C13184e.m34484a(str2, i2, a, ':');
                                int i5 = a2;
                                String str4 = str3;
                                i = a;
                                String a3 = C13319s.m35114a(str, i2, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.f34473b);
                                    sb2.append(str4);
                                    sb2.append(a3);
                                    a3 = sb2.toString();
                                }
                                this.f34473b = a3;
                                if (i5 != i) {
                                    this.f34474c = C13319s.m35114a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                String str5 = str3;
                                i = a;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f34474c);
                                sb3.append(str5);
                                sb3.append(C13319s.m35114a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.f34474c = sb3.toString();
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = a;
                int c42 = m35151c(str2, i2, i32);
                int i42 = c42 + 1;
                if (i42 < i32) {
                    this.f34475d = m35148a(str2, i2, c42);
                    this.f34476e = m35150b(str2, i42, i32);
                    if (this.f34476e == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.f34475d = m35148a(str2, i2, c42);
                    this.f34476e = C13319s.m35125d(this.f34472a);
                }
                if (this.f34475d != null) {
                    b = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, c42));
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.f34473b = sVar.mo38287f();
                this.f34474c = sVar.mo38280b();
                this.f34475d = sVar2.f34466d;
                this.f34476e = sVar2.f34467e;
                this.f34477f.clear();
                this.f34477f.addAll(sVar.mo38284d());
                if (b == c || str2.charAt(b) == '#') {
                    mo38306b(sVar.mo38285e());
                }
            }
            int a4 = C13184e.m34485a(str2, b, c, "?#");
            m35153d(str2, b, a4);
            if (a4 < c && str2.charAt(a4) == '?') {
                int a5 = C13184e.m34484a(str2, a4, c, '#');
                this.f34478g = C13319s.m35128g(C13319s.m35114a(str, a4 + 1, a5, " \"'<>#", true, false, true, true, null));
                a4 = a5;
            }
            if (a4 < c && str2.charAt(a4) == '#') {
                this.f34479h = C13319s.m35114a(str, 1 + a4, c, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: a */
        private void m35149a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C13319s.m35114a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (!m35156g(a)) {
                if (m35157h(a)) {
                    m35152d();
                    return;
                }
                List<String> list = this.f34477f;
                if (((String) list.get(list.size() - 1)).isEmpty()) {
                    List<String> list2 = this.f34477f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f34477f.add(a);
                }
                if (z) {
                    this.f34477f.add("");
                }
            }
        }

        /* renamed from: a */
        private static String m35148a(String str, int i, int i2) {
            return C13184e.m34488a(C13319s.m35115a(str, i, i2, false));
        }
    }

    C13319s(C13320a aVar) {
        this.f34463a = aVar.f34472a;
        this.f34464b = m35118a(aVar.f34473b, false);
        this.f34465c = m35118a(aVar.f34474c, false);
        this.f34466d = aVar.f34475d;
        this.f34467e = aVar.mo38305b();
        this.f34468f = m35119a(aVar.f34477f, false);
        List<String> list = aVar.f34478g;
        String str = null;
        this.f34469g = list != null ? m35119a(list, true) : null;
        String str2 = aVar.f34479h;
        if (str2 != null) {
            str = m35118a(str2, false);
        }
        this.f34470h = str;
        this.f34471i = aVar.toString();
    }

    /* renamed from: a */
    static void m35120a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: d */
    public static int m35125d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: b */
    public String mo38280b() {
        if (this.f34465c.isEmpty()) {
            return "";
        }
        return this.f34471i.substring(this.f34471i.indexOf(58, this.f34463a.length() + 3) + 1, this.f34471i.indexOf(64));
    }

    /* renamed from: c */
    public String mo38282c() {
        int indexOf = this.f34471i.indexOf(47, this.f34463a.length() + 3);
        String str = this.f34471i;
        return this.f34471i.substring(indexOf, C13184e.m34485a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: e */
    public String mo38285e() {
        if (this.f34469g == null) {
            return null;
        }
        int indexOf = this.f34471i.indexOf(63) + 1;
        String str = this.f34471i;
        return this.f34471i.substring(indexOf, C13184e.m34484a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13319s) && ((C13319s) obj).f34471i.equals(this.f34471i);
    }

    /* renamed from: f */
    public String mo38287f() {
        if (this.f34464b.isEmpty()) {
            return "";
        }
        int length = this.f34463a.length() + 3;
        String str = this.f34471i;
        return this.f34471i.substring(length, C13184e.m34485a(str, length, str.length(), ":@"));
    }

    /* renamed from: g */
    public String mo38288g() {
        return this.f34466d;
    }

    /* renamed from: h */
    public boolean mo38289h() {
        return this.f34463a.equals("https");
    }

    public int hashCode() {
        return this.f34471i.hashCode();
    }

    /* renamed from: i */
    public C13320a mo38291i() {
        C13320a aVar = new C13320a();
        aVar.f34472a = this.f34463a;
        aVar.f34473b = mo38287f();
        aVar.f34474c = mo38280b();
        aVar.f34475d = this.f34466d;
        aVar.f34476e = this.f34467e != m35125d(this.f34463a) ? this.f34467e : -1;
        aVar.f34477f.clear();
        aVar.f34477f.addAll(mo38284d());
        aVar.mo38306b(mo38285e());
        aVar.f34479h = mo38278a();
        return aVar;
    }

    /* renamed from: j */
    public List<String> mo38292j() {
        return this.f34468f;
    }

    /* renamed from: k */
    public int mo38293k() {
        return this.f34467e;
    }

    /* renamed from: l */
    public String mo38294l() {
        if (this.f34469g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m35120a(sb, this.f34469g);
        return sb.toString();
    }

    /* renamed from: m */
    public int mo38295m() {
        List<String> list = this.f34469g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    /* renamed from: n */
    public String mo38296n() {
        C13320a a = mo38279a("/...");
        String str = "";
        a.mo38312f(str);
        a.mo38310d(str);
        return a.mo38304a().toString();
    }

    /* renamed from: o */
    public String mo38297o() {
        return this.f34463a;
    }

    /* renamed from: p */
    public URI mo38298p() {
        C13320a i = mo38291i();
        i.mo38308c();
        String aVar = i.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        return this.f34471i;
    }

    /* renamed from: g */
    static List<String> m35128g(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<String> mo38284d() {
        int indexOf = this.f34471i.indexOf(47, this.f34463a.length() + 3);
        String str = this.f34471i;
        int a = C13184e.m34485a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C13184e.m34484a(this.f34471i, i, a, '/');
            arrayList.add(this.f34471i.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: c */
    public C13319s mo38283c(String str) {
        C13320a a = mo38279a(str);
        if (a != null) {
            return a.mo38304a();
        }
        return null;
    }

    /* renamed from: b */
    static void m35124b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
    }

    /* renamed from: e */
    public static C13319s m35126e(String str) {
        C13320a aVar = new C13320a();
        aVar.mo38303a((C13319s) null, str);
        return aVar.mo38304a();
    }

    /* renamed from: f */
    public static C13319s m35127f(String str) {
        try {
            return m35126e(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo38278a() {
        if (this.f34470h == null) {
            return null;
        }
        return this.f34471i.substring(this.f34471i.indexOf(35) + 1);
    }

    /* renamed from: b */
    public String mo38281b(String str) {
        List<String> list = this.f34469g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f34469g.get(i))) {
                return (String) this.f34469g.get(i + 1);
            }
        }
        return null;
    }

    /* renamed from: a */
    public C13320a mo38279a(String str) {
        try {
            C13320a aVar = new C13320a();
            aVar.mo38303a(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m35118a(String str, boolean z) {
        return m35115a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m35119a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m35118a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m35115a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C13342c cVar = new C13342c();
                cVar.writeUtf8(str, i, i3);
                m35122a(cVar, str, i3, i2, z);
                return cVar.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m35122a(C13342c cVar, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = C13184e.m34483a(str.charAt(i + 1));
                    int a2 = C13184e.m34483a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        cVar.writeByte((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    cVar.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                cVar.writeByte(32);
                i += Character.charCount(codePointAt);
            }
            cVar.writeUtf8CodePoint(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m35123a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C13184e.m34483a(str.charAt(i + 1)) == -1 || C13184e.m34483a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m35114a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m35123a(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C13342c cVar = new C13342c();
            int i5 = i;
            cVar.writeUtf8(str, i, i4);
            m35121a(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return cVar.readUtf8();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m35121a(C13342c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C13342c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.writeUtf8(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m35123a(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new C13342c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.writeUtf8CodePoint(codePointAt);
                    } else {
                        cVar2.writeString(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.exhausted()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        cVar.writeByte((int) f34462j[(readByte >> 4) & 15]);
                        cVar.writeByte((int) f34462j[readByte & 15]);
                    }
                } else {
                    cVar.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static String m35117a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m35114a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: a */
    static String m35116a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m35114a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
