package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.sequences.k */
public final class C12995k<T, R> implements Sequence<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Sequence<T> f33590a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<T, R> f33591b;

    /* renamed from: kotlin.sequences.k$a */
    public static final class C12996a implements Iterator<R>, KMappedMarker {

        /* renamed from: e */
        private final Iterator<T> f33592e;

        /* renamed from: f */
        final /* synthetic */ C12995k f33593f;

        C12996a(C12995k kVar) {
            this.f33593f = kVar;
            this.f33592e = kVar.f33590a.iterator();
        }

        public boolean hasNext() {
            return this.f33592e.hasNext();
        }

        public R next() {
            return this.f33593f.f33591b.invoke(this.f33592e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12995k(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        C12932j.m33818b(sequence, "sequence");
        C12932j.m33818b(function1, "transformer");
        this.f33590a = sequence;
        this.f33591b = function1;
    }

    public Iterator<R> iterator() {
        return new C12996a(this);
    }
}
