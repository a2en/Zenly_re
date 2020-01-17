package p214e.p222b.p223a.p225b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: e.b.a.b.b */
public class C7558b<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: e */
    C7561c<K, V> f18977e;

    /* renamed from: f */
    private C7561c<K, V> f18978f;

    /* renamed from: g */
    private WeakHashMap<C7564f<K, V>, Boolean> f18979g = new WeakHashMap<>();

    /* renamed from: h */
    private int f18980h = 0;

    /* renamed from: e.b.a.b.b$a */
    static class C7559a<K, V> extends C7563e<K, V> {
        C7559a(C7561c<K, V> cVar, C7561c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7561c<K, V> mo19457b(C7561c<K, V> cVar) {
            return cVar.f18984h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C7561c<K, V> mo19458c(C7561c<K, V> cVar) {
            return cVar.f18983g;
        }
    }

    /* renamed from: e.b.a.b.b$b */
    private static class C7560b<K, V> extends C7563e<K, V> {
        C7560b(C7561c<K, V> cVar, C7561c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7561c<K, V> mo19457b(C7561c<K, V> cVar) {
            return cVar.f18983g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C7561c<K, V> mo19458c(C7561c<K, V> cVar) {
            return cVar.f18984h;
        }
    }

    /* renamed from: e.b.a.b.b$c */
    static class C7561c<K, V> implements Entry<K, V> {

        /* renamed from: e */
        final K f18981e;

        /* renamed from: f */
        final V f18982f;

        /* renamed from: g */
        C7561c<K, V> f18983g;

        /* renamed from: h */
        C7561c<K, V> f18984h;

        C7561c(K k, V v) {
            this.f18981e = k;
            this.f18982f = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7561c)) {
                return false;
            }
            C7561c cVar = (C7561c) obj;
            if (!this.f18981e.equals(cVar.f18981e) || !this.f18982f.equals(cVar.f18982f)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.f18981e;
        }

        public V getValue() {
            return this.f18982f;
        }

        public int hashCode() {
            return this.f18981e.hashCode() ^ this.f18982f.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18981e);
            sb.append("=");
            sb.append(this.f18982f);
            return sb.toString();
        }
    }

    /* renamed from: e.b.a.b.b$d */
    private class C7562d implements Iterator<Entry<K, V>>, C7564f<K, V> {

        /* renamed from: e */
        private C7561c<K, V> f18985e;

        /* renamed from: f */
        private boolean f18986f = true;

        C7562d() {
        }

        /* renamed from: a */
        public void mo19465a(C7561c<K, V> cVar) {
            C7561c<K, V> cVar2 = this.f18985e;
            if (cVar == cVar2) {
                this.f18985e = cVar2.f18984h;
                this.f18986f = this.f18985e == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.f18986f) {
                if (C7558b.this.f18977e == null) {
                    z = false;
                }
                return z;
            }
            C7561c<K, V> cVar = this.f18985e;
            if (cVar == null || cVar.f18983g == null) {
                z = false;
            }
            return z;
        }

        public Entry<K, V> next() {
            if (this.f18986f) {
                this.f18986f = false;
                this.f18985e = C7558b.this.f18977e;
            } else {
                C7561c<K, V> cVar = this.f18985e;
                this.f18985e = cVar != null ? cVar.f18983g : null;
            }
            return this.f18985e;
        }
    }

    /* renamed from: e.b.a.b.b$e */
    private static abstract class C7563e<K, V> implements Iterator<Entry<K, V>>, C7564f<K, V> {

        /* renamed from: e */
        C7561c<K, V> f18988e;

        /* renamed from: f */
        C7561c<K, V> f18989f;

        C7563e(C7561c<K, V> cVar, C7561c<K, V> cVar2) {
            this.f18988e = cVar2;
            this.f18989f = cVar;
        }

        /* renamed from: a */
        public void mo19465a(C7561c<K, V> cVar) {
            if (this.f18988e == cVar && cVar == this.f18989f) {
                this.f18989f = null;
                this.f18988e = null;
            }
            C7561c<K, V> cVar2 = this.f18988e;
            if (cVar2 == cVar) {
                this.f18988e = mo19457b(cVar2);
            }
            if (this.f18989f == cVar) {
                this.f18989f = m18245a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C7561c<K, V> mo19457b(C7561c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract C7561c<K, V> mo19458c(C7561c<K, V> cVar);

        public boolean hasNext() {
            return this.f18989f != null;
        }

        public Entry<K, V> next() {
            C7561c<K, V> cVar = this.f18989f;
            this.f18989f = m18245a();
            return cVar;
        }

        /* renamed from: a */
        private C7561c<K, V> m18245a() {
            C7561c<K, V> cVar = this.f18989f;
            C7561c<K, V> cVar2 = this.f18988e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo19458c(cVar);
        }
    }

    /* renamed from: e.b.a.b.b$f */
    interface C7564f<K, V> {
        /* renamed from: a */
        void mo19465a(C7561c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7561c<K, V> mo19442a(K k) {
        C7561c<K, V> cVar = this.f18977e;
        while (cVar != null && !cVar.f18981e.equals(k)) {
            cVar = cVar.f18983g;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo19443b(K k, V v) {
        C7561c a = mo19442a(k);
        if (a != null) {
            return a.f18982f;
        }
        mo19447a(k, v);
        return null;
    }

    /* renamed from: c */
    public Entry<K, V> mo19450c() {
        return this.f18978f;
    }

    public Iterator<Entry<K, V>> descendingIterator() {
        C7560b bVar = new C7560b(this.f18978f, this.f18977e);
        this.f18979g.put(bVar, Boolean.valueOf(false));
        return bVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7558b)) {
            return false;
        }
        C7558b bVar = (C7558b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Entry<K, V>> iterator() {
        C7559a aVar = new C7559a(this.f18977e, this.f18978f);
        this.f18979g.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public V remove(K k) {
        C7561c a = mo19442a(k);
        if (a == null) {
            return null;
        }
        this.f18980h--;
        if (!this.f18979g.isEmpty()) {
            for (C7564f a2 : this.f18979g.keySet()) {
                a2.mo19465a(a);
            }
        }
        C7561c<K, V> cVar = a.f18984h;
        if (cVar != null) {
            cVar.f18983g = a.f18983g;
        } else {
            this.f18977e = a.f18983g;
        }
        C7561c<K, V> cVar2 = a.f18983g;
        if (cVar2 != null) {
            cVar2.f18984h = a.f18984h;
        } else {
            this.f18978f = a.f18984h;
        }
        a.f18983g = null;
        a.f18984h = null;
        return a.f18982f;
    }

    public int size() {
        return this.f18980h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7561c<K, V> mo19447a(K k, V v) {
        C7561c<K, V> cVar = new C7561c<>(k, v);
        this.f18980h++;
        C7561c<K, V> cVar2 = this.f18978f;
        if (cVar2 == null) {
            this.f18977e = cVar;
            this.f18978f = this.f18977e;
            return cVar;
        }
        cVar2.f18983g = cVar;
        cVar.f18984h = cVar2;
        this.f18978f = cVar;
        return cVar;
    }

    /* renamed from: b */
    public C7562d mo19449b() {
        C7562d dVar = new C7562d<>();
        this.f18979g.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    /* renamed from: a */
    public Entry<K, V> mo19448a() {
        return this.f18977e;
    }
}
