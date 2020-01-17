package app.zenly.locator.dashboard.p075w;

import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2949h;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.ContactSoonOnZenlyStore;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function5;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.w.h */
public final class C3337h {

    /* renamed from: a */
    private final ZenlySchedulers f9276a;

    /* renamed from: b */
    private final FriendStore f9277b;

    /* renamed from: c */
    private final C3330d f9278c;

    /* renamed from: d */
    private final FriendRequestStore f9279d;

    /* renamed from: e */
    private final ContactAlreadyOnZenlyStore f9280e;

    /* renamed from: f */
    private final ContactSoonOnZenlyStore f9281f;

    /* renamed from: app.zenly.locator.dashboard.w.h$a */
    public static final class C3338a<T1, T2, T3, T4, T5, R> implements Function5<T1, T2, T3, T4, T5, R> {
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            List list = (List) t3;
            C3326a aVar = (C3326a) t2;
            Map map = (Map) t1;
            C3335g gVar = new C3335g(map, aVar, list, (Map) t4, (Map) t5);
            return gVar;
        }
    }

    /* renamed from: app.zenly.locator.dashboard.w.h$b */
    static final class C3339b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3339b f9282e = new C3339b();

        C3339b() {
        }

        /* renamed from: a */
        public final Map<String, C2935a> apply(List<C2935a> list) {
            C12932j.m33818b(list, "items");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(list, 10)), 16));
            for (Object next : list) {
                linkedHashMap.put(((C2935a) next).mo9069a().getDeviceContactId(), next);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: app.zenly.locator.dashboard.w.h$c */
    static final class C3340c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3340c f9283e = new C3340c();

        C3340c() {
        }

        /* renamed from: a */
        public final Map<String, C2949h> apply(List<C2949h> list) {
            C12932j.m33818b(list, "items");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(list, 10)), 16));
            for (Object next : list) {
                linkedHashMap.put(((C2949h) next).mo9104a().getDeviceContactId(), next);
            }
            return linkedHashMap;
        }
    }

    public C3337h(ZenlySchedulers zenlySchedulers, FriendStore friendStore, C3330d dVar, FriendRequestStore friendRequestStore, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, ContactSoonOnZenlyStore contactSoonOnZenlyStore) {
        C12932j.m33818b(zenlySchedulers, "schedulers");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(dVar, "contactInvitesRepository");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(contactAlreadyOnZenlyStore, "aozStore");
        C12932j.m33818b(contactSoonOnZenlyStore, "soonStore");
        this.f9276a = zenlySchedulers;
        this.f9277b = friendStore;
        this.f9278c = dVar;
        this.f9279d = friendRequestStore;
        this.f9280e = contactAlreadyOnZenlyStore;
        this.f9281f = contactSoonOnZenlyStore;
    }

    /* renamed from: a */
    public final C12279e<C3335g> mo9856a() {
        C12774b bVar = C12774b.f33320a;
        C12279e friendsMap = this.f9277b.friendsMap();
        C12279e a = this.f9278c.mo9835a().mo36428a((C12286f) this.f9276a.getUserInteractive());
        C12932j.m33815a((Object) a, "contactInvitesRepository…hedulers.userInteractive)");
        C12279e friendRequests = this.f9279d.friendRequests();
        C12279e i = this.f9280e.contactsAlreadyOnZenly().mo36501i(C3339b.f9282e);
        C12932j.m33815a((Object) i, "aozStore.contactsAlready…ntact.deviceContactId } }");
        C12279e i2 = this.f9281f.contactsSoonOnZenly().mo36501i(C3340c.f9283e);
        C12932j.m33815a((Object) i2, "soonStore.contactsSoonOn…ntact.deviceContactId } }");
        C12279e<C3335g> a2 = C12279e.m32607a((ObservableSource<? extends T1>) friendsMap, (ObservableSource<? extends T2>) a, (ObservableSource<? extends T3>) friendRequests, (ObservableSource<? extends T4>) i, (ObservableSource<? extends T5>) i2, (Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R>) new C3338a<Object,Object,Object,Object,Object,Object>());
        C12932j.m33815a((Object) a2, "Observables.combineLates… ::DashboardSharedDomain)");
        return a2;
    }
}
