package app.zenly.locator.chat.p058q5;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C2345v4;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.chat.panel.ChatPanelHelper.C2214e;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.chat.q5.a */
public final class C2286a {

    /* renamed from: a */
    private final ZenlySchedulers f6943a = C1351e.m6372a(C2382x4.f7181b.mo19916a("unreadPresenter"));

    /* renamed from: b */
    private final C12275b f6944b = new C12275b();

    /* renamed from: c */
    private final C12279e<String> f6945c;

    /* renamed from: d */
    private final C12279e<C2214e> f6946d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2345v4 f6947e;

    /* renamed from: f */
    private final C2294c f6948f;

    /* renamed from: app.zenly.locator.chat.q5.a$a */
    private static final class C2287a {

        /* renamed from: a */
        private final int f6949a;

        public C2287a(int i) {
            this.f6949a = i;
        }

        /* renamed from: a */
        public final int mo8148a() {
            return this.f6949a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C2287a) {
                    if (this.f6949a == ((C2287a) obj).f6949a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Integer.valueOf(this.f6949a).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Preview(unreadCount=");
            sb.append(this.f6949a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.chat.q5.a$b */
    public static final class C2288b<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            C2214e eVar = (C2214e) t2;
            int intValue = ((Number) t1).intValue();
            if (eVar == C2214e.CHAT) {
                intValue = 0;
            }
            return new C2287a(intValue);
        }
    }

    /* renamed from: app.zenly.locator.chat.q5.a$c */
    static final /* synthetic */ class C2289c extends C12931i implements Function1<C2287a, C12956q> {
        C2289c(C2286a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo8152a(C2287a aVar) {
            C12932j.m33818b(aVar, "p1");
            ((C2286a) this.f33505f).m8185a(aVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2286a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "handlePreview(Lapp/zenly/locator/chat/unread/UnreadPresenter$Preview;)V";
        }

        public final String getName() {
            return "handlePreview";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo8152a((C2287a) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.chat.q5.a$d */
    static final class C2290d<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2290d f6950e = new C2290d();

        C2290d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32034c(th, "Unable to get unread count", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.q5.a$e */
    static final class C2291e<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C2286a f6951e;

        /* renamed from: app.zenly.locator.chat.q5.a$e$a */
        static final class C2292a<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C2292a f6952e = new C2292a();

            C2292a() {
            }

            /* renamed from: a */
            public final int mo8155a(List<C1949d> list) {
                C12932j.m33818b(list, "it");
                return list.size();
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(mo8155a((List) obj));
            }
        }

        C2291e(C2286a aVar) {
            this.f6951e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Integer> apply(String str) {
            C12932j.m33818b(str, "cursor");
            return this.f6951e.f6947e.mo8246c(str).mo36501i(C2292a.f6952e);
        }
    }

    public C2286a(C12279e<String> eVar, C12279e<C2214e> eVar2, C2345v4 v4Var, C2294c cVar) {
        C12932j.m33818b(eVar, "cursorStream");
        C12932j.m33818b(eVar2, "chatStateStream");
        C12932j.m33818b(v4Var, "chatDataSource");
        C12932j.m33818b(cVar, "viewController");
        this.f6945c = eVar;
        this.f6946d = eVar2;
        this.f6947e = v4Var;
        this.f6948f = cVar;
    }

    /* renamed from: c */
    private final C12279e<Integer> m8187c() {
        C12279e<Integer> d = this.f6945c.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C2291e<Object,Object>(this)).mo36477d();
        C12932j.m33815a((Object) d, "cursorStream\n           …  .distinctUntilChanged()");
        return d;
    }

    /* renamed from: b */
    public final void mo8147b() {
        this.f6944b.mo36401a();
    }

    /* renamed from: a */
    public final void mo8146a() {
        C12774b bVar = C12774b.f33320a;
        Disposable a = C12279e.m32610a((ObservableSource<? extends T1>) m8187c(), (ObservableSource<? extends T2>) this.f6946d, (BiFunction<? super T1, ? super T2, ? extends R>) new C2288b<Object,Object,Object>()).mo36477d().mo36428a((C12286f) this.f6943a.getMainThread()).mo36412a((Consumer<? super T>) new C2293b<Object>(new C2289c(this)), (Consumer<? super Throwable>) C2290d.f6950e);
        C12932j.m33815a((Object) a, "Observables.combineLates…ead count\")\n            }");
        C12773a.m33432a(a, this.f6944b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8185a(C2287a aVar) {
        this.f6948f.mo8157b(aVar.mo8148a());
    }
}
