package app.zenly.locator.descendants;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs.C1379a;
import app.zenly.locator.core.util.C3245z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C12956q;
import kotlin.collections.C12844m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserPreferencesProto$UserPreferences.C6915b;
import p213co.znly.models.UserPreferencesProto$UserPreferences.C6915b.C6916a;
import p213co.znly.models.core.C7226u0;
import p213co.znly.models.core.C7236v0;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12785a;
import p389io.reactivex.p406n.C12789c;
import p389io.reactivex.p406n.C12798f;

/* renamed from: app.zenly.locator.descendants.d */
public final class C3509d implements DescendantsPrefs {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ZenlySchedulers f9497a = C1351e.m6372a(C3505b.f9488b.mo19916a("preferences"));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12798f<Function1<C1379a, C1379a>> f9498b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12785a<C1379a> f9499c;

    /* renamed from: d */
    private final C12785a<Integer> f9500d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ZenlyCore f9501e;

    /* renamed from: app.zenly.locator.descendants.d$a */
    static final /* synthetic */ class C3510a extends C12931i implements Function0<C1379a> {
        C3510a(C3509d dVar) {
            super(0, dVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3509d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "prefsFromCore()Lapp/zenly/android/feature/descendants/feedback/DescendantsPrefs$Preferences;";
        }

        public final String getName() {
            return "prefsFromCore";
        }

        public final C1379a invoke() {
            return ((C3509d) this.f33505f).m10693a();
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$b */
    static final class C3511b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3509d f9502e;

        /* renamed from: app.zenly.locator.descendants.d$b$a */
        static final class C3512a<T1, T2, R> implements BiFunction<R, T, R> {

            /* renamed from: a */
            public static final C3512a f9503a = new C3512a();

            C3512a() {
            }

            /* renamed from: a */
            public final C1379a apply(C1379a aVar, Function1<? super C1379a, C1379a> function1) {
                C12932j.m33818b(aVar, "prefs");
                C12932j.m33818b(function1, "operation");
                return (C1379a) function1.invoke(aVar);
            }
        }

        /* renamed from: app.zenly.locator.descendants.d$b$b */
        static final /* synthetic */ class C3513b extends C12931i implements Function1<C1379a, C12956q> {
            C3513b(C12785a aVar) {
                super(1, aVar);
            }

            /* renamed from: a */
            public final void mo9976a(C1379a aVar) {
                C12932j.m33818b(aVar, "p1");
                ((C12785a) this.f33505f).onNext(aVar);
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C12785a.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "onNext(Ljava/lang/Object;)V";
            }

            public final String getName() {
                return "onNext";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9976a((C1379a) obj);
                return C12956q.f33541a;
            }
        }

        C3511b(C3509d dVar) {
            this.f9502e = dVar;
        }

        /* renamed from: a */
        public final C12279e<C1379a> apply(C1379a aVar) {
            C12932j.m33818b(aVar, "prefsFromCore");
            return this.f9502e.f9498b.mo36441a(aVar, (BiFunction<R, ? super T, R>) C3512a.f9503a).mo36455b((Consumer<? super T>) new C3521e<Object>(new C3513b(this.f9502e.f9499c))).mo36428a((C12286f) this.f9502e.f9497a.getComputation());
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$c */
    static final /* synthetic */ class C3514c extends C12931i implements Function1<C1379a, C12956q> {
        C3514c(C3509d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final void mo9977a(C1379a aVar) {
            C12932j.m33818b(aVar, "p1");
            ((C3509d) this.f33505f).m10695a(aVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3509d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "editDescendantsPrefs(Lapp/zenly/android/feature/descendants/feedback/DescendantsPrefs$Preferences;)V";
        }

        public final String getName() {
            return "editDescendantsPrefs";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9977a((C1379a) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$d */
    static final class C3515d<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3509d f9504e;

        C3515d(C3509d dVar) {
            this.f9504e = dVar;
        }

        /* renamed from: a */
        public final int mo9978a(C7236v0 v0Var) {
            String str = "it";
            C12932j.m33818b(v0Var, str);
            List<C7226u0> descendantsList = v0Var.getDescendantsList();
            C12932j.m33815a((Object) descendantsList, "it.descendantsList");
            if ((descendantsList instanceof Collection) && descendantsList.isEmpty()) {
                return 0;
            }
            int i = 0;
            for (C7226u0 u0Var : descendantsList) {
                C6915b descendantsPreferences = this.f9504e.f9501e.descendantsPreferences();
                boolean z = true;
                if (descendantsPreferences != null) {
                    Timestamp lastSeenDate = descendantsPreferences.getLastSeenDate();
                    if (lastSeenDate != null) {
                        long g = C3245z.m10288g(lastSeenDate);
                        C12932j.m33815a((Object) u0Var, str);
                        Timestamp descendantSince = u0Var.getDescendantSince();
                        C12932j.m33815a((Object) descendantSince, "it.descendantSince");
                        if (C3245z.m10288g(descendantSince) <= g) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    i++;
                    if (i < 0) {
                        C12844m.m33610b();
                        throw null;
                    }
                }
            }
            return i;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(mo9978a((C7236v0) obj));
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$e */
    static final /* synthetic */ class C3516e extends C12931i implements Function1<Integer, C12956q> {
        C3516e(C12785a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo9979a(int i) {
            ((C12785a) this.f33505f).onNext(Integer.valueOf(i));
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12785a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final String getName() {
            return "onNext";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo9979a(((Number) obj).intValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$f */
    static final class C3517f extends C12933k implements Function1<C1379a, C1379a> {

        /* renamed from: f */
        final /* synthetic */ int f9505f;

        C3517f(int i) {
            this.f9505f = i;
            super(1);
        }

        /* renamed from: a */
        public final C1379a invoke(C1379a aVar) {
            C12932j.m33818b(aVar, "$receiver");
            return C1379a.m6420a(aVar, this.f9505f, 0, 0, 0, 14, null);
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$g */
    static final class C3518g extends C12933k implements Function1<C1379a, C1379a> {

        /* renamed from: f */
        final /* synthetic */ int f9506f;

        C3518g(int i) {
            this.f9506f = i;
            super(1);
        }

        /* renamed from: a */
        public final C1379a invoke(C1379a aVar) {
            C12932j.m33818b(aVar, "$receiver");
            return C1379a.m6420a(aVar, 0, this.f9506f, 0, 0, 13, null);
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$h */
    static final class C3519h extends C12933k implements Function1<C1379a, C1379a> {

        /* renamed from: f */
        final /* synthetic */ int f9507f;

        C3519h(int i) {
            this.f9507f = i;
            super(1);
        }

        /* renamed from: a */
        public final C1379a invoke(C1379a aVar) {
            C12932j.m33818b(aVar, "$receiver");
            return C1379a.m6420a(aVar, 0, 0, this.f9507f, 0, 11, null);
        }
    }

    /* renamed from: app.zenly.locator.descendants.d$i */
    static final class C3520i extends C12933k implements Function1<C1379a, C1379a> {

        /* renamed from: f */
        final /* synthetic */ long f9508f;

        C3520i(long j) {
            this.f9508f = j;
            super(1);
        }

        /* renamed from: a */
        public final C1379a invoke(C1379a aVar) {
            C12932j.m33818b(aVar, "$receiver");
            return C1379a.m6420a(aVar, 0, 0, 0, this.f9508f, 7, null);
        }
    }

    public C3509d(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9501e = zenlyCore;
        C12798f<Function1<C1379a, C1379a>> r = C12789c.m33462s().mo36986r();
        C12932j.m33815a((Object) r, "PublishSubject.create<De…erences>().toSerialized()");
        this.f9498b = r;
        C1379a aVar = new C1379a(0, 0, 0, 0, 15, null);
        C12785a<C1379a> h = C12785a.m33446h(aVar);
        C12932j.m33815a((Object) h, "BehaviorSubject.createDe…dantsPrefs.Preferences())");
        this.f9499c = h;
        C12785a<Integer> h2 = C12785a.m33446h(Integer.valueOf(0));
        C12932j.m33815a((Object) h2, "BehaviorSubject.createDefault(0)");
        this.f9500d = h2;
    }

    public Disposable bind() {
        C12275b bVar = new C12275b();
        Disposable d = C12279e.m32616a((Callable<? extends T>) new C3522f<Object>(new C3510a(this))).mo36509m(new C3511b(this)).mo36452b((C12286f) this.f9497a.getComputation()).mo36476d((Consumer<? super T>) new C3521e<Object>(new C3514c(this)));
        C12932j.m33815a((Object) d, "Observable.fromCallable(…e(::editDescendantsPrefs)");
        C12773a.m33432a(d, bVar);
        Disposable d2 = this.f9501e.descendantUsers().mo36552d((Function<? super T, ? extends R>) new C3515d<Object,Object>(this)).mo36539a(Integer.valueOf(0)).mo36544b((C12286f) this.f9497a.getComputation()).mo36551d((Consumer<? super T>) new C3521e<Object>(new C3516e(this.f9500d)));
        C12932j.m33815a((Object) d2, "core.descendantUsers()\n …scendantsSubject::onNext)");
        C12773a.m33432a(d2, bVar);
        return bVar;
    }

    public C1379a getAllPreferences() {
        Object s = this.f9499c.mo36963s();
        if (s != null) {
            return (C1379a) s;
        }
        C12932j.m33814a();
        throw null;
    }

    public C12279e<Integer> getNewDescendantsCount() {
        return this.f9500d;
    }

    public C12279e<C1379a> observeAllPreferences() {
        return this.f9499c;
    }

    public void setCount(int i, int i2) {
        this.f9500d.onNext(Integer.valueOf(i - i2));
        m10697a((Function1<? super C1379a, C1379a>) new C3517f<Object,C1379a>(i));
    }

    public void setHintFlags(int i) {
        m10697a((Function1<? super C1379a, C1379a>) new C3518g<Object,C1379a>(i));
    }

    public void setLastSeenLevelThreshold(int i) {
        m10697a((Function1<? super C1379a, C1379a>) new C3519h<Object,C1379a>(i));
    }

    public void setNewDescendantsLastSeenDate(long j) {
        this.f9500d.onNext(Integer.valueOf(0));
        m10697a((Function1<? super C1379a, C1379a>) new C3520i<Object,C1379a>(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1379a m10693a() {
        C6915b descendantsPreferences = this.f9501e.descendantsPreferences();
        if (descendantsPreferences != null) {
            int count = descendantsPreferences.getCount();
            int hintFlags = descendantsPreferences.getHintFlags();
            int lastSeenLevelThreshold = descendantsPreferences.getLastSeenLevelThreshold();
            Timestamp lastSeenDate = descendantsPreferences.getLastSeenDate();
            C12932j.m33815a((Object) lastSeenDate, "descendantsPrefs.lastSeenDate");
            C1379a aVar = new C1379a(count, hintFlags, lastSeenLevelThreshold, C3245z.m10288g(lastSeenDate));
            return aVar;
        }
        C1379a aVar2 = new C1379a(0, 0, 0, 0, 15, null);
        return aVar2;
    }

    /* renamed from: a */
    private final void m10697a(Function1<? super C1379a, C1379a> function1) {
        C7707a.m18761b("prefs:desc:update");
        try {
            this.f9498b.onNext(function1);
            C12956q qVar = C12956q.f33541a;
        } finally {
            C7707a.m18759a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10695a(C1379a aVar) {
        C7707a.m18761b("prefs:desc:updateCorePrefs");
        try {
            C6916a newBuilder = C6915b.newBuilder();
            newBuilder.mo17856a(aVar.mo6638a());
            newBuilder.mo17858b(aVar.mo6640b());
            newBuilder.mo17859c(aVar.mo6641c());
            newBuilder.mo17857a(C3245z.m10282a(aVar.mo6642d()));
            this.f9501e.setDescendantsPreferences((C6915b) newBuilder.build());
            C12956q qVar = C12956q.f33541a;
        } finally {
            C7707a.m18759a();
        }
    }
}
