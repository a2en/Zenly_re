package kotlin.collections;

import com.appsflyer.share.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.d */
public abstract class C12822d<E> extends C12815a<E> implements List<E>, KMappedMarker {

    /* renamed from: e */
    public static final C12823a f33415e = new C12823a(null);

    /* renamed from: kotlin.collections.d$a */
    public static final class C12823a {
        private C12823a() {
        }

        /* renamed from: a */
        public final void mo37057a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: b */
        public final void mo37060b(int i, int i2) {
            if (i < 0 || i > i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        public /* synthetic */ C12823a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo37058a(int i, int i2, int i3) {
            String str = "fromIndex: ";
            if (i < 0 || i2 > i3) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i > i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        public final int mo37056a(Collection<?> collection) {
            C12932j.m33818b(collection, Constants.URL_CAMPAIGN);
            int i = 1;
            for (Object next : collection) {
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        /* renamed from: a */
        public final boolean mo37059a(Collection<?> collection, Collection<?> collection2) {
            C12932j.m33818b(collection, Constants.URL_CAMPAIGN);
            C12932j.m33818b(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a : collection) {
                if (!C12932j.m33817a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: kotlin.collections.d$b */
    private class C12824b implements Iterator<E>, KMappedMarker {

        /* renamed from: e */
        private int f33416e;

        public C12824b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo37061a() {
            return this.f33416e;
        }

        public boolean hasNext() {
            return this.f33416e < C12822d.this.size();
        }

        public E next() {
            if (hasNext()) {
                C12822d dVar = C12822d.this;
                int i = this.f33416e;
                this.f33416e = i + 1;
                return dVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo37062a(int i) {
            this.f33416e = i;
        }
    }

    /* renamed from: kotlin.collections.d$c */
    private class C12825c extends C12824b implements ListIterator<E>, KMappedMarker {
        public C12825c(int i) {
            super();
            C12822d.f33415e.mo37060b(i, C12822d.this.size());
            mo37062a(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo37061a() > 0;
        }

        public int nextIndex() {
            return mo37061a();
        }

        public E previous() {
            if (hasPrevious()) {
                C12822d dVar = C12822d.this;
                mo37062a(mo37061a() - 1);
                return dVar.get(mo37061a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo37061a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.d$d */
    private static final class C12826d<E> extends C12822d<E> implements RandomAccess {

        /* renamed from: f */
        private int f33419f;

        /* renamed from: g */
        private final C12822d<E> f33420g;

        /* renamed from: h */
        private final int f33421h;

        public C12826d(C12822d<? extends E> dVar, int i, int i2) {
            C12932j.m33818b(dVar, "list");
            this.f33420g = dVar;
            this.f33421h = i;
            C12822d.f33415e.mo37058a(this.f33421h, i2, this.f33420g.size());
            this.f33419f = i2 - this.f33421h;
        }

        /* renamed from: a */
        public int mo36999a() {
            return this.f33419f;
        }

        public E get(int i) {
            C12822d.f33415e.mo37057a(i, this.f33419f);
            return this.f33420g.get(this.f33421h + i);
        }
    }

    protected C12822d() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f33415e.mo37059a((Collection<?>) this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f33415e.mo37056a(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C12932j.m33817a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C12824b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C12932j.m33817a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C12825c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C12826d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C12825c(i);
    }
}
