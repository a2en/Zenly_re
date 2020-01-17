package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

public abstract class EventListener {

    /* renamed from: a */
    public static final EventListener f33789a = new C13165a();

    public interface Factory {
        EventListener create(Call call);
    }

    /* renamed from: okhttp3.EventListener$a */
    class C13165a extends EventListener {
        C13165a() {
        }
    }

    /* renamed from: a */
    static Factory m34373a(EventListener eventListener) {
        return new C13175d(eventListener);
    }

    /* renamed from: a */
    static /* synthetic */ EventListener m34374a(EventListener eventListener, Call call) {
        return eventListener;
    }

    /* renamed from: a */
    public void mo37747a(Call call) {
    }

    /* renamed from: a */
    public void mo37748a(Call call, long j) {
    }

    /* renamed from: a */
    public void mo37749a(Call call, IOException iOException) {
    }

    /* renamed from: a */
    public void mo37750a(Call call, String str) {
    }

    /* renamed from: a */
    public void mo37751a(Call call, String str, List<InetAddress> list) {
    }

    /* renamed from: a */
    public void mo37752a(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    /* renamed from: a */
    public void mo37753a(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, C13328w wVar) {
    }

    /* renamed from: a */
    public void mo37754a(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, C13328w wVar, IOException iOException) {
    }

    /* renamed from: a */
    public void mo37755a(Call call, Connection connection) {
    }

    /* renamed from: a */
    public void mo37756a(Call call, C13167a0 a0Var) {
    }

    /* renamed from: a */
    public void mo37757a(Call call, C13316q qVar) {
    }

    /* renamed from: a */
    public void mo37758a(Call call, C13331y yVar) {
    }

    /* renamed from: b */
    public void mo37759b(Call call) {
    }

    /* renamed from: b */
    public void mo37760b(Call call, long j) {
    }

    /* renamed from: b */
    public void mo37761b(Call call, IOException iOException) {
    }

    /* renamed from: b */
    public void mo37762b(Call call, Connection connection) {
    }

    /* renamed from: c */
    public void mo37763c(Call call) {
    }

    /* renamed from: c */
    public void mo37764c(Call call, IOException iOException) {
    }

    /* renamed from: d */
    public void mo37765d(Call call) {
    }

    /* renamed from: e */
    public void mo37766e(Call call) {
    }

    /* renamed from: f */
    public void mo37767f(Call call) {
    }

    /* renamed from: g */
    public void mo37768g(Call call) {
    }
}
