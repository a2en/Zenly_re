package kotlin.sequences;

import java.util.Iterator;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.sequences.f */
class C12984f {

    /* renamed from: kotlin.sequences.f$a */
    public static final class C12985a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Function2 f33583a;

        public C12985a(Function2 function2) {
            this.f33583a = function2;
        }

        public Iterator<T> iterator() {
            return C12984f.m33917a(this.f33583a);
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m33917a(Function2<? super C12982d<? super T>, ? super Continuation<? super C12956q>, ? extends Object> function2) {
        C12932j.m33818b(function2, "block");
        C12981c cVar = new C12981c();
        cVar.mo37381a(C12877c.m33721a(function2, cVar, cVar));
        return cVar;
    }

    /* renamed from: b */
    public static <T> Sequence<T> m33918b(Function2<? super C12982d<? super T>, ? super Continuation<? super C12956q>, ? extends Object> function2) {
        C12932j.m33818b(function2, "block");
        return new C12985a(function2);
    }
}
