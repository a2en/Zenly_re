package app.zenly.locator.p017a0.p035r.p037g;

import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.p017a0.p035r.C1651b;
import app.zenly.locator.p017a0.p035r.p039i.C1672a;
import app.zenly.locator.p017a0.p035r.p039i.C1673b;
import app.zenly.locator.p017a0.p035r.p039i.C1674c;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7302f3;
import p213co.znly.models.UserProto$DisabledNotifications;
import p213co.znly.models.UserProto$DisabledNotifications.C6923b;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.a0.r.g.a */
public final class C1661a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C7302f3 f5695l = C7302f3.NotificationCountryChange;

    /* renamed from: f */
    private final C12119a f5696f = new C12119a();

    /* renamed from: g */
    private final Comparator<C2936a0> f5697g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12279e<UserProto$User> f5698h;

    /* renamed from: i */
    private final C12279e<String> f5699i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final FriendStore f5700j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final ZenlyCore f5701k;

    /* renamed from: app.zenly.locator.a0.r.g.a$a */
    public static final class C1662a {
        private C1662a() {
        }

        public /* synthetic */ C1662a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.a0.r.g.a$b */
    static final class C1663b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C1661a f5702e;

        /* renamed from: app.zenly.locator.a0.r.g.a$b$a */
        public static final class C1664a<T1, T2, R> implements BiFunction<T1, T2, R> {

            /* renamed from: a */
            final /* synthetic */ C1663b f5703a;

            /* renamed from: b */
            final /* synthetic */ boolean f5704b;

            public C1664a(C1663b bVar, boolean z) {
                this.f5703a = bVar;
                this.f5704b = z;
            }

            public final R apply(T1 t1, T2 t2) {
                List list = (List) t2;
                UserProto$User userProto$User = (UserProto$User) t1;
                UserProto$DisabledNotifications disabledNotifications = userProto$User.getDisabledNotifications();
                String str = "user.disabledNotifications";
                C12932j.m33815a((Object) disabledNotifications, str);
                boolean a = C1651b.m6951a(disabledNotifications, C1661a.f5695l);
                ArrayList arrayList = new ArrayList();
                if (!this.f5704b) {
                    arrayList.add(new C1673b(R.string.settings_friendsabroad_toggle_all, C1661a.f5695l, a));
                }
                C12932j.m33815a((Object) list, "friends");
                if (!list.isEmpty()) {
                    C1661a aVar = this.f5703a.f5702e;
                    UserProto$DisabledNotifications disabledNotifications2 = userProto$User.getDisabledNotifications();
                    C12932j.m33815a((Object) disabledNotifications2, str);
                    arrayList.addAll(aVar.m6974a(list, disabledNotifications2));
                } else {
                    arrayList.add(new C1672a(this.f5704b ? R.string.settings_friendsAbroad_emptySearch : R.string.settings_friendsAbroad_empty));
                }
                return C11751f.m30863b(arrayList);
            }
        }

        /* renamed from: app.zenly.locator.a0.r.g.a$b$b */
        static final class C1665b<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C1665b f5705e = new C1665b();

            C1665b() {
            }

            /* renamed from: a */
            public final C2936a0 apply(UserProto$User userProto$User) {
                C12932j.m33818b(userProto$User, "it");
                return new C2936a0(userProto$User);
            }
        }

        C1663b(C1661a aVar) {
            this.f5702e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(String str) {
            C12279e eVar;
            C12932j.m33818b(str, "query");
            boolean z = str.length() > 0;
            if (z) {
                eVar = this.f5702e.f5701k.friendsSearchStream(str).mo36501i(C1665b.f5705e).mo36511n().mo36553e();
            } else {
                eVar = this.f5702e.f5700j.friends();
            }
            C12774b bVar = C12774b.f33320a;
            C12279e c = this.f5702e.f5698h;
            C12932j.m33815a((Object) eVar, "friendObservable");
            return C12279e.m32610a((ObservableSource<? extends T1>) c, (ObservableSource<? extends T2>) eVar, (BiFunction<? super T1, ? super T2, ? extends R>) new C1664a<Object,Object,Object>(this, z));
        }
    }

    static {
        new C1662a(null);
    }

    public C1661a(Comparator<C2936a0> comparator, C12279e<UserProto$User> eVar, C12279e<String> eVar2, FriendStore friendStore, ZenlyCore zenlyCore) {
        C12932j.m33818b(comparator, "friendsByName");
        C12932j.m33818b(eVar, "userMeObservable");
        C12932j.m33818b(eVar2, "queryObservable");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(zenlyCore, "core");
        this.f5697g = comparator;
        this.f5698h = eVar;
        this.f5699i = eVar2;
        this.f5700j = friendStore;
        this.f5701k = zenlyCore;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> m = this.f5699i.mo36509m(new C1663b(this));
        C12932j.m33815a((Object) m, "queryObservable.switchMa…)\n            }\n        }");
        return m;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C11722a> m6974a(List<C2936a0> list, UserProto$DisabledNotifications userProto$DisabledNotifications) {
        boolean a = C1651b.m6951a(userProto$DisabledNotifications, f5695l);
        List<C6923b> perUserList = userProto$DisabledNotifications.getPerUserList();
        C12932j.m33815a((Object) perUserList, "disabledNotifications.perUserList");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(perUserList, 10)), 16));
        for (C6923b bVar : perUserList) {
            String str = "forUser";
            C12932j.m33815a((Object) bVar, str);
            String userUuid = bVar.getUserUuid();
            C12932j.m33815a((Object) bVar, str);
            linkedHashMap.put(userUuid, Boolean.valueOf(C7710c.m18767b(bVar.getBitfield(), f5695l.getNumber())));
        }
        List<C2936a0> a2 = C12857w.m33665a((Iterable) list, (Comparator) this.f5697g);
        ArrayList arrayList = new ArrayList(C12850p.m33647a(a2, 10));
        for (C2936a0 a0Var : a2) {
            Boolean bool = (Boolean) linkedHashMap.get(a0Var.mo9074a().getUuid());
            C1674c cVar = new C1674c(this.f5696f.mo35844a(a0Var.mo9074a().getUuid()), a0Var, f5695l, a && !(bool != null ? bool.booleanValue() : false), a);
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
