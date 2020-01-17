package app.zenly.locator.p086e0.p087a.p089j;

import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.p086e0.p087a.p091l.C3656a;
import app.zenly.locator.p086e0.p087a.p091l.C3657b;
import app.zenly.locator.p086e0.p087a.p091l.C3658c;
import app.zenly.locator.p086e0.p087a.p091l.C3659d;
import app.zenly.locator.p086e0.p087a.p091l.C3660e;
import app.zenly.locator.p086e0.p087a.p091l.C3661f;
import app.zenly.locator.p086e0.p087a.p091l.C3662g;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C12844m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.C6947a3;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.e0.a.j.a */
public final class C3625a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f9742f = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Comparator<UserProto$User> f9743g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12271b f9744h;

    /* renamed from: i */
    private final C12279e<UserProto$User> f9745i;

    /* renamed from: j */
    private final C12279e<List<UserProto$User>> f9746j;

    /* renamed from: k */
    private final C12279e<C3641b> f9747k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12279e<TimeTogetherProto$Tst> f9748l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C12279e<C2991u0> f9749m;

    /* renamed from: n */
    private final FriendStore f9750n;

    /* renamed from: o */
    private final FriendRequestStore f9751o;

    /* renamed from: app.zenly.locator.e0.a.j.a$a */
    public static final class C3626a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C3625a f9752a;

        /* renamed from: b */
        final /* synthetic */ UserProto$User f9753b;

        /* renamed from: app.zenly.locator.e0.a.j.a$a$a */
        static final class C3627a extends C12933k implements Function1<UserProto$User, C3657b> {

            /* renamed from: f */
            final /* synthetic */ Map f9754f;

            /* renamed from: g */
            final /* synthetic */ List f9755g;

            /* renamed from: h */
            final /* synthetic */ C3626a f9756h;

            C3627a(Map map, List list, C3626a aVar) {
                this.f9754f = map;
                this.f9755g = list;
                this.f9756h = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C3657b invoke(UserProto$User userProto$User) {
                boolean z;
                C12932j.m33818b(userProto$User, "friend");
                long a = this.f9756h.f9752a.f9742f.mo35844a(userProto$User.getUuid());
                String uuid = userProto$User.getUuid();
                C12932j.m33815a((Object) uuid, "friend.uuid");
                boolean containsKey = this.f9754f.containsKey(userProto$User.getUuid());
                List list = this.f9755g;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C12932j.m33817a((Object) ((C2956k0) it.next()).mo9122b().getTargetUuid(), (Object) userProto$User.getUuid())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                C3657b bVar = new C3657b(a, uuid, containsKey, z, C12932j.m33817a((Object) userProto$User.getUuid(), (Object) C5447b.m15477d(C5448c.m15478a())), userProto$User.getPrivateMode());
                bVar.mo10150a(userProto$User);
                return bVar;
            }
        }

        /* renamed from: app.zenly.locator.e0.a.j.a$a$b */
        static final class C3628b extends C12933k implements Function1<C3657b, Boolean> {

            /* renamed from: f */
            final /* synthetic */ Map f9757f;

            /* renamed from: g */
            final /* synthetic */ C3626a f9758g;

            C3628b(Map map, C3626a aVar) {
                this.f9757f = map;
                this.f9758g = aVar;
                super(1);
            }

            /* renamed from: a */
            public final boolean mo10115a(C3657b bVar) {
                C12932j.m33818b(bVar, "model");
                return bVar.mo10156i() && !this.f9757f.containsKey(this.f9758g.f9753b.getUuid());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo10115a((C3657b) obj));
            }
        }

        public C3626a(C3625a aVar, UserProto$User userProto$User) {
            this.f9752a = aVar;
            this.f9753b = userProto$User;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            List list = (List) t3;
            Map map = (Map) t2;
            List list2 = (List) t1;
            C12932j.m33815a((Object) list2, "userFriends");
            return C12990j.m33935g(C12990j.m33930c(C12990j.m33928b(C12990j.m33930c(C12990j.m33925a(C12990j.m33926a(C12857w.m33671b((Iterable) list2), (Function1) C3630c.f9760f), this.f9752a.f9743g), new C3627a(map, list, this)), new C3628b(map, this)), C3631d.f9761f));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$b */
    static final class C3629b<T, R> implements Function<Throwable, List<? extends UserProto$User>> {

        /* renamed from: e */
        public static final C3629b f9759e = new C3629b();

        C3629b() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return C12848o.m33640a();
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$c */
    static final class C3630c extends C12933k implements Function1<UserProto$User, Boolean> {

        /* renamed from: f */
        public static final C3630c f9760f = new C3630c();

        C3630c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo10117a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            String name = userProto$User.getName();
            return !(name == null || C13028q.m34000a(name));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo10117a((UserProto$User) obj));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$d */
    static final class C3631d extends C12933k implements Function1<C3657b, C11722a> {

        /* renamed from: f */
        public static final C3631d f9761f = new C3631d();

        C3631d() {
            super(1);
        }

        /* renamed from: a */
        public final C11722a mo10118a(C3657b bVar) {
            C12932j.m33818b(bVar, "it");
            return bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C3657b bVar = (C3657b) obj;
            mo10118a(bVar);
            return bVar;
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$e */
    public static final class C3632e<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C3625a f9762a;

        /* renamed from: app.zenly.locator.e0.a.j.a$e$a */
        static final class C3633a extends C12933k implements Function0<C3658c> {

            /* renamed from: f */
            final /* synthetic */ C3641b f9763f;

            C3633a(C3641b bVar) {
                this.f9763f = bVar;
                super(0);
            }

            public final C3658c invoke() {
                String name = this.f9763f.mo10126a().getName();
                C12932j.m33815a((Object) name, "recommendFriendsFeature.user.name");
                return new C3658c(name, this.f9763f.mo10126a().getFriendsCount());
            }
        }

        public C3632e(C3625a aVar) {
            this.f9762a = aVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            C3641b bVar = (C3641b) t3;
            List<C11722a> list = (List) t1;
            Seekable a = C7712e.f19340a.mo19921a((C11722a) new C3660e(1, R.string.profile_highlights_section), (List) t2);
            C7712e eVar = C7712e.f19340a;
            int size = list.size();
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C11722a aVar : list) {
                    if (aVar == null) {
                        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.other.viewmodels.ProfileOtherFriendViewModel");
                    } else if (((C3657b) aVar).mo10157j()) {
                        i++;
                        if (i < 0) {
                            C12844m.m33610b();
                            throw null;
                        }
                    }
                }
            }
            return C11751f.m30860a(a, eVar.mo19921a((C11722a) new C3659d(size, i), C12857w.m33670b((Collection) list, (Iterable) this.f9762a.m10939a(bVar.mo10127a(list.size()), (Function0<? extends C11722a>) new C3633a<Object>(bVar)))));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$f */
    static final class C3634f<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ UserProto$User f9764e;

        C3634f(UserProto$User userProto$User) {
            this.f9764e = userProto$User;
        }

        /* renamed from: a */
        public final boolean mo10119a(Map<String, C2936a0> map) {
            C12932j.m33818b(map, "it");
            return map.containsKey(this.f9764e.getUuid());
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10119a((Map) obj));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$g */
    static final class C3635g<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3625a f9765e;

        /* renamed from: f */
        final /* synthetic */ UserProto$User f9766f;

        /* renamed from: app.zenly.locator.e0.a.j.a$g$a */
        static final class C3636a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ C3635g f9767e;

            /* renamed from: app.zenly.locator.e0.a.j.a$g$a$a */
            static final class C3637a<T, R> implements Function<T, R> {

                /* renamed from: e */
                final /* synthetic */ C3636a f9768e;

                /* renamed from: f */
                final /* synthetic */ C2991u0 f9769f;

                C3637a(C3636a aVar, C2991u0 u0Var) {
                    this.f9768e = aVar;
                    this.f9769f = u0Var;
                }

                /* renamed from: a */
                public final List<C11722a> apply(TimeTogetherProto$Tst timeTogetherProto$Tst) {
                    C12932j.m33818b(timeTogetherProto$Tst, "tst");
                    UserProto$User userProto$User = this.f9768e.f9767e.f9766f;
                    C2991u0 u0Var = this.f9769f;
                    C12932j.m33815a((Object) u0Var, "friendship");
                    return C12846n.m33635a(new C3661f(userProto$User, timeTogetherProto$Tst, u0Var));
                }
            }

            C3636a(C3635g gVar) {
                this.f9767e = gVar;
            }

            /* renamed from: a */
            public final C12279e<List<C11722a>> apply(C2991u0 u0Var) {
                C12932j.m33818b(u0Var, "friendship");
                return this.f9767e.f9765e.f9748l.mo36501i(new C3637a(this, u0Var)).mo36485d(C12846n.m33635a(new C3661f(this.f9767e.f9766f, null, u0Var)));
            }
        }

        /* renamed from: app.zenly.locator.e0.a.j.a$g$b */
        static final class C3638b<T, R> implements Function<Throwable, List<? extends C11722a>> {

            /* renamed from: e */
            public static final C3638b f9770e = new C3638b();

            C3638b() {
            }

            /* renamed from: a */
            public final List<C11722a> apply(Throwable th) {
                C12932j.m33818b(th, "it");
                return C12848o.m33640a();
            }
        }

        C3635g(C3625a aVar, UserProto$User userProto$User) {
            this.f9765e = aVar;
            this.f9766f = userProto$User;
        }

        /* renamed from: a */
        public final C12279e<List<C11722a>> apply(Boolean bool) {
            C12932j.m33818b(bool, "isFriend");
            if (bool.booleanValue()) {
                return this.f9765e.f9749m.mo36509m(new C3636a(this)).mo36504k(C3638b.f9770e);
            }
            return C12279e.m32626e(C12848o.m33640a());
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$h */
    static final class C3639h<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3625a f9771e;

        C3639h(C3625a aVar) {
            this.f9771e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(Seekable<C11722a> seekable) {
            C12932j.m33818b(seekable, "it");
            return this.f9771e.f9744h.mo36346a((ObservableSource<T>) C12279e.m32626e(seekable));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.j.a$i */
    static final class C3640i<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C3625a f9772e;

        C3640i(C3625a aVar) {
            this.f9772e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(UserProto$User userProto$User) {
            C3662g gVar;
            C12932j.m33818b(userProto$User, "user");
            if (userProto$User.getPrivateMode()) {
                gVar = C3662g.PRIVATE;
            } else if (userProto$User.getBlockRelationship() == C6947a3.BLOCKED_YOU) {
                gVar = C3662g.BLOCKED;
            } else {
                gVar = C3662g.NONE;
            }
            if (gVar == C3662g.NONE) {
                return this.f9772e.m10941b(userProto$User);
            }
            C12279e<Seekable<C11722a>> e = C12279e.m32626e(C11751f.m30861a(new C3656a(gVar)));
            C12932j.m33815a((Object) e, "Observable.just(Seekable…wModel)\n                )");
            return e;
        }
    }

    public C3625a(Comparator<UserProto$User> comparator, C12271b bVar, C12279e<UserProto$User> eVar, C12279e<List<UserProto$User>> eVar2, C12279e<C3641b> eVar3, C12279e<TimeTogetherProto$Tst> eVar4, C12279e<C2991u0> eVar5, FriendStore friendStore, FriendRequestStore friendRequestStore) {
        C12932j.m33818b(comparator, "userComparator");
        C12932j.m33818b(bVar, "waiter");
        C12932j.m33818b(eVar, "userObservable");
        C12932j.m33818b(eVar2, "userFriendsObservables");
        C12932j.m33818b(eVar3, "recommendFriendsFeatureObservable");
        C12932j.m33818b(eVar4, "tstObservable");
        C12932j.m33818b(eVar5, "friendshipObservable");
        C12932j.m33818b(friendStore, "friendsStore");
        C12932j.m33818b(friendRequestStore, "friendRequestsStore");
        this.f9743g = comparator;
        this.f9744h = bVar;
        this.f9745i = eVar;
        this.f9746j = eVar2;
        this.f9747k = eVar3;
        this.f9748l = eVar4;
        this.f9749m = eVar5;
        this.f9750n = friendStore;
        this.f9751o = friendRequestStore;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e m = this.f9745i.mo36509m(new C3640i(this));
        C12932j.m33815a((Object) m, "userObservable.switchMap…)\n            }\n        }");
        C12279e<Seekable<C11722a>> e = m.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C3639h<Object,Object>(this));
        C12932j.m33815a((Object) e, "modelsObservable.flatMap…en(Observable.just(it)) }");
        return e;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C12279e<Seekable<C11722a>> m10941b(UserProto$User userProto$User) {
        C12774b bVar = C12774b.f33320a;
        C12279e<Seekable<C11722a>> a = C12279e.m32609a((ObservableSource<? extends T1>) m10937a(userProto$User), (ObservableSource<? extends T2>) m10943c(userProto$User), (ObservableSource<? extends T3>) this.f9747k, (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3632e<Object,Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…)\n            )\n        }");
        return a;
    }

    /* renamed from: c */
    private final C12279e<List<C11722a>> m10943c(UserProto$User userProto$User) {
        C12279e<List<C11722a>> m = this.f9750n.friendsMap().mo36501i(new C3634f(userProto$User)).mo36477d().mo36509m(new C3635g(this, userProto$User));
        C12932j.m33815a((Object) m, "friendsStore.friendsMap(…)\n            }\n        }");
        return m;
    }

    /* renamed from: a */
    private final C12279e<List<C11722a>> m10937a(UserProto$User userProto$User) {
        C12774b bVar = C12774b.f33320a;
        C12279e k = this.f9746j.mo36504k(C3629b.f9759e);
        C12932j.m33815a((Object) k, "userFriendsObservables.o…rorReturn { emptyList() }");
        C12279e<List<C11722a>> a = C12279e.m32609a((ObservableSource<? extends T1>) k, (ObservableSource<? extends T2>) this.f9750n.friendsMap(), (ObservableSource<? extends T3>) this.f9751o.friendRequests(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3626a<Object,Object,Object,Object>(this, userProto$User));
        C12932j.m33815a((Object) a, "Observables.combineLates…      .toList()\n        }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C11722a> m10939a(boolean z, Function0<? extends C11722a> function0) {
        return z ? C12846n.m33635a(function0.invoke()) : C12848o.m33640a();
    }
}
