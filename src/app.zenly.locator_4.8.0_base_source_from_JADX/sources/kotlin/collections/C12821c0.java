package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.c0 */
public abstract class C12821c0 implements Iterator<Long>, KMappedMarker {
    /* renamed from: a */
    public abstract long mo37040a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Long next() {
        return Long.valueOf(mo37040a());
    }
}
