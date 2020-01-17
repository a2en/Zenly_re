package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.C13342c;

/* renamed from: okhttp3.p */
public final class C13314p extends C13333z {

    /* renamed from: c */
    private static final C13321t f34450c = C13321t.m35171a("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f34451a;

    /* renamed from: b */
    private final List<String> f34452b;

    /* renamed from: okhttp3.p$a */
    public static final class C13315a {

        /* renamed from: a */
        private final List<String> f34453a;

        /* renamed from: b */
        private final List<String> f34454b;

        /* renamed from: c */
        private final Charset f34455c;

        public C13315a() {
            this(null);
        }

        /* renamed from: a */
        public C13315a mo38250a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.f34453a.add(C13319s.m35117a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f34455c));
                String str4 = str2;
                this.f34454b.add(C13319s.m35117a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f34455c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: b */
        public C13315a mo38252b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.f34453a.add(C13319s.m35117a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f34455c));
                String str4 = str2;
                this.f34454b.add(C13319s.m35117a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f34455c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public C13315a(Charset charset) {
            this.f34453a = new ArrayList();
            this.f34454b = new ArrayList();
            this.f34455c = charset;
        }

        /* renamed from: a */
        public C13314p mo38251a() {
            return new C13314p(this.f34453a, this.f34454b);
        }
    }

    C13314p(List<String> list, List<String> list2) {
        this.f34451a = C13184e.m34496a(list);
        this.f34452b = C13184e.m34496a(list2);
    }

    /* renamed from: a */
    public long mo32976a() {
        return m35081a(null, true);
    }

    /* renamed from: b */
    public C13321t mo32978b() {
        return f34450c;
    }

    /* renamed from: a */
    public void mo32977a(BufferedSink bufferedSink) throws IOException {
        m35081a(bufferedSink, false);
    }

    /* renamed from: a */
    private long m35081a(BufferedSink bufferedSink, boolean z) {
        C13342c cVar;
        if (z) {
            cVar = new C13342c();
        } else {
            cVar = bufferedSink.buffer();
        }
        int size = this.f34451a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.writeByte(38);
            }
            cVar.writeUtf8((String) this.f34451a.get(i));
            cVar.writeByte(61);
            cVar.writeUtf8((String) this.f34452b.get(i));
        }
        if (!z) {
            return 0;
        }
        long b = cVar.mo38488b();
        cVar.clear();
        return b;
    }
}
