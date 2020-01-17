package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.jvm.internal.a */
final class C12921a<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: e */
    private int f33501e;

    /* renamed from: f */
    private final T[] f33502f;

    public C12921a(T[] tArr) {
        C12932j.m33818b(tArr, "array");
        this.f33502f = tArr;
    }

    public boolean hasNext() {
        return this.f33501e < this.f33502f.length;
    }

    public T next() {
        try {
            T[] tArr = this.f33502f;
            int i = this.f33501e;
            this.f33501e = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f33501e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
