package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.sequences.b */
public final class C12979b<T> implements Sequence<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Sequence<T> f33572a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f33573b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<T, Boolean> f33574c;

    /* renamed from: kotlin.sequences.b$a */
    public static final class C12980a implements Iterator<T>, KMappedMarker {

        /* renamed from: e */
        private final Iterator<T> f33575e;

        /* renamed from: f */
        private int f33576f = -1;

        /* renamed from: g */
        private T f33577g;

        /* renamed from: h */
        final /* synthetic */ C12979b f33578h;

        C12980a(C12979b bVar) {
            this.f33578h = bVar;
            this.f33575e = bVar.f33572a.iterator();
        }

        /* renamed from: a */
        private final void m33898a() {
            while (this.f33575e.hasNext()) {
                T next = this.f33575e.next();
                if (((Boolean) this.f33578h.f33574c.invoke(next)).booleanValue() == this.f33578h.f33573b) {
                    this.f33577g = next;
                    this.f33576f = 1;
                    return;
                }
            }
            this.f33576f = 0;
        }

        public boolean hasNext() {
            if (this.f33576f == -1) {
                m33898a();
            }
            return this.f33576f == 1;
        }

        public T next() {
            if (this.f33576f == -1) {
                m33898a();
            }
            if (this.f33576f != 0) {
                T t = this.f33577g;
                this.f33577g = null;
                this.f33576f = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12979b(Sequence<? extends T> sequence, boolean z, Function1<? super T, Boolean> function1) {
        C12932j.m33818b(sequence, "sequence");
        C12932j.m33818b(function1, "predicate");
        this.f33572a = sequence;
        this.f33573b = z;
        this.f33574c = function1;
    }

    public Iterator<T> iterator() {
        return new C12980a(this);
    }
}
