package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.C8936k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.f */
class C8926f<K extends C8936k, V> {

    /* renamed from: a */
    private final C8927a<K, V> f23251a = new C8927a<>();

    /* renamed from: b */
    private final Map<K, C8927a<K, V>> f23252b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.f$a */
    private static class C8927a<K, V> {

        /* renamed from: a */
        final K f23253a;

        /* renamed from: b */
        private List<V> f23254b;

        /* renamed from: c */
        C8927a<K, V> f23255c;

        /* renamed from: d */
        C8927a<K, V> f23256d;

        C8927a() {
            this(null);
        }

        /* renamed from: a */
        public V mo24347a() {
            int b = mo24349b();
            if (b > 0) {
                return this.f23254b.remove(b - 1);
            }
            return null;
        }

        /* renamed from: b */
        public int mo24349b() {
            List<V> list = this.f23254b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C8927a(K k) {
            this.f23256d = this;
            this.f23255c = this;
            this.f23253a = k;
        }

        /* renamed from: a */
        public void mo24348a(V v) {
            if (this.f23254b == null) {
                this.f23254b = new ArrayList();
            }
            this.f23254b.add(v);
        }
    }

    C8926f() {
    }

    /* renamed from: b */
    private void m21426b(C8927a<K, V> aVar) {
        m21427c(aVar);
        C8927a<K, V> aVar2 = this.f23251a;
        aVar.f23256d = aVar2.f23256d;
        aVar.f23255c = aVar2;
        m21428d(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m21427c(C8927a<K, V> aVar) {
        C8927a<K, V> aVar2 = aVar.f23256d;
        aVar2.f23255c = aVar.f23255c;
        aVar.f23255c.f23256d = aVar2;
    }

    /* renamed from: d */
    private static <K, V> void m21428d(C8927a<K, V> aVar) {
        aVar.f23255c.f23256d = aVar;
        aVar.f23256d.f23255c = aVar;
    }

    /* renamed from: a */
    public void mo24345a(K k, V v) {
        C8927a aVar = (C8927a) this.f23252b.get(k);
        if (aVar == null) {
            aVar = new C8927a(k);
            m21426b(aVar);
            this.f23252b.put(k, aVar);
        } else {
            k.mo24333a();
        }
        aVar.mo24348a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C8927a<K, V> aVar = this.f23251a.f23255c; !aVar.equals(this.f23251a); aVar = aVar.f23255c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f23253a);
            sb.append(':');
            sb.append(aVar.mo24349b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: a */
    public V mo24344a(K k) {
        C8927a aVar = (C8927a) this.f23252b.get(k);
        if (aVar == null) {
            aVar = new C8927a(k);
            this.f23252b.put(k, aVar);
        } else {
            k.mo24333a();
        }
        m21425a(aVar);
        return aVar.mo24347a();
    }

    /* renamed from: a */
    public V mo24343a() {
        for (C8927a<K, V> aVar = this.f23251a.f23256d; !aVar.equals(this.f23251a); aVar = aVar.f23256d) {
            V a = aVar.mo24347a();
            if (a != null) {
                return a;
            }
            m21427c(aVar);
            this.f23252b.remove(aVar.f23253a);
            ((C8936k) aVar.f23253a).mo24333a();
        }
        return null;
    }

    /* renamed from: a */
    private void m21425a(C8927a<K, V> aVar) {
        m21427c(aVar);
        C8927a<K, V> aVar2 = this.f23251a;
        aVar.f23256d = aVar2;
        aVar.f23255c = aVar2.f23255c;
        m21428d(aVar);
    }
}
