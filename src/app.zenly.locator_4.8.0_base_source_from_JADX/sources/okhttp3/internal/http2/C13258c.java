package okhttp3.internal.http2;

import com.appsflyer.share.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;
import okio.C13354l;
import okio.Source;

/* renamed from: okhttp3.internal.http2.c */
final class C13258c {

    /* renamed from: a */
    static final C13257b[] f34167a;

    /* renamed from: b */
    static final Map<C13346d, Integer> f34168b = m34819a();

    /* renamed from: okhttp3.internal.http2.c$a */
    static final class C13259a {

        /* renamed from: a */
        private final List<C13257b> f34169a;

        /* renamed from: b */
        private final BufferedSource f34170b;

        /* renamed from: c */
        private final int f34171c;

        /* renamed from: d */
        private int f34172d;

        /* renamed from: e */
        C13257b[] f34173e;

        /* renamed from: f */
        int f34174f;

        /* renamed from: g */
        int f34175g;

        /* renamed from: h */
        int f34176h;

        C13259a(int i, Source source) {
            this(i, i, source);
        }

        /* renamed from: b */
        private int m34823b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f34173e.length;
                while (true) {
                    length--;
                    if (length < this.f34174f || i <= 0) {
                        C13257b[] bVarArr = this.f34173e;
                        int i3 = this.f34174f;
                        System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i2, this.f34175g);
                        this.f34174f += i2;
                    } else {
                        C13257b[] bVarArr2 = this.f34173e;
                        i -= bVarArr2[length].f34166c;
                        this.f34176h -= bVarArr2[length].f34166c;
                        this.f34175g--;
                        i2++;
                    }
                }
                C13257b[] bVarArr3 = this.f34173e;
                int i32 = this.f34174f;
                System.arraycopy(bVarArr3, i32 + 1, bVarArr3, i32 + 1 + i2, this.f34175g);
                this.f34174f += i2;
            }
            return i2;
        }

        /* renamed from: d */
        private void m34825d() {
            int i = this.f34172d;
            int i2 = this.f34176h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m34827e();
            } else {
                m34823b(i2 - i);
            }
        }

        /* renamed from: e */
        private void m34827e() {
            Arrays.fill(this.f34173e, null);
            this.f34174f = this.f34173e.length - 1;
            this.f34175g = 0;
            this.f34176h = 0;
        }

        /* renamed from: f */
        private void m34830f(int i) throws IOException {
            m34822a(-1, new C13257b(m34824c(i), mo38084b()));
        }

        /* renamed from: g */
        private void m34832g(int i) throws IOException {
            this.f34169a.add(new C13257b(m34824c(i), mo38084b()));
        }

        /* renamed from: h */
        private void m34833h() throws IOException {
            C13346d b = mo38084b();
            C13258c.m34820a(b);
            this.f34169a.add(new C13257b(b, mo38084b()));
        }

        /* renamed from: a */
        public List<C13257b> mo38083a() {
            ArrayList arrayList = new ArrayList(this.f34169a);
            this.f34169a.clear();
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo38085c() throws IOException {
            while (!this.f34170b.exhausted()) {
                byte readByte = this.f34170b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m34828e(mo38082a((int) readByte, 127) - 1);
                } else if (readByte == 64) {
                    m34831g();
                } else if ((readByte & 64) == 64) {
                    m34830f(mo38082a((int) readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.f34172d = mo38082a((int) readByte, 31);
                    int i = this.f34172d;
                    if (i < 0 || i > this.f34171c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.f34172d);
                        throw new IOException(sb.toString());
                    }
                    m34825d();
                } else if (readByte == 16 || readByte == 0) {
                    m34833h();
                } else {
                    m34832g(mo38082a((int) readByte, 15) - 1);
                }
            }
        }

        C13259a(int i, int i2, Source source) {
            this.f34169a = new ArrayList();
            this.f34173e = new C13257b[8];
            this.f34174f = this.f34173e.length - 1;
            this.f34175g = 0;
            this.f34176h = 0;
            this.f34171c = i;
            this.f34172d = i2;
            this.f34170b = C13354l.m35375a(source);
        }

        /* renamed from: a */
        private int m34821a(int i) {
            return this.f34174f + 1 + i;
        }

        /* renamed from: a */
        private void m34822a(int i, C13257b bVar) {
            this.f34169a.add(bVar);
            int i2 = bVar.f34166c;
            if (i != -1) {
                i2 -= this.f34173e[m34821a(i)].f34166c;
            }
            int i3 = this.f34172d;
            if (i2 > i3) {
                m34827e();
                return;
            }
            int b = m34823b((this.f34176h + i2) - i3);
            if (i == -1) {
                int i4 = this.f34175g + 1;
                C13257b[] bVarArr = this.f34173e;
                if (i4 > bVarArr.length) {
                    C13257b[] bVarArr2 = new C13257b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f34174f = this.f34173e.length - 1;
                    this.f34173e = bVarArr2;
                }
                int i5 = this.f34174f;
                this.f34174f = i5 - 1;
                this.f34173e[i5] = bVar;
                this.f34175g++;
            } else {
                this.f34173e[i + m34821a(i) + b] = bVar;
            }
            this.f34176h += i2;
        }

        /* renamed from: d */
        private boolean m34826d(int i) {
            return i >= 0 && i <= C13258c.f34167a.length - 1;
        }

        /* renamed from: f */
        private int m34829f() throws IOException {
            return this.f34170b.readByte() & 255;
        }

        /* renamed from: g */
        private void m34831g() throws IOException {
            C13346d b = mo38084b();
            C13258c.m34820a(b);
            m34822a(-1, new C13257b(b, mo38084b()));
        }

        /* renamed from: e */
        private void m34828e(int i) throws IOException {
            if (m34826d(i)) {
                this.f34169a.add(C13258c.f34167a[i]);
                return;
            }
            int a = m34821a(i - C13258c.f34167a.length);
            if (a >= 0) {
                C13257b[] bVarArr = this.f34173e;
                if (a < bVarArr.length) {
                    this.f34169a.add(bVarArr[a]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C13346d mo38084b() throws IOException {
            int f = m34829f();
            boolean z = (f & 128) == 128;
            int a = mo38082a(f, 127);
            if (z) {
                return C13346d.m35331a(C13286j.m34981b().mo38168a(this.f34170b.readByteArray((long) a)));
            }
            return this.f34170b.readByteString((long) a);
        }

        /* renamed from: c */
        private C13346d m34824c(int i) throws IOException {
            if (m34826d(i)) {
                return C13258c.f34167a[i].f34164a;
            }
            int a = m34821a(i - C13258c.f34167a.length);
            if (a >= 0) {
                C13257b[] bVarArr = this.f34173e;
                if (a < bVarArr.length) {
                    return bVarArr[a].f34164a;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo38082a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f = m34829f();
                if ((f & 128) == 0) {
                    return i2 + (f << i4);
                }
                i2 += (f & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.c$b */
    static final class C13260b {

        /* renamed from: a */
        private final C13342c f34177a;

        /* renamed from: b */
        private final boolean f34178b;

        /* renamed from: c */
        private int f34179c;

        /* renamed from: d */
        private boolean f34180d;

        /* renamed from: e */
        int f34181e;

        /* renamed from: f */
        C13257b[] f34182f;

        /* renamed from: g */
        int f34183g;

        /* renamed from: h */
        int f34184h;

        /* renamed from: i */
        int f34185i;

        C13260b(C13342c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: a */
        private void m34839a(C13257b bVar) {
            int i = bVar.f34166c;
            int i2 = this.f34181e;
            if (i > i2) {
                m34841b();
                return;
            }
            m34840b((this.f34185i + i) - i2);
            int i3 = this.f34184h + 1;
            C13257b[] bVarArr = this.f34182f;
            if (i3 > bVarArr.length) {
                C13257b[] bVarArr2 = new C13257b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f34183g = this.f34182f.length - 1;
                this.f34182f = bVarArr2;
            }
            int i4 = this.f34183g;
            this.f34183g = i4 - 1;
            this.f34182f[i4] = bVar;
            this.f34184h++;
            this.f34185i += i;
        }

        /* renamed from: b */
        private void m34841b() {
            Arrays.fill(this.f34182f, null);
            this.f34183g = this.f34182f.length - 1;
            this.f34184h = 0;
            this.f34185i = 0;
        }

        C13260b(int i, boolean z, C13342c cVar) {
            this.f34179c = Integer.MAX_VALUE;
            this.f34182f = new C13257b[8];
            this.f34183g = this.f34182f.length - 1;
            this.f34184h = 0;
            this.f34185i = 0;
            this.f34181e = i;
            this.f34178b = z;
            this.f34177a = cVar;
        }

        /* renamed from: b */
        private int m34840b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f34182f.length;
                while (true) {
                    length--;
                    if (length < this.f34183g || i <= 0) {
                        C13257b[] bVarArr = this.f34182f;
                        int i3 = this.f34183g;
                        System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i2, this.f34184h);
                        C13257b[] bVarArr2 = this.f34182f;
                        int i4 = this.f34183g;
                        Arrays.fill(bVarArr2, i4 + 1, i4 + 1 + i2, null);
                        this.f34183g += i2;
                    } else {
                        C13257b[] bVarArr3 = this.f34182f;
                        i -= bVarArr3[length].f34166c;
                        this.f34185i -= bVarArr3[length].f34166c;
                        this.f34184h--;
                        i2++;
                    }
                }
                C13257b[] bVarArr4 = this.f34182f;
                int i32 = this.f34183g;
                System.arraycopy(bVarArr4, i32 + 1, bVarArr4, i32 + 1 + i2, this.f34184h);
                C13257b[] bVarArr22 = this.f34182f;
                int i42 = this.f34183g;
                Arrays.fill(bVarArr22, i42 + 1, i42 + 1 + i2, null);
                this.f34183g += i2;
            }
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38088a(List<C13257b> list) throws IOException {
            int i;
            int i2;
            if (this.f34180d) {
                int i3 = this.f34179c;
                if (i3 < this.f34181e) {
                    mo38087a(i3, 31, 32);
                }
                this.f34180d = false;
                this.f34179c = Integer.MAX_VALUE;
                mo38087a(this.f34181e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C13257b bVar = (C13257b) list.get(i4);
                C13346d h = bVar.f34164a.mo38529h();
                C13346d dVar = bVar.f34165b;
                Integer num = (Integer) C13258c.f34168b.get(h);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (Objects.equals(C13258c.f34167a[i2 - 1].f34165b, dVar)) {
                            i = i2;
                        } else if (Objects.equals(C13258c.f34167a[i2].f34165b, dVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f34183g + 1;
                    int length = this.f34182f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f34182f[i5].f34164a, h)) {
                            if (Objects.equals(this.f34182f[i5].f34165b, dVar)) {
                                i2 = C13258c.f34167a.length + (i5 - this.f34183g);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f34183g) + C13258c.f34167a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo38087a(i2, 127, 128);
                } else if (i == -1) {
                    this.f34177a.writeByte(64);
                    mo38089a(h);
                    mo38089a(dVar);
                    m34839a(bVar);
                } else if (!h.mo38521b(C13257b.f34158d) || C13257b.f34163i.equals(h)) {
                    mo38087a(i, 63, 64);
                    mo38089a(dVar);
                    m34839a(bVar);
                } else {
                    mo38087a(i, 15, 0);
                    mo38089a(dVar);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38087a(int i, int i2, int i3) {
            if (i < i2) {
                this.f34177a.writeByte(i | i3);
                return;
            }
            this.f34177a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f34177a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f34177a.writeByte(i4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38089a(C13346d dVar) throws IOException {
            if (!this.f34178b || C13286j.m34981b().mo38166a(dVar) >= dVar.mo38528g()) {
                mo38087a(dVar.mo38528g(), 127, 0);
                this.f34177a.write(dVar);
                return;
            }
            C13342c cVar = new C13342c();
            C13286j.m34981b().mo38167a(dVar, cVar);
            C13346d readByteString = cVar.readByteString();
            mo38087a(readByteString.mo38528g(), 127, 128);
            this.f34177a.write(readByteString);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38086a(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f34181e;
            if (i2 != min) {
                if (min < i2) {
                    this.f34179c = Math.min(this.f34179c, min);
                }
                this.f34180d = true;
                this.f34181e = min;
                m34838a();
            }
        }

        /* renamed from: a */
        private void m34838a() {
            int i = this.f34181e;
            int i2 = this.f34185i;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m34841b();
            } else {
                m34840b(i2 - i);
            }
        }
    }

    static {
        String str = "";
        f34167a = new C13257b[]{new C13257b(C13257b.f34163i, str), new C13257b(C13257b.f34160f, "GET"), new C13257b(C13257b.f34160f, "POST"), new C13257b(C13257b.f34161g, Constants.URL_PATH_DELIMITER), new C13257b(C13257b.f34161g, "/index.html"), new C13257b(C13257b.f34162h, "http"), new C13257b(C13257b.f34162h, "https"), new C13257b(C13257b.f34159e, "200"), new C13257b(C13257b.f34159e, "204"), new C13257b(C13257b.f34159e, "206"), new C13257b(C13257b.f34159e, "304"), new C13257b(C13257b.f34159e, "400"), new C13257b(C13257b.f34159e, "404"), new C13257b(C13257b.f34159e, "500"), new C13257b("accept-charset", str), new C13257b("accept-encoding", "gzip, deflate"), new C13257b("accept-language", str), new C13257b("accept-ranges", str), new C13257b("accept", str), new C13257b("access-control-allow-origin", str), new C13257b("age", str), new C13257b("allow", str), new C13257b("authorization", str), new C13257b("cache-control", str), new C13257b("content-disposition", str), new C13257b("content-encoding", str), new C13257b("content-language", str), new C13257b("content-length", str), new C13257b("content-location", str), new C13257b("content-range", str), new C13257b("content-type", str), new C13257b("cookie", str), new C13257b("date", str), new C13257b("etag", str), new C13257b("expect", str), new C13257b("expires", str), new C13257b("from", str), new C13257b("host", str), new C13257b("if-match", str), new C13257b("if-modified-since", str), new C13257b("if-none-match", str), new C13257b("if-range", str), new C13257b("if-unmodified-since", str), new C13257b("last-modified", str), new C13257b("link", str), new C13257b("location", str), new C13257b("max-forwards", str), new C13257b("proxy-authenticate", str), new C13257b("proxy-authorization", str), new C13257b("range", str), new C13257b("referer", str), new C13257b("refresh", str), new C13257b("retry-after", str), new C13257b("server", str), new C13257b("set-cookie", str), new C13257b("strict-transport-security", str), new C13257b("transfer-encoding", str), new C13257b("user-agent", str), new C13257b("vary", str), new C13257b("via", str), new C13257b("www-authenticate", str)};
    }

    /* renamed from: a */
    private static Map<C13346d, Integer> m34819a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f34167a.length);
        int i = 0;
        while (true) {
            C13257b[] bVarArr = f34167a;
            if (i >= bVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(bVarArr[i].f34164a)) {
                linkedHashMap.put(f34167a[i].f34164a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* renamed from: a */
    static C13346d m34820a(C13346d dVar) throws IOException {
        int g = dVar.mo38528g();
        int i = 0;
        while (i < g) {
            byte a = dVar.mo38513a(i);
            if (a < 65 || a > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(dVar.mo38532j());
                throw new IOException(sb.toString());
            }
        }
        return dVar;
    }
}
