package app.zenly.locator.recommendation;

import android.content.Context;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.recommendation.C5245d.C5247b;
import app.zenly.locator.recommendation.model.PotentialMatch;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7135k0;
import p213co.znly.models.core.C7135k0.C7136a;
import p213co.znly.models.core.C7142l0;
import p213co.znly.models.core.C7159m1;
import p213co.znly.models.core.CoreRecommendationsProto$PotentialMatchOrBuilder;
import p213co.znly.models.recommendations.C7886b;
import p213co.znly.models.recommendations.C7888c;
import p213co.znly.models.services.C8032d4;
import p213co.znly.models.services.C8032d4.C8033a;
import p213co.znly.models.services.C8048e4;
import p213co.znly.models.services.C8064f4;
import p213co.znly.models.services.C8064f4.C8065a;
import p213co.znly.models.services.C8080g4;
import p213co.znly.models.services.C8096h4;
import p213co.znly.models.services.C8096h4.C8097a;
import p213co.znly.models.services.C8111i4;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.recommendation.k */
public final class C5266k {

    /* renamed from: a */
    private final ZenlySchedulers f13565a = C1351e.m6372a(C5249f.f13535b.mo19916a("recommendFriendsRepository"));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f13566b;

    /* renamed from: c */
    private final ZenlyCore f13567c;

    /* renamed from: app.zenly.locator.recommendation.k$a */
    public enum C5267a {
        ACCEPTED(C7886b.ACK_MATCH_ACCEPTED),
        PICKED_FROM_LIST(C7886b.ACK_MATCH_PICKED_FROM_LIST),
        IGNORED(C7886b.ACK_MATCH_IGNORED);
        

        /* renamed from: e */
        private final C7886b f13572e;

        private C5267a(C7886b bVar) {
            this.f13572e = bVar;
        }

        /* renamed from: a */
        public final C7886b mo12628a() {
            return this.f13572e;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$b */
    private static final class C5268b implements PotentialMatch {

        /* renamed from: a */
        private final Avatar f13573a = C2884f.m9355a(this.f13574b);

        /* renamed from: b */
        private final UserProto$User f13574b;

        public C5268b(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "user");
            this.f13574b = userProto$User;
        }

        public Avatar getAvatar() {
            return this.f13573a;
        }

        public String getId() {
            String uuid = this.f13574b.getUuid();
            C12932j.m33815a((Object) uuid, "user.uuid");
            return uuid;
        }

        public String getName() {
            String name = this.f13574b.getName();
            C12932j.m33815a((Object) name, "user.name");
            return name;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$c */
    static final class C5269c<T> implements Consumer<C8048e4> {

        /* renamed from: e */
        public static final C5269c f13575e = new C5269c();

        C5269c() {
        }

        /* renamed from: a */
        public final void accept(C8048e4 e4Var) {
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$d */
    static final class C5270d<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5270d f13576e = new C5270d();

        C5270d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Couldn't acknowledge potential match", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$e */
    static final class C5271e<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C5271e f13577e = new C5271e();

        C5271e() {
        }

        /* renamed from: a */
        public final Set<String> mo12634a(Set<String> set) {
            C12932j.m33818b(set, "it");
            return set;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            Set set = (Set) obj;
            mo12634a(set);
            return set;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$f */
    static final class C5272f<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C5266k f13578e;

        /* renamed from: f */
        final /* synthetic */ String f13579f;

        /* renamed from: g */
        final /* synthetic */ C5267a f13580g;

        C5272f(C5266k kVar, String str, C5267a aVar) {
            this.f13578e = kVar;
            this.f13579f = str;
            this.f13580g = aVar;
        }

        /* renamed from: a */
        public final Disposable apply(String str) {
            C12932j.m33818b(str, "potentialMatchUuid");
            return this.f13578e.mo12620a(this.f13579f, str, this.f13580g);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$g */
    static final class C5273g<T> implements Consumer<Disposable> {

        /* renamed from: e */
        public static final C5273g f13581e = new C5273g();

        C5273g() {
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$h */
    static final class C5274h<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5274h f13582e = new C5274h();

        C5274h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Couldn't send acknowledge potential matches", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$i */
    static final class C5275i<T> implements Consumer<C8080g4> {

        /* renamed from: e */
        public static final C5275i f13583e = new C5275i();

        C5275i() {
        }

        /* renamed from: a */
        public final void accept(C8080g4 g4Var) {
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$j */
    static final class C5276j<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5276j f13584e = new C5276j();

        C5276j() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Couldn't acknowledge recommendation", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$k */
    static final class C5277k<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C5277k f13585e = new C5277k();

        C5277k() {
        }

        /* renamed from: a */
        public final List<CoreRecommendationsProto$PotentialMatchOrBuilder> apply(C7142l0 l0Var) {
            C12932j.m33818b(l0Var, "it");
            List a = l0Var.mo19125a();
            C12932j.m33815a((Object) a, "it.potentialMatchesOrBuilderList");
            return C12857w.m33689j(a);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$l */
    static final class C5278l<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5278l f13586e = new C5278l();

        C5278l() {
        }

        /* renamed from: a */
        public final PotentialMatch apply(CoreRecommendationsProto$PotentialMatchOrBuilder coreRecommendationsProto$PotentialMatchOrBuilder) {
            C12932j.m33818b(coreRecommendationsProto$PotentialMatchOrBuilder, "it");
            UserProto$User friend = coreRecommendationsProto$PotentialMatchOrBuilder.getFriend();
            C12932j.m33815a((Object) friend, "it.friend");
            return new C5268b(friend);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$m */
    static final class C5279m<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5279m f13587e = new C5279m();

        /* renamed from: app.zenly.locator.recommendation.k$m$a */
        public static final class C5280a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                UserProto$User userProto$User = (UserProto$User) t2;
                String str = "user";
                C12932j.m33815a((Object) userProto$User, str);
                Boolean valueOf = Boolean.valueOf(C3194b0.m10163a(userProto$User));
                UserProto$User userProto$User2 = (UserProto$User) t;
                C12932j.m33815a((Object) userProto$User2, str);
                return C12998b.m33940a(valueOf, Boolean.valueOf(C3194b0.m10163a(userProto$User2)));
            }
        }

        C5279m() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(C7159m1 m1Var) {
            C12932j.m33818b(m1Var, "mutualFriendsState");
            List friendsList = m1Var.getFriendsList();
            C12932j.m33815a((Object) friendsList, "mutualFriendsState.friendsList");
            return C12857w.m33665a((Iterable) friendsList, (Comparator) new C5280a());
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$n */
    static final class C5281n<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C5266k f13588e;

        /* renamed from: f */
        final /* synthetic */ String f13589f;

        C5281n(C5266k kVar, String str) {
            this.f13588e = kVar;
            this.f13589f = str;
        }

        /* renamed from: a */
        public final List<PotentialMatch> apply(List<UserProto$User> list) {
            C12932j.m33818b(list, "it");
            List a = C12857w.m33665a((Iterable) list, (Comparator) C3205g.m10196e(C7713f.m18776a(this.f13588e.f13566b)));
            ArrayList<UserProto$User> arrayList = new ArrayList<>();
            for (Object next : a) {
                UserProto$User userProto$User = (UserProto$User) next;
                C12932j.m33815a((Object) userProto$User, "user");
                if (!C12932j.m33817a((Object) userProto$User.getUuid(), (Object) this.f13589f)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
            for (UserProto$User bVar : arrayList) {
                arrayList2.add(new C5268b(bVar));
            }
            return arrayList2;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$o */
    static final class C5282o<T> implements Consumer<C8111i4> {

        /* renamed from: e */
        public static final C5282o f13590e = new C5282o();

        C5282o() {
        }

        /* renamed from: a */
        public final void accept(C8111i4 i4Var) {
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$p */
    static final class C5283p<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5283p f13591e = new C5283p();

        C5283p() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Couldn't send recommendation", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$q */
    static final class C5284q<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C5284q f13592e = new C5284q();

        C5284q() {
        }

        /* renamed from: a */
        public final Collection<String> mo12647a(Collection<String> collection) {
            C12932j.m33818b(collection, "it");
            return collection;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            Collection collection = (Collection) obj;
            mo12647a(collection);
            return collection;
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$r */
    static final class C5285r<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C5266k f13593e;

        /* renamed from: f */
        final /* synthetic */ C5245d f13594f;

        /* renamed from: g */
        final /* synthetic */ String f13595g;

        C5285r(C5266k kVar, C5245d dVar, String str) {
            this.f13593e = kVar;
            this.f13594f = dVar;
            this.f13595g = str;
        }

        /* renamed from: a */
        public final Disposable apply(String str) {
            C12932j.m33818b(str, "potentialMatchUuid");
            this.f13594f.mo12594a(C5247b.LIST);
            return this.f13593e.mo12626b(this.f13595g, str);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$s */
    static final class C5286s<T> implements Consumer<Disposable> {

        /* renamed from: e */
        public static final C5286s f13596e = new C5286s();

        C5286s() {
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
        }
    }

    /* renamed from: app.zenly.locator.recommendation.k$t */
    static final class C5287t<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5287t f13597e = new C5287t();

        C5287t() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Couldn't send recommendations", new Object[0]);
        }
    }

    public C5266k(Context context, ZenlyCore zenlyCore) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlyCore, "core");
        this.f13566b = context;
        this.f13567c = zenlyCore;
    }

    /* renamed from: b */
    public final C12279e<List<UserProto$User>> mo12627b(String str) {
        C12932j.m33818b(str, "userUuid");
        C12279e<List<UserProto$User>> i = this.f13567c.userPublicMutualFriendsState(str).mo36501i(C5279m.f13587e);
        C12932j.m33815a((Object) i, "core.userPublicMutualFri…sAvatar() }\n            }");
        return i;
    }

    /* renamed from: a */
    public final C12291g<List<PotentialMatch>> mo12625a(String str) {
        C12932j.m33818b(str, "newComerUuid");
        C7136a newBuilder = C7135k0.newBuilder();
        newBuilder.mo19124a(str);
        C12291g<List<PotentialMatch>> n = this.f13567c.recoPotentialMatches((C7135k0) newBuilder.build()).mo36535a((C12286f) this.f13565a.getComputation()).mo36553e().mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C5277k.f13585e).mo36501i(C5278l.f13586e).mo36511n();
        C12932j.m33815a((Object) n, "core.recoPotentialMatche…h }\n            .toList()");
        return n;
    }

    /* renamed from: b */
    public final Disposable mo12626b(String str, String str2) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(str2, "potentialMatchUuid");
        ZenlyCore zenlyCore = this.f13567c;
        C8097a newBuilder = C8096h4.newBuilder();
        newBuilder.mo22143a(str);
        newBuilder.mo22144b(str2);
        Disposable a = zenlyCore.recoSendRecommendation((C8096h4) newBuilder.build()).mo36535a((C12286f) this.f13565a.getComputation()).mo36533a((Consumer<? super T>) C5282o.f13590e, (Consumer<? super Throwable>) C5283p.f13591e);
        C12932j.m33815a((Object) a, "core.recoSendRecommendat… send recommendation\") })");
        return a;
    }

    /* renamed from: a */
    public final Disposable mo12620a(String str, String str2, C5267a aVar) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(str2, "potentialMatchUuid");
        C12932j.m33818b(aVar, "ackPotentialMatchState");
        C8033a newBuilder = C8032d4.newBuilder();
        newBuilder.mo22059a(aVar.mo12628a());
        C12932j.m33815a((Object) newBuilder, "this");
        newBuilder.mo22060a(str);
        newBuilder.mo22061b(str2);
        Disposable a = this.f13567c.recoAcknowledgePotentialMatch((C8032d4) newBuilder.build()).mo36535a((C12286f) this.f13565a.getComputation()).mo36533a((Consumer<? super T>) C5269c.f13575e, (Consumer<? super Throwable>) C5270d.f13576e);
        C12932j.m33815a((Object) a, "core.recoAcknowledgePote…edge potential match\") })");
        return a;
    }

    /* renamed from: a */
    public final Disposable mo12622a(String str, Set<String> set, C5267a aVar) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(set, "pendingRecommendations");
        C12932j.m33818b(aVar, "ackPotentialMatchState");
        Disposable a = C12279e.m32626e(set).mo36428a((C12286f) this.f13565a.getComputation()).mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C5271e.f13577e).mo36501i(new C5272f(this, str, aVar)).mo36412a((Consumer<? super T>) C5273g.f13581e, (Consumer<? super Throwable>) C5274h.f13582e);
        C12932j.m33815a((Object) a, "Observable.just(pendingR…ge potential matches\") })");
        return a;
    }

    /* renamed from: a */
    public final Disposable mo12623a(String str, boolean z) {
        C12932j.m33818b(str, "potentialMatchUuid");
        C8065a newBuilder = C8064f4.newBuilder();
        newBuilder.mo22066a(z ? C7888c.ACK_RECO_ACCEPTED : C7888c.ACK_RECO_IGNORED);
        newBuilder.mo22067a(str);
        Disposable a = this.f13567c.recoAcknowledgeRecommendation((C8064f4) newBuilder.build()).mo36535a((C12286f) this.f13565a.getComputation()).mo36533a((Consumer<? super T>) C5275i.f13583e, (Consumer<? super Throwable>) C5276j.f13584e);
        C12932j.m33815a((Object) a, "core.recoAcknowledgeReco…ledge recommendation\") })");
        return a;
    }

    /* renamed from: a */
    public final C12279e<List<PotentialMatch>> mo12624a(String str, String str2) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(str2, "query");
        C12279e<List<PotentialMatch>> i = this.f13567c.friendsSearchStream(str2).mo36511n().mo36553e().mo36501i(new C5281n(this, str));
        C12932j.m33815a((Object) i, "searchFriendObservable\n …ntialMatch>\n            }");
        return i;
    }

    /* renamed from: a */
    public final Disposable mo12621a(String str, Collection<String> collection) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(collection, "recommendationsToSend");
        C5343a U = C5343a.m15160U();
        C12932j.m33815a((Object) U, "Analytics.get()");
        AnalyticsTracker a = U.mo12806a();
        C12932j.m33815a((Object) a, "Analytics.get().tracker");
        Disposable a2 = C12279e.m32626e(collection).mo36428a((C12286f) this.f13565a.getComputation()).mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C5284q.f13592e).mo36501i(new C5285r(this, new C5245d(a), str)).mo36412a((Consumer<? super T>) C5286s.f13596e, (Consumer<? super Throwable>) C5287t.f13597e);
        C12932j.m33815a((Object) a2, "Observable.just(recommen…send recommendations\") })");
        return a2;
    }
}
