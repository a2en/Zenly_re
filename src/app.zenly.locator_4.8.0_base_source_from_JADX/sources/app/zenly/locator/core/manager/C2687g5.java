package app.zenly.locator.core.manager;

import android.content.Context;
import android.text.TextUtils;
import app.zenly.locator.C4958p;
import app.zenly.locator.core.manager.C2718k5.C2723e;
import app.zenly.locator.core.manager.p070t5.C2832b;
import app.zenly.locator.core.models.C2887h;
import app.zenly.locator.core.models.C2888i;
import app.zenly.locator.core.models.C2889j;
import app.zenly.locator.core.models.C2891l;
import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p213co.znly.models.core.C7056b;
import p213co.znly.models.services.C8252r0;
import p213co.znly.models.services.ZenlyProto$BrumpCountersResponse;
import p213co.znly.models.services.ZenlyProto$BrumpCountersResponse.C7941b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.manager.g5 */
public final class C2687g5 {

    /* renamed from: g */
    private static final C2900b f7851g = new C2900b();

    /* renamed from: h */
    private static final C2891l f7852h;

    /* renamed from: a */
    private final C2718k5 f7853a;

    /* renamed from: b */
    private final C12279e<C2888i> f7854b;

    /* renamed from: c */
    private final C12279e<C2887h> f7855c;

    /* renamed from: d */
    private final C12279e<C2889j> f7856d;

    /* renamed from: e */
    private final C12279e<C2891l> f7857e;

    /* renamed from: f */
    private final FriendStore f7858f;

    static {
        C2900b bVar = f7851g;
        bVar.f8224a = -1;
        f7852h = new C2891l(bVar);
    }

    public C2687g5(Context context, FriendStore friendStore, C2718k5 k5Var) {
        this.f7858f = friendStore;
        this.f7853a = k5Var;
        C12279e l = C5448c.m15478a().brumpStream().mo36455b((Consumer<? super T>) C2794q.f8025e).mo36432a((Consumer<? super Throwable>) C2863z.f8106e).mo36453b((Action) C2712k.f7885a).mo36506l();
        this.f7854b = l.mo36459b((Predicate<? super T>) C2681g.f7845e).mo36501i(C2845w.f8088e).mo36506l();
        this.f7855c = l.mo36459b((Predicate<? super T>) C2770o.f7998e).mo36501i(C2688h.f7859e).mo36506l();
        this.f7856d = l.mo36459b((Predicate<? super T>) C2667e.f7831e).mo36501i(C2639b.f7799e).mo36506l();
        if (C3444a.m10686a(context).mo6511a("feature:bumpHint")) {
            C4958p.m14306a(context).mo12155a("prefs:tweaks:bypassBumpHintConditionsEnabled", false);
            this.f7857e = m9053a(context, false).mo36459b((Predicate<? super T>) C2825t.f8064e).mo36509m(new C2633a0(m9072c(false))).mo36459b((Predicate<? super T>) C2697i.f7871e).mo36509m(new C2640b0(m9066b(false))).mo36459b((Predicate<? super T>) C2857y.f8100e).mo36509m(new C2646c(m9054a(false))).mo36501i(C2647c0.f7807e).mo36455b((Consumer<? super T>) C2668e0.f7832e).mo36460b(f7852h).mo36506l();
            return;
        }
        this.f7857e = C12279e.m32633q();
    }

    /* renamed from: a */
    static /* synthetic */ ObservableSource m9052a(C12279e eVar, Boolean bool) throws Exception {
        return eVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m9058a(C2891l lVar) throws Exception {
    }

    /* renamed from: a */
    static /* synthetic */ void m9059a(C2900b bVar) throws Exception {
    }

    /* renamed from: a */
    static /* synthetic */ void m9060a(C7056b bVar) throws Exception {
    }

    /* renamed from: b */
    static /* synthetic */ ObservableSource m9065b(C12279e eVar, Boolean bool) throws Exception {
        return eVar;
    }

    /* renamed from: b */
    static /* synthetic */ void m9067b(Boolean bool) throws Exception {
    }

    /* renamed from: c */
    static /* synthetic */ C2888i m9069c(C7056b bVar) throws Exception {
        return new C2888i();
    }

    /* renamed from: c */
    static /* synthetic */ ObservableSource m9070c(C12279e eVar, Boolean bool) throws Exception {
        return eVar;
    }

    /* renamed from: d */
    static /* synthetic */ void m9073d(Boolean bool) throws Exception {
    }

    /* renamed from: d */
    static /* synthetic */ boolean m9074d(C7056b bVar) throws Exception {
        return !bVar.getIsSingleBump() && bVar.getBrumpEvent().getIsFriend();
    }

    /* renamed from: e */
    static /* synthetic */ C2887h m9075e(C7056b bVar) throws Exception {
        return new C2887h(bVar.getBrumpEvent().getUser());
    }

    /* renamed from: e */
    static /* synthetic */ void m9076e() throws Exception {
    }

    /* renamed from: e */
    static /* synthetic */ void m9077e(Boolean bool) throws Exception {
    }

    /* renamed from: f */
    static /* synthetic */ boolean m9078f(C7056b bVar) throws Exception {
        return !bVar.getIsSingleBump() && !bVar.getBrumpEvent().getIsFriend();
    }

    /* renamed from: g */
    static /* synthetic */ C2889j m9080g(C7056b bVar) throws Exception {
        return new C2889j(bVar.getBrumpEvent().getBrumpInfo().getMatchId(), bVar.getBrumpEvent().getUser());
    }

    /* renamed from: a */
    private C12279e<Boolean> m9053a(Context context, boolean z) {
        return C12279e.m32626e(Boolean.valueOf(z)).mo36509m(new C2704j(C5407g.m15386a(context))).mo36455b((Consumer<? super T>) C2735m.f7952e);
    }

    /* renamed from: b */
    static /* synthetic */ C2891l m9063b(C2900b bVar) throws Exception {
        return bVar == f7851g ? f7852h : new C2891l(bVar);
    }

    /* renamed from: c */
    private C12279e<Boolean> m9072c(boolean z) {
        return C12279e.m32626e(Boolean.valueOf(z)).mo36509m(C2833u.f8076e).mo36477d().mo36455b((Consumer<? super T>) C2654d0.f7814e);
    }

    /* renamed from: d */
    public C12279e<C2889j> mo8770d() {
        return this.f7856d;
    }

    /* renamed from: b */
    private C12279e<Boolean> m9066b(boolean z) {
        return C12279e.m32626e(Boolean.valueOf(z)).mo36509m(new C2653d(this)).mo36477d().mo36455b((Consumer<? super T>) C2839v.f8082e);
    }

    /* renamed from: a */
    static /* synthetic */ ObservableSource m9051a(C5407g gVar, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return C12279e.m32626e(Boolean.valueOf(true));
        }
        return C12279e.m32616a((Callable<? extends T>) new C2763n<Object>(gVar));
    }

    /* renamed from: c */
    static /* synthetic */ ObservableSource m9071c(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return C12279e.m32626e(Boolean.valueOf(true));
        }
        return C5448c.m15478a().brumpCounters(C8252r0.getDefaultInstance()).mo36501i(C2815s.f8053e);
    }

    /* renamed from: b */
    static /* synthetic */ C2900b m9064b(C2723e eVar) throws Exception {
        for (int i = 0; i < eVar.f7935a.size(); i++) {
            C2900b bVar = (C2900b) eVar.f7935a.valueAt(i);
            if (bVar.f8227d) {
                return bVar;
            }
        }
        return f7851g;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m9055a(C5407g gVar) throws Exception {
        int b = gVar.mo12974b();
        Boolean valueOf = Boolean.valueOf(true);
        if (b == 0) {
            return valueOf;
        }
        long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()) - TimeUnit.MILLISECONDS.toDays(gVar.mo12977c());
        if (b == 0) {
            return valueOf;
        }
        boolean z = false;
        if (b == 1) {
            if (days >= 3) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (b == 2) {
            if (days >= 6) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (b != 3) {
            return Boolean.valueOf(false);
        } else {
            if (days >= 12) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b */
    public C12279e<C2887h> mo8768b() {
        return this.f7855c;
    }

    /* renamed from: c */
    public C12279e<C2888i> mo8769c() {
        return this.f7854b;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m9056a(ZenlyProto$BrumpCountersResponse zenlyProto$BrumpCountersResponse) throws Exception {
        boolean z;
        C7941b bVar;
        Iterator it = zenlyProto$BrumpCountersResponse.getCountersList().iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return Boolean.valueOf(true);
            }
            bVar = (C7941b) it.next();
        } while (!TextUtils.equals(bVar.getUserUuid(), C5447b.m15477d(C5448c.m15478a())));
        if (bVar.getBrumpFriendMatchCount() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public /* synthetic */ ObservableSource mo8766a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return C12279e.m32626e(Boolean.valueOf(true));
        }
        return this.f7858f.friends().mo36501i(C2805r.f8042e);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m9057a(List list) throws Exception {
        return Boolean.valueOf(list.size() >= 3);
    }

    /* renamed from: a */
    private C12279e<C2900b> m9054a(boolean z) {
        return this.f7853a.mo8793d().mo36459b((Predicate<? super T>) C2784p.f8014e).mo36501i(C2851x.f8094e).mo36501i(new C2727l(z)).mo36477d().mo36455b((Consumer<? super T>) C2674f.f7838e);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m9062a(C2723e eVar) throws Exception {
        if (eVar.mo8801a()) {
            return true;
        }
        for (int i = 0; i < eVar.f7936b.size(); i++) {
            if (C2832b.m9308a(((C2832b) eVar.f7936b.valueAt(i)).mo8864b(), 291)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ C2900b m9050a(boolean z, C2900b bVar) throws Exception {
        return (z || bVar.mo8984a()) ? bVar : f7851g;
    }

    /* renamed from: a */
    public C12279e<C2891l> mo8767a() {
        return this.f7857e;
    }
}
