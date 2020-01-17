package app.zenly.locator.p017a0.p030q.p032d;

import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.api.FriendshipStore;
import app.zenly.locator.p017a0.p030q.p034f.C1645a;
import app.zenly.locator.p017a0.p030q.p034f.C1646b;
import app.zenly.locator.p017a0.p030q.p034f.C1647c;
import app.zenly.locator.p017a0.p030q.p034f.C1648d;
import app.zenly.locator.p017a0.p030q.p034f.C1649e;
import app.zenly.locator.userprofile.p198me.p199g.C6081a;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function6;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.a0.q.d.a */
public final class C1632a extends C12292a implements ObservableSectionController {

    /* renamed from: f */
    private final C12119a f5637f = new C12119a();

    /* renamed from: g */
    private final String f5638g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6081a f5639h;

    /* renamed from: i */
    private final FriendStore f5640i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final FriendshipStore f5641j;

    /* renamed from: k */
    private final FriendRequestStore f5642k;

    /* renamed from: l */
    private final Comparator<C2936a0> f5643l;

    /* renamed from: m */
    private final Comparator<C2956k0> f5644m;

    /* renamed from: n */
    private final C12279e<String> f5645n;

    /* renamed from: o */
    private final ZenlyCore f5646o;

    /* renamed from: app.zenly.locator.a0.q.d.a$a */
    static final class C1633a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C1632a f5647e;

        /* renamed from: app.zenly.locator.a0.q.d.a$a$a */
        public static final class C1634a<T1, T2, T3, T4, T5, T6, R> implements Function6<T1, T2, T3, T4, T5, T6, R> {

            /* renamed from: a */
            final /* synthetic */ C1632a f5648a;

            public C1634a(C1632a aVar) {
                this.f5648a = aVar;
            }

            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                return this.f5648a.m6899a((List) t1, (List) t2, (List) t3, (List) t4, (Map) t5, (String) t6);
            }
        }

        C1633a(C1632a aVar) {
            this.f5647e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(String str) {
            C12932j.m33818b(str, "query");
            C12279e b = this.f5647e.m6906b(str);
            C12279e a = this.f5647e.m6901a(str);
            C12774b bVar = C12774b.f33320a;
            C12279e c = this.f5647e.f5639h.mo13900c();
            C12279e b2 = this.f5647e.f5639h.mo13898b();
            C12279e friendshipsMap = this.f5647e.f5641j.friendshipsMap();
            C12279e e = C12279e.m32626e(str);
            C12932j.m33815a((Object) e, "Observable.just(query)");
            return C12279e.m32606a(c, b2, b, a, friendshipsMap, e, new C1634a(this.f5647e));
        }
    }

    /* renamed from: app.zenly.locator.a0.q.d.a$b */
    static final class C1635b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1635b f5649e = new C1635b();

        C1635b() {
        }

        /* renamed from: a */
        public final C2956k0 apply(ZenlyProto$FriendRequestWithUser zenlyProto$FriendRequestWithUser) {
            C12932j.m33818b(zenlyProto$FriendRequestWithUser, "it");
            FriendRequestProto$FriendRequest friendRequest = zenlyProto$FriendRequestWithUser.getFriendRequest();
            C12932j.m33815a((Object) friendRequest, "it.friendRequest");
            UserProto$User user = zenlyProto$FriendRequestWithUser.getUser();
            C12932j.m33815a((Object) user, "it.user");
            C2956k0 k0Var = new C2956k0(friendRequest, user, null, 4, null);
            return k0Var;
        }
    }

    /* renamed from: app.zenly.locator.a0.q.d.a$c */
    static final class C1636c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1636c f5650e = new C1636c();

        C1636c() {
        }

        /* renamed from: a */
        public final C2936a0 apply(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            return new C2936a0(userProto$User);
        }
    }

    public C1632a(String str, C6081a aVar, FriendStore friendStore, FriendshipStore friendshipStore, FriendRequestStore friendRequestStore, Comparator<C2936a0> comparator, Comparator<C2956k0> comparator2, C12279e<String> eVar, ZenlyCore zenlyCore) {
        C12932j.m33818b(str, "meUserUuid");
        C12932j.m33818b(aVar, "bffRepository");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(friendshipStore, "friendshipStore");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(comparator, "friendsByName");
        C12932j.m33818b(comparator2, "friendRequestsByName");
        C12932j.m33818b(eVar, "queryObservable");
        C12932j.m33818b(zenlyCore, "core");
        this.f5638g = str;
        this.f5639h = aVar;
        this.f5640i = friendStore;
        this.f5641j = friendshipStore;
        this.f5642k = friendRequestStore;
        this.f5643l = comparator;
        this.f5644m = comparator2;
        this.f5645n = eVar;
        this.f5646o = zenlyCore;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> m = this.f5645n.mo36509m(new C1633a(this));
        C12932j.m33815a((Object) m, "queryObservable.switchMa…s\n            )\n        }");
        return m;
    }

    public void onViewBound(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "model");
    }

    public void onViewRecycled(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "viewModel");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C12279e<List<C2936a0>> m6906b(String str) {
        if (!(str.length() > 0)) {
            return this.f5640i.friends();
        }
        C12279e<List<C2936a0>> e = this.f5646o.friendsSearchStream(str).mo36501i(C1636c.f5650e).mo36511n().mo36553e();
        C12932j.m33815a((Object) e, "core.friendsSearchStream…          .toObservable()");
        return e;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Seekable<C11722a> m6899a(List<String> list, List<String> list2, List<C2936a0> list3, List<C2956k0> list4, Map<String, C2991u0> map, String str) {
        boolean z = str.length() > 0;
        List a = m6903a(list, list2, list3, map);
        List a2 = m6902a(list4);
        if (!z || !a.isEmpty() || !a2.isEmpty()) {
            return C11751f.m30860a(C7712e.f19340a.mo19920a(new C1649e(R.string.commons_label_friends), new C1646b(R.string.settings_manageFriends_emptyFriends), a), C7712e.f19340a.mo19920a(new C1649e(R.string.commons_label_invited_plural), new C1645a(R.string.settings_manageFriends_emptyInvited), a2));
        }
        return C11751f.m30861a(new C1645a(R.string.settings_manageFriends_emptySearch));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<List<C2956k0>> m6901a(String str) {
        if (!(str.length() > 0)) {
            return this.f5642k.friendRequests();
        }
        C12279e<List<C2956k0>> e = this.f5646o.friendRequestsSearchStream(str).mo36501i(C1635b.f5649e).mo36511n().mo36553e();
        C12932j.m33815a((Object) e, "core.friendRequestsSearc…          .toObservable()");
        return e;
    }

    /* renamed from: a */
    private final List<C11722a> m6903a(List<String> list, List<String> list2, List<C2936a0> list3, Map<String, C2991u0> map) {
        List<C2936a0> a = C12857w.m33665a((Iterable) list3, (Comparator) this.f5643l);
        ArrayList arrayList = new ArrayList();
        for (C2936a0 a0Var : a) {
            C2991u0 u0Var = (C2991u0) map.get(a0Var.mo9074a().getUuid());
            C1647c cVar = u0Var != null ? new C1647c(this.f5637f.mo35844a(a0Var.mo9074a().getUuid()), a0Var, u0Var, list.contains(a0Var.mo9074a().getUuid()), list2.contains(a0Var.mo9074a().getUuid())) : null;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<C11722a> m6902a(List<C2956k0> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C2956k0 k0Var = (C2956k0) next;
            if (C12932j.m33817a((Object) k0Var.mo9122b().getAuthorUuid(), (Object) this.f5638g) && k0Var.mo9122b().getStatus() == C6812c.pending) {
                arrayList.add(next);
            }
        }
        List<C2956k0> a = C12857w.m33665a((Iterable) arrayList, (Comparator) this.f5644m);
        ArrayList arrayList2 = new ArrayList(C12850p.m33647a(a, 10));
        for (C2956k0 k0Var2 : a) {
            arrayList2.add(new C1648d(this.f5637f.mo35844a(k0Var2.mo9124d()), k0Var2));
        }
        return arrayList2;
    }
}
