package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C12927e;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.a0 */
public final class C12817a0 implements Set, Serializable, KMappedMarker {

    /* renamed from: e */
    public static final C12817a0 f33411e = new C12817a0();
    private static final long serialVersionUID = 3406603774387020532L;

    private C12817a0() {
    }

    private final Object readResolve() {
        return f33411e;
    }

    /* renamed from: a */
    public int mo37013a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo37014a(Void voidR) {
        C12932j.m33818b(voidR, "element");
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo37014a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C12932j.m33818b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C12859x.f33431e;
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

    public final /* bridge */ int size() {
        return mo37013a();
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
}
