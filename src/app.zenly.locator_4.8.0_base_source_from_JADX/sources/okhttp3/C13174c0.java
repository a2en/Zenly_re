package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: okhttp3.c0 */
public final class C13174c0 {

    /* renamed from: a */
    final C13177e f33828a;

    /* renamed from: b */
    final Proxy f33829b;

    /* renamed from: c */
    final InetSocketAddress f33830c;

    public C13174c0(C13177e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (eVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f33828a = eVar;
            this.f33829b = proxy;
            this.f33830c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C13177e mo37833a() {
        return this.f33828a;
    }

    /* renamed from: b */
    public Proxy mo37834b() {
        return this.f33829b;
    }

    /* renamed from: c */
    public boolean mo37835c() {
        return this.f33828a.f33847i != null && this.f33829b.type() == Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo37836d() {
        return this.f33830c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13174c0) {
            C13174c0 c0Var = (C13174c0) obj;
            if (c0Var.f33828a.equals(this.f33828a) && c0Var.f33829b.equals(this.f33829b) && c0Var.f33830c.equals(this.f33830c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f33828a.hashCode()) * 31) + this.f33829b.hashCode()) * 31) + this.f33830c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.f33830c);
        sb.append("}");
        return sb.toString();
    }
}
