package p389io.reactivex.p405m;

import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;

/* renamed from: io.reactivex.m.b */
public final class C12774b {

    /* renamed from: a */
    public static final C12774b f33320a = new C12774b();

    /* renamed from: io.reactivex.m.b$a */
    static final class C12775a<T1, T2, R> implements BiFunction<T1, T2, C12899i<? extends T1, ? extends T2>> {

        /* renamed from: a */
        public static final C12775a f33321a = new C12775a();

        C12775a() {
        }

        public final C12899i<T1, T2> apply(T1 t1, T2 t2) {
            return C12954o.m33853a(t1, t2);
        }
    }

    /* renamed from: io.reactivex.m.b$b */
    static final class C12776b<T1, T2, R> implements BiFunction<T1, T2, C12899i<? extends T1, ? extends T2>> {

        /* renamed from: a */
        public static final C12776b f33322a = new C12776b();

        C12776b() {
        }

        public final C12899i<T1, T2> apply(T1 t1, T2 t2) {
            return C12954o.m33853a(t1, t2);
        }
    }

    private C12774b() {
    }

    /* renamed from: a */
    public final <T1, T2> C12279e<C12899i<T1, T2>> mo36955a(C12279e<T1> eVar, C12279e<T2> eVar2) {
        C12932j.m33818b(eVar, "source1");
        C12932j.m33818b(eVar2, "source2");
        return C12279e.m32610a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) eVar2, (BiFunction<? super T1, ? super T2, ? extends R>) C12775a.f33321a);
    }

    /* renamed from: b */
    public final <T1, T2> C12279e<C12899i<T1, T2>> mo36956b(C12279e<T1> eVar, C12279e<T2> eVar2) {
        C12932j.m33818b(eVar, "source1");
        C12932j.m33818b(eVar2, "source2");
        return C12279e.m32622b((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) eVar2, (BiFunction<? super T1, ? super T2, ? extends R>) C12776b.f33322a);
    }
}
