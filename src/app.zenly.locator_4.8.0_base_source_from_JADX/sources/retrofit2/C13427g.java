package retrofit2;

import java.io.IOException;
import okhttp3.C13314p.C13315a;
import okhttp3.C13317r;
import okhttp3.C13319s;
import okhttp3.C13319s.C13320a;
import okhttp3.C13321t;
import okhttp3.C13322u;
import okhttp3.C13322u.C13323a;
import okhttp3.C13322u.C13324b;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import okio.BufferedSink;
import okio.C13342c;

/* renamed from: retrofit2.g */
final class C13427g {

    /* renamed from: k */
    private static final char[] f34812k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f34813a;

    /* renamed from: b */
    private final C13319s f34814b;

    /* renamed from: c */
    private String f34815c;

    /* renamed from: d */
    private C13320a f34816d;

    /* renamed from: e */
    private final C13332a f34817e = new C13332a();

    /* renamed from: f */
    private C13321t f34818f;

    /* renamed from: g */
    private final boolean f34819g;

    /* renamed from: h */
    private C13323a f34820h;

    /* renamed from: i */
    private C13315a f34821i;

    /* renamed from: j */
    private C13333z f34822j;

    /* renamed from: retrofit2.g$a */
    private static class C13428a extends C13333z {

        /* renamed from: a */
        private final C13333z f34823a;

        /* renamed from: b */
        private final C13321t f34824b;

        C13428a(C13333z zVar, C13321t tVar) {
            this.f34823a = zVar;
            this.f34824b = tVar;
        }

        /* renamed from: a */
        public long mo32976a() throws IOException {
            return this.f34823a.mo32976a();
        }

        /* renamed from: b */
        public C13321t mo32978b() {
            return this.f34824b;
        }

        /* renamed from: a */
        public void mo32977a(BufferedSink bufferedSink) throws IOException {
            this.f34823a.mo32977a(bufferedSink);
        }
    }

    C13427g(String str, C13319s sVar, String str2, C13317r rVar, C13321t tVar, boolean z, boolean z2, boolean z3) {
        this.f34813a = str;
        this.f34814b = sVar;
        this.f34815c = str2;
        this.f34818f = tVar;
        this.f34819g = z;
        if (rVar != null) {
            this.f34817e.mo38397a(rVar);
        }
        if (z2) {
            this.f34821i = new C13315a();
        } else if (z3) {
            this.f34820h = new C13323a();
            this.f34820h.mo38325a(C13322u.f34487f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38655a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            C13321t b = C13321t.m35172b(str2);
            if (b != null) {
                this.f34818f = b;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Malformed content type: ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f34817e.mo38394a(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38660b(String str, String str2, boolean z) {
        String str3 = this.f34815c;
        if (str3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append(str);
            sb.append("}");
            this.f34815c = str3.replace(sb.toString(), m35533a(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo38661c(String str, String str2, boolean z) {
        String str3 = this.f34815c;
        if (str3 != null) {
            this.f34816d = this.f34814b.mo38279a(str3);
            if (this.f34816d != null) {
                this.f34815c = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.f34814b);
                sb.append(", Relative: ");
                sb.append(this.f34815c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.f34816d.mo38302a(str, str2);
        } else {
            this.f34816d.mo38307b(str, str2);
        }
    }

    /* renamed from: a */
    private static String m35533a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C13342c cVar = new C13342c();
                cVar.writeUtf8(str, 0, i);
                m35534a(cVar, str, i, length, z);
                return cVar.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: a */
    private static void m35534a(C13342c cVar, String str, int i, int i2, boolean z) {
        C13342c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new C13342c();
                    }
                    cVar2.writeUtf8CodePoint(codePointAt);
                    while (!cVar2.exhausted()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        cVar.writeByte((int) f34812k[(readByte >> 4) & 15]);
                        cVar.writeByte((int) f34812k[readByte & 15]);
                    }
                } else {
                    cVar.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38656a(String str, String str2, boolean z) {
        if (z) {
            this.f34821i.mo38252b(str, str2);
        } else {
            this.f34821i.mo38250a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38657a(C13317r rVar, C13333z zVar) {
        this.f34820h.mo38324a(rVar, zVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38658a(C13324b bVar) {
        this.f34820h.mo38326a(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38659a(C13333z zVar) {
        this.f34822j = zVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13331y mo38654a() {
        C13319s sVar;
        C13320a aVar = this.f34816d;
        if (aVar != null) {
            sVar = aVar.mo38304a();
        } else {
            sVar = this.f34814b.mo38283c(this.f34815c);
            if (sVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.f34814b);
                sb.append(", Relative: ");
                sb.append(this.f34815c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C13333z zVar = this.f34822j;
        if (zVar == null) {
            C13315a aVar2 = this.f34821i;
            if (aVar2 != null) {
                zVar = aVar2.mo38251a();
            } else {
                C13323a aVar3 = this.f34820h;
                if (aVar3 != null) {
                    zVar = aVar3.mo38327a();
                } else if (this.f34819g) {
                    zVar = C13333z.m35283a((C13321t) null, new byte[0]);
                }
            }
        }
        C13321t tVar = this.f34818f;
        if (tVar != null) {
            if (zVar != null) {
                zVar = new C13428a(zVar, tVar);
            } else {
                this.f34817e.mo38394a("Content-Type", tVar.toString());
            }
        }
        C13332a aVar4 = this.f34817e;
        aVar4.mo38398a(sVar);
        aVar4.mo38395a(this.f34813a, zVar);
        return aVar4.mo38400a();
    }
}
