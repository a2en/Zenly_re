package p214e.p228e;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: e.e.a */
public class C7571a<K, V> extends C7584g<K, V> implements Map<K, V> {

    /* renamed from: l */
    C7578f<K, V> f18990l;

    /* renamed from: e.e.a$a */
    class C7572a extends C7578f<K, V> {
        C7572a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo19476a(int i, int i2) {
            return C7571a.this.f19039f[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo19481b(Object obj) {
            return C7571a.this.mo19596c(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo19483c() {
            return C7571a.this.f19040g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo19475a(Object obj) {
            return C7571a.this.mo19594b(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<K, V> mo19482b() {
            return C7571a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19480a(K k, V v) {
            C7571a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public V mo19477a(int i, V v) {
            return C7571a.this.mo19591a(i, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19479a(int i) {
            C7571a.this.mo19597c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19478a() {
            C7571a.this.clear();
        }
    }

    public C7571a() {
    }

    /* renamed from: b */
    private C7578f<K, V> m18250b() {
        if (this.f18990l == null) {
            this.f18990l = new C7572a();
        }
        return this.f18990l;
    }

    /* renamed from: a */
    public boolean mo19470a(Collection<?> collection) {
        return C7578f.m18309c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m18250b().mo19530d();
    }

    public Set<K> keySet() {
        return m18250b().mo19531e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo19592a(this.f19040g + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m18250b().mo19532f();
    }

    public C7571a(int i) {
        super(i);
    }

    public C7571a(C7584g gVar) {
        super(gVar);
    }
}
