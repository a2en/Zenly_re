package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.sequences.a */
public final class C12978a<T> implements Sequence<T> {

    /* renamed from: a */
    private final AtomicReference<Sequence<T>> f33571a;

    public C12978a(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "sequence");
        this.f33571a = new AtomicReference<>(sequence);
    }

    public Iterator<T> iterator() {
        Sequence sequence = (Sequence) this.f33571a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
