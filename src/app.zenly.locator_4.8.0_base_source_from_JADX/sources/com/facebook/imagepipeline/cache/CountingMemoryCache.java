package com.facebook.imagepipeline.cache;

import android.os.SystemClock;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.C9545a;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class CountingMemoryCache<K, V> implements MemoryCache<K, V>, MemoryTrimmable {

    /* renamed from: a */
    final C9683f<K, C9670c<K, V>> f25268a;

    /* renamed from: b */
    final C9683f<K, C9670c<K, V>> f25269b;

    /* renamed from: c */
    private final ValueDescriptor<V> f25270c;

    /* renamed from: d */
    private final CacheTrimStrategy f25271d;

    /* renamed from: e */
    private final Supplier<C9692m> f25272e;

    /* renamed from: f */
    protected C9692m f25273f = ((C9692m) this.f25272e.get());

    /* renamed from: g */
    private long f25274g = SystemClock.uptimeMillis();

    public interface CacheTrimStrategy {
        double getTrimRatio(C9545a aVar);
    }

    public interface EntryStateObserver<K> {
        void onExclusivityChanged(K k, boolean z);
    }

    /* renamed from: com.facebook.imagepipeline.cache.CountingMemoryCache$a */
    class C9668a implements ValueDescriptor<C9670c<K, V>> {

        /* renamed from: a */
        final /* synthetic */ ValueDescriptor f25275a;

        C9668a(CountingMemoryCache countingMemoryCache, ValueDescriptor valueDescriptor) {
            this.f25275a = valueDescriptor;
        }

        /* renamed from: a */
        public int getSizeInBytes(C9670c<K, V> cVar) {
            return this.f25275a.getSizeInBytes(cVar.f25279b.mo25724b());
        }
    }

    /* renamed from: com.facebook.imagepipeline.cache.CountingMemoryCache$b */
    class C9669b implements ResourceReleaser<V> {

        /* renamed from: a */
        final /* synthetic */ C9670c f25276a;

        C9669b(C9670c cVar) {
            this.f25276a = cVar;
        }

        public void release(V v) {
            CountingMemoryCache.this.m23787i(this.f25276a);
        }
    }

    /* renamed from: com.facebook.imagepipeline.cache.CountingMemoryCache$c */
    static class C9670c<K, V> {

        /* renamed from: a */
        public final K f25278a;

        /* renamed from: b */
        public final CloseableReference<V> f25279b;

        /* renamed from: c */
        public int f25280c = 0;

        /* renamed from: d */
        public boolean f25281d = false;

        /* renamed from: e */
        public final EntryStateObserver<K> f25282e;

        private C9670c(K k, CloseableReference<V> closeableReference, EntryStateObserver<K> entryStateObserver) {
            C9536j.m23271a(k);
            this.f25278a = k;
            CloseableReference<V> a = CloseableReference.m23348a(closeableReference);
            C9536j.m23271a(a);
            this.f25279b = a;
            this.f25282e = entryStateObserver;
        }

        /* renamed from: a */
        static <K, V> C9670c<K, V> m23793a(K k, CloseableReference<V> closeableReference, EntryStateObserver<K> entryStateObserver) {
            return new C9670c<>(k, closeableReference, entryStateObserver);
        }
    }

    public CountingMemoryCache(ValueDescriptor<V> valueDescriptor, CacheTrimStrategy cacheTrimStrategy, Supplier<C9692m> supplier) {
        new WeakHashMap();
        this.f25270c = valueDescriptor;
        this.f25268a = new C9683f<>(m23770a(valueDescriptor));
        this.f25269b = new C9683f<>(m23770a(valueDescriptor));
        this.f25271d = cacheTrimStrategy;
        this.f25272e = supplier;
    }

    /* renamed from: b */
    private synchronized boolean m23777b(V v) {
        boolean z;
        int sizeInBytes = this.f25270c.getSizeInBytes(v);
        z = true;
        if (sizeInBytes > this.f25273f.f25324e || mo26201a() > this.f25273f.f25321b - 1 || mo26204b() > this.f25273f.f25320a - sizeInBytes) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m23778c() {
        ArrayList a;
        synchronized (this) {
            a = m23771a(Math.min(this.f25273f.f25323d, this.f25273f.f25321b - mo26201a()), Math.min(this.f25273f.f25322c, this.f25273f.f25320a - mo26204b()));
            m23774a(a);
        }
        m23776b(a);
        m23780c(a);
    }

    /* renamed from: d */
    private synchronized boolean m23782d(C9670c<K, V> cVar) {
        if (cVar.f25281d || cVar.f25280c != 0) {
            return false;
        }
        this.f25268a.mo26238a(cVar.f25278a, cVar);
        return true;
    }

    /* renamed from: e */
    private static <K, V> void m23783e(C9670c<K, V> cVar) {
        if (cVar != null) {
            EntryStateObserver<K> entryStateObserver = cVar.f25282e;
            if (entryStateObserver != null) {
                entryStateObserver.onExclusivityChanged(cVar.f25278a, true);
            }
        }
    }

    /* renamed from: f */
    private static <K, V> void m23784f(C9670c<K, V> cVar) {
        if (cVar != null) {
            EntryStateObserver<K> entryStateObserver = cVar.f25282e;
            if (entryStateObserver != null) {
                entryStateObserver.onExclusivityChanged(cVar.f25278a, false);
            }
        }
    }

    /* renamed from: g */
    private synchronized CloseableReference<V> m23785g(C9670c<K, V> cVar) {
        m23775b(cVar);
        return CloseableReference.m23351a(cVar.f25279b.mo25724b(), (ResourceReleaser<T>) new C9669b<T>(cVar));
    }

    /* renamed from: h */
    private synchronized CloseableReference<V> m23786h(C9670c<K, V> cVar) {
        C9536j.m23271a(cVar);
        return (!cVar.f25281d || cVar.f25280c != 0) ? null : cVar.f25279b;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m23787i(C9670c<K, V> cVar) {
        boolean d;
        CloseableReference h;
        C9536j.m23271a(cVar);
        synchronized (this) {
            m23772a(cVar);
            d = m23782d(cVar);
            h = m23786h(cVar);
        }
        CloseableReference.m23355b(h);
        if (!d) {
            cVar = null;
        }
        m23783e(cVar);
        m23781d();
        m23778c();
    }

    public CloseableReference<V> cache(K k, CloseableReference<V> closeableReference) {
        return mo26203a(k, closeableReference, null);
    }

    public synchronized boolean contains(Predicate<K> predicate) {
        return !this.f25269b.mo26239a(predicate).isEmpty();
    }

    public CloseableReference<V> get(K k) {
        C9670c cVar;
        CloseableReference<V> g;
        C9536j.m23271a(k);
        synchronized (this) {
            cVar = (C9670c) this.f25268a.mo26245c(k);
            C9670c cVar2 = (C9670c) this.f25269b.mo26242b(k);
            g = cVar2 != null ? m23785g(cVar2) : null;
        }
        m23784f(cVar);
        m23781d();
        m23778c();
        return g;
    }

    public int removeAll(Predicate<K> predicate) {
        ArrayList b;
        ArrayList b2;
        synchronized (this) {
            b = this.f25268a.mo26243b(predicate);
            b2 = this.f25269b.mo26243b(predicate);
            m23774a(b2);
        }
        m23776b(b2);
        m23780c(b);
        m23781d();
        m23778c();
        return b2.size();
    }

    public void trim(C9545a aVar) {
        ArrayList a;
        double trimRatio = this.f25271d.getTrimRatio(aVar);
        synchronized (this) {
            a = m23771a(Integer.MAX_VALUE, Math.max(0, ((int) (((double) this.f25269b.mo26244c()) * (1.0d - trimRatio))) - mo26204b()));
            m23774a(a);
        }
        m23776b(a);
        m23780c(a);
        m23781d();
        m23778c();
    }

    /* renamed from: a */
    private ValueDescriptor<C9670c<K, V>> m23770a(ValueDescriptor<V> valueDescriptor) {
        return new C9668a(this, valueDescriptor);
    }

    public synchronized boolean contains(K k) {
        return this.f25269b.mo26240a(k);
    }

    /* renamed from: a */
    public CloseableReference<V> mo26203a(K k, CloseableReference<V> closeableReference, EntryStateObserver<K> entryStateObserver) {
        C9670c cVar;
        CloseableReference<V> closeableReference2;
        CloseableReference closeableReference3;
        C9536j.m23271a(k);
        C9536j.m23271a(closeableReference);
        m23781d();
        synchronized (this) {
            cVar = (C9670c) this.f25268a.mo26245c(k);
            C9670c cVar2 = (C9670c) this.f25269b.mo26245c(k);
            closeableReference2 = null;
            if (cVar2 != null) {
                m23779c(cVar2);
                closeableReference3 = m23786h(cVar2);
            } else {
                closeableReference3 = null;
            }
            if (m23777b((V) closeableReference.mo25724b())) {
                C9670c a = C9670c.m23793a(k, closeableReference, entryStateObserver);
                this.f25269b.mo26238a(k, a);
                closeableReference2 = m23785g(a);
            }
        }
        CloseableReference.m23355b(closeableReference3);
        m23784f(cVar);
        m23778c();
        return closeableReference2;
    }

    /* renamed from: d */
    private synchronized void m23781d() {
        if (this.f25274g + this.f25273f.f25325f <= SystemClock.uptimeMillis()) {
            this.f25274g = SystemClock.uptimeMillis();
            this.f25273f = (C9692m) this.f25272e.get();
        }
    }

    /* renamed from: b */
    private void m23776b(ArrayList<C9670c<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CloseableReference.m23355b(m23786h((C9670c) it.next()));
            }
        }
    }

    /* renamed from: b */
    private synchronized void m23775b(C9670c<K, V> cVar) {
        C9536j.m23271a(cVar);
        C9536j.m23279b(!cVar.f25281d);
        cVar.f25280c++;
    }

    /* renamed from: b */
    public synchronized int mo26204b() {
        return this.f25269b.mo26244c() - this.f25268a.mo26244c();
    }

    /* renamed from: c */
    private void m23780c(ArrayList<C9670c<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m23784f((C9670c) it.next());
            }
        }
    }

    /* renamed from: c */
    private synchronized void m23779c(C9670c<K, V> cVar) {
        C9536j.m23271a(cVar);
        C9536j.m23279b(!cVar.f25281d);
        cVar.f25281d = true;
    }

    /* renamed from: a */
    public CloseableReference<V> mo26202a(K k) {
        C9670c cVar;
        boolean z;
        CloseableReference<V> closeableReference;
        C9536j.m23271a(k);
        synchronized (this) {
            cVar = (C9670c) this.f25268a.mo26245c(k);
            z = true;
            boolean z2 = false;
            if (cVar != null) {
                C9670c cVar2 = (C9670c) this.f25269b.mo26245c(k);
                C9536j.m23271a(cVar2);
                if (cVar2.f25280c == 0) {
                    z2 = true;
                }
                C9536j.m23279b(z2);
                closeableReference = cVar2.f25279b;
            } else {
                closeableReference = null;
                z = false;
            }
        }
        if (z) {
            m23784f(cVar);
        }
        return closeableReference;
    }

    /* renamed from: a */
    private synchronized ArrayList<C9670c<K, V>> m23771a(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f25268a.mo26237a() <= max && this.f25268a.mo26244c() <= max2) {
            return null;
        }
        ArrayList<C9670c<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f25268a.mo26237a() <= max && this.f25268a.mo26244c() <= max2) {
                return arrayList;
            }
            Object b = this.f25268a.mo26241b();
            this.f25268a.mo26245c(b);
            arrayList.add(this.f25269b.mo26245c(b));
        }
    }

    /* renamed from: a */
    private synchronized void m23774a(ArrayList<C9670c<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m23779c((C9670c) it.next());
            }
        }
    }

    /* renamed from: a */
    private synchronized void m23772a(C9670c<K, V> cVar) {
        C9536j.m23271a(cVar);
        C9536j.m23279b(cVar.f25280c > 0);
        cVar.f25280c--;
    }

    /* renamed from: a */
    public synchronized int mo26201a() {
        return this.f25269b.mo26237a() - this.f25268a.mo26237a();
    }
}
