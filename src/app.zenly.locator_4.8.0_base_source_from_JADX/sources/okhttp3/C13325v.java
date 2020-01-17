package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13317r.C13318a;
import okhttp3.Call.Factory;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.C13231d;
import okhttp3.internal.connection.C13237g;
import okhttp3.internal.p423ws.C13295b;
import okhttp3.internal.tls.C13292c;
import okhttp3.internal.tls.C13293d;
import okhttp3.p418f0.C13182c;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.p420h.C13202e;
import okhttp3.p418f0.p421i.C13203a;

/* renamed from: okhttp3.v */
public class C13325v implements Cloneable, Factory, WebSocket.Factory {

    /* renamed from: G */
    static final List<C13328w> f34500G = C13184e.m34498a((T[]) new C13328w[]{C13328w.HTTP_2, C13328w.HTTP_1_1});

    /* renamed from: H */
    static final List<C13307l> f34501H = C13184e.m34498a((T[]) new C13307l[]{C13307l.f34410g, C13307l.f34412i});

    /* renamed from: A */
    final boolean f34502A;

    /* renamed from: B */
    final int f34503B;

    /* renamed from: C */
    final int f34504C;

    /* renamed from: D */
    final int f34505D;

    /* renamed from: E */
    final int f34506E;

    /* renamed from: F */
    final int f34507F;

    /* renamed from: e */
    final C13312n f34508e;

    /* renamed from: f */
    final Proxy f34509f;

    /* renamed from: g */
    final List<C13328w> f34510g;

    /* renamed from: h */
    final List<C13307l> f34511h;

    /* renamed from: i */
    final List<Interceptor> f34512i;

    /* renamed from: j */
    final List<Interceptor> f34513j;

    /* renamed from: k */
    final EventListener.Factory f34514k;

    /* renamed from: l */
    final ProxySelector f34515l;

    /* renamed from: m */
    final CookieJar f34516m;

    /* renamed from: n */
    final C13204g f34517n;

    /* renamed from: o */
    final InternalCache f34518o;

    /* renamed from: p */
    final SocketFactory f34519p;

    /* renamed from: q */
    final SSLSocketFactory f34520q;

    /* renamed from: r */
    final C13292c f34521r;

    /* renamed from: s */
    final HostnameVerifier f34522s;

    /* renamed from: t */
    final C13213i f34523t;

    /* renamed from: u */
    final Authenticator f34524u;

    /* renamed from: v */
    final Authenticator f34525v;

    /* renamed from: w */
    final C13306k f34526w;

    /* renamed from: x */
    final Dns f34527x;

    /* renamed from: y */
    final boolean f34528y;

    /* renamed from: z */
    final boolean f34529z;

    /* renamed from: okhttp3.v$a */
    class C13326a extends C13182c {
        C13326a() {
        }

        /* renamed from: a */
        public void mo37870a(C13318a aVar, String str) {
            aVar.mo38270a(str);
        }

        /* renamed from: a */
        public void mo37871a(C13318a aVar, String str, String str2) {
            aVar.mo38274b(str, str2);
        }

        /* renamed from: a */
        public C13237g mo37867a(C13306k kVar) {
            return kVar.f34407a;
        }

        /* renamed from: a */
        public boolean mo37872a(C13177e eVar, C13177e eVar2) {
            return eVar.mo37842a(eVar2);
        }

        /* renamed from: a */
        public int mo37864a(C13168a aVar) {
            return aVar.f33807c;
        }

        /* renamed from: a */
        public void mo37869a(C13307l lVar, SSLSocket sSLSocket, boolean z) {
            lVar.mo38221a(sSLSocket, z);
        }

        /* renamed from: a */
        public Call mo37865a(C13325v vVar, C13331y yVar) {
            return C13329x.m35248a(vVar, yVar, true);
        }

        /* renamed from: a */
        public void mo37868a(C13168a aVar, C13231d dVar) {
            aVar.mo37817a(dVar);
        }

        /* renamed from: a */
        public C13231d mo37866a(C13167a0 a0Var) {
            return a0Var.f33803q;
        }
    }

    /* renamed from: okhttp3.v$b */
    public static final class C13327b {

        /* renamed from: A */
        int f34530A;

        /* renamed from: B */
        int f34531B;

        /* renamed from: a */
        C13312n f34532a;

        /* renamed from: b */
        Proxy f34533b;

        /* renamed from: c */
        List<C13328w> f34534c;

        /* renamed from: d */
        List<C13307l> f34535d;

        /* renamed from: e */
        final List<Interceptor> f34536e;

        /* renamed from: f */
        final List<Interceptor> f34537f;

        /* renamed from: g */
        EventListener.Factory f34538g;

        /* renamed from: h */
        ProxySelector f34539h;

        /* renamed from: i */
        CookieJar f34540i;

        /* renamed from: j */
        C13204g f34541j;

        /* renamed from: k */
        InternalCache f34542k;

        /* renamed from: l */
        SocketFactory f34543l;

        /* renamed from: m */
        SSLSocketFactory f34544m;

        /* renamed from: n */
        C13292c f34545n;

        /* renamed from: o */
        HostnameVerifier f34546o;

        /* renamed from: p */
        C13213i f34547p;

        /* renamed from: q */
        Authenticator f34548q;

        /* renamed from: r */
        Authenticator f34549r;

        /* renamed from: s */
        C13306k f34550s;

        /* renamed from: t */
        Dns f34551t;

        /* renamed from: u */
        boolean f34552u;

        /* renamed from: v */
        boolean f34553v;

        /* renamed from: w */
        boolean f34554w;

        /* renamed from: x */
        int f34555x;

        /* renamed from: y */
        int f34556y;

        /* renamed from: z */
        int f34557z;

        public C13327b() {
            this.f34536e = new ArrayList();
            this.f34537f = new ArrayList();
            this.f34532a = new C13312n();
            this.f34534c = C13325v.f34500G;
            this.f34535d = C13325v.f34501H;
            this.f34538g = EventListener.m34373a(EventListener.f33789a);
            this.f34539h = ProxySelector.getDefault();
            if (this.f34539h == null) {
                this.f34539h = new C13203a();
            }
            this.f34540i = CookieJar.f33787a;
            this.f34543l = SocketFactory.getDefault();
            this.f34546o = C13293d.f34323a;
            this.f34547p = C13213i.f33969c;
            Authenticator authenticator = Authenticator.f33786a;
            this.f34548q = authenticator;
            this.f34549r = authenticator;
            this.f34550s = new C13306k();
            this.f34551t = Dns.f33788a;
            this.f34552u = true;
            this.f34553v = true;
            this.f34554w = true;
            this.f34555x = 0;
            this.f34556y = 10000;
            this.f34557z = 10000;
            this.f34530A = 10000;
            this.f34531B = 0;
        }

        /* renamed from: a */
        public C13327b mo38356a(long j, TimeUnit timeUnit) {
            this.f34556y = C13184e.m34486a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C13327b mo38368b(long j, TimeUnit timeUnit) {
            this.f34557z = C13184e.m34486a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C13327b mo38371c(long j, TimeUnit timeUnit) {
            this.f34530A = C13184e.m34486a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public C13327b mo38363a(C13204g gVar) {
            this.f34541j = gVar;
            this.f34542k = null;
            return this;
        }

        /* renamed from: b */
        public C13327b mo38369b(List<C13328w> list) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.contains(C13328w.H2_PRIOR_KNOWLEDGE) && !arrayList.contains(C13328w.HTTP_1_1)) {
                StringBuilder sb = new StringBuilder();
                sb.append("protocols must contain h2_prior_knowledge or http/1.1: ");
                sb.append(arrayList);
                throw new IllegalArgumentException(sb.toString());
            } else if (arrayList.contains(C13328w.H2_PRIOR_KNOWLEDGE) && arrayList.size() > 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("protocols containing h2_prior_knowledge cannot use other protocols: ");
                sb2.append(arrayList);
                throw new IllegalArgumentException(sb2.toString());
            } else if (arrayList.contains(C13328w.HTTP_1_0)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("protocols must not contain http/1.0: ");
                sb3.append(arrayList);
                throw new IllegalArgumentException(sb3.toString());
            } else if (!arrayList.contains(null)) {
                arrayList.remove(C13328w.SPDY_3);
                this.f34534c = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        /* renamed from: a */
        public C13327b mo38359a(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.f34544m = sSLSocketFactory;
                this.f34545n = C13202e.m34581d().mo37918a(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        /* renamed from: a */
        public C13327b mo38360a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.f34544m = sSLSocketFactory;
                this.f34545n = C13292c.m35003a(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        /* renamed from: a */
        public C13327b mo38358a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f34546o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        /* renamed from: a */
        public C13327b mo38364a(C13213i iVar) {
            if (iVar != null) {
                this.f34547p = iVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        /* renamed from: b */
        public C13327b mo38370b(Interceptor interceptor) {
            if (interceptor != null) {
                this.f34537f.add(interceptor);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public C13327b mo38366a(boolean z) {
            this.f34554w = z;
            return this;
        }

        /* renamed from: a */
        public C13327b mo38365a(C13312n nVar) {
            if (nVar != null) {
                this.f34532a = nVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        /* renamed from: a */
        public C13327b mo38357a(List<C13307l> list) {
            this.f34535d = C13184e.m34496a(list);
            return this;
        }

        /* renamed from: a */
        public C13327b mo38362a(Interceptor interceptor) {
            if (interceptor != null) {
                this.f34536e.add(interceptor);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public C13327b mo38361a(EventListener eventListener) {
            if (eventListener != null) {
                this.f34538g = EventListener.m34373a(eventListener);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        /* renamed from: a */
        public C13325v mo38367a() {
            return new C13325v(this);
        }

        C13327b(C13325v vVar) {
            this.f34536e = new ArrayList();
            this.f34537f = new ArrayList();
            this.f34532a = vVar.f34508e;
            this.f34533b = vVar.f34509f;
            this.f34534c = vVar.f34510g;
            this.f34535d = vVar.f34511h;
            this.f34536e.addAll(vVar.f34512i);
            this.f34537f.addAll(vVar.f34513j);
            this.f34538g = vVar.f34514k;
            this.f34539h = vVar.f34515l;
            this.f34540i = vVar.f34516m;
            this.f34542k = vVar.f34518o;
            this.f34541j = vVar.f34517n;
            this.f34543l = vVar.f34519p;
            this.f34544m = vVar.f34520q;
            this.f34545n = vVar.f34521r;
            this.f34546o = vVar.f34522s;
            this.f34547p = vVar.f34523t;
            this.f34548q = vVar.f34524u;
            this.f34549r = vVar.f34525v;
            this.f34550s = vVar.f34526w;
            this.f34551t = vVar.f34527x;
            this.f34552u = vVar.f34528y;
            this.f34553v = vVar.f34529z;
            this.f34554w = vVar.f34502A;
            this.f34555x = vVar.f34503B;
            this.f34556y = vVar.f34504C;
            this.f34557z = vVar.f34505D;
            this.f34530A = vVar.f34506E;
            this.f34531B = vVar.f34507F;
        }
    }

    static {
        C13182c.f33853a = new C13326a();
    }

    public C13325v() {
        this(new C13327b());
    }

    /* renamed from: a */
    private static SSLSocketFactory m35192a(X509TrustManager x509TrustManager) {
        try {
            SSLContext b = C13202e.m34581d().mo37902b();
            b.init(null, new TrustManager[]{x509TrustManager}, null);
            return b.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* renamed from: A */
    public SSLSocketFactory mo38328A() {
        return this.f34520q;
    }

    /* renamed from: B */
    public int mo38329B() {
        return this.f34506E;
    }

    /* renamed from: b */
    public C13204g mo38331b() {
        return this.f34517n;
    }

    /* renamed from: c */
    public int mo38332c() {
        return this.f34503B;
    }

    /* renamed from: d */
    public C13213i mo38333d() {
        return this.f34523t;
    }

    /* renamed from: e */
    public int mo38334e() {
        return this.f34504C;
    }

    /* renamed from: f */
    public C13306k mo38335f() {
        return this.f34526w;
    }

    /* renamed from: g */
    public List<C13307l> mo38336g() {
        return this.f34511h;
    }

    /* renamed from: h */
    public CookieJar mo38337h() {
        return this.f34516m;
    }

    /* renamed from: i */
    public C13312n mo38338i() {
        return this.f34508e;
    }

    /* renamed from: j */
    public Dns mo38339j() {
        return this.f34527x;
    }

    /* renamed from: k */
    public EventListener.Factory mo38340k() {
        return this.f34514k;
    }

    /* renamed from: l */
    public boolean mo38341l() {
        return this.f34529z;
    }

    /* renamed from: m */
    public boolean mo38342m() {
        return this.f34528y;
    }

    /* renamed from: n */
    public HostnameVerifier mo38343n() {
        return this.f34522s;
    }

    public Call newCall(C13331y yVar) {
        return C13329x.m35248a(this, yVar, false);
    }

    public WebSocket newWebSocket(C13331y yVar, C13178e0 e0Var) {
        C13295b bVar = new C13295b(yVar, e0Var, new Random(), (long) this.f34507F);
        bVar.mo38206a(this);
        return bVar;
    }

    /* renamed from: o */
    public List<Interceptor> mo38344o() {
        return this.f34512i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public InternalCache mo38345p() {
        C13204g gVar = this.f34517n;
        return gVar != null ? gVar.f33915e : this.f34518o;
    }

    /* renamed from: q */
    public List<Interceptor> mo38346q() {
        return this.f34513j;
    }

    /* renamed from: r */
    public C13327b mo38347r() {
        return new C13327b(this);
    }

    /* renamed from: s */
    public int mo38348s() {
        return this.f34507F;
    }

    /* renamed from: t */
    public List<C13328w> mo38349t() {
        return this.f34510g;
    }

    /* renamed from: u */
    public Proxy mo38350u() {
        return this.f34509f;
    }

    /* renamed from: v */
    public Authenticator mo38351v() {
        return this.f34524u;
    }

    /* renamed from: w */
    public ProxySelector mo38352w() {
        return this.f34515l;
    }

    /* renamed from: x */
    public int mo38353x() {
        return this.f34505D;
    }

    /* renamed from: y */
    public boolean mo38354y() {
        return this.f34502A;
    }

    /* renamed from: z */
    public SocketFactory mo38355z() {
        return this.f34519p;
    }

    C13325v(C13327b bVar) {
        boolean z;
        this.f34508e = bVar.f34532a;
        this.f34509f = bVar.f34533b;
        this.f34510g = bVar.f34534c;
        this.f34511h = bVar.f34535d;
        this.f34512i = C13184e.m34496a(bVar.f34536e);
        this.f34513j = C13184e.m34496a(bVar.f34537f);
        this.f34514k = bVar.f34538g;
        this.f34515l = bVar.f34539h;
        this.f34516m = bVar.f34540i;
        this.f34517n = bVar.f34541j;
        this.f34518o = bVar.f34542k;
        this.f34519p = bVar.f34543l;
        Iterator it = this.f34511h.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C13307l lVar = (C13307l) it.next();
                if (z || lVar.mo38223b()) {
                    z = true;
                }
            }
        }
        if (bVar.f34544m != null || !z) {
            this.f34520q = bVar.f34544m;
            this.f34521r = bVar.f34545n;
        } else {
            X509TrustManager a = C13184e.m34501a();
            this.f34520q = m35192a(a);
            this.f34521r = C13292c.m35003a(a);
        }
        if (this.f34520q != null) {
            C13202e.m34581d().mo37914b(this.f34520q);
        }
        this.f34522s = bVar.f34546o;
        this.f34523t = bVar.f34547p.mo37958a(this.f34521r);
        this.f34524u = bVar.f34548q;
        this.f34525v = bVar.f34549r;
        this.f34526w = bVar.f34550s;
        this.f34527x = bVar.f34551t;
        this.f34528y = bVar.f34552u;
        this.f34529z = bVar.f34553v;
        this.f34502A = bVar.f34554w;
        this.f34503B = bVar.f34555x;
        this.f34504C = bVar.f34556y;
        this.f34505D = bVar.f34557z;
        this.f34506E = bVar.f34530A;
        this.f34507F = bVar.f34531B;
        if (this.f34512i.contains(null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Null interceptor: ");
            sb.append(this.f34512i);
            throw new IllegalStateException(sb.toString());
        } else if (this.f34513j.contains(null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Null network interceptor: ");
            sb2.append(this.f34513j);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public Authenticator mo38330a() {
        return this.f34525v;
    }
}
