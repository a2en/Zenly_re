package p389io.reactivex.p405m;

import kotlin.C12899i;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleSource;
import p389io.reactivex.functions.BiFunction;

/* renamed from: io.reactivex.m.c */
public final class C12777c {

    /* renamed from: a */
    public static final C12777c f33323a = new C12777c();

    /* renamed from: io.reactivex.m.c$a */
    static final class C12778a<T1, T2, R> implements BiFunction<T, U, C12899i<? extends T, ? extends U>> {

        /* renamed from: a */
        public static final C12778a f33324a = new C12778a();

        C12778a() {
        }

        public final C12899i<T, U> apply(T t, U u) {
            return new C12899i<>(t, u);
        }
    }

    private C12777c() {
    }

    /* renamed from: a */
    public final <T, U> C12291g<C12899i<T, U>> mo36957a(SingleSource<T> singleSource, SingleSource<U> singleSource2) {
        C12932j.m33818b(singleSource, "s1");
        C12932j.m33818b(singleSource2, "s2");
        C12291g<C12899i<T, U>> a = C12291g.m32761a(singleSource, singleSource2, (BiFunction<? super T1, ? super T2, ? extends R>) C12778a.f33324a);
        C12932j.m33815a((Object) a, "Single.zip(s1, s2, BiFun…on { t, u -> Pair(t,u) })");
        return a;
    }
}
