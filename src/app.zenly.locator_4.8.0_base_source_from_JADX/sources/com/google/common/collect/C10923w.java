package com.google.common.collect;

import com.google.common.base.C10838c;
import com.google.common.base.C10850i;
import com.google.common.collect.C10923w.C10937i;
import com.google.common.collect.C10923w.C10942n;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p333g.p357d.p367b.p368a.C12094b;

/* renamed from: com.google.common.collect.w */
class C10923w<K, V, E extends C10937i<K, V, E>, S extends C10942n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: n */
    static final C10929c0<Object, Object, C10932e> f28489n = new C10924a();
    private static final long serialVersionUID = 5;

    /* renamed from: e */
    final transient int f28490e;

    /* renamed from: f */
    final transient int f28491f;

    /* renamed from: g */
    final transient C10942n<K, V, E, S>[] f28492g;

    /* renamed from: h */
    final int f28493h;

    /* renamed from: i */
    final C10838c<Object> f28494i;

    /* renamed from: j */
    final transient C10938j<K, V, E, S> f28495j;

    /* renamed from: k */
    transient Set<K> f28496k;

    /* renamed from: l */
    transient Collection<V> f28497l;

    /* renamed from: m */
    transient Set<Entry<K, V>> f28498m;

    /* renamed from: com.google.common.collect.w$a */
    static class C10924a implements C10929c0<Object, Object, C10932e> {
        C10924a() {
        }

        /* renamed from: a */
        public C10929c0<Object, Object, C10932e> mo31825a(ReferenceQueue<Object> referenceQueue, C10932e eVar) {
            return this;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10929c0 mo31826a(ReferenceQueue referenceQueue, C10937i iVar) {
            mo31825a(referenceQueue, (C10932e) iVar);
            return this;
        }

        /* renamed from: a */
        public C10932e m28172a() {
            return null;
        }

        public void clear() {
        }

        public Object get() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.w$a0 */
    static final class C10925a0<K, V> extends C10942n<K, V, C10959z<K, V>, C10925a0<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final ReferenceQueue<K> f28499l = new ReferenceQueue<>();
        /* access modifiers changed from: private */

        /* renamed from: m */
        public final ReferenceQueue<V> f28500m = new ReferenceQueue<>();

        C10925a0(C10923w<K, V, C10959z<K, V>, C10925a0<K, V>> wVar, int i, int i2) {
            super(wVar, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo31830c() {
            mo31879a(this.f28499l);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo31831d() {
            mo31891b(this.f28499l);
            mo31893c(this.f28500m);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public C10925a0<K, V> mo31832i() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.w$b */
    static abstract class C10926b<K, V> extends C10894k<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: e */
        final C10944p f28501e;

        /* renamed from: f */
        final C10944p f28502f;

        /* renamed from: g */
        final C10838c<Object> f28503g;

        /* renamed from: h */
        final int f28504h;

        /* renamed from: i */
        transient ConcurrentMap<K, V> f28505i;

        C10926b(C10944p pVar, C10944p pVar2, C10838c<Object> cVar, C10838c<Object> cVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.f28501e = pVar;
            this.f28502f = pVar2;
            this.f28503g = cVar;
            this.f28504h = i;
            this.f28505i = concurrentMap;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C10922v mo31835b(ObjectInputStream objectInputStream) throws IOException {
            int readInt = objectInputStream.readInt();
            C10922v vVar = new C10922v();
            vVar.mo31792b(readInt);
            vVar.mo31790a(this.f28501e);
            vVar.mo31793b(this.f28502f);
            vVar.mo31789a(this.f28503g);
            vVar.mo31788a(this.f28504h);
            return vVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ConcurrentMap<K, V> m28181a() {
            return this.f28505i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31834a(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f28505i.size());
            for (Entry entry : this.f28505i.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31833a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.f28505i.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.common.collect.w$b0 */
    interface C10927b0<K, V, E extends C10937i<K, V, E>> extends C10937i<K, V, E> {
        /* renamed from: a */
        C10929c0<K, V, E> mo31836a();
    }

    /* renamed from: com.google.common.collect.w$c */
    static abstract class C10928c<K, V, E extends C10937i<K, V, E>> implements C10937i<K, V, E> {

        /* renamed from: a */
        final K f28506a;

        /* renamed from: b */
        final int f28507b;

        /* renamed from: c */
        final E f28508c;

        C10928c(K k, int i, E e) {
            this.f28506a = k;
            this.f28507b = i;
            this.f28508c = e;
        }

        public int getHash() {
            return this.f28507b;
        }

        public K getKey() {
            return this.f28506a;
        }

        public E getNext() {
            return this.f28508c;
        }
    }

    /* renamed from: com.google.common.collect.w$c0 */
    interface C10929c0<K, V, E extends C10937i<K, V, E>> {
        /* renamed from: a */
        C10929c0<K, V, E> mo31826a(ReferenceQueue<V> referenceQueue, E e);

        /* renamed from: a */
        E mo31827a();

        void clear();

        V get();
    }

    /* renamed from: com.google.common.collect.w$d */
    static abstract class C10930d<K, V, E extends C10937i<K, V, E>> extends WeakReference<K> implements C10937i<K, V, E> {

        /* renamed from: a */
        final int f28509a;

        /* renamed from: b */
        final E f28510b;

        C10930d(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f28509a = i;
            this.f28510b = e;
        }

        public int getHash() {
            return this.f28509a;
        }

        public K getKey() {
            return get();
        }

        public E getNext() {
            return this.f28510b;
        }
    }

    /* renamed from: com.google.common.collect.w$d0 */
    static final class C10931d0<K, V, E extends C10937i<K, V, E>> extends WeakReference<V> implements C10929c0<K, V, E> {

        /* renamed from: a */
        final E f28511a;

        C10931d0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f28511a = e;
        }

        /* renamed from: a */
        public E mo31827a() {
            return this.f28511a;
        }

        /* renamed from: a */
        public C10929c0<K, V, E> mo31826a(ReferenceQueue<V> referenceQueue, E e) {
            return new C10931d0(referenceQueue, get(), e);
        }
    }

    /* renamed from: com.google.common.collect.w$e */
    static final class C10932e implements C10937i<Object, Object, C10932e> {
        private C10932e() {
            throw new AssertionError();
        }

        public int getHash() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public Object getValue() {
            throw new AssertionError();
        }

        public C10932e getNext() {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.collect.w$e0 */
    final class C10933e0 extends C10872c<K, V> {

        /* renamed from: e */
        final K f28512e;

        /* renamed from: f */
        V f28513f;

        C10933e0(K k, V v) {
            this.f28512e = k;
            this.f28513f = v;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f28512e.equals(entry.getKey()) || !this.f28513f.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f28512e;
        }

        public V getValue() {
            return this.f28513f;
        }

        public int hashCode() {
            return this.f28512e.hashCode() ^ this.f28513f.hashCode();
        }

        public V setValue(V v) {
            V put = C10923w.this.put(this.f28512e, v);
            this.f28513f = v;
            return put;
        }
    }

    /* renamed from: com.google.common.collect.w$f */
    final class C10934f extends C10936h<Entry<K, V>> {
        C10934f(C10923w wVar) {
            super();
        }

        public Entry<K, V> next() {
            return mo31853b();
        }
    }

    /* renamed from: com.google.common.collect.w$g */
    final class C10935g extends C10941m<Entry<K, V>> {
        C10935g() {
            super(null);
        }

        public void clear() {
            C10923w.this.clear();
        }

        public boolean contains(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            Object obj2 = C10923w.this.get(key);
            if (obj2 != null && C10923w.this.mo31800a().mo31465b(entry.getValue(), obj2)) {
                z = true;
            }
            return z;
        }

        public boolean isEmpty() {
            return C10923w.this.isEmpty();
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C10934f(C10923w.this);
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key != null && C10923w.this.remove(key, entry.getValue())) {
                z = true;
            }
            return z;
        }

        public int size() {
            return C10923w.this.size();
        }
    }

    /* renamed from: com.google.common.collect.w$h */
    abstract class C10936h<T> implements Iterator<T> {

        /* renamed from: e */
        int f28516e;

        /* renamed from: f */
        int f28517f = -1;

        /* renamed from: g */
        C10942n<K, V, E, S> f28518g;

        /* renamed from: h */
        AtomicReferenceArray<E> f28519h;

        /* renamed from: i */
        E f28520i;

        /* renamed from: j */
        C10933e0 f28521j;

        /* renamed from: k */
        C10933e0 f28522k;

        C10936h() {
            this.f28516e = C10923w.this.f28492g.length - 1;
            mo31851a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo31851a() {
            this.f28521j = null;
            if (!mo31854c() && !mo31855d()) {
                while (true) {
                    int i = this.f28516e;
                    if (i < 0) {
                        break;
                    }
                    C10942n<K, V, E, S>[] nVarArr = C10923w.this.f28492g;
                    this.f28516e = i - 1;
                    this.f28518g = nVarArr[i];
                    if (this.f28518g.f28526f != 0) {
                        this.f28519h = this.f28518g.f28529i;
                        this.f28517f = this.f28519h.length() - 1;
                        if (mo31855d()) {
                            break;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C10933e0 mo31853b() {
            C10933e0 e0Var = this.f28521j;
            if (e0Var != null) {
                this.f28522k = e0Var;
                mo31851a();
                return this.f28522k;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo31854c() {
            E e = this.f28520i;
            if (e != null) {
                while (true) {
                    this.f28520i = e.getNext();
                    E e2 = this.f28520i;
                    if (e2 == null) {
                        break;
                    } else if (mo31852a(e2)) {
                        return true;
                    } else {
                        e = this.f28520i;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo31855d() {
            while (true) {
                int i = this.f28517f;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f28519h;
                this.f28517f = i - 1;
                E e = (C10937i) atomicReferenceArray.get(i);
                this.f28520i = e;
                if (e == null || (!mo31852a(this.f28520i) && !mo31854c())) {
                }
            }
            return true;
        }

        public boolean hasNext() {
            return this.f28521j != null;
        }

        public void remove() {
            C10882f.m28058a(this.f28522k != null);
            C10923w.this.remove(this.f28522k.getKey());
            this.f28522k = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31852a(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object a = C10923w.this.mo31802a(e);
                if (a != null) {
                    this.f28521j = new C10933e0<>(key, a);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f28518g.mo31896e();
            }
        }
    }

    /* renamed from: com.google.common.collect.w$i */
    interface C10937i<K, V, E extends C10937i<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* renamed from: com.google.common.collect.w$j */
    interface C10938j<K, V, E extends C10937i<K, V, E>, S extends C10942n<K, V, E, S>> {
        /* renamed from: a */
        E mo31858a(S s, E e, E e2);

        /* renamed from: a */
        E mo31859a(S s, K k, int i, E e);

        /* renamed from: a */
        S mo31860a(C10923w<K, V, E, S> wVar, int i, int i2);

        /* renamed from: a */
        C10944p mo31861a();

        /* renamed from: a */
        void mo31862a(S s, E e, V v);

        /* renamed from: b */
        C10944p mo31863b();
    }

    /* renamed from: com.google.common.collect.w$k */
    final class C10939k extends C10936h<K> {
        C10939k(C10923w wVar) {
            super();
        }

        public K next() {
            return mo31853b().getKey();
        }
    }

    /* renamed from: com.google.common.collect.w$l */
    final class C10940l extends C10941m<K> {
        C10940l() {
            super(null);
        }

        public void clear() {
            C10923w.this.clear();
        }

        public boolean contains(Object obj) {
            return C10923w.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return C10923w.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new C10939k(C10923w.this);
        }

        public boolean remove(Object obj) {
            return C10923w.this.remove(obj) != null;
        }

        public int size() {
            return C10923w.this.size();
        }
    }

    /* renamed from: com.google.common.collect.w$m */
    private static abstract class C10941m<E> extends AbstractSet<E> {
        private C10941m() {
        }

        public Object[] toArray() {
            return C10923w.m28159b((Collection<E>) this).toArray();
        }

        /* synthetic */ C10941m(C10924a aVar) {
            this();
        }

        public <T> T[] toArray(T[] tArr) {
            return C10923w.m28159b((Collection<E>) this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.w$n */
    static abstract class C10942n<K, V, E extends C10937i<K, V, E>, S extends C10942n<K, V, E, S>> extends ReentrantLock {

        /* renamed from: e */
        final C10923w<K, V, E, S> f28525e;

        /* renamed from: f */
        volatile int f28526f;

        /* renamed from: g */
        int f28527g;

        /* renamed from: h */
        int f28528h;

        /* renamed from: i */
        volatile AtomicReferenceArray<E> f28529i;

        /* renamed from: j */
        final int f28530j;

        /* renamed from: k */
        final AtomicInteger f28531k = new AtomicInteger();

        C10942n(C10923w<K, V, E, S> wVar, int i, int i2) {
            this.f28525e = wVar;
            this.f28530j = i2;
            mo31880a(mo31889b(i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31878a(E e, V v) {
            this.f28525e.f28495j.mo31862a(mo31832i(), e, v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public AtomicReferenceArray<E> mo31889b(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo31830c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo31893c(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.f28525e.mo31803a((C10929c0) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public E mo31894d(Object obj, int i) {
            return mo31892c(obj, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo31831d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public V mo31895e(Object obj, int i) {
            lock();
            try {
                mo31897f();
                AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                int length = (atomicReferenceArray.length() - 1) & i;
                C10937i iVar = (C10937i) atomicReferenceArray.get(length);
                C10937i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f28525e.f28494i.mo31465b(obj, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (!m28201b((E) iVar2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.f28527g++;
                        C10937i b = mo31886b((E) iVar, (E) iVar2);
                        int i2 = this.f28526f - 1;
                        atomicReferenceArray.set(length, b);
                        this.f28526f = i2;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo31897f() {
            mo31899h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo31898g() {
            mo31899h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo31899h() {
            if (tryLock()) {
                try {
                    mo31831d();
                    this.f28531k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public abstract S mo31832i();

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo31900j() {
            if (tryLock()) {
                try {
                    mo31831d();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public E mo31874a(E e, E e2) {
            return this.f28525e.f28495j.mo31858a(mo31832i(), e, e2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo31891b(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference poll = referenceQueue.poll();
                if (poll != null) {
                    this.f28525e.mo31807b((C10937i) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31880a(AtomicReferenceArray<E> atomicReferenceArray) {
            this.f28528h = (atomicReferenceArray.length() * 3) / 4;
            int i = this.f28528h;
            if (i == this.f28530j) {
                this.f28528h = i + 1;
            }
            this.f28529i = atomicReferenceArray;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public E mo31892c(Object obj, int i) {
            if (this.f28526f != 0) {
                for (E a = mo31873a(i); a != null; a = a.getNext()) {
                    if (a.getHash() == i) {
                        Object key = a.getKey();
                        if (key == null) {
                            mo31900j();
                        } else if (this.f28525e.f28494i.mo31465b(obj, key)) {
                            return a;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo31887b(Object obj, int i) {
            try {
                C10937i d = mo31894d(obj, i);
                if (d == null) {
                    return null;
                }
                V value = d.getValue();
                if (value == null) {
                    mo31900j();
                }
                mo31896e();
                return value;
            } finally {
                mo31896e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <T> void mo31879a(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public E mo31873a(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
            return (C10937i) atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31882a(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f28526f != 0) {
                    C10937i d = mo31894d(obj, i);
                    if (!(d == null || d.getValue() == null)) {
                        z = true;
                    }
                    return z;
                }
                mo31896e();
                return false;
            } finally {
                mo31896e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo31890b() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f28526f;
                AtomicReferenceArray<E> b = mo31889b(length << 1);
                this.f28528h = (b.length() * 3) / 4;
                int length2 = b.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C10937i iVar = (C10937i) atomicReferenceArray.get(i2);
                    if (iVar != null) {
                        C10937i next = iVar.getNext();
                        int hash = iVar.getHash() & length2;
                        if (next == null) {
                            b.set(hash, iVar);
                        } else {
                            C10937i iVar2 = iVar;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    iVar2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            b.set(hash, iVar2);
                            while (iVar != iVar2) {
                                int hash3 = iVar.getHash() & length2;
                                C10937i a = mo31874a((E) iVar, (E) (C10937i) b.get(hash3));
                                if (a != null) {
                                    b.set(hash3, a);
                                } else {
                                    i--;
                                }
                                iVar = iVar.getNext();
                            }
                        }
                    }
                }
                this.f28529i = b;
                this.f28526f = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo31876a(K k, int i, V v, boolean z) {
            lock();
            try {
                mo31897f();
                int i2 = this.f28526f + 1;
                if (i2 > this.f28528h) {
                    mo31890b();
                    i2 = this.f28526f + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                int length = (atomicReferenceArray.length() - 1) & i;
                C10937i iVar = (C10937i) atomicReferenceArray.get(length);
                C10937i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f28525e.f28494i.mo31465b(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            this.f28527g++;
                            mo31878a((E) iVar2, v);
                            this.f28526f = this.f28526f;
                            return null;
                        } else if (z) {
                            unlock();
                            return value;
                        } else {
                            this.f28527g++;
                            mo31878a((E) iVar2, v);
                            unlock();
                            return value;
                        }
                    }
                }
                this.f28527g++;
                C10937i a = this.f28525e.f28495j.mo31859a(mo31832i(), k, i, iVar);
                mo31878a((E) a, v);
                atomicReferenceArray.set(length, a);
                this.f28526f = i2;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo31896e() {
            if ((this.f28531k.incrementAndGet() & 63) == 0) {
                mo31898g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public V mo31888b(K k, int i, V v) {
            lock();
            try {
                mo31897f();
                AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                int length = (atomicReferenceArray.length() - 1) & i;
                C10937i iVar = (C10937i) atomicReferenceArray.get(length);
                C10937i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f28525e.f28494i.mo31465b(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (m28201b((E) iVar2)) {
                                this.f28527g++;
                                int i2 = this.f28526f - 1;
                                atomicReferenceArray.set(length, mo31886b((E) iVar, (E) iVar2));
                                this.f28526f = i2;
                            }
                            return null;
                        }
                        this.f28527g++;
                        mo31878a((E) iVar2, v);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31885a(K k, int i, V v, V v2) {
            lock();
            try {
                mo31897f();
                AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                int length = (atomicReferenceArray.length() - 1) & i;
                C10937i iVar = (C10937i) atomicReferenceArray.get(length);
                C10937i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f28525e.f28494i.mo31465b(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else {
                        Object value = iVar2.getValue();
                        if (value == null) {
                            if (m28201b((E) iVar2)) {
                                this.f28527g++;
                                int i2 = this.f28526f - 1;
                                atomicReferenceArray.set(length, mo31886b((E) iVar, (E) iVar2));
                                this.f28526f = i2;
                            }
                            return false;
                        } else if (this.f28525e.mo31800a().mo31465b(v, value)) {
                            this.f28527g++;
                            mo31878a((E) iVar2, v2);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public E mo31886b(E e, E e2) {
            int i = this.f28526f;
            E next = e2.getNext();
            while (e != e2) {
                E a = mo31874a(e, next);
                if (a != null) {
                    next = a;
                } else {
                    i--;
                }
                e = e.getNext();
            }
            this.f28526f = i;
            return next;
        }

        /* renamed from: b */
        static <K, V, E extends C10937i<K, V, E>> boolean m28201b(E e) {
            return e.getValue() == null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31884a(Object obj, int i, Object obj2) {
            lock();
            try {
                mo31897f();
                AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                int length = (atomicReferenceArray.length() - 1) & i;
                C10937i iVar = (C10937i) atomicReferenceArray.get(length);
                C10937i iVar2 = iVar;
                while (true) {
                    boolean z = false;
                    if (iVar2 != null) {
                        Object key = iVar2.getKey();
                        if (iVar2.getHash() != i || key == null || !this.f28525e.f28494i.mo31465b(obj, key)) {
                            iVar2 = iVar2.getNext();
                        } else {
                            if (this.f28525e.mo31800a().mo31465b(obj2, iVar2.getValue())) {
                                z = true;
                            } else if (!m28201b((E) iVar2)) {
                                unlock();
                                return false;
                            }
                            this.f28527g++;
                            int i2 = this.f28526f - 1;
                            atomicReferenceArray.set(length, mo31886b((E) iVar, (E) iVar2));
                            this.f28526f = i2;
                            return z;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31877a() {
            if (this.f28526f != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    mo31830c();
                    this.f28531k.set(0);
                    this.f28527g++;
                    this.f28526f = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31881a(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = (C10937i) atomicReferenceArray.get(length);
                for (E e3 = e2; e3 != null; e3 = e3.getNext()) {
                    if (e3 == e) {
                        this.f28527g++;
                        C10937i b = mo31886b(e2, e3);
                        int i2 = this.f28526f - 1;
                        atomicReferenceArray.set(length, b);
                        this.f28526f = i2;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31883a(K k, int i, C10929c0<K, V, E> c0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f28529i;
                int length = (atomicReferenceArray.length() - 1) & i;
                C10937i iVar = (C10937i) atomicReferenceArray.get(length);
                C10937i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.getHash() != i || key == null || !this.f28525e.f28494i.mo31465b(k, key)) {
                        iVar2 = iVar2.getNext();
                    } else if (((C10927b0) iVar2).mo31836a() == c0Var) {
                        this.f28527g++;
                        int i2 = this.f28526f - 1;
                        atomicReferenceArray.set(length, mo31886b((E) iVar, (E) iVar2));
                        this.f28526f = i2;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public V mo31875a(E e) {
            if (e.getKey() == null) {
                mo31900j();
                return null;
            }
            V value = e.getValue();
            if (value != null) {
                return value;
            }
            mo31900j();
            return null;
        }
    }

    /* renamed from: com.google.common.collect.w$o */
    private static final class C10943o<K, V> extends C10926b<K, V> {
        private static final long serialVersionUID = 3;

        C10943o(C10944p pVar, C10944p pVar2, C10838c<Object> cVar, C10838c<Object> cVar2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(pVar, pVar2, cVar, cVar2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f28505i = mo31835b(objectInputStream).mo31797f();
            mo31833a(objectInputStream);
        }

        private Object readResolve() {
            return this.f28505i;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            mo31834a(objectOutputStream);
        }
    }

    /* renamed from: com.google.common.collect.w$p */
    enum C10944p {
        STRONG {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public C10838c<Object> mo31901a() {
                return C10838c.m27972a();
            }
        },
        WEAK {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public C10838c<Object> mo31901a() {
                return C10838c.m27973b();
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C10838c<Object> mo31901a();
    }

    /* renamed from: com.google.common.collect.w$q */
    static final class C10947q<K, V> extends C10928c<K, V, C10947q<K, V>> implements C10953u<K, V, C10947q<K, V>> {

        /* renamed from: d */
        private volatile V f28535d = null;

        /* renamed from: com.google.common.collect.w$q$a */
        static final class C10948a<K, V> implements C10938j<K, V, C10947q<K, V>, C10949r<K, V>> {

            /* renamed from: a */
            private static final C10948a<?, ?> f28536a = new C10948a<>();

            C10948a() {
            }

            /* renamed from: c */
            static <K, V> C10948a<K, V> m28238c() {
                return f28536a;
            }

            /* renamed from: b */
            public C10944p mo31863b() {
                return C10944p.STRONG;
            }

            /* renamed from: a */
            public C10944p mo31861a() {
                return C10944p.STRONG;
            }

            /* renamed from: a */
            public C10949r<K, V> m28245a(C10923w<K, V, C10947q<K, V>, C10949r<K, V>> wVar, int i, int i2) {
                return new C10949r<>(wVar, i, i2);
            }

            /* renamed from: a */
            public C10947q<K, V> mo31858a(C10949r<K, V> rVar, C10947q<K, V> qVar, C10947q<K, V> qVar2) {
                return qVar.mo31902a(qVar2);
            }

            /* renamed from: a */
            public void mo31862a(C10949r<K, V> rVar, C10947q<K, V> qVar, V v) {
                qVar.mo31903a(v);
            }

            /* renamed from: a */
            public C10947q<K, V> mo31859a(C10949r<K, V> rVar, K k, int i, C10947q<K, V> qVar) {
                return new C10947q<>(k, i, qVar);
            }
        }

        C10947q(K k, int i, C10947q<K, V> qVar) {
            super(k, i, qVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31903a(V v) {
            this.f28535d = v;
        }

        public V getValue() {
            return this.f28535d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C10947q<K, V> mo31902a(C10947q<K, V> qVar) {
            C10947q<K, V> qVar2 = new C10947q<>(this.f28506a, this.f28507b, qVar);
            qVar2.f28535d = this.f28535d;
            return qVar2;
        }
    }

    /* renamed from: com.google.common.collect.w$r */
    static final class C10949r<K, V> extends C10942n<K, V, C10947q<K, V>, C10949r<K, V>> {
        C10949r(C10923w<K, V, C10947q<K, V>, C10949r<K, V>> wVar, int i, int i2) {
            super(wVar, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public C10949r<K, V> m28250i() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.w$s */
    static final class C10950s<K, V> extends C10928c<K, V, C10950s<K, V>> implements C10927b0<K, V, C10950s<K, V>> {

        /* renamed from: d */
        private volatile C10929c0<K, V, C10950s<K, V>> f28537d = C10923w.m28158b();

        /* renamed from: com.google.common.collect.w$s$a */
        static final class C10951a<K, V> implements C10938j<K, V, C10950s<K, V>, C10952t<K, V>> {

            /* renamed from: a */
            private static final C10951a<?, ?> f28538a = new C10951a<>();

            C10951a() {
            }

            /* renamed from: c */
            static <K, V> C10951a<K, V> m28254c() {
                return f28538a;
            }

            /* renamed from: b */
            public C10944p mo31863b() {
                return C10944p.STRONG;
            }

            /* renamed from: a */
            public C10944p mo31861a() {
                return C10944p.WEAK;
            }

            /* renamed from: a */
            public C10952t<K, V> m28261a(C10923w<K, V, C10950s<K, V>, C10952t<K, V>> wVar, int i, int i2) {
                return new C10952t<>(wVar, i, i2);
            }

            /* renamed from: a */
            public C10950s<K, V> mo31858a(C10952t<K, V> tVar, C10950s<K, V> sVar, C10950s<K, V> sVar2) {
                if (C10942n.m28201b(sVar)) {
                    return null;
                }
                return sVar.mo31907a(tVar.f28539l, sVar2);
            }

            /* renamed from: a */
            public void mo31862a(C10952t<K, V> tVar, C10950s<K, V> sVar, V v) {
                sVar.mo31908a(v, tVar.f28539l);
            }

            /* renamed from: a */
            public C10950s<K, V> mo31859a(C10952t<K, V> tVar, K k, int i, C10950s<K, V> sVar) {
                return new C10950s<>(k, i, sVar);
            }
        }

        C10950s(K k, int i, C10950s<K, V> sVar) {
            super(k, i, sVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31908a(V v, ReferenceQueue<V> referenceQueue) {
            C10929c0<K, V, C10950s<K, V>> c0Var = this.f28537d;
            this.f28537d = new C10931d0(referenceQueue, v, this);
            c0Var.clear();
        }

        public V getValue() {
            return this.f28537d.get();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C10950s<K, V> mo31907a(ReferenceQueue<V> referenceQueue, C10950s<K, V> sVar) {
            C10950s<K, V> sVar2 = new C10950s<>(this.f28506a, this.f28507b, sVar);
            sVar2.f28537d = this.f28537d.mo31826a(referenceQueue, sVar2);
            return sVar2;
        }

        /* renamed from: a */
        public C10929c0<K, V, C10950s<K, V>> mo31836a() {
            return this.f28537d;
        }
    }

    /* renamed from: com.google.common.collect.w$t */
    static final class C10952t<K, V> extends C10942n<K, V, C10950s<K, V>, C10952t<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final ReferenceQueue<V> f28539l = new ReferenceQueue<>();

        C10952t(C10923w<K, V, C10950s<K, V>, C10952t<K, V>> wVar, int i, int i2) {
            super(wVar, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo31830c() {
            mo31879a(this.f28539l);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo31831d() {
            mo31893c(this.f28539l);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public C10952t<K, V> m28269i() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.w$u */
    interface C10953u<K, V, E extends C10937i<K, V, E>> extends C10937i<K, V, E> {
    }

    /* renamed from: com.google.common.collect.w$v */
    final class C10954v extends C10936h<V> {
        C10954v(C10923w wVar) {
            super();
        }

        public V next() {
            return mo31853b().getValue();
        }
    }

    /* renamed from: com.google.common.collect.w$w */
    final class C10955w extends AbstractCollection<V> {
        C10955w() {
        }

        public void clear() {
            C10923w.this.clear();
        }

        public boolean contains(Object obj) {
            return C10923w.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return C10923w.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new C10954v(C10923w.this);
        }

        public int size() {
            return C10923w.this.size();
        }

        public Object[] toArray() {
            return C10923w.m28159b((Collection<E>) this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C10923w.m28159b((Collection<E>) this).toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.w$x */
    static final class C10956x<K, V> extends C10930d<K, V, C10956x<K, V>> implements C10953u<K, V, C10956x<K, V>> {

        /* renamed from: c */
        private volatile V f28541c = null;

        /* renamed from: com.google.common.collect.w$x$a */
        static final class C10957a<K, V> implements C10938j<K, V, C10956x<K, V>, C10958y<K, V>> {

            /* renamed from: a */
            private static final C10957a<?, ?> f28542a = new C10957a<>();

            C10957a() {
            }

            /* renamed from: c */
            static <K, V> C10957a<K, V> m28272c() {
                return f28542a;
            }

            /* renamed from: b */
            public C10944p mo31863b() {
                return C10944p.WEAK;
            }

            /* renamed from: a */
            public C10944p mo31861a() {
                return C10944p.STRONG;
            }

            /* renamed from: a */
            public C10958y<K, V> m28279a(C10923w<K, V, C10956x<K, V>, C10958y<K, V>> wVar, int i, int i2) {
                return new C10958y<>(wVar, i, i2);
            }

            /* renamed from: a */
            public C10956x<K, V> mo31858a(C10958y<K, V> yVar, C10956x<K, V> xVar, C10956x<K, V> xVar2) {
                if (xVar.getKey() == null) {
                    return null;
                }
                return xVar.mo31920a(yVar.f28543l, xVar2);
            }

            /* renamed from: a */
            public void mo31862a(C10958y<K, V> yVar, C10956x<K, V> xVar, V v) {
                xVar.mo31921a(v);
            }

            /* renamed from: a */
            public C10956x<K, V> mo31859a(C10958y<K, V> yVar, K k, int i, C10956x<K, V> xVar) {
                return new C10956x<>(yVar.f28543l, k, i, xVar);
            }
        }

        C10956x(ReferenceQueue<K> referenceQueue, K k, int i, C10956x<K, V> xVar) {
            super(referenceQueue, k, i, xVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31921a(V v) {
            this.f28541c = v;
        }

        public V getValue() {
            return this.f28541c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C10956x<K, V> mo31920a(ReferenceQueue<K> referenceQueue, C10956x<K, V> xVar) {
            C10956x<K, V> xVar2 = new C10956x<>(referenceQueue, getKey(), this.f28509a, xVar);
            xVar2.mo31921a(this.f28541c);
            return xVar2;
        }
    }

    /* renamed from: com.google.common.collect.w$y */
    static final class C10958y<K, V> extends C10942n<K, V, C10956x<K, V>, C10958y<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final ReferenceQueue<K> f28543l = new ReferenceQueue<>();

        C10958y(C10923w<K, V, C10956x<K, V>, C10958y<K, V>> wVar, int i, int i2) {
            super(wVar, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo31830c() {
            mo31879a(this.f28543l);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo31831d() {
            mo31891b(this.f28543l);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public C10958y<K, V> m28287i() {
            return this;
        }
    }

    /* renamed from: com.google.common.collect.w$z */
    static final class C10959z<K, V> extends C10930d<K, V, C10959z<K, V>> implements C10927b0<K, V, C10959z<K, V>> {

        /* renamed from: c */
        private volatile C10929c0<K, V, C10959z<K, V>> f28544c = C10923w.m28158b();

        /* renamed from: com.google.common.collect.w$z$a */
        static final class C10960a<K, V> implements C10938j<K, V, C10959z<K, V>, C10925a0<K, V>> {

            /* renamed from: a */
            private static final C10960a<?, ?> f28545a = new C10960a<>();

            C10960a() {
            }

            /* renamed from: c */
            static <K, V> C10960a<K, V> m28291c() {
                return f28545a;
            }

            /* renamed from: b */
            public C10944p mo31863b() {
                return C10944p.WEAK;
            }

            /* renamed from: a */
            public C10944p mo31861a() {
                return C10944p.WEAK;
            }

            /* renamed from: a */
            public C10925a0<K, V> m28295a(C10923w<K, V, C10959z<K, V>, C10925a0<K, V>> wVar, int i, int i2) {
                return new C10925a0<>(wVar, i, i2);
            }

            /* renamed from: a */
            public C10959z<K, V> mo31858a(C10925a0<K, V> a0Var, C10959z<K, V> zVar, C10959z<K, V> zVar2) {
                if (zVar.getKey() != null && !C10942n.m28201b(zVar)) {
                    return zVar.mo31925a(a0Var.f28499l, a0Var.f28500m, zVar2);
                }
                return null;
            }

            /* renamed from: a */
            public void mo31862a(C10925a0<K, V> a0Var, C10959z<K, V> zVar, V v) {
                zVar.mo31926a(v, a0Var.f28500m);
            }

            /* renamed from: a */
            public C10959z<K, V> mo31859a(C10925a0<K, V> a0Var, K k, int i, C10959z<K, V> zVar) {
                return new C10959z<>(a0Var.f28499l, k, i, zVar);
            }
        }

        C10959z(ReferenceQueue<K> referenceQueue, K k, int i, C10959z<K, V> zVar) {
            super(referenceQueue, k, i, zVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C10959z<K, V> mo31925a(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C10959z<K, V> zVar) {
            C10959z<K, V> zVar2 = new C10959z<>(referenceQueue, getKey(), this.f28509a, zVar);
            zVar2.f28544c = this.f28544c.mo31826a(referenceQueue2, zVar2);
            return zVar2;
        }

        public V getValue() {
            return this.f28544c.get();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31926a(V v, ReferenceQueue<V> referenceQueue) {
            C10929c0<K, V, C10959z<K, V>> c0Var = this.f28544c;
            this.f28544c = new C10931d0(referenceQueue, v, this);
            c0Var.clear();
        }

        /* renamed from: a */
        public C10929c0<K, V, C10959z<K, V>> mo31836a() {
            return this.f28544c;
        }
    }

    private C10923w(C10922v vVar, C10938j<K, V, E, S> jVar) {
        this.f28493h = Math.min(vVar.mo31787a(), 65536);
        this.f28494i = vVar.mo31794c();
        this.f28495j = jVar;
        int min = Math.min(vVar.mo31791b(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f28493h) {
            i4++;
            i3 <<= 1;
        }
        this.f28491f = 32 - i4;
        this.f28490e = i3 - 1;
        this.f28492g = mo31804a(i3);
        int i5 = min / i3;
        if (i3 * i5 < min) {
            i5++;
        }
        while (i2 < i5) {
            i2 <<= 1;
        }
        while (true) {
            C10942n<K, V, E, S>[] nVarArr = this.f28492g;
            if (i < nVarArr.length) {
                nVarArr[i] = mo31801a(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    static <K, V, E extends C10937i<K, V, E>> C10929c0<K, V, E> m28158b() {
        return f28489n;
    }

    /* renamed from: c */
    static int m28160c(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    public void clear() {
        for (C10942n<K, V, E, S> a : this.f28492g) {
            a.mo31877a();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int b = mo31805b(obj);
        return mo31806b(b).mo31882a(obj, b);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        C10942n<K, V, E, S>[] nVarArr = this.f28492g;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (C10942n<K, V, E, S> nVar : nVarArr) {
                int i2 = nVar.f28526f;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.f28529i;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (C10937i iVar = (C10937i) atomicReferenceArray.get(i3); iVar != null; iVar = iVar.getNext()) {
                        Object a = nVar.mo31875a(iVar);
                        if (a != null && mo31800a().mo31465b(obj2, a)) {
                            return true;
                        }
                    }
                }
                j2 += (long) nVar.f28527g;
            }
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f28498m;
        if (set != null) {
            return set;
        }
        C10935g gVar = new C10935g();
        this.f28498m = gVar;
        return gVar;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int b = mo31805b(obj);
        return mo31806b(b).mo31887b(obj, b);
    }

    public boolean isEmpty() {
        C10942n<K, V, E, S>[] nVarArr = this.f28492g;
        long j = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].f28526f != 0) {
                return false;
            }
            j += (long) nVarArr[i].f28527g;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < nVarArr.length; i2++) {
                if (nVarArr[i2].f28526f != 0) {
                    return false;
                }
                j -= (long) nVarArr[i2].f28527g;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public Set<K> keySet() {
        Set<K> set = this.f28496k;
        if (set != null) {
            return set;
        }
        C10940l lVar = new C10940l();
        this.f28496k = lVar;
        return lVar;
    }

    public V put(K k, V v) {
        C10850i.m28004a(k);
        C10850i.m28004a(v);
        int b = mo31805b((Object) k);
        return mo31806b(b).mo31876a(k, b, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V putIfAbsent(K k, V v) {
        C10850i.m28004a(k);
        C10850i.m28004a(v);
        int b = mo31805b((Object) k);
        return mo31806b(b).mo31876a(k, b, v, true);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int b = mo31805b(obj);
        return mo31806b(b).mo31895e(obj, b);
    }

    public boolean replace(K k, V v, V v2) {
        C10850i.m28004a(k);
        C10850i.m28004a(v2);
        if (v == null) {
            return false;
        }
        int b = mo31805b((Object) k);
        return mo31806b(b).mo31885a(k, b, v, v2);
    }

    public int size() {
        long j = 0;
        for (C10942n<K, V, E, S> nVar : this.f28492g) {
            j += (long) nVar.f28526f;
        }
        return C12094b.m31911a(j);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f28497l;
        if (collection != null) {
            return collection;
        }
        C10955w wVar = new C10955w();
        this.f28497l = wVar;
        return wVar;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        C10943o oVar = new C10943o(this.f28495j.mo31863b(), this.f28495j.mo31861a(), this.f28494i, this.f28495j.mo31861a().mo31901a(), this.f28493h, this);
        return oVar;
    }

    /* renamed from: a */
    static <K, V> C10923w<K, V, ? extends C10937i<K, V, ?>, ?> m28156a(C10922v vVar) {
        if (vVar.mo31795d() == C10944p.STRONG && vVar.mo31796e() == C10944p.STRONG) {
            return new C10923w<>(vVar, C10948a.m28238c());
        }
        if (vVar.mo31795d() == C10944p.STRONG && vVar.mo31796e() == C10944p.WEAK) {
            return new C10923w<>(vVar, C10951a.m28254c());
        }
        if (vVar.mo31795d() == C10944p.WEAK && vVar.mo31796e() == C10944p.STRONG) {
            return new C10923w<>(vVar, C10957a.m28272c());
        }
        if (vVar.mo31795d() == C10944p.WEAK && vVar.mo31796e() == C10944p.WEAK) {
            return new C10923w<>(vVar, C10960a.m28291c());
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo31805b(Object obj) {
        return m28160c(this.f28494i.mo31464b(obj));
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int b = mo31805b(obj);
        return mo31806b(b).mo31884a(obj, b, obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo31807b(E e) {
        int hash = e.getHash();
        mo31806b(hash).mo31881a(e, hash);
    }

    public V replace(K k, V v) {
        C10850i.m28004a(k);
        C10850i.m28004a(v);
        int b = mo31805b((Object) k);
        return mo31806b(b).mo31888b(k, b, v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C10942n<K, V, E, S> mo31806b(int i) {
        return this.f28492g[(i >>> this.f28491f) & this.f28490e];
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> ArrayList<E> m28159b(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C10917t.m28134a((Collection<T>) arrayList, collection.iterator());
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31803a(C10929c0<K, V, E> c0Var) {
        C10937i a = c0Var.mo31827a();
        int hash = a.getHash();
        mo31806b(hash).mo31883a(a.getKey(), hash, c0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10942n<K, V, E, S> mo31801a(int i, int i2) {
        return this.f28495j.mo31860a(this, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public V mo31802a(E e) {
        if (e.getKey() == null) {
            return null;
        }
        V value = e.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10942n<K, V, E, S>[] mo31804a(int i) {
        return new C10942n[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10838c<Object> mo31800a() {
        return this.f28495j.mo31861a().mo31901a();
    }
}
