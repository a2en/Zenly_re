package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C12927e;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.y */
public final class C12860y implements List, Serializable, RandomAccess, KMappedMarker {

    /* renamed from: e */
    public static final C12860y f33432e = new C12860y();
    private static final long serialVersionUID = -7390468764508069838L;

    private C12860y() {
    }

    private final Object readResolve() {
        return f33432e;
    }

    /* renamed from: a */
    public int mo37104a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo37105a(Void voidR) {
        C12932j.m33818b(voidR, "element");
        return false;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo37110b(Void voidR) {
        C12932j.m33818b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    public int mo37111c(Void voidR) {
        C12932j.m33818b(voidR, "element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo37105a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C12932j.m33818b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo37110b((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C12859x.f33431e;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo37111c((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C12859x.f33431e;
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo37104a();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public Object[] toArray() {
        return C12927e.m33803a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12927e.m33804a(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    public Void get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C12859x.f33431e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
