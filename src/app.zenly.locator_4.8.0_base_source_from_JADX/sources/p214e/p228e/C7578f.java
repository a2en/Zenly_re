package p214e.p228e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: e.e.f */
abstract class C7578f<K, V> {

    /* renamed from: a */
    C7580b f19019a;

    /* renamed from: b */
    C7581c f19020b;

    /* renamed from: c */
    C7583e f19021c;

    /* renamed from: e.e.f$a */
    final class C7579a<T> implements Iterator<T> {

        /* renamed from: e */
        final int f19022e;

        /* renamed from: f */
        int f19023f;

        /* renamed from: g */
        int f19024g;

        /* renamed from: h */
        boolean f19025h = false;

        C7579a(int i) {
            this.f19022e = i;
            this.f19023f = C7578f.this.mo19483c();
        }

        public boolean hasNext() {
            return this.f19024g < this.f19023f;
        }

        public T next() {
            if (hasNext()) {
                T a = C7578f.this.mo19476a(this.f19024g, this.f19022e);
                this.f19024g++;
                this.f19025h = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f19025h) {
                this.f19024g--;
                this.f19023f--;
                this.f19025h = false;
                C7578f.this.mo19479a(this.f19024g);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: e.e.f$b */
    final class C7580b implements Set<Entry<K, V>> {
        C7580b() {
        }

        /* renamed from: a */
        public boolean mo19536a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo19536a((Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int c = C7578f.this.mo19483c();
            for (Entry entry : collection) {
                C7578f.this.mo19480a(entry.getKey(), entry.getValue());
            }
            return c != C7578f.this.mo19483c();
        }

        public void clear() {
            C7578f.this.mo19478a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C7578f.this.mo19475a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C7575c.m18281a(C7578f.this.mo19476a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C7578f.m18307a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int c = C7578f.this.mo19483c() - 1; c >= 0; c--) {
                Object a = C7578f.this.mo19476a(c, 0);
                Object a2 = C7578f.this.mo19476a(c, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C7578f.this.mo19483c() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C7582d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C7578f.this.mo19483c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.e.f$c */
    final class C7581c implements Set<K> {
        C7581c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C7578f.this.mo19478a();
        }

        public boolean contains(Object obj) {
            return C7578f.this.mo19475a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C7578f.m18306a(C7578f.this.mo19482b(), collection);
        }

        public boolean equals(Object obj) {
            return C7578f.m18307a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int c = C7578f.this.mo19483c() - 1; c >= 0; c--) {
                Object a = C7578f.this.mo19476a(c, 0);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C7578f.this.mo19483c() == 0;
        }

        public Iterator<K> iterator() {
            return new C7579a(0);
        }

        public boolean remove(Object obj) {
            int a = C7578f.this.mo19475a(obj);
            if (a < 0) {
                return false;
            }
            C7578f.this.mo19479a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C7578f.m18308b(C7578f.this.mo19482b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C7578f.m18309c(C7578f.this.mo19482b(), collection);
        }

        public int size() {
            return C7578f.this.mo19483c();
        }

        public Object[] toArray() {
            return C7578f.this.mo19529b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C7578f.this.mo19528a(tArr, 0);
        }
    }

    /* renamed from: e.e.f$d */
    final class C7582d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: e */
        int f19029e;

        /* renamed from: f */
        int f19030f;

        /* renamed from: g */
        boolean f19031g = false;

        C7582d() {
            this.f19029e = C7578f.this.mo19483c() - 1;
            this.f19030f = -1;
        }

        public boolean equals(Object obj) {
            if (this.f19031g) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C7575c.m18281a(entry.getKey(), C7578f.this.mo19476a(this.f19030f, 0)) && C7575c.m18281a(entry.getValue(), C7578f.this.mo19476a(this.f19030f, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f19031g) {
                return C7578f.this.mo19476a(this.f19030f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f19031g) {
                return C7578f.this.mo19476a(this.f19030f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f19030f < this.f19029e;
        }

        public int hashCode() {
            int i;
            if (this.f19031g) {
                int i2 = 0;
                Object a = C7578f.this.mo19476a(this.f19030f, 0);
                Object a2 = C7578f.this.mo19476a(this.f19030f, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f19031g) {
                C7578f.this.mo19479a(this.f19030f);
                this.f19030f--;
                this.f19029e--;
                this.f19031g = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f19031g) {
                return C7578f.this.mo19477a(this.f19030f, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                this.f19030f++;
                this.f19031g = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: e.e.f$e */
    final class C7583e implements Collection<V> {
        C7583e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C7578f.this.mo19478a();
        }

        public boolean contains(Object obj) {
            return C7578f.this.mo19481b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C7578f.this.mo19483c() == 0;
        }

        public Iterator<V> iterator() {
            return new C7579a(1);
        }

        public boolean remove(Object obj) {
            int b = C7578f.this.mo19481b(obj);
            if (b < 0) {
                return false;
            }
            C7578f.this.mo19479a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C7578f.this.mo19483c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C7578f.this.mo19476a(i, 1))) {
                    C7578f.this.mo19479a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C7578f.this.mo19483c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C7578f.this.mo19476a(i, 1))) {
                    C7578f.this.mo19479a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C7578f.this.mo19483c();
        }

        public Object[] toArray() {
            return C7578f.this.mo19529b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C7578f.this.mo19528a(tArr, 1);
        }
    }

    C7578f() {
    }

    /* renamed from: a */
    public static <K, V> boolean m18306a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m18308b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m18309c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo19475a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo19476a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo19477a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19478a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19479a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19480a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo19481b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo19482b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo19483c();

    /* renamed from: d */
    public Set<Entry<K, V>> mo19530d() {
        if (this.f19019a == null) {
            this.f19019a = new C7580b<>();
        }
        return this.f19019a;
    }

    /* renamed from: e */
    public Set<K> mo19531e() {
        if (this.f19020b == null) {
            this.f19020b = new C7581c<>();
        }
        return this.f19020b;
    }

    /* renamed from: f */
    public Collection<V> mo19532f() {
        if (this.f19021c == null) {
            this.f19021c = new C7583e<>();
        }
        return this.f19021c;
    }

    /* renamed from: a */
    public <T> T[] mo19528a(T[] tArr, int i) {
        int c = mo19483c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo19476a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    public Object[] mo19529b(int i) {
        int c = mo19483c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo19476a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> boolean m18307a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
