package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.n */
public final class C13312n {

    /* renamed from: a */
    private int f34443a = 64;

    /* renamed from: b */
    private int f34444b = 5;

    /* renamed from: c */
    private Runnable f34445c;

    /* renamed from: d */
    private ExecutorService f34446d;

    /* renamed from: e */
    private final Deque<C13330a> f34447e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C13330a> f34448f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C13329x> f34449g = new ArrayDeque();

    public C13312n(ExecutorService executorService) {
        this.f34446d = executorService;
    }

    /* renamed from: c */
    private boolean m35072c() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f34447e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C13330a aVar = (C13330a) it.next();
                if (this.f34448f.size() >= this.f34443a) {
                    break;
                } else if (aVar.mo38378c().get() < this.f34444b) {
                    it.remove();
                    aVar.mo38378c().incrementAndGet();
                    arrayList.add(aVar);
                    this.f34448f.add(aVar);
                }
            }
            z = mo38247b() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C13330a) arrayList.get(i)).mo38376a(mo38243a());
        }
        return z;
    }

    /* renamed from: a */
    public synchronized ExecutorService mo38243a() {
        if (this.f34446d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13184e.m34500a("OkHttp Dispatcher", false));
            this.f34446d = threadPoolExecutor;
        }
        return this.f34446d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38248b(C13330a aVar) {
        aVar.mo38378c().decrementAndGet();
        m35071a(this.f34448f, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38249b(C13329x xVar) {
        m35071a(this.f34449g, xVar);
    }

    /* renamed from: b */
    public synchronized int mo38247b() {
        return this.f34448f.size() + this.f34449g.size();
    }

    /* renamed from: a */
    public void mo38244a(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.f34444b = i;
            }
            m35072c();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("max < 1: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public C13312n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38245a(C13330a aVar) {
        synchronized (this) {
            this.f34447e.add(aVar);
            if (!aVar.mo38379d().f34569h) {
                C13330a a = m35070a(aVar.mo38380e());
                if (a != null) {
                    aVar.mo38377a(a);
                }
            }
        }
        m35072c();
    }

    /* renamed from: a */
    private C13330a m35070a(String str) {
        for (C13330a aVar : this.f34448f) {
            if (aVar.mo38380e().equals(str)) {
                return aVar;
            }
        }
        for (C13330a aVar2 : this.f34447e) {
            if (aVar2.mo38380e().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo38246a(C13329x xVar) {
        this.f34449g.add(xVar);
    }

    /* renamed from: a */
    private <T> void m35071a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f34445c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m35072c() && runnable != null) {
            runnable.run();
        }
    }
}
