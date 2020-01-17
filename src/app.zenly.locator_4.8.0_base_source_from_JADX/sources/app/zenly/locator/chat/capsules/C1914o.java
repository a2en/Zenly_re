package app.zenly.locator.chat.capsules;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C1956d5;
import app.zenly.locator.chat.C2002h5;
import app.zenly.locator.chat.C2375w4;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.chat.capsules.o */
public final class C1914o {

    /* renamed from: a */
    private final ZenlySchedulers f6252a = C1351e.m6372a(C2382x4.f7181b.mo19916a("capsulesPresenter"));

    /* renamed from: b */
    private final C12275b f6253b = new C12275b();

    /* renamed from: c */
    private final C12785a<C1939r> f6254c;

    /* renamed from: d */
    private final String f6255d;

    /* renamed from: e */
    private final ZenlyCore f6256e;

    /* renamed from: f */
    private final C1956d5 f6257f;

    /* renamed from: g */
    private final C2375w4 f6258g;

    /* renamed from: h */
    private final CapsulesViewController f6259h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2002h5 f6260i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1941t f6261j;

    /* renamed from: app.zenly.locator.chat.capsules.o$a */
    public static final class C1915a<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C1914o f6262a;

        public C1915a(C1914o oVar) {
            this.f6262a = oVar;
        }

        public final R apply(T1 t1, T2 t2) {
            return this.f6262a.m7534a((List) t1, (C1939r) t2);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$b */
    static final /* synthetic */ class C1916b extends C12931i implements Function1<List<? extends C1908k>, C12956q> {
        C1916b(CapsulesViewController capsulesViewController) {
            super(1, capsulesViewController);
        }

        /* renamed from: a */
        public final void mo7661a(List<C1908k> list) {
            C12932j.m33818b(list, "p1");
            ((CapsulesViewController) this.f33505f).mo7630a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(CapsulesViewController.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "updateCapsules(Ljava/util/List;)V";
        }

        public final String getName() {
            return "updateCapsules";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7661a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$c */
    static final class C1917c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1917c f6263e = new C1917c();

        C1917c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed to update capsules", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$d */
    static final class C1918d<T> implements Consumer<List<C2242d>> {

        /* renamed from: e */
        final /* synthetic */ C1914o f6264e;

        C1918d(C1914o oVar) {
            this.f6264e = oVar;
        }

        /* renamed from: a */
        public final void accept(List<C2242d> list) {
            C1914o oVar = this.f6264e;
            C12932j.m33815a((Object) list, "emojis");
            oVar.m7536a(list);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$e */
    static final class C1919e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1919e f6265e = new C1919e();

        C1919e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32034c(th, "Unable to download emojis", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$f */
    static final /* synthetic */ class C1920f extends C12931i implements Function1<Integer, C12956q> {
        C1920f(C1941t tVar) {
            super(1, tVar);
        }

        /* renamed from: a */
        public final void mo7665a(int i) {
            ((C1941t) this.f33505f).mo7689a(i);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1941t.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "displayAvatar(I)V";
        }

        public final String getName() {
            return "displayAvatar";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7665a(((Number) obj).intValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$g */
    static final class C1921g<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1921g f6266e = new C1921g();

        C1921g() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Could not update emojis count", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$h */
    static final class C1922h<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C1914o f6267e;

        C1922h(C1914o oVar) {
            this.f6267e = oVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f6267e.f6261j.mo7688a();
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$i */
    static final class C1923i<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1923i f6268e = new C1923i();

        C1923i() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Could not update avatar blink", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$j */
    static final class C1924j<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C1914o f6269e;

        /* renamed from: app.zenly.locator.chat.capsules.o$j$a */
        static final /* synthetic */ class C1925a extends C12931i implements Function1<String, C12279e<UserProto$User>> {
            C1925a(C2002h5 h5Var) {
                super(1, h5Var);
            }

            /* renamed from: a */
            public final C12279e<UserProto$User> invoke(String str) {
                return ((C2002h5) this.f33505f).mo7813a(str);
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C2002h5.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "getPublicUser(Ljava/lang/String;)Lio/reactivex/Observable;";
            }

            public final String getName() {
                return "getPublicUser";
            }
        }

        /* renamed from: app.zenly.locator.chat.capsules.o$j$b */
        static final class C1926b<T> implements Comparator<UserProto$User> {

            /* renamed from: e */
            public static final C1926b f6270e = new C1926b();

            C1926b() {
            }

            /* renamed from: a */
            public final int compare(UserProto$User userProto$User, UserProto$User userProto$User2) {
                C12932j.m33815a((Object) userProto$User2, "o2");
                int min = Math.min(userProto$User2.getAvatarVersion(), 1);
                C12932j.m33815a((Object) userProto$User, "o1");
                return C12932j.m33811a(min, Math.min(userProto$User.getAvatarVersion(), 1));
            }
        }

        C1924j(C1914o oVar) {
            this.f6269e = oVar;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r1v3, types: [app.zenly.locator.chat.capsules.n] */
        /* JADX WARNING: type inference failed for: r0v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p389io.reactivex.C12279e<java.util.List<p213co.znly.models.UserProto$User>> apply(java.util.List<app.zenly.locator.chat.capsules.C1908k> r3) {
            /*
                r2 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C12932j.m33818b(r3, r0)
                java.util.List r3 = kotlin.collections.C12853s.m33648a(r3)
                io.reactivex.e r3 = p389io.reactivex.C12279e.m32623b(r3)
                kotlin.reflect.KProperty1 r0 = app.zenly.locator.chat.capsules.C1929p.f6272h
                if (r0 == 0) goto L_0x0017
                app.zenly.locator.chat.capsules.n r1 = new app.zenly.locator.chat.capsules.n
                r1.<init>(r0)
                r0 = r1
            L_0x0017:
                io.reactivex.functions.Function r0 = (p389io.reactivex.functions.Function) r0
                io.reactivex.e r3 = r3.mo36501i(r0)
                app.zenly.locator.chat.capsules.o$j$a r0 = new app.zenly.locator.chat.capsules.o$j$a
                app.zenly.locator.chat.capsules.o r1 = r2.f6269e
                app.zenly.locator.chat.h5 r1 = r1.f6260i
                r0.<init>(r1)
                app.zenly.locator.chat.capsules.n r1 = new app.zenly.locator.chat.capsules.n
                r1.<init>(r0)
                io.reactivex.e r3 = r3.mo36434a(r1)
                app.zenly.locator.chat.capsules.o$j$b r0 = app.zenly.locator.chat.capsules.C1914o.C1924j.C1926b.f6270e
                io.reactivex.e r3 = r3.mo36442a(r0)
                io.reactivex.g r3 = r3.mo36511n()
                io.reactivex.e r3 = r3.mo36553e()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.chat.capsules.C1914o.C1924j.apply(java.util.List):io.reactivex.e");
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$k */
    static final /* synthetic */ class C1927k extends C12931i implements Function1<List<? extends UserProto$User>, C12956q> {
        C1927k(C1941t tVar) {
            super(1, tVar);
        }

        /* renamed from: a */
        public final void mo7673a(List<UserProto$User> list) {
            C12932j.m33818b(list, "p1");
            ((C1941t) this.f33505f).mo7690a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1941t.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "setUsers(Ljava/util/List;)V";
        }

        public final String getName() {
            return "setUsers";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7673a((List) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.chat.capsules.o$l */
    static final class C1928l<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C1928l f6271e = new C1928l();

        C1928l() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Could not update emojis avatars", new Object[0]);
        }
    }

    public C1914o(String str, ZenlyCore zenlyCore, C1956d5 d5Var, C2375w4 w4Var, CapsulesViewController capsulesViewController, C2002h5 h5Var, C1941t tVar) {
        C12932j.m33818b(str, "conversationUuid");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(d5Var, "chatViewModel");
        C12932j.m33818b(w4Var, "emojisViewModel");
        C12932j.m33818b(capsulesViewController, "capsulesView");
        C12932j.m33818b(h5Var, "userRepository");
        C12932j.m33818b(tVar, "sendGroupEmojisTargetViewController");
        this.f6255d = str;
        this.f6256e = zenlyCore;
        this.f6257f = d5Var;
        this.f6258g = w4Var;
        this.f6259h = capsulesViewController;
        this.f6260i = h5Var;
        this.f6261j = tVar;
        C12785a<C1939r> h = C12785a.m33446h(new C1939r());
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(ChatEmojis())");
        this.f6254c = h;
    }

    /* renamed from: b */
    public final void mo7660b() {
        this.f6253b.mo36401a();
    }

    /* renamed from: a */
    public final void mo7658a() {
        C1930q qVar = new C1930q(this.f6255d, this.f6256e, this.f6257f);
        Disposable a = this.f6258g.mo8317c().mo36428a((C12286f) this.f6252a.getMainThread()).mo36412a((Consumer<? super T>) new C1918d<Object>(this), (Consumer<? super Throwable>) C1919e.f6265e);
        C12932j.m33815a((Object) a, "emojisViewModel.receiveE… emojis\") }\n            )");
        C12773a.m33432a(a, this.f6253b);
        Disposable a2 = this.f6258g.mo8315a().mo36428a((C12286f) this.f6252a.getMainThread()).mo36412a((Consumer<? super T>) new C1912m<Object>(new C1920f(this.f6261j)), (Consumer<? super Throwable>) C1921g.f6266e);
        C12932j.m33815a((Object) a2, "emojisViewModel.emojisCo…jis count\")\n            }");
        C12773a.m33432a(a2, this.f6253b);
        Disposable a3 = this.f6258g.mo8316b().mo36428a((C12286f) this.f6252a.getMainThread()).mo36412a((Consumer<? super T>) new C1922h<Object>(this), (Consumer<? super Throwable>) C1923i.f6268e);
        C12932j.m33815a((Object) a3, "emojisViewModel.emojisTi…r blink\") }\n            )");
        C12773a.m33432a(a3, this.f6253b);
        C12767a j = qVar.mo7676a().mo36428a((C12286f) this.f6252a.getComputation()).mo36503j();
        Disposable a4 = j.mo36477d().mo36424a(1, TimeUnit.SECONDS, true).mo36509m(new C1924j(this)).mo36428a((C12286f) this.f6252a.getMainThread()).mo36412a((Consumer<? super T>) new C1912m<Object>(new C1927k(this.f6261j)), (Consumer<? super Throwable>) C1928l.f6271e);
        C12932j.m33815a((Object) a4, "capsulesObservable\n     …s avatars\")\n            }");
        C12773a.m33432a(a4, this.f6253b);
        C12774b bVar = C12774b.f33320a;
        C12279e a5 = j.mo36477d().mo36424a(500, TimeUnit.MILLISECONDS, true);
        C12932j.m33815a((Object) a5, "capsulesObservable.disti…eUnit.MILLISECONDS, true)");
        C12279e a6 = this.f6254c.mo36428a((C12286f) this.f6252a.getComputation());
        C12932j.m33815a((Object) a6, "emojisSubject.observeOn(schedulers.computation)");
        Disposable a7 = C12279e.m32610a((ObservableSource<? extends T1>) a5, (ObservableSource<? extends T2>) a6, (BiFunction<? super T1, ? super T2, ? extends R>) new C1915a<Object,Object,Object>(this)).mo36477d().mo36428a((C12286f) this.f6252a.getMainThread()).mo36412a((Consumer<? super T>) new C1912m<Object>(new C1916b(this.f6259h)), (Consumer<? super Throwable>) C1917c.f6263e);
        C12932j.m33815a((Object) a7, "Observables.combineLates… capsules\")\n            }");
        C12773a.m33432a(a7, this.f6253b);
        Disposable r = j.mo36946r();
        C12932j.m33815a((Object) r, "capsulesObservable.connect()");
        C12773a.m33432a(r, this.f6253b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C1908k> m7534a(List<C1908k> list, C1939r rVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (C1908k kVar : C12857w.m33684g((Iterable) list)) {
            List a = rVar.mo7683a(kVar.mo7642d());
            if (!(!a.isEmpty()) || kVar.mo7643e()) {
                C1908k kVar2 = new C1908k(kVar.mo7642d(), kVar.mo7640b(), kVar.mo7639a(), a);
                arrayList.add(i, kVar2);
            } else {
                i++;
                C1908k kVar3 = new C1908k(kVar.mo7642d(), kVar.mo7640b(), kVar.mo7639a(), a);
                arrayList.add(0, kVar3);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7536a(List<? extends C2242d> list) {
        Object s = this.f6254c.mo36963s();
        if (s != null) {
            C12932j.m33815a(s, "emojisSubject.value!!");
            C1939r rVar = (C1939r) s;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : list) {
                String str = ((C2242d) next).f6868d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(next);
            }
            for (Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                C12932j.m33815a(key, "entry.key");
                rVar.mo7685a((String) key, (List) entry.getValue());
            }
            this.f6254c.onNext(rVar);
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public final void mo7659a(C2242d dVar) {
        C12932j.m33818b(dVar, "displayedEmoji");
        Object s = this.f6254c.mo36963s();
        if (s != null) {
            C12932j.m33815a(s, "emojisSubject.value!!");
            C1939r rVar = (C1939r) s;
            rVar.mo7684a(dVar);
            this.f6254c.onNext(rVar);
            return;
        }
        C12932j.m33814a();
        throw null;
    }
}
