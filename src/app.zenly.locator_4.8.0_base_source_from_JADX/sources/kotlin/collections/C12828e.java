package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.markers.KMutableList;

/* renamed from: kotlin.collections.e */
public abstract class C12828e<E> extends AbstractList<E> implements List<E>, KMutableList {
    protected C12828e() {
    }

    /* renamed from: a */
    public abstract int mo37073a();

    /* renamed from: a */
    public abstract E mo37074a(int i);

    public final /* bridge */ E remove(int i) {
        return mo37074a(i);
    }

    public final /* bridge */ int size() {
        return mo37073a();
    }
}
