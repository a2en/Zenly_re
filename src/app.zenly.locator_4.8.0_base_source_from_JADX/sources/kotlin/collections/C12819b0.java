package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.b0 */
public abstract class C12819b0 implements Iterator<Integer>, KMappedMarker {
    /* renamed from: a */
    public abstract int mo37031a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Integer next() {
        return Integer.valueOf(mo37031a());
    }
}
