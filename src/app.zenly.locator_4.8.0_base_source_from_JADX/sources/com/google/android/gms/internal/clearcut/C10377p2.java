package com.google.android.gms.internal.clearcut;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.clearcut.p2 */
class C10377p2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: e */
    private final int f27162e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C10422w2> f27163f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<K, V> f27164g;

    /* renamed from: h */
    private boolean f27165h;

    /* renamed from: i */
    private volatile C10434y2 f27166i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Map<K, V> f27167j;

    /* renamed from: k */
    private volatile C10398s2 f27168k;

    private C10377p2(int i) {
        this.f27162e = i;
        this.f27163f = Collections.emptyList();
        this.f27164g = Collections.emptyMap();
        this.f27167j = Collections.emptyMap();
    }

    /* synthetic */ C10377p2(int i, C10383q2 q2Var) {
        this(i);
    }

    /* renamed from: a */
    private final int m26435a(K k) {
        int size = this.f27163f.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C10422w2) this.f27163f.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((C10422w2) this.f27163f.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    static <FieldDescriptorType extends zzca<FieldDescriptorType>> C10377p2<FieldDescriptorType, Object> m26438b(int i) {
        return new C10383q2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m26440c(int i) {
        m26443f();
        V value = ((C10422w2) this.f27163f.remove(i)).getValue();
        if (!this.f27164g.isEmpty()) {
            Iterator it = m26444g().entrySet().iterator();
            this.f27163f.add(new C10422w2(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m26443f() {
        if (this.f27165h) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m26444g() {
        m26443f();
        if (this.f27164g.isEmpty() && !(this.f27164g instanceof TreeMap)) {
            this.f27164g = new TreeMap();
            this.f27167j = ((TreeMap) this.f27164g).descendingMap();
        }
        return (SortedMap) this.f27164g;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m26443f();
        int a = m26435a(k);
        if (a >= 0) {
            return ((C10422w2) this.f27163f.get(a)).setValue(v);
        }
        m26443f();
        if (this.f27163f.isEmpty() && !(this.f27163f instanceof ArrayList)) {
            this.f27163f = new ArrayList(this.f27162e);
        }
        int i = -(a + 1);
        if (i >= this.f27162e) {
            return m26444g().put(k, v);
        }
        int size = this.f27163f.size();
        int i2 = this.f27162e;
        if (size == i2) {
            C10422w2 w2Var = (C10422w2) this.f27163f.remove(i2 - 1);
            m26444g().put((Comparable) w2Var.getKey(), w2Var.getValue());
        }
        this.f27163f.add(i, new C10422w2(this, k, v));
        return null;
    }

    /* renamed from: a */
    public final Entry<K, V> mo28089a(int i) {
        return (Entry) this.f27163f.get(i);
    }

    /* renamed from: a */
    public final boolean mo28090a() {
        return this.f27165h;
    }

    /* renamed from: b */
    public final int mo28091b() {
        return this.f27163f.size();
    }

    /* renamed from: c */
    public final Iterable<Entry<K, V>> mo28092c() {
        return this.f27164g.isEmpty() ? C10404t2.m26537a() : this.f27164g.entrySet();
    }

    public void clear() {
        m26443f();
        if (!this.f27163f.isEmpty()) {
            this.f27163f.clear();
        }
        if (!this.f27164g.isEmpty()) {
            this.f27164g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m26435a((K) comparable) >= 0 || this.f27164g.containsKey(comparable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<Entry<K, V>> mo28095d() {
        if (this.f27168k == null) {
            this.f27168k = new C10398s2(this, null);
        }
        return this.f27168k;
    }

    /* renamed from: e */
    public void mo28096e() {
        if (!this.f27165h) {
            this.f27164g = this.f27164g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f27164g);
            this.f27167j = this.f27167j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f27167j);
            this.f27165h = true;
        }
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f27166i == null) {
            this.f27166i = new C10434y2(this, null);
        }
        return this.f27166i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10377p2)) {
            return super.equals(obj);
        }
        C10377p2 p2Var = (C10377p2) obj;
        int size = size();
        if (size != p2Var.size()) {
            return false;
        }
        int b = mo28091b();
        if (b != p2Var.mo28091b()) {
            return entrySet().equals(p2Var.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo28089a(i).equals(p2Var.mo28089a(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f27164g.equals(p2Var.f27164g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m26435a((K) comparable);
        return a >= 0 ? ((C10422w2) this.f27163f.get(a)).getValue() : this.f27164g.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo28091b(); i2++) {
            i += ((C10422w2) this.f27163f.get(i2)).hashCode();
        }
        return this.f27164g.size() > 0 ? i + this.f27164g.hashCode() : i;
    }

    public V remove(Object obj) {
        m26443f();
        Comparable comparable = (Comparable) obj;
        int a = m26435a((K) comparable);
        if (a >= 0) {
            return m26440c(a);
        }
        if (this.f27164g.isEmpty()) {
            return null;
        }
        return this.f27164g.remove(comparable);
    }

    public int size() {
        return this.f27163f.size() + this.f27164g.size();
    }
}
