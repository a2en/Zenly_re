package app.zenly.locator.userprofile.p198me.p202j;

import android.content.Context;
import android.view.View;
import app.zenly.android.feature.descendants.feedback.C1381b;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs.C1379a;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.friendshipfacts.FriendshipFactsPrefs;
import app.zenly.locator.friendshipfacts.FriendshipFactsPrefs.C3764a;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import app.zenly.locator.userprofile.p198me.appicons.C6056h;
import app.zenly.locator.userprofile.p198me.p204l.C6134a;
import app.zenly.locator.userprofile.p198me.p204l.C6135b;
import app.zenly.locator.userprofile.p198me.p204l.C6136c;
import app.zenly.locator.userprofile.p198me.p204l.C6137d;
import app.zenly.locator.userprofile.p198me.p204l.C6138e;
import app.zenly.locator.userprofile.p198me.p204l.C6139f;
import app.zenly.locator.userprofile.p198me.p204l.C6143j;
import app.zenly.locator.userprofile.p198me.p204l.C6144k;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C12844m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6926b;
import p213co.znly.models.UserProto$UserEngagementStats;
import p213co.znly.models.core.C7210s0;
import p213co.znly.models.services.C8001b5;
import p213co.znly.models.services.C8230p5;
import p213co.znly.models.services.C8361w5;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function8;
import p389io.reactivex.p390h.C12292a;

/* renamed from: app.zenly.locator.userprofile.me.j.a */
public final class C6101a extends C12292a implements ObservableSectionController {

    /* renamed from: f */
    private final C12119a f15345f = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f15346g;

    /* renamed from: h */
    private final EventDispatcher f15347h;

    /* renamed from: i */
    private final C11727c f15348i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12271b f15349j;

    /* renamed from: k */
    private final ZenlyCore f15350k;

    /* renamed from: l */
    private final C12279e<C1379a> f15351l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1381b f15352m;

    /* renamed from: n */
    private final C12279e<Integer> f15353n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C6056h f15354o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C6052e f15355p;

    /* renamed from: q */
    private final C12279e<List<C7210s0>> f15356q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final FriendshipFactsPrefs f15357r;

    /* renamed from: app.zenly.locator.userprofile.me.j.a$a */
    public static final class C6102a {
        private C6102a() {
        }

        public /* synthetic */ C6102a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.j.a$b */
    private static final class C6103b {

        /* renamed from: a */
        private final long f15358a;

        /* renamed from: b */
        private final List<Long> f15359b;

        public C6103b(long j, List<Long> list) {
            C12932j.m33818b(list, "timeSpentByWeeksMillis");
            this.f15358a = j;
            this.f15359b = list;
        }

        /* renamed from: a */
        public final List<Long> mo13928a() {
            return this.f15359b;
        }

        /* renamed from: b */
        public final long mo13929b() {
            return this.f15358a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6103b) {
                    C6103b bVar = (C6103b) obj;
                    if (!(this.f15358a == bVar.f15358a) || !C12932j.m33817a((Object) this.f15359b, (Object) bVar.f15359b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int a = Long.valueOf(this.f15358a).hashCode() * 31;
            List<Long> list = this.f15359b;
            return a + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TstState(timeSpentTotalMillis=");
            sb.append(this.f15358a);
            sb.append(", timeSpentByWeeksMillis=");
            sb.append(this.f15359b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.j.a$c */
    static final class C6104c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C6104c f15360e = new C6104c();

        C6104c() {
        }

        /* renamed from: a */
        public final C6103b apply(C8001b5 b5Var) {
            String str;
            C12932j.m33818b(b5Var, "tsts");
            List tstsList = b5Var.getTstsList();
            String str2 = "tsts.tstsList";
            C12932j.m33815a((Object) tstsList, str2);
            ArrayList<TimeTogetherProto$Tst> arrayList = new ArrayList<>();
            Iterator it = tstsList.iterator();
            while (true) {
                str = "it";
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                TimeTogetherProto$Tst timeTogetherProto$Tst = (TimeTogetherProto$Tst) next;
                C12932j.m33815a((Object) timeTogetherProto$Tst, str);
                Timestamp ts = timeTogetherProto$Tst.getTs();
                C12932j.m33815a((Object) ts, "it.ts");
                if (!C3245z.m10286e(ts)) {
                    arrayList.add(next);
                }
            }
            List arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
            for (TimeTogetherProto$Tst timeTogetherProto$Tst2 : arrayList) {
                C12932j.m33815a((Object) timeTogetherProto$Tst2, str);
                arrayList2.add(Long.valueOf(timeTogetherProto$Tst2.getTimeTogetherAllTime()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = C12846n.m33635a(Long.valueOf(0));
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                Object next2 = it2.next();
                while (it2.hasNext()) {
                    next2 = Long.valueOf(((Number) next2).longValue() + ((Number) it2.next()).longValue());
                }
                long longValue = ((Number) next2).longValue();
                ArrayList arrayList3 = new ArrayList();
                List<TimeTogetherProto$Tst> tstsList2 = b5Var.getTstsList();
                C12932j.m33815a((Object) tstsList2, str2);
                for (TimeTogetherProto$Tst timeTogetherProto$Tst3 : tstsList2) {
                    C12932j.m33815a((Object) timeTogetherProto$Tst3, str);
                    List trendGraphList = timeTogetherProto$Tst3.getTrendGraphList();
                    C12932j.m33815a((Object) trendGraphList, "it.trendGraphList");
                    int i = 0;
                    Iterator it3 = trendGraphList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                Long l = (Long) next3;
                                String str3 = "value";
                                if (arrayList3.size() > i) {
                                    long longValue2 = ((Number) arrayList3.get(i)).longValue();
                                    C12932j.m33815a((Object) l, str3);
                                    arrayList3.set(i, Long.valueOf(longValue2 + l.longValue()));
                                } else {
                                    C12932j.m33815a((Object) l, str3);
                                    arrayList3.add(l);
                                }
                                i = i2;
                            } else {
                                C12844m.m33616c();
                                throw null;
                            }
                        }
                    }
                }
                return new C6103b(TimeUnit.SECONDS.toMillis(longValue), C12855u.m33657d(arrayList3));
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.j.a$d */
    static final class C6105d<T, R> implements Function<Throwable, C6103b> {

        /* renamed from: e */
        public static final C6105d f15361e = new C6105d();

        C6105d() {
        }

        /* renamed from: a */
        public final Void apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return null;
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.j.a$e */
    public static final class C6106e<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> {

        /* renamed from: a */
        final /* synthetic */ C6101a f15362a;

        public C6106e(C6101a aVar) {
            this.f15362a = aVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            Seekable seekable;
            Seekable seekable2;
            Seekable seekable3;
            C6103b bVar = (C6103b) t8;
            C3764a aVar = (C3764a) t7;
            List list = (List) t6;
            C1379a aVar2 = (C1379a) t5;
            Integer num = (Integer) t4;
            UserProto$UserEngagementStats userProto$UserEngagementStats = (UserProto$UserEngagementStats) t3;
            C8361w5 w5Var = (C8361w5) t2;
            UserProto$User userProto$User = (UserProto$User) t1;
            FriendshipFactsPrefs f = this.f15362a.f15357r;
            C12932j.m33815a((Object) userProto$User, "user");
            f.onUserUpdate(userProto$User, true);
            int friendsCount = userProto$User.getFriendsCount();
            if (friendsCount < 3 || !(!list.isEmpty())) {
                seekable = C11751f.m30859a();
                seekable2 = C11751f.m30859a();
            } else {
                String quantityString = this.f15362a.f15346g.getResources().getQuantityString(R.plurals.profile_bestFriends_count, list.size(), new Object[]{Integer.valueOf(list.size())});
                C12932j.m33815a((Object) quantityString, "context.resources.getQua…V2.size\n                )");
                seekable = C11751f.m30861a(new C6143j(1, quantityString));
                seekable2 = this.f15362a.m16888a(list);
            }
            if (this.f15362a.f15354o.mo13875b()) {
                C12932j.m33815a((Object) userProto$UserEngagementStats, "userEngagement");
                seekable3 = C11751f.m30861a(new C6135b(userProto$UserEngagementStats, this.f15362a.f15355p));
            } else {
                seekable3 = C11751f.m30859a();
            }
            String string = this.f15362a.f15346g.getString(R.string.profile_highlights_section);
            C12932j.m33815a((Object) string, "context.getString(R.stri…ofile_highlights_section)");
            C6926b events = userProto$User.getEvents();
            C12932j.m33815a((Object) events, "user.events");
            int inviterCount = events.getInviterCount();
            C12932j.m33815a((Object) num, "descendantsNewCount");
            int intValue = num.intValue();
            C1381b e = this.f15362a.f15352m;
            C12932j.m33815a((Object) w5Var, "todayWatchers");
            C6144k kVar = new C6144k(userProto$User, inviterCount, intValue, aVar2, e, w5Var);
            return C11751f.m30862a(C12848o.m33643b((Object[]) new Seekable[]{seekable, seekable2, C11751f.m30861a(new C6143j(2, string)), this.f15362a.m16885a(friendsCount, bVar, aVar), C11751f.m30861a(new C6134a(kVar)), seekable3, C11751f.m30861a(new C6139f(userProto$User))}));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.j.a$f */
    static final /* synthetic */ class C6107f extends C12931i implements Function1<C8230p5, UserProto$UserEngagementStats> {

        /* renamed from: i */
        public static final C6107f f15363i = new C6107f();

        C6107f() {
            super(1);
        }

        /* renamed from: a */
        public final UserProto$UserEngagementStats invoke(C8230p5 p5Var) {
            C12932j.m33818b(p5Var, "p1");
            return p5Var.getUserEngagement();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C8230p5.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "getUserEngagement()Lco/znly/models/UserProto$UserEngagementStats;";
        }

        public final String getName() {
            return "getUserEngagement";
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.j.a$g */
    static final class C6108g<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C6101a f15364e;

        C6108g(C6101a aVar) {
            this.f15364e = aVar;
        }

        /* renamed from: a */
        public final C12279e<Seekable<C11722a>> apply(Seekable<C11722a> seekable) {
            C12932j.m33818b(seekable, "seekable");
            return this.f15364e.f15349j.mo36346a((ObservableSource<T>) C12279e.m32626e(seekable));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.j.a$h */
    static final class C6109h<T, R> implements Function<T, K> {

        /* renamed from: e */
        public static final C6109h f15365e = new C6109h();

        C6109h() {
        }

        /* renamed from: a */
        public final int mo13938a(C8361w5 w5Var) {
            C12932j.m33818b(w5Var, "response");
            return w5Var.getTimes();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(mo13938a((C8361w5) obj));
        }
    }

    static {
        new C6102a(null);
    }

    public C6101a(Context context, EventDispatcher eventDispatcher, C11727c cVar, C12271b bVar, ZenlyCore zenlyCore, C12279e<C1379a> eVar, C1381b bVar2, C12279e<Integer> eVar2, C6056h hVar, C6052e eVar3, C12279e<List<C7210s0>> eVar4, FriendshipFactsPrefs friendshipFactsPrefs) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(eventDispatcher, "eventDispatcher");
        C12932j.m33818b(cVar, "viewFactory");
        C12932j.m33818b(bVar, "delayBind");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(eVar, "descendantsPrefs");
        C12932j.m33818b(bVar2, "descendantsNewCountInterceptor");
        C12932j.m33818b(eVar2, "descendantsNewCount");
        C12932j.m33818b(hVar, "appIconsShortcutInstaller");
        C12932j.m33818b(eVar3, "appIconsPrefs");
        C12932j.m33818b(eVar4, "bestFriendsObservable");
        C12932j.m33818b(friendshipFactsPrefs, "friendshipFactsPrefs");
        this.f15346g = context;
        this.f15347h = eventDispatcher;
        this.f15348i = cVar;
        this.f15349j = bVar;
        this.f15350k = zenlyCore;
        this.f15351l = eVar;
        this.f15352m = bVar2;
        this.f15353n = eVar2;
        this.f15354o = hVar;
        this.f15355p = eVar3;
        this.f15356q = eVar4;
        this.f15357r = friendshipFactsPrefs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, app.zenly.locator.userprofile.me.j.a$f] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r4v1, types: [app.zenly.locator.userprofile.me.j.b] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p389io.reactivex.C12279e<com.snap.p327ui.seeking.Seekable<com.snap.p327ui.recycling.p328d.C11722a>> getViewModels() {
        /*
            r11 = this;
            io.reactivex.m.b r0 = p389io.reactivex.p405m.C12774b.f33320a
            co.znly.core.ZenlyCore r0 = r11.f15350k
            io.reactivex.e r0 = r0.userMeStream()
            io.reactivex.e r1 = p389io.reactivex.C12279e.m32633q()
            io.reactivex.e r2 = r0.mo36466c(r1)
            java.lang.String r0 = "core.userMeStream().onEr…eNext(Observable.empty())"
            kotlin.jvm.internal.C12932j.m33815a(r2, r0)
            io.reactivex.e r0 = r11.m16892c()
            io.reactivex.e r1 = p389io.reactivex.C12279e.m32633q()
            io.reactivex.e r3 = r0.mo36466c(r1)
            java.lang.String r0 = "watchersObservable().onE…eNext(Observable.empty())"
            kotlin.jvm.internal.C12932j.m33815a(r3, r0)
            co.znly.core.ZenlyCore r0 = r11.f15350k
            io.reactivex.e r0 = r0.userEngagement()
            io.reactivex.e r1 = p389io.reactivex.C12279e.m32633q()
            io.reactivex.e r0 = r0.mo36466c(r1)
            app.zenly.locator.userprofile.me.j.a$f r1 = app.zenly.locator.userprofile.p198me.p202j.C6101a.C6107f.f15363i
            if (r1 == 0) goto L_0x003e
            app.zenly.locator.userprofile.me.j.b r4 = new app.zenly.locator.userprofile.me.j.b
            r4.<init>(r1)
            r1 = r4
        L_0x003e:
            io.reactivex.functions.Function r1 = (p389io.reactivex.functions.Function) r1
            io.reactivex.e r4 = r0.mo36501i(r1)
            java.lang.String r0 = "core.userEngagement()\n  …ponse::getUserEngagement)"
            kotlin.jvm.internal.C12932j.m33815a(r4, r0)
            io.reactivex.e<java.lang.Integer> r0 = r11.f15353n
            io.reactivex.e r5 = r0.mo36477d()
            java.lang.String r0 = "descendantsNewCount.distinctUntilChanged()"
            kotlin.jvm.internal.C12932j.m33815a(r5, r0)
            io.reactivex.e<app.zenly.android.feature.descendants.feedback.DescendantsPrefs$a> r6 = r11.f15351l
            io.reactivex.e<java.util.List<co.znly.models.core.s0>> r7 = r11.f15356q
            app.zenly.locator.friendshipfacts.FriendshipFactsPrefs r0 = r11.f15357r
            io.reactivex.e r8 = r0.observeState()
            io.reactivex.e r0 = r11.m16890b()
            io.reactivex.e r1 = p389io.reactivex.C12279e.m32633q()
            io.reactivex.e r9 = r0.mo36466c(r1)
            java.lang.String r0 = "friendshipFactsObservabl…eNext(Observable.empty())"
            kotlin.jvm.internal.C12932j.m33815a(r9, r0)
            app.zenly.locator.userprofile.me.j.a$e r10 = new app.zenly.locator.userprofile.me.j.a$e
            r10.<init>(r11)
            io.reactivex.e r0 = p389io.reactivex.C12279e.m32605a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            app.zenly.locator.userprofile.me.j.a$g r1 = new app.zenly.locator.userprofile.me.j.a$g
            r1.<init>(r11)
            io.reactivex.e r0 = r0.mo36490e(r1)
            java.lang.String r1 = "Observables.combineLates…(seekable))\n            }"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.userprofile.p198me.p202j.C6101a.getViewModels():io.reactivex.e");
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* renamed from: b */
    private final C12279e<C6103b> m16890b() {
        C12279e<C6103b> k = this.f15350k.timeTogetherState().mo36501i(C6104c.f15360e).mo36504k(C6105d.f15361e);
        C12932j.m33815a((Object) k, "core.timeTogetherState()…  .onErrorReturn { null }");
        return k;
    }

    /* renamed from: c */
    private final C12279e<C8361w5> m16892c() {
        C12279e<C8361w5> d = this.f15350k.userTodayWatchersStream().mo36484d((Function<? super T, K>) C6109h.f15365e);
        C12932j.m33815a((Object) d, "core\n            .userTo…ponse -> response.times }");
        return d;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4 != null) goto L_0x002b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.snap.p327ui.seeking.Seekable<com.snap.p327ui.recycling.p328d.C11722a> m16885a(int r3, app.zenly.locator.userprofile.p198me.p202j.C6101a.C6103b r4, app.zenly.locator.friendshipfacts.FriendshipFactsPrefs.C3764a r5) {
        /*
            r2 = this;
            r0 = 3
            if (r3 < r0) goto L_0x0033
            app.zenly.locator.friendshipfacts.FriendshipFactsPrefs$a r0 = app.zenly.locator.friendshipfacts.FriendshipFactsPrefs.C3764a.UNLOCKABLE
            if (r5 != r0) goto L_0x0013
            app.zenly.locator.userprofile.me.l.g r3 = new app.zenly.locator.userprofile.me.l.g
            r4 = 1
            r3.<init>(r4)
            com.snap.ui.seeking.Seekable r3 = com.snap.p327ui.seeking.C11751f.m30861a(r3)
            goto L_0x0037
        L_0x0013:
            app.zenly.locator.userprofile.me.l.h r5 = new app.zenly.locator.userprofile.me.l.h
            if (r4 == 0) goto L_0x001c
            long r0 = r4.mo13929b()
            goto L_0x001e
        L_0x001c:
            r0 = 0
        L_0x001e:
            if (r4 == 0) goto L_0x0027
            java.util.List r4 = r4.mo13928a()
            if (r4 == 0) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.util.List r4 = kotlin.collections.C12848o.m33640a()
        L_0x002b:
            r5.<init>(r3, r0, r4)
            com.snap.ui.seeking.Seekable r3 = com.snap.p327ui.seeking.C11751f.m30861a(r5)
            goto L_0x0037
        L_0x0033:
            com.snap.ui.seeking.Seekable r3 = com.snap.p327ui.seeking.C11751f.m30859a()
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.userprofile.p198me.p202j.C6101a.m16885a(int, app.zenly.locator.userprofile.me.j.a$b, app.zenly.locator.friendshipfacts.FriendshipFactsPrefs$a):com.snap.ui.seeking.Seekable");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Seekable<C11722a> m16888a(List<C7210s0> list) {
        ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
        for (C7210s0 s0Var : list) {
            C12119a aVar = this.f15345f;
            UserProto$User friend = s0Var.getFriend();
            C12932j.m33815a((Object) friend, "it.friend");
            arrayList.add(new C6137d(aVar.mo35844a(friend.getUuid()), s0Var));
        }
        List d = C12857w.m33678d((Collection) arrayList);
        for (int size = d.size(); size < 4; size++) {
            C12119a aVar2 = this.f15345f;
            StringBuilder sb = new StringBuilder();
            sb.append("unknownuuid");
            sb.append(size);
            d.add(new C6136c(aVar2.mo35844a(sb.toString())));
        }
        return C11751f.m30861a(new C6138e(d, this.f15348i, this.f15347h));
    }
}
