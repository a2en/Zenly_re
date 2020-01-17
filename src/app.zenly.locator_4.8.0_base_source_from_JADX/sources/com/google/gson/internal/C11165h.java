package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.gson.internal.h */
public final class C11165h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: l */
    private static final Comparator<Comparable> f28887l = new C11166a();

    /* renamed from: e */
    Comparator<? super K> f28888e;

    /* renamed from: f */
    C11172e<K, V> f28889f;

    /* renamed from: g */
    int f28890g;

    /* renamed from: h */
    int f28891h;

    /* renamed from: i */
    final C11172e<K, V> f28892i;

    /* renamed from: j */
    private C11167b f28893j;

    /* renamed from: k */
    private C11169c f28894k;

    /* renamed from: com.google.gson.internal.h$a */
    static class C11166a implements Comparator<Comparable> {
        C11166a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.h$b */
    class C11167b extends AbstractSet<Entry<K, V>> {

        /* renamed from: com.google.gson.internal.h$b$a */
        class C11168a extends C11171d<Entry<K, V>> {
            C11168a(C11167b bVar) {
                super();
            }

            public Entry<K, V> next() {
                return mo32551a();
            }
        }

        C11167b() {
        }

        public void clear() {
            C11165h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C11165h.this.mo32525a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C11168a(this);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C11172e a = C11165h.this.mo32525a((Entry) obj);
            if (a == null) {
                return false;
            }
            C11165h.this.mo32526a(a, true);
            return true;
        }

        public int size() {
            return C11165h.this.f28890g;
        }
    }

    /* renamed from: com.google.gson.internal.h$c */
    final class C11169c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.h$c$a */
        class C11170a extends C11171d<K> {
            C11170a(C11169c cVar) {
                super();
            }

            public K next() {
                return mo32551a().f28906j;
            }
        }

        C11169c() {
        }

        public void clear() {
            C11165h.this.clear();
        }

        public boolean contains(Object obj) {
            return C11165h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C11170a(this);
        }

        public boolean remove(Object obj) {
            return C11165h.this.mo32528c(obj) != null;
        }

        public int size() {
            return C11165h.this.f28890g;
        }
    }

    /* renamed from: com.google.gson.internal.h$d */
    private abstract class C11171d<T> implements Iterator<T> {

        /* renamed from: e */
        C11172e<K, V> f28897e;

        /* renamed from: f */
        C11172e<K, V> f28898f = null;

        /* renamed from: g */
        int f28899g;

        C11171d() {
            C11165h hVar = C11165h.this;
            this.f28897e = hVar.f28892i.f28904h;
            this.f28899g = hVar.f28891h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C11172e<K, V> mo32551a() {
            C11172e<K, V> eVar = this.f28897e;
            C11165h hVar = C11165h.this;
            if (eVar == hVar.f28892i) {
                throw new NoSuchElementException();
            } else if (hVar.f28891h == this.f28899g) {
                this.f28897e = eVar.f28904h;
                this.f28898f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f28897e != C11165h.this.f28892i;
        }

        public final void remove() {
            C11172e<K, V> eVar = this.f28898f;
            if (eVar != null) {
                C11165h.this.mo32526a(eVar, true);
                this.f28898f = null;
                this.f28899g = C11165h.this.f28891h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.gson.internal.h$e */
    static final class C11172e<K, V> implements Entry<K, V> {

        /* renamed from: e */
        C11172e<K, V> f28901e;

        /* renamed from: f */
        C11172e<K, V> f28902f;

        /* renamed from: g */
        C11172e<K, V> f28903g;

        /* renamed from: h */
        C11172e<K, V> f28904h;

        /* renamed from: i */
        C11172e<K, V> f28905i;

        /* renamed from: j */
        final K f28906j;

        /* renamed from: k */
        V f28907k;

        /* renamed from: l */
        int f28908l;

        C11172e() {
            this.f28906j = null;
            this.f28905i = this;
            this.f28904h = this;
        }

        /* renamed from: a */
        public C11172e<K, V> mo32554a() {
            C11172e eVar = this;
            for (C11172e eVar2 = this.f28902f; eVar2 != null; eVar2 = eVar2.f28902f) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C11172e<K, V> mo32555b() {
            C11172e eVar = this;
            for (C11172e eVar2 = this.f28903g; eVar2 != null; eVar2 = eVar2.f28903g) {
                eVar = eVar2;
            }
            return eVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f28906j;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f28907k;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f28906j;
        }

        public V getValue() {
            return this.f28907k;
        }

        public int hashCode() {
            K k = this.f28906j;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f28907k;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f28907k;
            this.f28907k = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28906j);
            sb.append("=");
            sb.append(this.f28907k);
            return sb.toString();
        }

        C11172e(C11172e<K, V> eVar, K k, C11172e<K, V> eVar2, C11172e<K, V> eVar3) {
            this.f28901e = eVar;
            this.f28906j = k;
            this.f28908l = 1;
            this.f28904h = eVar2;
            this.f28905i = eVar3;
            eVar3.f28904h = this;
            eVar2.f28905i = this;
        }
    }

    static {
        Class<C11165h> cls = C11165h.class;
    }

    public C11165h() {
        this(f28887l);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11172e<K, V> mo32524a(K k, boolean z) {
        int i;
        C11172e<K, V> eVar;
        Comparator<? super K> comparator = this.f28888e;
        C11172e<K, V> eVar2 = this.f28889f;
        if (eVar2 != null) {
            Comparable comparable = comparator == f28887l ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar2.f28906j);
                } else {
                    i = comparator.compare(k, eVar2.f28906j);
                }
                if (i == 0) {
                    return eVar2;
                }
                C11172e<K, V> eVar3 = i < 0 ? eVar2.f28902f : eVar2.f28903g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C11172e<K, V> eVar4 = this.f28892i;
        if (eVar2 != null) {
            eVar = new C11172e<>(eVar2, k, eVar4, eVar4.f28905i);
            if (i < 0) {
                eVar2.f28902f = eVar;
            } else {
                eVar2.f28903g = eVar;
            }
            m28727b(eVar2, true);
        } else if (comparator != f28887l || (k instanceof Comparable)) {
            eVar = new C11172e<>(eVar2, k, eVar4, eVar4.f28905i);
            this.f28889f = eVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f28890g++;
        this.f28891h++;
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11172e<K, V> mo32527b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo32524a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C11172e<K, V> mo32528c(Object obj) {
        C11172e<K, V> b = mo32527b(obj);
        if (b != null) {
            mo32526a(b, true);
        }
        return b;
    }

    public void clear() {
        this.f28889f = null;
        this.f28890g = 0;
        this.f28891h++;
        C11172e<K, V> eVar = this.f28892i;
        eVar.f28905i = eVar;
        eVar.f28904h = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo32527b(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C11167b bVar = this.f28893j;
        if (bVar != null) {
            return bVar;
        }
        C11167b bVar2 = new C11167b<>();
        this.f28893j = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C11172e b = mo32527b(obj);
        if (b != null) {
            return b.f28907k;
        }
        return null;
    }

    public Set<K> keySet() {
        C11169c cVar = this.f28894k;
        if (cVar != null) {
            return cVar;
        }
        C11169c cVar2 = new C11169c<>();
        this.f28894k = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C11172e a = mo32524a(k, true);
            V v2 = a.f28907k;
            a.f28907k = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C11172e c = mo32528c(obj);
        if (c != null) {
            return c.f28907k;
        }
        return null;
    }

    public int size() {
        return this.f28890g;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11165h(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f28890g = r0
            r1.f28891h = r0
            com.google.gson.internal.h$e r0 = new com.google.gson.internal.h$e
            r0.<init>()
            r1.f28892i = r0
            if (r2 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            java.util.Comparator<java.lang.Comparable> r2 = f28887l
        L_0x0014:
            r1.f28888e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C11165h.<init>(java.util.Comparator):void");
    }

    /* renamed from: b */
    private void m28727b(C11172e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C11172e<K, V> eVar2 = eVar.f28902f;
            C11172e<K, V> eVar3 = eVar.f28903g;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f28908l : 0;
            int i3 = eVar3 != null ? eVar3.f28908l : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C11172e<K, V> eVar4 = eVar3.f28902f;
                C11172e<K, V> eVar5 = eVar3.f28903g;
                int i5 = eVar5 != null ? eVar5.f28908l : 0;
                if (eVar4 != null) {
                    i = eVar4.f28908l;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m28723a(eVar);
                } else {
                    m28726b(eVar3);
                    m28723a(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C11172e<K, V> eVar6 = eVar2.f28902f;
                C11172e<K, V> eVar7 = eVar2.f28903g;
                int i7 = eVar7 != null ? eVar7.f28908l : 0;
                if (eVar6 != null) {
                    i = eVar6.f28908l;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m28726b(eVar);
                } else {
                    m28723a(eVar2);
                    m28726b(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f28908l = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f28908l = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f28901e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11172e<K, V> mo32525a(Entry<?, ?> entry) {
        C11172e<K, V> b = mo32527b(entry.getKey());
        if (b != null && m28725a((Object) b.f28907k, entry.getValue())) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m28725a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32526a(C11172e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C11172e<K, V> eVar2 = eVar.f28905i;
            eVar2.f28904h = eVar.f28904h;
            eVar.f28904h.f28905i = eVar2;
        }
        C11172e<K, V> eVar3 = eVar.f28902f;
        C11172e<K, V> eVar4 = eVar.f28903g;
        C11172e<K, V> eVar5 = eVar.f28901e;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m28724a(eVar, eVar3);
                eVar.f28902f = null;
            } else if (eVar4 != null) {
                m28724a(eVar, eVar4);
                eVar.f28903g = null;
            } else {
                m28724a(eVar, null);
            }
            m28727b(eVar5, false);
            this.f28890g--;
            this.f28891h++;
            return;
        }
        C11172e<K, V> b = eVar3.f28908l > eVar4.f28908l ? eVar3.mo32555b() : eVar4.mo32554a();
        mo32526a(b, false);
        C11172e<K, V> eVar6 = eVar.f28902f;
        if (eVar6 != null) {
            i = eVar6.f28908l;
            b.f28902f = eVar6;
            eVar6.f28901e = b;
            eVar.f28902f = null;
        } else {
            i = 0;
        }
        C11172e<K, V> eVar7 = eVar.f28903g;
        if (eVar7 != null) {
            i2 = eVar7.f28908l;
            b.f28903g = eVar7;
            eVar7.f28901e = b;
            eVar.f28903g = null;
        }
        b.f28908l = Math.max(i, i2) + 1;
        m28724a(eVar, b);
    }

    /* renamed from: b */
    private void m28726b(C11172e<K, V> eVar) {
        C11172e<K, V> eVar2 = eVar.f28902f;
        C11172e<K, V> eVar3 = eVar.f28903g;
        C11172e<K, V> eVar4 = eVar2.f28902f;
        C11172e<K, V> eVar5 = eVar2.f28903g;
        eVar.f28902f = eVar5;
        if (eVar5 != null) {
            eVar5.f28901e = eVar;
        }
        m28724a(eVar, eVar2);
        eVar2.f28903g = eVar;
        eVar.f28901e = eVar2;
        int i = 0;
        eVar.f28908l = Math.max(eVar3 != null ? eVar3.f28908l : 0, eVar5 != null ? eVar5.f28908l : 0) + 1;
        int i2 = eVar.f28908l;
        if (eVar4 != null) {
            i = eVar4.f28908l;
        }
        eVar2.f28908l = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m28724a(C11172e<K, V> eVar, C11172e<K, V> eVar2) {
        C11172e<K, V> eVar3 = eVar.f28901e;
        eVar.f28901e = null;
        if (eVar2 != null) {
            eVar2.f28901e = eVar3;
        }
        if (eVar3 == null) {
            this.f28889f = eVar2;
        } else if (eVar3.f28902f == eVar) {
            eVar3.f28902f = eVar2;
        } else {
            eVar3.f28903g = eVar2;
        }
    }

    /* renamed from: a */
    private void m28723a(C11172e<K, V> eVar) {
        C11172e<K, V> eVar2 = eVar.f28902f;
        C11172e<K, V> eVar3 = eVar.f28903g;
        C11172e<K, V> eVar4 = eVar3.f28902f;
        C11172e<K, V> eVar5 = eVar3.f28903g;
        eVar.f28903g = eVar4;
        if (eVar4 != null) {
            eVar4.f28901e = eVar;
        }
        m28724a(eVar, eVar3);
        eVar3.f28902f = eVar;
        eVar.f28901e = eVar3;
        int i = 0;
        eVar.f28908l = Math.max(eVar2 != null ? eVar2.f28908l : 0, eVar4 != null ? eVar4.f28908l : 0) + 1;
        int i2 = eVar.f28908l;
        if (eVar5 != null) {
            i = eVar5.f28908l;
        }
        eVar3.f28908l = Math.max(i2, i) + 1;
    }
}
