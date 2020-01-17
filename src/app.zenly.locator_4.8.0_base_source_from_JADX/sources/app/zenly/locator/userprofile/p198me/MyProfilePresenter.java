package app.zenly.locator.userprofile.p198me;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.C0143b;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0875o;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.descendants.C1382g;
import app.zenly.android.feature.descendants.DescendantsModule;
import app.zenly.android.feature.descendants.feedback.C1381b;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs;
import app.zenly.locator.C3572e;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.CardSwitcherActivity;
import app.zenly.locator.cards.CardSwitcherActivity.C1767a;
import app.zenly.locator.cards.models.AppIconsCard;
import app.zenly.locator.cards.models.BestFriendV2Card;
import app.zenly.locator.cards.models.BestFriendV2Card.C1861a;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.DescendantsCard;
import app.zenly.locator.cards.models.TopPopsCard;
import app.zenly.locator.cards.models.WatcherMedalCard;
import app.zenly.locator.cards.models.WorldRankingCard;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.contracts.NavigationContract.C2468b;
import app.zenly.locator.core.manager.C2800q5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.activity.ChangeAvatarActivity;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.friendshipfacts.C3772c;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5348e;
import app.zenly.locator.p143s.C5343a.C5363t;
import app.zenly.locator.p143s.C5343a.C5366w;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.userprofile.p198me.appicons.C6042a;
import app.zenly.locator.userprofile.p198me.appicons.C6050d;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import app.zenly.locator.userprofile.p198me.appicons.C6055g;
import app.zenly.locator.userprofile.p198me.appicons.C6056h;
import app.zenly.locator.userprofile.p198me.appicons.C6058i;
import app.zenly.locator.userprofile.p198me.p199g.C6081a;
import app.zenly.locator.userprofile.p198me.p200h.C6087a;
import app.zenly.locator.userprofile.p198me.p200h.C6088b;
import app.zenly.locator.userprofile.p198me.p200h.C6089c;
import app.zenly.locator.userprofile.p198me.p200h.C6090d;
import app.zenly.locator.userprofile.p198me.p200h.C6091e;
import app.zenly.locator.userprofile.p198me.p200h.C6092f;
import app.zenly.locator.userprofile.p198me.p200h.C6093g;
import app.zenly.locator.userprofile.p198me.p200h.C6094h;
import app.zenly.locator.userprofile.p198me.p200h.C6095i;
import app.zenly.locator.userprofile.p198me.p200h.C6096j;
import app.zenly.locator.userprofile.p198me.p200h.C6097k;
import app.zenly.locator.userprofile.p198me.p200h.C6098l;
import app.zenly.locator.userprofile.p198me.p202j.C6101a;
import app.zenly.locator.userprofile.p198me.p204l.C6144k;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.share.Constants;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.prefetch.C11731a;
import com.snap.p327ui.recycling.prefetch.ViewHolderPrefetcher;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$UserEngagementStats;
import p213co.znly.models.core.C7210s0;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7715b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7716c;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter */
public final class MyProfilePresenter extends C3572e<MyProfileTarget> implements LifecycleObserver {

    /* renamed from: q */
    static final /* synthetic */ KProperty[] f15190q;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12275b f15191f = new C12275b();

    /* renamed from: g */
    private final C12275b f15192g = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ZenlySchedulers f15193h = C1351e.m6372a(C6067c.f15275b.mo19916a("presenter"));

    /* renamed from: i */
    private C12271b f15194i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6068d f15195j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11705b f15196k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12785a<List<C7210s0>> f15197l;

    /* renamed from: m */
    private final Lazy f15198m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final MeUserManager f15199n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C12279e<Boolean> f15200o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AvatarLoader f15201p;

    /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$a */
    public final class C6030a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Context f15202a;

        /* renamed from: b */
        private final C6050d f15203b;

        /* renamed from: c */
        final /* synthetic */ MyProfilePresenter f15204c;

        /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$a$a */
        static final class C6031a extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C6030a f15205f;

            C6031a(C6030a aVar) {
                this.f15205f = aVar;
                super(0);
            }

            public final void invoke() {
                NavigationContract navigation = ((MyProfileTarget) this.f15205f.f15204c.mo10039b()).getNavigation();
                if (navigation != null) {
                    navigation.setNavigationEnabled(true);
                }
                C3772c.m11231a(this.f15205f.f15204c.mo13821c()).provideFriendshipFactsPrefs().onFriendshipFactsVisited();
            }
        }

        /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$a$b */
        static final class C6032b extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C6030a f15206f;

            C6032b(C6030a aVar) {
                this.f15206f = aVar;
                super(0);
            }

            public final void invoke() {
                NavigationContract navigation = ((MyProfileTarget) this.f15206f.f15204c.mo10039b()).getNavigation();
                if (navigation != null) {
                    navigation.setNavigationEnabled(true);
                }
                NavigationContract navigation2 = ((MyProfileTarget) this.f15206f.f15204c.mo10039b()).getNavigation();
                if (navigation2 != null) {
                    navigation2.onMyProfileClick(C2468b.BEST_FRIENDS_UNLOCKED);
                    C12956q qVar = C12956q.f33541a;
                    C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15206f.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
                }
            }
        }

        /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$a$c */
        static final class C6033c implements OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C6030a f15207e;

            C6033c(C6030a aVar) {
                this.f15207e = aVar;
            }

            public final void onClick(View view) {
                C5343a.m15160U().mo12805T();
                NavigationContract navigation = ((MyProfileTarget) this.f15207e.f15204c.mo10039b()).getNavigation();
                if (navigation != null) {
                    navigation.onMyProfileClick(C2468b.ADD_FRIENDS);
                    C12956q qVar = C12956q.f33541a;
                    C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15207e.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
                }
            }
        }

        /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$a$d */
        static final class C6034d extends C12933k implements Function0<C12956q> {

            /* renamed from: f */
            final /* synthetic */ C6030a f15208f;

            /* renamed from: g */
            final /* synthetic */ C6042a f15209g;

            C6034d(C6030a aVar, C6042a aVar2) {
                this.f15208f = aVar;
                this.f15209g = aVar2;
                super(0);
            }

            public final void invoke() {
                NavigationContract navigation = ((MyProfileTarget) this.f15208f.f15204c.mo10039b()).getNavigation();
                if (navigation != null) {
                    navigation.setNavigationEnabled(true);
                }
                C1767a.m7170a(CardSwitcherActivity.f5873p, this.f15208f.f15204c.mo13821c(), C12846n.m33635a(new AppIconsCard(this.f15209g.mo13854c())), 0, 4, (Object) null);
            }
        }

        public C6030a(MyProfilePresenter myProfilePresenter, Context context, C6050d dVar) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(dVar, "appIconsAnalytics");
            this.f15204c = myProfilePresenter;
            this.f15202a = context;
            this.f15203b = dVar;
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6089c cVar) {
            C12932j.m33818b(cVar, "event");
            this.f15204c.mo13821c().startActivity(ChangeAvatarActivity.f8483p.mo9271a(this.f15204c.mo13821c()));
        }

        /* renamed from: a */
        static /* synthetic */ void m16767a(C6030a aVar, C6042a aVar2, LottieAnimationView lottieAnimationView, int i, Object obj) {
            if ((i & 2) != 0) {
                lottieAnimationView = null;
            }
            aVar.m16768a(aVar2, lottieAnimationView);
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6096j jVar) {
            C12932j.m33818b(jVar, "event");
            NavigationContract navigation = ((MyProfileTarget) this.f15204c.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onMyProfileClick(C2468b.RENAME);
                C12956q qVar = C12956q.f33541a;
                C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            }
        }

        /* renamed from: a */
        private final void m16768a(C6042a aVar, LottieAnimationView lottieAnimationView) {
            if (lottieAnimationView != null) {
                NavigationContract navigation = ((MyProfileTarget) this.f15204c.mo10039b()).getNavigation();
                if (navigation != null) {
                    navigation.setNavigationEnabled(false);
                }
                ((MyProfileTarget) this.f15204c.mo10039b()).getUnlockAnimationView().mo13997a(lottieAnimationView);
                C6034d dVar = new C6034d(this, aVar);
                ((MyProfileTarget) this.f15204c.mo10039b()).getUnlockAnimationView().mo13998a((Function0<C12956q>) dVar);
                ((MyProfileTarget) this.f15204c.mo10039b()).getUnlockAnimationView().mo14000b((Function0<C12956q>) dVar);
                return;
            }
            C1767a.m7170a(CardSwitcherActivity.f5873p, this.f15204c.mo13821c(), C12846n.m33635a(new AppIconsCard(aVar.mo13854c())), 0, 4, (Object) null);
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6095i iVar) {
            C12932j.m33818b(iVar, "event");
            NavigationContract navigation = ((MyProfileTarget) this.f15204c.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onMyProfileClick(iVar.mo13922a());
                C12956q qVar = C12956q.f33541a;
                C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6090d dVar) {
            C5348e eVar;
            C12932j.m33818b(dVar, "event");
            C5343a U = C5343a.m15160U();
            if (dVar.mo13917b()) {
                eVar = C5348e.MUTUAL_LOVE;
            } else {
                eVar = C5348e.BEST_FRIEND;
            }
            U.mo12818a(eVar);
            if (this.f15204c.f15197l.mo36964t()) {
                C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
                Object s = this.f15204c.f15197l.mo36963s();
                if (s != null) {
                    C12932j.m33815a(s, "bffsSubject.value!!");
                    List<C7210s0> list = (List) s;
                    C1767a aVar = CardSwitcherActivity.f5873p;
                    Activity c = this.f15204c.mo13821c();
                    ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
                    for (C7210s0 a : list) {
                        arrayList.add(C1861a.m7407a(BestFriendV2Card.f6084x, a, false, 2, null));
                    }
                    ArrayList arrayList2 = new ArrayList(C12850p.m33647a(list, 10));
                    for (C7210s0 friend : list) {
                        UserProto$User friend2 = friend.getFriend();
                        C12932j.m33815a((Object) friend2, "it.friend");
                        arrayList2.add(friend2.getUuid());
                    }
                    aVar.mo7357a(c, (List<? extends Card>) arrayList, arrayList2.indexOf(dVar.mo13916a()));
                    return;
                }
                C12932j.m33814a();
                throw null;
            }
        }

        /* renamed from: a */
        private final void m16769a(UserProto$UserEngagementStats userProto$UserEngagementStats, C6042a aVar) {
            int a = C6058i.m16808a(userProto$UserEngagementStats);
            C0143b bVar = new C0143b(this.f15202a, 2132083208);
            View inflate = LayoutInflater.from(bVar).inflate(R.layout.dialog_content_appicons, null);
            C12932j.m33815a((Object) inflate, "view");
            TextView textView = (TextView) inflate.findViewById(C3891l.days_streak);
            String str = "view.days_streak";
            C12932j.m33815a((Object) textView, str);
            textView.setText(m16765a(a, aVar.mo13856e()));
            TextView textView2 = (TextView) inflate.findViewById(C3891l.friends_streak);
            String str2 = "view.friends_streak";
            C12932j.m33815a((Object) textView2, str2);
            textView2.setText(m16765a(userProto$UserEngagementStats.getCurrentFriendsCount(), aVar.mo13855d()));
            AvatarLoader a2 = this.f15204c.f15201p;
            C2879d0 d0Var = this.f15204c.f15199n.mo8756b().f8250a;
            C12932j.m33815a((Object) d0Var, "meUserManager.meUser.user");
            Request load = a2.load(C2884f.m9353a(d0Var));
            ImageView imageView = (ImageView) inflate.findViewById(C3891l.profile_pic);
            C12932j.m33815a((Object) imageView, "view.profile_pic");
            load.into(imageView);
            boolean z = a >= aVar.mo13856e();
            TextView textView3 = (TextView) inflate.findViewById(C3891l.days_title);
            C12932j.m33815a((Object) textView3, "view.days_title");
            textView3.setSelected(z);
            TextView textView4 = (TextView) inflate.findViewById(C3891l.days_streak);
            C12932j.m33815a((Object) textView4, str);
            textView4.setSelected(z);
            boolean z2 = userProto$UserEngagementStats.getCurrentFriendsCount() >= aVar.mo13855d();
            TextView textView5 = (TextView) inflate.findViewById(C3891l.friends_title);
            C12932j.m33815a((Object) textView5, "view.friends_title");
            textView5.setSelected(z2);
            TextView textView6 = (TextView) inflate.findViewById(C3891l.friends_streak);
            C12932j.m33815a((Object) textView6, str2);
            textView6.setSelected(z2);
            boolean hasProfilePicture = userProto$UserEngagementStats.getHasProfilePicture();
            TextView textView7 = (TextView) inflate.findViewById(C3891l.profile_title);
            C12932j.m33815a((Object) textView7, "view.profile_title");
            textView7.setSelected(hasProfilePicture);
            C3106c cVar = new C3106c(bVar);
            cVar.mo9331a(2131231499);
            cVar.mo9349f(aVar.mo13853b());
            cVar.mo9332a((int) R.string.streak_modal_desc, Integer.valueOf(aVar.mo13855d()), Integer.valueOf(aVar.mo13856e()));
            cVar.mo9345c((int) R.string.commons_gotit);
            cVar.mo9333a(inflate);
            cVar.mo9344b().mo9296j(this.f15204c.mo13821c());
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6091e eVar) {
            C12932j.m33818b(eVar, "event");
            C5343a.m15160U().mo12818a(C5348e.EMPTY);
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C3106c cVar = new C3106c(this.f15202a);
            cVar.mo9349f((int) R.string.profile_bestFriends_locked_title);
            cVar.mo9348e((int) R.string.profile_bestFriends_locked_subtitle);
            cVar.mo9337a(this.f15202a.getString(R.string.profile_bestFriends_locked_button_ok), (String) null);
            cVar.mo9301a(true).mo9344b().mo9296j(this.f15204c.mo13821c());
        }

        /* renamed from: a */
        private final void m16766a() {
            C3106c cVar = new C3106c(this.f15202a);
            cVar.mo9339b(2131231306);
            cVar.mo9343b(true);
            cVar.mo9349f((int) R.string.appIconDialog_title);
            cVar.mo9348e((int) R.string.appIconDialog_message_shortcut);
            cVar.mo9345c((int) R.string.appIconDialog_button);
            cVar.mo9344b().mo9296j(this.f15204c.mo13821c());
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6093g gVar) {
            C12932j.m33818b(gVar, "event");
            NavigationContract navigation = ((MyProfileTarget) this.f15204c.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onMyProfileClick(C2468b.BEST_FRIENDS);
                C12956q qVar = C12956q.f33541a;
                C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6094h hVar) {
            C12932j.m33818b(hVar, "event");
            NavigationContract navigation = ((MyProfileTarget) this.f15204c.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.setNavigationEnabled(false);
            }
            ((MyProfileTarget) this.f15204c.mo10039b()).getUnlockAnimationView().mo13997a(hVar.mo13921a());
            ((MyProfileTarget) this.f15204c.mo10039b()).getUnlockAnimationView().mo13998a((Function0<C12956q>) new C6031a<C12956q>(this));
            ((MyProfileTarget) this.f15204c.mo10039b()).getUnlockAnimationView().mo14000b((Function0<C12956q>) new C6032b<C12956q>(this));
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6098l lVar) {
            C12932j.m33818b(lVar, "event");
            if (lVar.mo13925b()) {
                C5343a.m15160U().mo12852a(true, C5366w.None);
                C3106c cVar = new C3106c(this.f15202a);
                cVar.mo9331a(2131231499);
                cVar.mo9349f((int) R.string.profile_watchers_locked_title);
                cVar.mo9348e((int) R.string.profile_fame_modal_content);
                cVar.mo9338a(this.f15202a.getString(R.string.settings_manage_button_addfriends), null, new C6033c(this));
                cVar.mo9301a(true).mo9344b().mo9296j(this.f15204c.mo13821c());
                return;
            }
            C6144k a = lVar.mo13924a();
            C5343a.m15160U().mo12852a(false, a.mo13984f());
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15204c.mo13821c()), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            WatcherMedalCard watcherMedalCard = new WatcherMedalCard((int) 4278323233L, (int) 4279051392L, a.mo13990l(), a.mo13991m(), a.mo13985g());
            CardSwitcherActivity.f5873p.mo7356a(this.f15204c.mo13821c(), (Card) watcherMedalCard, new Card[0]);
        }

        /* renamed from: a */
        private final CharSequence m16765a(int i, int i2) {
            C7685b bVar = new C7685b();
            bVar.mo19895a(Math.min(i, i2));
            bVar.mo19896a((CharSequence) Constants.URL_PATH_DELIMITER);
            bVar.mo19895a(i2);
            return bVar.mo19893a();
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6097k kVar) {
            C12932j.m33818b(kVar, "event");
            C5343a.m15160U().mo12839a(kVar.mo13923a(), C5363t.PROFILE_CELL_TAP);
            NavigationContract navigation = ((MyProfileTarget) this.f15204c.mo10039b()).getNavigation();
            if (navigation != null) {
                navigation.onMyProfileClick(C2468b.SET_USERNAME);
                C12956q qVar = C12956q.f33541a;
                C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            }
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6092f fVar) {
            C12932j.m33818b(fVar, "event");
            int a = fVar.mo13918a().mo6638a();
            C5343a.m15160U().mo12892i(a);
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f15202a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            int b = fVar.mo13919b();
            String quantityString = this.f15202a.getResources().getQuantityString(R.plurals.cards_descendants_subtitle_myProfile, a);
            C12932j.m33815a((Object) quantityString, "context.resources.getQua…ubtitle_myProfile, count)");
            DescendantsCard descendantsCard = new DescendantsCard(a, b, quantityString, true);
            if (descendantsCard.mo7552e() == 0) {
                CardSwitcherActivity.f5873p.mo7356a(this.f15204c.mo13821c(), (Card) descendantsCard, new Card[0]);
                return;
            }
            CardSwitcherActivity.f5873p.mo7356a(this.f15204c.mo13821c(), (Card) descendantsCard, new TopPopsCard(fVar.mo13920c(), true), new WorldRankingCard(descendantsCard.mo7552e(), fVar.mo13920c(), true));
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6087a aVar) {
            C12932j.m33818b(aVar, "event");
            C6042a b = aVar.mo13911b();
            C6042a a = aVar.mo13910a();
            boolean a2 = b.mo13852a(a);
            C6042a aVar2 = C6042a.f15221k;
            if (b == aVar2 && a == aVar2) {
                m16766a();
            } else if (a2) {
                m16767a(this, a, null, 2, null);
            } else {
                m16769a(aVar.mo13912c(), a);
            }
            this.f15203b.mo13861a(a, !a2);
        }

        @C13382i(threadMode = ThreadMode.MAIN)
        public final void onClick(C6088b bVar) {
            C12932j.m33818b(bVar, "event");
            m16768a(bVar.mo13914b(), bVar.mo13913a());
            this.f15203b.mo13861a(bVar.mo13914b(), !bVar.mo13915c().mo13852a(bVar.mo13914b()));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$b */
    static final class C6035b extends C12933k implements Function0<MyProfileBindingContext> {

        /* renamed from: f */
        final /* synthetic */ MyProfilePresenter f15210f;

        C6035b(MyProfilePresenter myProfilePresenter) {
            this.f15210f = myProfilePresenter;
            super(0);
        }

        public final MyProfileBindingContext invoke() {
            C12279e d = this.f15210f.f15200o.mo36428a((C12286f) this.f15210f.f15193h.getUserInteractive()).mo36477d();
            C12932j.m33815a((Object) d, "visibilityObservable\n   …  .distinctUntilChanged()");
            return new MyProfileBindingContext(d);
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$c */
    static final class C6036c implements Action {

        /* renamed from: a */
        final /* synthetic */ MyProfilePresenter f15211a;

        /* renamed from: b */
        final /* synthetic */ Context f15212b;

        /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$c$a */
        static final class C6037a<T, R> implements Function<T, ObservableSource<? extends R>> {

            /* renamed from: e */
            final /* synthetic */ ZenlyCore f15213e;

            /* renamed from: f */
            final /* synthetic */ C6036c f15214f;

            /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$c$a$a */
            static final class C6038a<T> implements Consumer<List<? extends C7210s0>> {

                /* renamed from: e */
                final /* synthetic */ C6037a f15215e;

                C6038a(C6037a aVar) {
                    this.f15215e = aVar;
                }

                /* renamed from: a */
                public final void accept(List<C7210s0> list) {
                    this.f15215e.f15214f.f15211a.f15197l.onNext(list);
                }
            }

            C6037a(C11727c cVar, C11700c cVar2, C12271b bVar, ZenlyCore zenlyCore, DescendantsPrefs descendantsPrefs, DescendantsModule descendantsModule, C6056h hVar, C6052e eVar, C6036c cVar3) {
                this.f15213e = zenlyCore;
                this.f15214f = cVar3;
            }

            /* renamed from: a */
            public final C12279e<List<C7210s0>> apply(Boolean bool) {
                C12932j.m33818b(bool, "it");
                return new C6081a(this.f15213e).mo13896a().mo36455b((Consumer<? super T>) new C6038a<Object>(this));
            }
        }

        /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$c$b */
        static final class C6039b<T> implements Predicate<Boolean> {

            /* renamed from: e */
            public static final C6039b f15216e = new C6039b();

            C6039b() {
            }

            /* renamed from: a */
            public final Boolean mo13841a(Boolean bool) {
                C12932j.m33818b(bool, "it");
                return bool;
            }

            public /* bridge */ /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                mo13841a(bool);
                return bool.booleanValue();
            }
        }

        C6036c(MyProfilePresenter myProfilePresenter, Context context) {
            this.f15211a = myProfilePresenter;
            this.f15212b = context;
        }

        public final void run() {
            C6037a aVar;
            C11705b bVar;
            String str = "bus.eventDispatcher";
            C7707a.m18761b("profile:prepareAsync");
            try {
                ZenlyCore a = C5448c.m15478a();
                DescendantsModule a2 = C1382g.m6431a(this.f15212b);
                C6052e a3 = C6055g.m16803a(this.f15212b);
                C6056h hVar = new C6056h(this.f15212b);
                C11727c cVar = new C11727c(this.f15211a.m16756d(), C12848o.m33643b((Object[]) new Class[]{C7716c.class, C6080f.class}));
                C11700c cVar2 = new C11700c();
                MyProfilePresenter myProfilePresenter = this.f15211a;
                Context context = this.f15212b;
                C5343a U = C5343a.m15160U();
                C12932j.m33815a((Object) U, "Analytics.get()");
                AnalyticsTracker a4 = U.mo12806a();
                C12932j.m33815a((Object) a4, "Analytics.get().tracker");
                cVar2.mo34449b(new C6030a(myProfilePresenter, context, new C6050d(a4)));
                this.f15211a.f15191f.add(cVar2);
                MyProfilePresenter myProfilePresenter2 = this.f15211a;
                C6077e eVar = new C6077e(a);
                AvatarLoader a5 = this.f15211a.f15201p;
                C2800q5 c = C2666b.m9049a(this.f15212b).mo8765c();
                EventDispatcher a6 = cVar2.mo34447a();
                C12932j.m33815a((Object) a6, str);
                C6068d dVar = new C6068d(eVar, a5, c, a6, C1351e.m6372a(C6067c.f15275b.mo19916a("headerPresenter")).getMainThread());
                myProfilePresenter2.f15195j = dVar;
                C1342b userInteractive = this.f15211a.f15193h.getUserInteractive();
                LayoutInflater from = LayoutInflater.from(this.f15212b);
                C12932j.m33815a((Object) from, "LayoutInflater.from(context)");
                RecyclerView recyclerView = new RecyclerView(this.f15212b);
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f15212b));
                C11731a aVar2 = new C11731a(cVar, userInteractive, from, recyclerView);
                cVar.mo34543a((ViewHolderPrefetcher) aVar2);
                Map b = C12835h0.m33554b(C12954o.m33853a(C6080f.SECTION, Integer.valueOf(2)), C12954o.m33853a(C6080f.VANITY_METRICS, Integer.valueOf(1)), C12954o.m33853a(C6080f.FOOTER, Integer.valueOf(1)));
                if (hVar.mo13875b()) {
                    b.put(C6080f.APP_ICONS, Integer.valueOf(1));
                }
                C12271b a7 = aVar2.mo34549a(b).mo36338a();
                Disposable b2 = a7.mo36351b();
                C12932j.m33815a((Object) b2, "prefetchDoneCompletable.subscribe()");
                C12773a.m33432a(b2, this.f15211a.f15191f);
                DescendantsPrefs provideDescendantsPrefs = a2.provideDescendantsPrefs();
                MyProfilePresenter myProfilePresenter3 = this.f15211a;
                ZenlySchedulers a8 = C1351e.m6372a(C6067c.f15275b.mo19916a("adapter"));
                EventDispatcher a9 = cVar2.mo34447a();
                C12932j.m33815a((Object) a9, str);
                C1342b computation = a8.getComputation();
                C1342b mainThread = a8.getMainThread();
                ObservableSectionController[] observableSectionControllerArr = new ObservableSectionController[2];
                observableSectionControllerArr[0] = new C7715b();
                Context context2 = this.f15212b;
                EventDispatcher a10 = cVar2.mo34447a();
                C12932j.m33815a((Object) a10, str);
                C12932j.m33815a((Object) a7, "prefetchDoneCompletable");
                C12279e a11 = provideDescendantsPrefs.observeAllPreferences().mo36428a((C12286f) a8.getComputation());
                C12932j.m33815a((Object) a11, "descendantsPrefs.observe…n(schedulers.computation)");
                C1381b provideDescendantsNewCountInterceptor = a2.provideDescendantsNewCountInterceptor();
                C12279e newDescendantsCount = provideDescendantsPrefs.getNewDescendantsCount();
                EventDispatcher eventDispatcher = a10;
                C12279e eVar2 = a11;
                C12279e b3 = this.f15211a.f15200o.mo36459b((Predicate<? super T>) C6039b.f15216e);
                ObservableSectionController[] observableSectionControllerArr2 = observableSectionControllerArr;
                Context context3 = context2;
                EventDispatcher eventDispatcher2 = a9;
                MyProfilePresenter myProfilePresenter4 = myProfilePresenter3;
                C6037a aVar3 = new C6037a(cVar, cVar2, a7, a, provideDescendantsPrefs, a2, hVar, a3, this);
                C12279e e = b3.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) aVar);
                C12932j.m33815a((Object) e, "visibilityObservable\n   …                        }");
                C11727c cVar3 = cVar;
                C6056h hVar2 = hVar;
                ZenlyCore zenlyCore = a;
                C6101a aVar4 = new C6101a(context3, eventDispatcher, cVar3, a7, zenlyCore, eVar2, provideDescendantsNewCountInterceptor, newDescendantsCount, hVar2, a3, e, C3772c.m11231a(this.f15212b).provideFriendshipFactsPrefs());
                observableSectionControllerArr2[1] = aVar4;
                C11705b bVar2 = new C11705b(cVar3, eventDispatcher2, computation, mainThread, C12848o.m33643b((Object[]) observableSectionControllerArr2), null, 32, null);
                myProfilePresenter4.f15196k = bVar;
                C12956q qVar = C12956q.f33541a;
            } finally {
                C7707a.m18759a();
            }
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter$d */
    static final class C6040d implements Action {

        /* renamed from: a */
        final /* synthetic */ MyProfilePresenter f15217a;

        /* renamed from: b */
        final /* synthetic */ MyProfileTarget f15218b;

        C6040d(MyProfilePresenter myProfilePresenter, Context context, MyProfileTarget myProfileTarget) {
            this.f15217a = myProfilePresenter;
            this.f15218b = myProfileTarget;
        }

        public final void run() {
            this.f15218b.getLifecycle().mo4446a(this.f15217a);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(MyProfilePresenter.class), "myProfileBindingContext", "getMyProfileBindingContext()Lapp/zenly/locator/userprofile/me/MyProfileBindingContext;");
        C12946x.m33839a((C12940r) sVar);
        f15190q = new KProperty[]{sVar};
    }

    public MyProfilePresenter(MeUserManager meUserManager, C12279e<Boolean> eVar, AvatarLoader avatarLoader) {
        C12932j.m33818b(meUserManager, "meUserManager");
        C12932j.m33818b(eVar, "visibilityObservable");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        this.f15199n = meUserManager;
        this.f15200o = eVar;
        this.f15201p = avatarLoader;
        C12785a<List<C7210s0>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<L…eUserProto.BestFriend>>()");
        this.f15197l = u;
        this.f15198m = C12896f.m33751a(new C6035b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final MyProfileBindingContext m16756d() {
        Lazy lazy = this.f15198m;
        KProperty kProperty = f15190q[0];
        return (MyProfileBindingContext) lazy.getValue();
    }

    @C0875o(C0863a.ON_PAUSE)
    public final void onPause() {
        C7707a.m18761b("profile:pause");
        try {
            this.f15192g.mo36401a();
            C6068d dVar = this.f15195j;
            if (dVar != null) {
                dVar.mo13882a();
                C12956q qVar = C12956q.f33541a;
                return;
            }
            C12932j.m33820c("myProfileHeaderPresenter");
            throw null;
        } finally {
            C7707a.m18759a();
        }
    }

    @C0875o(C0863a.ON_RESUME)
    public final Disposable onResume() {
        C7707a.m18761b("profile:resume");
        try {
            C11705b bVar = this.f15196k;
            if (bVar != null) {
                C12773a.m33432a(bVar.mo34464b(), this.f15192g);
                C6068d dVar = this.f15195j;
                if (dVar != null) {
                    Disposable b = dVar.mo13884b();
                    C12773a.m33432a(b, this.f15192g);
                    return b;
                }
                C12932j.m33820c("myProfileHeaderPresenter");
                throw null;
            }
            C12932j.m33820c("myProfileAdapter");
            throw null;
        } finally {
            C7707a.m18759a();
        }
    }

    @C0875o(C0863a.ON_START)
    public final void onStart() {
        C7707a.m18761b("profile:start");
        try {
            RecyclerView recyclerView = ((MyProfileTarget) mo10039b()).getRecyclerView();
            C11705b bVar = this.f15196k;
            if (bVar != null) {
                recyclerView.setAdapter(bVar);
                C12956q qVar = C12956q.f33541a;
                return;
            }
            C12932j.m33820c("myProfileAdapter");
            throw null;
        } finally {
            C7707a.m18759a();
        }
    }

    @C0875o(C0863a.ON_STOP)
    public final void onStop() {
        C7707a.m18761b("profile:stop");
        try {
            m16756d().mo13815a();
            this.f15191f.mo36401a();
            C12956q qVar = C12956q.f33541a;
        } finally {
            C7707a.m18759a();
        }
    }

    /* renamed from: b */
    private final C12271b m16752b(Context context) {
        C12271b b = C12271b.m32506b((Action) new C6036c(this, context));
        C12932j.m33815a((Object) b, "Completable.fromAction {…        }\n        }\n    }");
        return b;
    }

    /* renamed from: c */
    public final Activity mo13821c() {
        Activity currentActivity = ((MyProfileTarget) mo10039b()).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public final C12271b mo13819a(Context context) {
        C12932j.m33818b(context, "context");
        C12271b bVar = this.f15194i;
        if (bVar != null) {
            return bVar;
        }
        C12271b a = m16752b(context).mo36350b((C12286f) this.f15193h.getUserInteractive()).mo36338a();
        this.f15194i = a;
        C12932j.m33815a((Object) a, "onPrepareAsync(context)\n…epareCompletable = this }");
        return a;
    }

    /* renamed from: a */
    public void mo10037a() {
        ((MyProfileTarget) mo10039b()).getLifecycle().mo4447b(this);
        super.mo10037a();
    }

    /* renamed from: a */
    public void mo13820a(Context context, MyProfileTarget myProfileTarget) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(myProfileTarget, "target");
        C7707a.m18761b("profile:takeTarget");
        try {
            super.mo10038a(context, myProfileTarget);
            Disposable a = mo13819a(context).mo36342a((C12286f) this.f15193h.getMainThread()).mo36344a((Action) new C6040d(this, context, myProfileTarget));
            C12932j.m33815a((Object) a, "prepareAsync(context)\n  …erver(this)\n            }");
            C12773a.m33432a(a, this.f15191f);
            C6068d dVar = this.f15195j;
            if (dVar != null) {
                dVar.mo13883a(myProfileTarget.getContainerView());
                C12956q qVar = C12956q.f33541a;
                return;
            }
            C12932j.m33820c("myProfileHeaderPresenter");
            throw null;
        } finally {
            C7707a.m18759a();
        }
    }
}
