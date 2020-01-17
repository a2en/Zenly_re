package kotlin.collections;

import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12927e;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.a */
public abstract class C12815a<E> implements Collection<E>, KMappedMarker {

    /* renamed from: kotlin.collections.a$a */
    static final class C12816a extends C12933k implements Function1<E, CharSequence> {

        /* renamed from: f */
        final /* synthetic */ C12815a f33410f;

        C12816a(C12815a aVar) {
            this.f33410f = aVar;
            super(1);
        }

        public final CharSequence invoke(E e) {
            return e == this.f33410f ? "(this Collection)" : String.valueOf(e);
        }
    }

    protected C12815a() {
    }

    /* renamed from: a */
    public abstract int mo36999a();

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C12932j.m33817a(a, obj)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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
        return mo36999a();
    }

    public Object[] toArray() {
        return C12927e.m33803a(this);
    }

    public String toString() {
        return C12857w.m33662a(this, ", ", "[", "]", 0, null, new C12816a(this), 24, null);
    }

    public <T> T[] toArray(T[] tArr) {
        C12932j.m33818b(tArr, "array");
        T[] a = C12927e.m33804a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
