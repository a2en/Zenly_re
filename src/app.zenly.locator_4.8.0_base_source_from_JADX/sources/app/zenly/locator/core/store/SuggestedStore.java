package app.zenly.locator.core.store;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0875o;
import androidx.lifecycle.LifecycleObserver;
import app.zenly.locator.core.helper.AuthenticatedSessionLifecycleOwner;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12945w;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.C7434p.C7436b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7058b0;
import p213co.znly.models.core.C7058b0.C7059a;
import p213co.znly.models.core.StatesProto$ContactsSuggestionsState;
import p213co.znly.models.core.StatesProto$ContactsSuggestionsState.C7015c;
import p213co.znly.models.services.C8375x4;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12789c;
import p389io.reactivex.p406n.C12791d;
import p389io.reactivex.schedulers.C12802a;

public final class SuggestedStore implements LifecycleObserver {

    /* renamed from: e */
    private static final C12275b f8299e = new C12275b();

    /* renamed from: f */
    private static final C12789c<C3052n> f8300f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C12791d<List<C7434p>> f8301g;

    /* renamed from: h */
    private static final C12279e<List<C7434p>> f8302h = f8301g;

    /* renamed from: i */
    public static final SuggestedStore f8303i;

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$a */
    static final class C2920a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C2920a f8304e = new C2920a();

        C2920a() {
        }

        /* renamed from: a */
        public final C12279e<C8375x4> apply(C3052n nVar) {
            C12932j.m33818b(nVar, "entry");
            ZenlyCore a = C5448c.m15478a();
            C7059a newBuilder = C7058b0.newBuilder();
            if (nVar instanceof C3055p) {
                newBuilder.mo19115b(((C3055p) nVar).mo9238a());
            } else if (nVar instanceof C3051m) {
                newBuilder.mo19114a(((C3051m) nVar).mo9232a());
            }
            return a.contactsSuggestedDismissUser((C7058b0) newBuilder.build());
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$b */
    static final class C2921b<T> implements Consumer<C8375x4> {

        /* renamed from: e */
        public static final C2921b f8305e = new C2921b();

        C2921b() {
        }

        /* renamed from: a */
        public final void accept(C8375x4 x4Var) {
            Object[] objArr = new Object[1];
            objArr[0] = x4Var.hasError() ? x4Var.getErrorMessages(0) : "success";
            C12143a.m32027a("Contact dismiss: %s", objArr);
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$c */
    static final class C2922c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2922c f8306e = new C2922c();

        C2922c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Contact dismiss exception", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$d */
    static final class C2923d<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C12945w f8307e;

        C2923d(C12945w wVar) {
            this.f8307e = wVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            SuggestedStore.f8301g.onNext(new ArrayList(((Map) this.f8307e.f33528e).values()));
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$e */
    static final class C2924e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2924e f8308e = new C2924e();

        C2924e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Suggested merge error", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$f */
    static final class C2925f<T> implements Consumer<C3052n> {

        /* renamed from: e */
        final /* synthetic */ C12945w f8309e;

        C2925f(C12945w wVar) {
            this.f8309e = wVar;
        }

        /* renamed from: a */
        public final void accept(C3052n nVar) {
            ((Map) this.f8309e.f33528e).remove(nVar);
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$g */
    static final class C2926g<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2926g f8310e = new C2926g();

        C2926g() {
        }

        /* renamed from: a */
        public final boolean mo9035a(C3052n nVar) {
            C12932j.m33818b(nVar, "it");
            return true;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo9035a((C3052n) obj));
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$h */
    static final class C2927h<T> implements Predicate<StatesProto$ContactsSuggestionsState> {

        /* renamed from: e */
        public static final C2927h f8311e = new C2927h();

        C2927h() {
        }

        /* renamed from: a */
        public final boolean test(StatesProto$ContactsSuggestionsState statesProto$ContactsSuggestionsState) {
            C12932j.m33818b(statesProto$ContactsSuggestionsState, "it");
            return statesProto$ContactsSuggestionsState.hasState();
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$i */
    static final class C2928i<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2928i f8312e = new C2928i();

        C2928i() {
        }

        /* renamed from: a */
        public final List<C7434p> apply(StatesProto$ContactsSuggestionsState statesProto$ContactsSuggestionsState) {
            C12932j.m33818b(statesProto$ContactsSuggestionsState, "it");
            C7015c state = statesProto$ContactsSuggestionsState.getState();
            C12932j.m33815a((Object) state, "it.state");
            return state.getStateList();
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$j */
    static final class C2929j<T> implements Consumer<List<C7434p>> {

        /* renamed from: e */
        final /* synthetic */ C12945w f8313e;

        C2929j(C12945w wVar) {
            this.f8313e = wVar;
        }

        /* renamed from: a */
        public final void accept(List<C7434p> list) {
            C12945w wVar = this.f8313e;
            SuggestedStore suggestedStore = SuggestedStore.f8303i;
            C12932j.m33815a((Object) list, "list");
            wVar.f33528e = suggestedStore.m9427a(list);
        }
    }

    /* renamed from: app.zenly.locator.core.store.SuggestedStore$k */
    static final class C2930k<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2930k f8314e = new C2930k();

        C2930k() {
        }

        /* renamed from: a */
        public final boolean mo9039a(List<C7434p> list) {
            C12932j.m33818b(list, "it");
            return true;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo9039a((List) obj));
        }
    }

    static {
        SuggestedStore suggestedStore = new SuggestedStore();
        f8303i = suggestedStore;
        C12789c<C3052n> s = C12789c.m33462s();
        C12932j.m33815a((Object) s, "PublishSubject.create<SuggestedEntry>()");
        f8300f = s;
        C12791d<List<C7434p>> g = C12791d.m33470g(1);
        C12932j.m33815a((Object) g, "ReplaySubject.createWith…tProto.SuggestedUser>>(1)");
        f8301g = g;
        AuthenticatedSessionLifecycleOwner.f7494i.mo8561a().getLifecycle().mo4446a(suggestedStore);
    }

    private SuggestedStore() {
    }

    @C0875o(C0863a.ON_START)
    public final Disposable onStart() {
        C7707a.m18761b("store:suggested:start");
        try {
            C12945w wVar = new C12945w();
            wVar.f33528e = new LinkedHashMap();
            C12279e i = C5448c.m15478a().contactsSuggestionsStateStream().mo36459b((Predicate<? super T>) C2927h.f8311e).mo36501i(C2928i.f8312e).mo36428a(C12802a.m33492c()).mo36455b((Consumer<? super T>) new C2929j<Object>(wVar)).mo36501i(C2930k.f8314e);
            C12279e i2 = f8300f.mo36428a(C12802a.m33492c()).mo36455b((Consumer<? super T>) new C2925f<Object>(wVar)).mo36501i(C2926g.f8310e);
            Disposable a = f8300f.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) C2920a.f8304e).mo36412a((Consumer<? super T>) C2921b.f8305e, (Consumer<? super Throwable>) C2922c.f8306e);
            C12932j.m33815a((Object) a, "removedSuggested\n       …xception\")\n            })");
            C12773a.m33432a(a, f8299e);
            Disposable a2 = C12279e.m32621b((ObservableSource<? extends T>) i, (ObservableSource<? extends T>) i2).mo36428a(C12802a.m33492c()).mo36412a((Consumer<? super T>) new C2923d<Object>(wVar), (Consumer<? super Throwable>) C2924e.f8308e);
            C12932j.m33815a((Object) a2, "Observable.merge(suggest…ge error\")\n            })");
            C12773a.m33432a(a2, f8299e);
            return a2;
        } finally {
            C7707a.m18759a();
        }
    }

    @C0875o(C0863a.ON_STOP)
    public final void onStop() {
        f8299e.mo36401a();
    }

    /* renamed from: a */
    public static final C12279e<List<C7434p>> m9424a() {
        return f8302h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<C3052n, C7434p> m9427a(List<C7434p> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C7434p pVar : list) {
            C7436b type = pVar.getType();
            if (type != null) {
                int i = C3054o.f8450a[type.ordinal()];
                if (i == 1) {
                    UserProto$User user = pVar.getUser();
                    C12932j.m33815a((Object) user, "suggested.user");
                    String uuid = user.getUuid();
                    C12932j.m33815a((Object) uuid, "suggested.user.uuid");
                    linkedHashMap.put(new C3055p(uuid), pVar);
                } else if (i == 2) {
                    C7339i contact = pVar.getContact();
                    C12932j.m33815a((Object) contact, "suggested.contact");
                    String deviceContactId = contact.getDeviceContactId();
                    C12932j.m33815a((Object) deviceContactId, "suggested.contact.deviceContactId");
                    linkedHashMap.put(new C3051m(deviceContactId), pVar);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final void m9428a(C3052n nVar) {
        C12932j.m33818b(nVar, "entry");
        f8300f.onNext(nVar);
    }
}
