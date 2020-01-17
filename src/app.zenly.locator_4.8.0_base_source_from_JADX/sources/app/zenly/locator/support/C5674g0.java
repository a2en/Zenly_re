package app.zenly.locator.support;

import app.zenly.locator.core.models.C2877d;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.support.model.C5718k;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import zendesk.support.Request;

/* renamed from: app.zenly.locator.support.g0 */
public final class C5674g0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5724n0 f14447a;

    /* renamed from: app.zenly.locator.support.g0$a */
    public static final class C5675a {
        private C5675a() {
        }

        public /* synthetic */ C5675a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.g0$b */
    static final class C5676b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5674g0 f14448e;

        /* renamed from: app.zenly.locator.support.g0$b$a */
        static final class C5677a<T, R> implements Function<C12279e<Throwable>, ObservableSource<?>> {

            /* renamed from: e */
            public static final C5677a f14449e = new C5677a();

            /* renamed from: app.zenly.locator.support.g0$b$a$a */
            static final class C5678a<T, R> implements Function<T, ObservableSource<? extends R>> {

                /* renamed from: e */
                public static final C5678a f14450e = new C5678a();

                C5678a() {
                }

                /* renamed from: a */
                public final C12279e<Long> apply(Throwable th) {
                    C12932j.m33818b(th, "<anonymous parameter 0>");
                    return C12279e.m32630h(5, TimeUnit.SECONDS);
                }
            }

            C5677a() {
            }

            /* renamed from: a */
            public final C12279e<Long> apply(C12279e<Throwable> eVar) {
                C12932j.m33818b(eVar, "errors");
                return eVar.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C5678a.f14450e);
            }
        }

        C5676b(C5674g0 g0Var) {
            this.f14448e = g0Var;
        }

        /* renamed from: a */
        public final C12279e<List<Request>> apply(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return this.f14448e.f14447a.mo13401c().mo36507l(C5677a.f14449e);
        }
    }

    /* renamed from: app.zenly.locator.support.g0$c */
    static final class C5679c<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C5679c f14451e = new C5679c();

        C5679c() {
        }

        /* renamed from: a */
        public final Boolean mo13341a(Boolean bool) {
            C12932j.m33818b(bool, "unseen");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo13341a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: app.zenly.locator.support.g0$d */
    public static final class C5680d<T1, T2, R> implements BiFunction<List<? extends Request>, Map<String, C2877d>, R> {
        public final R apply(List<? extends Request> list, Map<String, C2877d> map) {
            Map map2 = map;
            List<Request> list2 = list;
            R arrayList = new ArrayList(C12850p.m33647a(list2, 10));
            for (Request request : list2) {
                Integer commentCount = request.getCommentCount();
                boolean z = false;
                if (commentCount == null) {
                    commentCount = Integer.valueOf(0);
                }
                if (C12932j.m33811a(commentCount.intValue(), 1) > 0) {
                    C2877d dVar = (C2877d) map2.get(request.getId());
                    Date publicUpdatedAt = request.getPublicUpdatedAt();
                    if (!(dVar == null || publicUpdatedAt == null)) {
                        Timestamp viewedAt = dVar.getViewedAt();
                        C12932j.m33815a((Object) viewedAt, "viewed.viewedAt");
                        if (C3245z.m10288g(viewedAt) >= publicUpdatedAt.getTime()) {
                        }
                    }
                    z = true;
                }
                arrayList.add(new C5718k(request, z));
            }
            return arrayList;
        }
    }

    static {
        new C5675a(null);
    }

    public C5674g0(C5724n0 n0Var) {
        C12932j.m33818b(n0Var, "zendeskSdk");
        this.f14447a = n0Var;
    }

    /* renamed from: c */
    private final C12279e<List<Request>> m15998c() {
        return m15999d().mo36509m(new C5676b(this));
    }

    /* renamed from: d */
    private final C12279e<Boolean> m15999d() {
        C12279e<Boolean> a = C12279e.m32604a((ObservableSource<? extends T>) C12279e.m32626e(Boolean.valueOf(true)), (ObservableSource<? extends T>) this.f14447a.mo13408h().mo36459b((Predicate<? super T>) C5679c.f14451e));
        C12932j.m33815a((Object) a, "Observable.concat(\n     … unseen -> unseen }\n    )");
        return a;
    }

    /* renamed from: b */
    public final C12279e<List<C5718k>> mo13337b() {
        C12279e c = m15998c();
        C12932j.m33815a((Object) c, "requests()");
        C12279e<List<C5718k>> a = c.mo36426a((ObservableSource<? extends U>) this.f14447a.mo13403d(), (BiFunction<? super T, ? super U, ? extends R>) new C5680d<Object,Object,Object>());
        C12932j.m33815a((Object) a, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return a;
    }

    /* renamed from: a */
    public final void mo13336a() {
        C5448c.m15478a().zendeskSeenTickets();
    }
}
