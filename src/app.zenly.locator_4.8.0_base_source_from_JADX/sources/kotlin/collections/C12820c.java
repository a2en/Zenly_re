package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.collections.c */
public abstract class C12820c<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: e */
    private C12849o0 f33413e = C12849o0.NotReady;

    /* renamed from: f */
    private T f33414f;

    /* renamed from: c */
    private final boolean m33500c() {
        this.f33413e = C12849o0.Failed;
        mo37034a();
        return this.f33413e == C12849o0.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo37034a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37036b(T t) {
        this.f33414f = t;
        this.f33413e = C12849o0.Ready;
    }

    public boolean hasNext() {
        if (this.f33413e != C12849o0.Failed) {
            int i = C12818b.f33412a[this.f33413e.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m33500c();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f33413e = C12849o0.NotReady;
            return this.f33414f;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37035b() {
        this.f33413e = C12849o0.Done;
    }
}
