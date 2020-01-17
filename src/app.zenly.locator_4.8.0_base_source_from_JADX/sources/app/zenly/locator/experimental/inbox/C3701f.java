package app.zenly.locator.experimental.inbox;

import android.content.Context;
import android.view.View;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.locator.R;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.experimental.inbox.C3697d.C3698a;
import app.zenly.locator.experimental.inbox.p093j.C3710a;
import app.zenly.locator.experimental.inbox.p093j.C3711b;
import app.zenly.locator.experimental.inbox.p095l.C3720a;
import app.zenly.locator.experimental.inbox.p095l.C3721b;
import app.zenly.locator.experimental.inbox.p095l.C3722c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.experimental.inbox.f */
public final class C3701f extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f9928f = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f9929g;

    /* renamed from: h */
    private final C1322a f9930h;

    /* renamed from: i */
    private final ZenlyCore f9931i;

    /* renamed from: j */
    private final C3699e f9932j;

    /* renamed from: k */
    private final C3697d f9933k;

    /* renamed from: l */
    private final FriendRequestStore f9934l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C11727c f9935m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final EventDispatcher f9936n;

    /* renamed from: app.zenly.locator.experimental.inbox.f$a */
    public static final class C3702a {
        private C3702a() {
        }

        public /* synthetic */ C3702a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.f$b */
    static final /* synthetic */ class C3703b extends C12931i implements Function1<UserProto$User, Boolean> {
        C3703b(C3701f fVar) {
            super(1, fVar);
        }

        /* renamed from: a */
        public final boolean mo10232a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "p1");
            return ((C3701f) this.f33505f).m11085a(userProto$User);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3701f.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "friendsLimitNotExceeded(Lco/znly/models/UserProto$User;)Z";
        }

        public final String getName() {
            return "friendsLimitNotExceeded";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo10232a((UserProto$User) obj));
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.f$c */
    static final class C3704c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3701f f9937e;

        C3704c(C3701f fVar) {
            this.f9937e = fVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            return this.f9937e.m11087b();
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.f$d */
    public static final class C3705d<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C3701f f9938a;

        public C3705d(C3701f fVar) {
            this.f9938a = fVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            C3698a aVar = (C3698a) t3;
            List list = (List) t2;
            List list2 = (List) t1;
            if (list2.isEmpty()) {
                return C11751f.m30859a();
            }
            String string = this.f9938a.f9929g.getString(R.string.z_track4exp3_inbox_quickAdd_title);
            C12932j.m33815a((Object) string, "context.getString(R.stri…xp3_inbox_quickAdd_title)");
            return C11751f.m30863b(C12848o.m33643b((Object[]) new C11722a[]{new C3722c(this.f9938a.f9928f.mo35844a(string), string), new C3721b(this.f9938a.m11083a(list2, list, aVar), this.f9938a.f9935m, this.f9938a.f9936n)}));
        }
    }

    static {
        new C3702a(null);
    }

    public C3701f(Context context, C1322a aVar, ZenlyCore zenlyCore, C3699e eVar, C3697d dVar, FriendRequestStore friendRequestStore, C11727c cVar, EventDispatcher eventDispatcher) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "decisionApi");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(eVar, "suggestedRepository");
        C12932j.m33818b(dVar, "suggestedInvitationRepository");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(cVar, "childViewFactory");
        C12932j.m33818b(eventDispatcher, "childEventDispatcher");
        this.f9929g = context;
        this.f9930h = aVar;
        this.f9931i = zenlyCore;
        this.f9932j = eVar;
        this.f9933k = dVar;
        this.f9934l = friendRequestStore;
        this.f9935m = cVar;
        this.f9936n = eventDispatcher;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        if (this.f9930h.mo6511a("feature:quickAddInboxFeature")) {
            C12279e<Seekable<C11722a>> m = this.f9931i.userMeStream().mo36459b((Predicate<? super T>) new C3706g<Object>(new C3703b(this))).mo36509m(new C3704c(this));
            C12932j.m33815a((Object) m, "core.userMeStream()\n    …uggestedFriendsStream() }");
            return m;
        }
        C12279e<Seekable<C11722a>> e = C12279e.m32626e(C11751f.m30859a());
        C12932j.m33815a((Object) e, "Observable.just(Seekables.empty())");
        return e;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C12279e<Seekable<C11722a>> m11087b() {
        C12774b bVar = C12774b.f33320a;
        return C12279e.m32609a((ObservableSource<? extends T1>) this.f9932j.mo10230a(), (ObservableSource<? extends T2>) this.f9934l.friendRequests(), (ObservableSource<? extends T3>) this.f9933k.mo10226a(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3705d<Object,Object,Object,Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m11085a(UserProto$User userProto$User) {
        return userProto$User.getFriendsCount() < 8;
    }

    /* renamed from: a */
    private final C3720a m11080a(C3711b bVar, C3698a aVar) {
        return new C3720a(this.f9928f.mo35844a(bVar.mo10240d()), bVar, aVar.mo10228a(bVar.mo10240d()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C3720a> m11083a(List<C3711b> list, List<C2956k0> list2, C3698a aVar) {
        Object obj;
        ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
        for (C3711b a : list) {
            arrayList.add(m11080a(a, aVar));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            C3720a aVar2 = (C3720a) next;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C12932j.m33817a((Object) ((C2956k0) obj).mo9122b().getTargetUuid(), (Object) aVar2.mo10252g().mo10240d())) {
                    break;
                }
            }
            if (obj == null || aVar2.mo10251f() != C3710a.NOT_INVITED) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
