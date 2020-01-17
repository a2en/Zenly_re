package app.zenly.locator.sharesheet.p167e0;

import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.sharesheet.e0.b */
public final class C5621b {

    /* renamed from: a */
    private final FriendStore f14364a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<String> f14365b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Comparator<UserProto$User> f14366c;

    /* renamed from: app.zenly.locator.sharesheet.e0.b$a */
    static final class C5622a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C5621b f14367e;

        C5622a(C5621b bVar) {
            this.f14367e = bVar;
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(List<C2936a0> list) {
            C12932j.m33818b(list, "friends");
            ArrayList<C2936a0> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (!this.f14367e.f14365b.contains(((C2936a0) next).mo9074a().getUuid())) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
            for (C2936a0 a : arrayList) {
                arrayList2.add(a.mo9074a());
            }
            return C12857w.m33665a((Iterable) arrayList2, this.f14367e.f14366c);
        }
    }

    public C5621b(FriendStore friendStore, List<String> list, Comparator<UserProto$User> comparator) {
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(list, "excludedUsers");
        C12932j.m33818b(comparator, "userComparator");
        this.f14364a = friendStore;
        this.f14365b = list;
        this.f14366c = comparator;
    }

    /* renamed from: a */
    public final C12279e<List<UserProto$User>> mo13271a() {
        C12279e<List<UserProto$User>> i = this.f14364a.friends().mo36487e(1).mo36501i(new C5622a(this));
        C12932j.m33815a((Object) i, "friendStore.friends()\n  …Comparator)\n            }");
        return i;
    }
}
