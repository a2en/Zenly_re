package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.sequences.h */
class C12987h extends C12986g {

    /* renamed from: kotlin.sequences.h$a */
    public static final class C12988a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f33584a;

        public C12988a(Iterator it) {
            this.f33584a = it;
        }

        public Iterator<T> iterator() {
            return this.f33584a;
        }
    }

    /* renamed from: a */
    public static <T> Sequence<T> m33919a(Iterator<? extends T> it) {
        C12932j.m33818b(it, "$this$asSequence");
        return m33920a((Sequence<? extends T>) new C12988a<Object>(it));
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m33920a(Sequence<? extends T> sequence) {
        C12932j.m33818b(sequence, "$this$constrainOnce");
        return sequence instanceof C12978a ? sequence : new C12978a(sequence);
    }
}
