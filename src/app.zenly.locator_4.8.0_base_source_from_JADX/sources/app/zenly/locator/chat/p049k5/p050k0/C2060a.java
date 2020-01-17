package app.zenly.locator.chat.p049k5.p050k0;

import app.zenly.locator.chat.p049k5.p051l0.C2064a;
import app.zenly.locator.chat.p059r5.C2309e;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.util.C3201f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.core.C7117i;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.chat.k5.k0.a */
public final class C2060a {

    /* renamed from: a */
    private final C12279e<C7117i> f6524a;

    /* renamed from: b */
    private final FriendStore f6525b;

    /* renamed from: c */
    private final FriendRequestStore f6526c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3201f<C6818b> f6527d;

    /* renamed from: app.zenly.locator.chat.k5.k0.a$a */
    public static final class C2061a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C2060a f6528a;

        public C2061a(C2060a aVar) {
            this.f6528a = aVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            return this.f6528a.m7830a((List) t1, (Map) t2, (List) t3);
        }
    }

    /* renamed from: app.zenly.locator.chat.k5.k0.a$b */
    static final class C2062b<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C2060a f6529e;

        C2062b(C2060a aVar) {
            this.f6529e = aVar;
        }

        /* renamed from: a */
        public final List<C6818b> apply(C7117i iVar) {
            C12932j.m33818b(iVar, "it");
            List othersList = iVar.getOthersList();
            C12932j.m33815a((Object) othersList, "it.othersList");
            return C12857w.m33665a((Iterable) othersList, (Comparator) this.f6529e.f6527d);
        }
    }

    public C2060a(C12279e<C7117i> eVar, FriendStore friendStore, FriendRequestStore friendRequestStore, C3201f<C6818b> fVar) {
        C12932j.m33818b(eVar, "conversationObservable");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(friendRequestStore, "friendRequestsStore");
        C12932j.m33818b(fVar, "memberComparator");
        this.f6524a = eVar;
        this.f6525b = friendStore;
        this.f6526c = friendRequestStore;
        this.f6527d = fVar;
    }

    /* renamed from: a */
    public final C12279e<List<C2064a>> mo7871a() {
        C12774b bVar = C12774b.f33320a;
        C12279e i = this.f6524a.mo36501i(new C2062b(this));
        C12932j.m33815a((Object) i, "conversationObservable.m…dWith(memberComparator) }");
        C12279e<List<C2064a>> a = C12279e.m32609a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) this.f6525b.friendsMap(), (ObservableSource<? extends T3>) this.f6526c.friendRequests(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C2061a<Object,Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…emberViewModels\n        )");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C2064a> m7830a(List<C6818b> list, Map<String, C2936a0> map, List<C2956k0> list2) {
        ArrayList<C6818b> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (true ^ C2309e.m8217a((C6818b) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
        for (C6818b bVar : arrayList) {
            String userUuid = bVar.getUserUuid();
            C12932j.m33815a((Object) userUuid, "it.userUuid");
            String nickname = bVar.getNickname();
            C12932j.m33815a((Object) nickname, "it.nickname");
            boolean containsKey = map.containsKey(bVar.getUserUuid());
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C12932j.m33817a((Object) ((C2956k0) it.next()).mo9122b().getTargetUuid(), (Object) bVar.getUserUuid())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList2.add(new C2064a(userUuid, nickname, containsKey, z));
        }
        return arrayList2;
    }
}
