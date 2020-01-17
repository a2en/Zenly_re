package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.C13174c0;
import okhttp3.C13177e;
import okhttp3.C13319s;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.internal.connection.i */
final class C13239i {

    /* renamed from: a */
    private final C13177e f34094a;

    /* renamed from: b */
    private final C13238h f34095b;

    /* renamed from: c */
    private final Call f34096c;

    /* renamed from: d */
    private final EventListener f34097d;

    /* renamed from: e */
    private List<Proxy> f34098e = Collections.emptyList();

    /* renamed from: f */
    private int f34099f;

    /* renamed from: g */
    private List<InetSocketAddress> f34100g = Collections.emptyList();

    /* renamed from: h */
    private final List<C13174c0> f34101h = new ArrayList();

    /* renamed from: okhttp3.internal.connection.i$a */
    public static final class C13240a {

        /* renamed from: a */
        private final List<C13174c0> f34102a;

        /* renamed from: b */
        private int f34103b = 0;

        C13240a(List<C13174c0> list) {
            this.f34102a = list;
        }

        /* renamed from: a */
        public List<C13174c0> mo38051a() {
            return new ArrayList(this.f34102a);
        }

        /* renamed from: b */
        public boolean mo38052b() {
            return this.f34103b < this.f34102a.size();
        }

        /* renamed from: c */
        public C13174c0 mo38053c() {
            if (mo38052b()) {
                List<C13174c0> list = this.f34102a;
                int i = this.f34103b;
                this.f34103b = i + 1;
                return (C13174c0) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    C13239i(C13177e eVar, C13238h hVar, Call call, EventListener eventListener) {
        this.f34094a = eVar;
        this.f34095b = hVar;
        this.f34096c = call;
        this.f34097d = eventListener;
        m34753a(eVar.mo37854k(), eVar.mo37848f());
    }

    /* renamed from: c */
    private boolean m34754c() {
        return this.f34099f < this.f34098e.size();
    }

    /* renamed from: d */
    private Proxy m34755d() throws IOException {
        if (m34754c()) {
            List<Proxy> list = this.f34098e;
            int i = this.f34099f;
            this.f34099f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m34752a(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.f34094a.mo37854k().mo38288g());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.f34098e);
        throw new SocketException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo38049a() {
        return m34754c() || !this.f34101h.isEmpty();
    }

    /* renamed from: b */
    public C13240a mo38050b() throws IOException {
        if (mo38049a()) {
            ArrayList arrayList = new ArrayList();
            while (m34754c()) {
                Proxy d = m34755d();
                int size = this.f34100g.size();
                for (int i = 0; i < size; i++) {
                    C13174c0 c0Var = new C13174c0(this.f34094a, d, (InetSocketAddress) this.f34100g.get(i));
                    if (this.f34095b.mo38048c(c0Var)) {
                        this.f34101h.add(c0Var);
                    } else {
                        arrayList.add(c0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f34101h);
                this.f34101h.clear();
            }
            return new C13240a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private void m34753a(C13319s sVar, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f34098e = Collections.singletonList(proxy);
        } else {
            List select = this.f34094a.mo37850h().select(sVar.mo38298p());
            if (select == null || select.isEmpty()) {
                list = C13184e.m34498a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = C13184e.m34496a(select);
            }
            this.f34098e = list;
        }
        this.f34099f = 0;
    }

    /* renamed from: a */
    private void m34752a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f34100g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f34094a.mo37854k().mo38288g();
            i = this.f34094a.mo37854k().mo38293k();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m34751a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i < 1 || i > 65535) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.f34100g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f34097d.mo37750a(this.f34096c, str);
            List lookup = this.f34094a.mo37844c().lookup(str);
            if (!lookup.isEmpty()) {
                this.f34097d.mo37751a(this.f34096c, str, lookup);
                int size = lookup.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f34100g.add(new InetSocketAddress((InetAddress) lookup.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f34094a.mo37844c());
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    /* renamed from: a */
    static String m34751a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
