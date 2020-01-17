package com.google.common.collect;

import com.google.common.collect.C10901o.C10903b;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.q */
public abstract class C10909q<K, V> implements Map<K, V>, Serializable {

    /* renamed from: e */
    private transient C10912r<Entry<K, V>> f28463e;

    /* renamed from: f */
    private transient C10912r<K> f28464f;

    /* renamed from: g */
    private transient C10901o<V> f28465g;

    /* renamed from: com.google.common.collect.q$a */
    public static class C10910a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f28466a;

        /* renamed from: b */
        Object[] f28467b;

        /* renamed from: c */
        int f28468c;

        /* renamed from: d */
        boolean f28469d;

        public C10910a() {
            this(4);
        }

        /* renamed from: a */
        private void m28112a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f28467b;
            if (i2 > objArr.length) {
                this.f28467b = Arrays.copyOf(objArr, C10903b.m28094a(objArr.length, i2));
                this.f28469d = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo31778b() {
            int i;
            if (this.f28466a != null) {
                if (this.f28469d) {
                    this.f28467b = Arrays.copyOf(this.f28467b, this.f28468c * 2);
                }
                Entry[] entryArr = new Entry[this.f28468c];
                int i2 = 0;
                while (true) {
                    i = this.f28468c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f28467b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, C10963z.m28306a(this.f28466a).mo31930a(Maps.m28027a()));
                for (int i4 = 0; i4 < this.f28468c; i4++) {
                    int i5 = i4 * 2;
                    this.f28467b[i5] = entryArr[i4].getKey();
                    this.f28467b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        C10910a(int i) {
            this.f28467b = new Object[(i * 2)];
            this.f28468c = 0;
            this.f28469d = false;
        }

        /* renamed from: a */
        public C10910a<K, V> mo31776a(K k, V v) {
            m28112a(this.f28468c + 1);
            C10882f.m28057a((Object) k, (Object) v);
            Object[] objArr = this.f28467b;
            int i = this.f28468c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f28468c = i + 1;
            return this;
        }

        /* renamed from: a */
        public C10909q<K, V> mo31777a() {
            mo31778b();
            this.f28469d = true;
            return C10877e0.m28043a(this.f28468c, this.f28467b);
        }
    }

    /* renamed from: com.google.common.collect.q$b */
    static class C10911b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final Object[] f28470e;

        /* renamed from: f */
        private final Object[] f28471f;

        C10911b(C10909q<?, ?> qVar) {
            this.f28470e = new Object[qVar.size()];
            this.f28471f = new Object[qVar.size()];
            C10897l0 it = qVar.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.f28470e[i] = entry.getKey();
                this.f28471f[i] = entry.getValue();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo31779a(C10910a<Object, Object> aVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f28470e;
                if (i >= objArr.length) {
                    return aVar.mo31777a();
                }
                aVar.mo31776a(objArr[i], this.f28471f[i]);
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return mo31779a(new C10910a(this.f28470e.length));
        }
    }

    C10909q() {
    }

    /* renamed from: d */
    public static <K, V> C10910a<K, V> m28107d() {
        return new C10910a<>();
    }

    /* renamed from: e */
    public static <K, V> C10909q<K, V> m28108e() {
        return C10877e0.f28425k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C10912r<Entry<K, V>> mo31675a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C10912r<K> mo31676b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C10901o<V> mo31677c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return Maps.m28029a(this, obj);
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return C10885g0.m28063a(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m28028a(this);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C10911b(this);
    }

    public C10912r<Entry<K, V>> entrySet() {
        C10912r<Entry<K, V>> rVar = this.f28463e;
        if (rVar != null) {
            return rVar;
        }
        C10912r<Entry<K, V>> a = mo31675a();
        this.f28463e = a;
        return a;
    }

    public C10912r<K> keySet() {
        C10912r<K> rVar = this.f28464f;
        if (rVar != null) {
            return rVar;
        }
        C10912r<K> b = mo31676b();
        this.f28464f = b;
        return b;
    }

    public C10901o<V> values() {
        C10901o<V> oVar = this.f28465g;
        if (oVar != null) {
            return oVar;
        }
        C10901o<V> c = mo31677c();
        this.f28465g = c;
        return c;
    }
}
