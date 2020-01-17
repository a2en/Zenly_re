package app.zenly.locator.friendshipfacts;

import android.content.Context;
import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.friendshipfacts.p098k.C3801b;
import app.zenly.locator.friendshipfacts.p098k.C3802c;
import app.zenly.locator.friendshipfacts.p098k.C3803d;
import app.zenly.locator.friendshipfacts.p098k.C3804e;
import app.zenly.locator.friendshipfacts.p098k.C3804e.C3805a;
import app.zenly.locator.friendshipfacts.p099l.C3806a;
import app.zenly.locator.friendshipfacts.p099l.C3809c;
import app.zenly.locator.friendshipfacts.p100m.C3811a;
import app.zenly.locator.friendshipfacts.p100m.C3812b;
import app.zenly.locator.friendshipfacts.p100m.C3813c;
import app.zenly.locator.friendshipfacts.p100m.C3814d;
import app.zenly.locator.friendshipfacts.p100m.C3815e;
import app.zenly.locator.friendshipfacts.p100m.C3816f;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.recycling.p328d.C11723b;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.services.C8001b5;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function4;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.friendshipfacts.d */
public final class C3773d extends C12292a implements ObservableSectionController {

    /* renamed from: f */
    private final C12119a f10083f = new C12119a();

    /* renamed from: g */
    public List<C3809c> f10084g;

    /* renamed from: h */
    public List<C3809c> f10085h;

    /* renamed from: i */
    private final Context f10086i;

    /* renamed from: j */
    private final C11727c f10087j;

    /* renamed from: k */
    private final EventDispatcher f10088k;

    /* renamed from: l */
    private final ZenlyCore f10089l;

    /* renamed from: m */
    private final FriendStore f10090m;

    /* renamed from: n */
    private final FriendshipStore f10091n;

    /* renamed from: o */
    private final C12279e<Integer> f10092o;

    /* renamed from: app.zenly.locator.friendshipfacts.d$a */
    public static final class C3774a<T1, T2, T3, T4, R> implements Function4<T1, T2, T3, T4, R> {

        /* renamed from: a */
        final /* synthetic */ C3773d f10093a;

        public C3774a(C3773d dVar) {
            this.f10093a = dVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            int intValue = ((Number) t4).intValue();
            Map map = (Map) t3;
            C8001b5 b5Var = (C8001b5) t2;
            List list = (List) t1;
            C3773d dVar = this.f10093a;
            C3802c cVar = C3802c.f10132a;
            C12932j.m33815a((Object) b5Var, "tst");
            Seekable a = dVar.m11235a(cVar.mo10366a(b5Var, list));
            C3805a a2 = C3804e.f10135a.mo10372a(b5Var, list);
            return C11751f.m30862a(C12848o.m33643b((Object[]) new Seekable[]{a, this.f10093a.m11236a(a2), this.f10093a.m11239b(a2), this.f10093a.m11237a(list, b5Var, map, intValue)}));
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.d$b */
    public static final class C3775b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C12998b.m33940a(Integer.valueOf(((C3809c) t2).mo10388b()), Integer.valueOf(((C3809c) t).mo10388b()));
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.d$c */
    public static final class C3776c<T> implements Comparator<T> {

        /* renamed from: e */
        final /* synthetic */ Comparator f10094e;

        public C3776c(Comparator comparator) {
            this.f10094e = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f10094e.compare(t, t2);
            return compare != 0 ? compare : C12998b.m33940a(((C3809c) t).mo10389c().getName(), ((C3809c) t2).mo10389c().getName());
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.d$d */
    public static final class C3777d<T> implements Comparator<T> {

        /* renamed from: e */
        final /* synthetic */ boolean f10095e;

        public C3777d(boolean z) {
            this.f10095e = z;
        }

        public final int compare(T t, T t2) {
            C3806a aVar = (C3806a) t2;
            C3806a aVar2 = (C3806a) t;
            return C12998b.m33940a(Long.valueOf(this.f10095e ? aVar.mo10381d() : aVar.mo10380c()), Long.valueOf(this.f10095e ? aVar2.mo10381d() : aVar2.mo10380c()));
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.d$e */
    public static final class C3778e<T> implements Comparator<T> {

        /* renamed from: e */
        final /* synthetic */ Comparator f10096e;

        public C3778e(Comparator comparator) {
            this.f10096e = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f10096e.compare(t, t2);
            return compare != 0 ? compare : C12998b.m33940a(((C3806a) t).mo10382e().getName(), ((C3806a) t2).mo10382e().getName());
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.d$f */
    public static final class C3779f<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C12998b.m33940a(Integer.valueOf(((C3809c) t2).mo10388b()), Integer.valueOf(((C3809c) t).mo10388b()));
        }
    }

    /* renamed from: app.zenly.locator.friendshipfacts.d$g */
    public static final class C3780g<T> implements Comparator<T> {

        /* renamed from: e */
        final /* synthetic */ Comparator f10097e;

        public C3780g(Comparator comparator) {
            this.f10097e = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f10097e.compare(t, t2);
            return compare != 0 ? compare : C12998b.m33940a(((C3809c) t).mo10389c().getName(), ((C3809c) t2).mo10389c().getName());
        }
    }

    public C3773d(Context context, C11727c cVar, EventDispatcher eventDispatcher, ZenlyCore zenlyCore, FriendStore friendStore, FriendshipStore friendshipStore, C12279e<Integer> eVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(cVar, "viewFactory");
        C12932j.m33818b(eventDispatcher, "eventDispatcher");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(friendshipStore, "friendshipStore");
        C12932j.m33818b(eVar, "tstFilterModeObservable");
        this.f10086i = context;
        this.f10087j = cVar;
        this.f10088k = eventDispatcher;
        this.f10089l = zenlyCore;
        this.f10090m = friendStore;
        this.f10091n = friendshipStore;
        this.f10092o = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    /* renamed from: c */
    public final List<C3809c> mo10341c() {
        List<C3809c> list = this.f10084g;
        if (list != null) {
            return list;
        }
        C12932j.m33820c("streaksSnapchot");
        throw null;
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e friends = this.f10090m.friends();
        C12279e timeTogetherState = this.f10089l.timeTogetherState();
        C12932j.m33815a((Object) timeTogetherState, "core.timeTogetherState()");
        C12279e<Seekable<C11722a>> a = C12279e.m32608a(friends, timeTogetherState, this.f10091n.friendshipsMap(), this.f10092o, new C3774a(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…\n            )\n\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* renamed from: b */
    public final List<C3809c> mo10340b() {
        List<C3809c> list = this.f10085h;
        if (list != null) {
            return list;
        }
        C12932j.m33820c("noSeeSnapshot");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Seekable<C11722a> m11239b(C3805a aVar) {
        Seekable seekable;
        this.f10085h = C12857w.m33665a((Iterable) aVar.mo10373a(), (Comparator) new C3780g(new C3779f()));
        C3781e eVar = C3781e.STREAK_USERS;
        C11727c cVar = this.f10087j;
        EventDispatcher eventDispatcher = this.f10088k;
        List<C3809c> list = this.f10085h;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C3809c cVar2 : list) {
                arrayList.add(new C3815e(this.f10083f.mo35844a(cVar2.mo10389c().getUuid()), cVar2));
            }
            C11723b bVar = new C11723b(eVar, cVar, eventDispatcher, arrayList, 1, -2, 0, 0);
            String string = this.f10086i.getString(R.string.friendshipFacts_ghost_cards_title);
            C12932j.m33815a((Object) string, "context.getString(R.stri…pFacts_ghost_cards_title)");
            Seekable a = C11751f.m30861a(new C3812b(string));
            if (aVar.mo10373a().isEmpty()) {
                String string2 = this.f10086i.getString(R.string.friendshipFacts_ghost_empty);
                C12932j.m33815a((Object) string2, "context.getString(R.stri…endshipFacts_ghost_empty)");
                seekable = C11751f.m30861a(new C3811a(2131231587, string2));
            } else {
                seekable = C11751f.m30861a(bVar);
            }
            return C11751f.m30860a(a, seekable);
        }
        C12932j.m33820c("noSeeSnapshot");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Seekable<C11722a> m11235a(C3803d dVar) {
        return C11751f.m30861a(new C3814d(1, dVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Seekable<C11722a> m11236a(C3805a aVar) {
        Seekable seekable;
        this.f10084g = C12857w.m33665a((Iterable) aVar.mo10374b(), (Comparator) new C3776c(new C3775b()));
        C3781e eVar = C3781e.STREAK_USERS;
        C11727c cVar = this.f10087j;
        EventDispatcher eventDispatcher = this.f10088k;
        List<C3809c> list = this.f10084g;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C3809c cVar2 : list) {
                arrayList.add(new C3815e(this.f10083f.mo35844a(cVar2.mo10389c().getUuid()), cVar2));
            }
            C11723b bVar = new C11723b(eVar, cVar, eventDispatcher, arrayList, 1, -2, 0, 0);
            String string = this.f10086i.getString(R.string.friendshipFacts_streaks_cards_title);
            C12932j.m33815a((Object) string, "context.getString(R.stri…acts_streaks_cards_title)");
            Seekable a = C11751f.m30861a(new C3812b(string));
            if (aVar.mo10374b().isEmpty()) {
                String string2 = this.f10086i.getString(R.string.friendshipFacts_streaks_empty);
                C12932j.m33815a((Object) string2, "context.getString(R.stri…dshipFacts_streaks_empty)");
                seekable = C11751f.m30861a(new C3811a(2131231448, string2));
            } else {
                seekable = C11751f.m30861a(bVar);
            }
            return C11751f.m30860a(a, seekable);
        }
        C12932j.m33820c("streaksSnapchot");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Seekable<C11722a> m11237a(List<C2936a0> list, C8001b5 b5Var, Map<String, C2991u0> map, int i) {
        List a = C3801b.f10131a.mo10365a(b5Var, list, map);
        boolean z = i == 2;
        C7712e eVar = C7712e.f19340a;
        String string = this.f10086i.getString(R.string.friendshipFacts_leaderboard);
        C12932j.m33815a((Object) string, "context.getString(R.stri…endshipFacts_leaderboard)");
        String string2 = this.f10086i.getString(z ? R.string.tst_view_subtitle_week : R.string.tst_view_subtitle_alltime);
        C12932j.m33815a((Object) string2, "context.getString(if (we…st_view_subtitle_alltime)");
        C3813c cVar = new C3813c(string, string2);
        String string3 = this.f10086i.getString(z ? R.string.timetogether_hidden_empty : R.string.timetogether_hidden_empty_alltime);
        C12932j.m33815a((Object) string3, "context.getString(\n     …pty_alltime\n            )");
        C3811a aVar = new C3811a(2131231409, string3);
        List a2 = C12857w.m33665a((Iterable) a, (Comparator) new C3778e(new C3777d(z)));
        ArrayList arrayList = new ArrayList(C12850p.m33647a(a2, 10));
        int i2 = 0;
        for (Object next : a2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C3806a aVar2 = (C3806a) next;
                C3816f fVar = r5;
                C3816f fVar2 = new C3816f(this.f10083f.mo35844a(aVar2.mo10382e().getUuid()), aVar2, z, i2);
                arrayList.add(fVar);
                i2 = i3;
            } else {
                C12844m.m33616c();
                throw null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (((C3816f) next2).mo10401g() > TimeUnit.HOURS.toMillis(1)) {
                arrayList2.add(next2);
            }
        }
        return eVar.mo19920a(cVar, aVar, arrayList2);
    }
}
