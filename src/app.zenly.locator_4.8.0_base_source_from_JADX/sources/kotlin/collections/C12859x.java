package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.x */
public final class C12859x implements ListIterator, KMappedMarker {

    /* renamed from: e */
    public static final C12859x f33431e = new C12859x();

    private C12859x() {
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void next() {
        throw new NoSuchElementException();
    }

    public Void previous() {
        throw new NoSuchElementException();
    }
}
