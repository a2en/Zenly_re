package app.zenly.locator.map.p109i1;

import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.map.p109i1.p110s1.C4062a;
import app.zenly.locator.map.p111j1.C4081c;
import app.zenly.locator.map.text.ContextualLabelingFormatterVariant;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.map.i1.n1 */
public final class C4037n1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Provider<C2718k5> f10620a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Provider<C4059r1> f10621b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Provider<ContextualLabelingFormatterVariant> f10622c;

    /* renamed from: app.zenly.locator.map.i1.n1$a */
    static final class C4038a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4037n1 f10623e;

        /* renamed from: app.zenly.locator.map.i1.n1$a$a */
        public static final class C4039a<T1, T2, R> implements BiFunction<T1, T2, R> {

            /* renamed from: a */
            final /* synthetic */ C4038a f10624a;

            public C4039a(C4038a aVar) {
                this.f10624a = aVar;
            }

            public final R apply(T1 t1, T2 t2) {
                String str = (String) t2;
                C4062a aVar = (C4062a) t1;
                ContextualLabelingFormatterVariant contextualLabelingFormatterVariant = (ContextualLabelingFormatterVariant) this.f10624a.f10623e.f10622c.get();
                C12932j.m33815a((Object) aVar, "event");
                C4081c b = aVar.mo10733b();
                C12932j.m33815a((Object) str, "tz");
                return contextualLabelingFormatterVariant.formatMeta(b, str);
            }
        }

        /* renamed from: app.zenly.locator.map.i1.n1$a$b */
        static final class C4040b<T> implements Predicate<C2831a> {

            /* renamed from: e */
            public static final C4040b f10625e = new C4040b();

            C4040b() {
            }

            /* renamed from: a */
            public final boolean test(C2831a aVar) {
                C12932j.m33818b(aVar, "friendEvent");
                return C2831a.m9302a(aVar.mo8857b(), (int) ItemAnimator.FLAG_MOVED);
            }
        }

        /* renamed from: app.zenly.locator.map.i1.n1$a$c */
        static final class C4041c<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C4041c f10626e = new C4041c();

            C4041c() {
            }

            /* renamed from: a */
            public final String apply(C2831a aVar) {
                C12932j.m33818b(aVar, "friendEvent");
                return aVar.mo8858c().f8218v;
            }
        }

        C4038a(C4037n1 n1Var) {
            this.f10623e = n1Var;
        }

        /* renamed from: a */
        public final C12279e<String> apply(String str) {
            C12932j.m33818b(str, "uuid");
            if (str.length() == 0) {
                return C12279e.m32626e("");
            }
            C12279e i = ((C2718k5) this.f10623e.f10620a.get()).mo8789b(str).mo36459b((Predicate<? super T>) C4040b.f10625e).mo36501i(C4041c.f10626e);
            C12774b bVar = C12774b.f33320a;
            C12279e e = ((C4059r1) this.f10623e.f10621b.get()).mo10728e();
            C12932j.m33815a((Object) e, "weatherManager.get().observable");
            C12932j.m33815a((Object) i, "timeZone");
            return C12279e.m32610a((ObservableSource<? extends T1>) e, (ObservableSource<? extends T2>) i, (BiFunction<? super T1, ? super T2, ? extends R>) new C4039a<Object,Object,Object>(this));
        }
    }

    public C4037n1(Provider<C2718k5> provider, Provider<C4059r1> provider2, Provider<ContextualLabelingFormatterVariant> provider3) {
        C12932j.m33818b(provider, "friendsManager");
        C12932j.m33818b(provider2, "weatherManager");
        C12932j.m33818b(provider3, "formatter");
        this.f10620a = provider;
        this.f10621b = provider2;
        this.f10622c = provider3;
    }

    /* renamed from: a */
    public final C12279e<String> mo10694a(C12279e<String> eVar) {
        C12932j.m33818b(eVar, "focusedUuid");
        C12279e<String> m = eVar.mo36509m(new C4038a(this));
        C12932j.m33815a((Object) m, "focusedUuid\n            …          }\n            }");
        return m;
    }
}
