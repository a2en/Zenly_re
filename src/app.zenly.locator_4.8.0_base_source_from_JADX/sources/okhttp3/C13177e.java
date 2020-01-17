package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C13319s.C13320a;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.e */
public final class C13177e {

    /* renamed from: a */
    final C13319s f33839a;

    /* renamed from: b */
    final Dns f33840b;

    /* renamed from: c */
    final SocketFactory f33841c;

    /* renamed from: d */
    final Authenticator f33842d;

    /* renamed from: e */
    final List<C13328w> f33843e;

    /* renamed from: f */
    final List<C13307l> f33844f;

    /* renamed from: g */
    final ProxySelector f33845g;

    /* renamed from: h */
    final Proxy f33846h;

    /* renamed from: i */
    final SSLSocketFactory f33847i;

    /* renamed from: j */
    final HostnameVerifier f33848j;

    /* renamed from: k */
    final C13213i f33849k;

    public C13177e(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C13213i iVar, Authenticator authenticator, Proxy proxy, List<C13328w> list, List<C13307l> list2, ProxySelector proxySelector) {
        C13320a aVar = new C13320a();
        aVar.mo38311e(sSLSocketFactory != null ? "https" : "http");
        aVar.mo38309c(str);
        aVar.mo38300a(i);
        this.f33839a = aVar.mo38304a();
        if (dns != null) {
            this.f33840b = dns;
            if (socketFactory != null) {
                this.f33841c = socketFactory;
                if (authenticator != null) {
                    this.f33842d = authenticator;
                    if (list != null) {
                        this.f33843e = C13184e.m34496a(list);
                        if (list2 != null) {
                            this.f33844f = C13184e.m34496a(list2);
                            if (proxySelector != null) {
                                this.f33845g = proxySelector;
                                this.f33846h = proxy;
                                this.f33847i = sSLSocketFactory;
                                this.f33848j = hostnameVerifier;
                                this.f33849k = iVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    /* renamed from: a */
    public C13213i mo37841a() {
        return this.f33849k;
    }

    /* renamed from: b */
    public List<C13307l> mo37843b() {
        return this.f33844f;
    }

    /* renamed from: c */
    public Dns mo37844c() {
        return this.f33840b;
    }

    /* renamed from: d */
    public HostnameVerifier mo37845d() {
        return this.f33848j;
    }

    /* renamed from: e */
    public List<C13328w> mo37846e() {
        return this.f33843e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13177e) {
            C13177e eVar = (C13177e) obj;
            if (this.f33839a.equals(eVar.f33839a) && mo37842a(eVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public Proxy mo37848f() {
        return this.f33846h;
    }

    /* renamed from: g */
    public Authenticator mo37849g() {
        return this.f33842d;
    }

    /* renamed from: h */
    public ProxySelector mo37850h() {
        return this.f33845g;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f33839a.hashCode()) * 31) + this.f33840b.hashCode()) * 31) + this.f33842d.hashCode()) * 31) + this.f33843e.hashCode()) * 31) + this.f33844f.hashCode()) * 31) + this.f33845g.hashCode()) * 31) + Objects.hashCode(this.f33846h)) * 31) + Objects.hashCode(this.f33847i)) * 31) + Objects.hashCode(this.f33848j)) * 31) + Objects.hashCode(this.f33849k);
    }

    /* renamed from: i */
    public SocketFactory mo37852i() {
        return this.f33841c;
    }

    /* renamed from: j */
    public SSLSocketFactory mo37853j() {
        return this.f33847i;
    }

    /* renamed from: k */
    public C13319s mo37854k() {
        return this.f33839a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f33839a.mo38288g());
        sb.append(":");
        sb.append(this.f33839a.mo38293k());
        if (this.f33846h != null) {
            sb.append(", proxy=");
            sb.append(this.f33846h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f33845g);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo37842a(C13177e eVar) {
        return this.f33840b.equals(eVar.f33840b) && this.f33842d.equals(eVar.f33842d) && this.f33843e.equals(eVar.f33843e) && this.f33844f.equals(eVar.f33844f) && this.f33845g.equals(eVar.f33845g) && Objects.equals(this.f33846h, eVar.f33846h) && Objects.equals(this.f33847i, eVar.f33847i) && Objects.equals(this.f33848j, eVar.f33848j) && Objects.equals(this.f33849k, eVar.f33849k) && mo37854k().mo38293k() == eVar.mo37854k().mo38293k();
    }
}
