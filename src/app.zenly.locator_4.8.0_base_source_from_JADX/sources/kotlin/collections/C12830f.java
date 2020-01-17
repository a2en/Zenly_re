package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C12923b;
import kotlin.jvm.internal.C12927e;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.f */
final class C12830f<T> implements Collection<T>, KMappedMarker {

    /* renamed from: e */
    private final T[] f33422e;

    /* renamed from: f */
    private final boolean f33423f;

    public C12830f(T[] tArr, boolean z) {
        C12932j.m33818b(tArr, "values");
        this.f33422e = tArr;
        this.f33423f = z;
    }

    /* renamed from: a */
    public int mo37077a() {
        return this.f33422e.length;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C12840k.m33571a(this.f33422e, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12932j.m33818b(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f33422e.length == 0;
    }

    public Iterator<T> iterator() {
        return C12923b.m33794a(this.f33422e);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo37077a();
    }

    public final Object[] toArray() {
        return C12846n.m33636a(this.f33422e, this.f33423f);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12927e.m33804a(this, tArr);
    }
}
