package app.zenly.locator.p017a0.p018n;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8202o0;
import p213co.znly.models.services.C8220p0;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12789c;

/* renamed from: app.zenly.locator.a0.n.c */
public final class C1534c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<UserProto$User> f5433a = C12848o.m33640a();

    /* renamed from: b */
    private final C12789c<List<UserProto$User>> f5434b;

    /* renamed from: app.zenly.locator.a0.n.c$a */
    static final class C1535a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1535a f5435e = new C1535a();

        C1535a() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(C8220p0 p0Var) {
            C12932j.m33818b(p0Var, "it");
            return p0Var.getBlockedUsersList();
        }
    }

    /* renamed from: app.zenly.locator.a0.n.c$b */
    static final class C1536b<T> implements Consumer<List<UserProto$User>> {

        /* renamed from: e */
        final /* synthetic */ C1534c f5436e;

        C1536b(C1534c cVar) {
            this.f5436e = cVar;
        }

        /* renamed from: a */
        public final void accept(List<UserProto$User> list) {
            C1534c cVar = this.f5436e;
            C12932j.m33815a((Object) list, "it");
            cVar.f5433a = list;
        }
    }

    public C1534c() {
        C12789c<List<UserProto$User>> s = C12789c.m33462s();
        C12932j.m33815a((Object) s, "PublishSubject.create()");
        this.f5434b = s;
    }

    /* renamed from: b */
    public final void mo7072b(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        List<UserProto$User> list = this.f5433a;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!C12932j.m33817a((Object) ((UserProto$User) next).getUuid(), (Object) userProto$User.getUuid())) {
                arrayList.add(next);
            }
        }
        this.f5433a = arrayList;
        this.f5434b.onNext(this.f5433a);
    }

    /* renamed from: c */
    public final C12271b mo7073c(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        C12271b h = C5448c.m15478a().userUnblock(userProto$User.getUuid()).mo36498h();
        C12932j.m33815a((Object) h, "ZenlyCoreProvider.get().…er.uuid).ignoreElements()");
        return h;
    }

    /* renamed from: a */
    public final C12279e<List<UserProto$User>> mo7070a() {
        C12279e<List<UserProto$User>> b = C5448c.m15478a().blockedUsersSync(C8202o0.getDefaultInstance()).mo36501i(C1535a.f5435e).mo36451b((ObservableSource<? extends T>) this.f5434b).mo36455b((Consumer<? super T>) new C1536b<Object>(this));
        C12932j.m33815a((Object) b, "ZenlyCoreProvider.get().…ta = it\n                }");
        return b;
    }

    /* renamed from: a */
    public final void mo7071a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        this.f5433a = C12857w.m33666a((Collection) this.f5433a, (Object) userProto$User);
        this.f5434b.onNext(this.f5433a);
    }
}
